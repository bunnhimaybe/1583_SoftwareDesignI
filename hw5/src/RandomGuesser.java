/*  Random Guesser
    Homework 5
    Nhi Pham
    due 10/11 Wed
*/

import java.util.Scanner;
import java.util.Random;

public class RandomGuesser{
	// variables
	private static int MAX_BOUND, MIN_BOUND, MAX_GUESSES, SECRET, RANGE, TEMP; 
	private static int[] history; // keep track of guesses
	private enum Grade {PASS, EXCELLENT, GOOD, FAILED, LUCKY}; 
	public static Scanner input = new Scanner(System.in);

	// validate range
	public static void rangeCheck(){
		if (RANGE < 2){
			System.out.println("ERROR: INVALID RANGE");
			System.out.println("There must be at least two possible integers in the range (noninclusive). Try again!");
		} else if (RANGE == 2){ 
			System.out.println("ERROR: CHEATING RANGE");
			System.out.println("There is only one possible number in that range. Try again.\n");
		}
	}

	public RandomGuesser(){
	}

	// define variables
	public static void setup(){

		// game values setup
		do { // range
			System.out.print("Give me a number: ");
			MIN_BOUND = input.nextInt();
			System.out.print("Give me another number: ");
			MAX_BOUND = input.nextInt();
			
			// switch MIN/MAX if second number is smaller
			if (MAX_BOUND < MIN_BOUND) {
				TEMP = MAX_BOUND;
				MAX_BOUND = MIN_BOUND;
				MIN_BOUND = TEMP;
			}

			RANGE = MAX_BOUND - MIN_BOUND; 
			rangeCheck();
		} while (RANGE <= 2); 

		// generate random number in valid range
		SECRET = (int) (Math.random() * RANGE) + MIN_BOUND;

		// set # of tries
		do { 
			System.out.print("How many tries do you want?: ");
			MAX_GUESSES = input.nextInt();

			if (MAX_GUESSES <= 0){
				System.out.println("ERROR: GUESSES");
				System.out.println("You must guess at least once. Try again!\n");
			}
		} while (MAX_GUESSES <= 0);
		return;
	}

	// player guesses what SECRET is
	public static int play(){
		history = new int[MAX_GUESSES];
		int turn;
		for (turn = 0; turn < MAX_GUESSES; turn++){
			System.out.print("Guess a number: ");
			history[turn] = input.nextInt();

			// check if number was already guessed
			for (int j = 0; j < turn; j++){ 
				if (history[j] == history[turn]){
					// lose if guess is duplicated more than once
					if (TEMP == 1){
						turn = MAX_GUESSES;
						System.out.println("You suck!");
					} else {
						System.out.println("You've already guessed that number. Try again!");
						TEMP = 1; turn--; // repeat turn if guess already made 
					}
				}
			}

			if (history[turn] == SECRET){
				System.out.println("Nice, That's correct!");
			}
			TEMP = 0;
		}
		return turn;
	}

	// grade player and reveal SECRET
	public static void results(int score){
		System.out.printf("The number was %d.\n", SECRET);
	} 

	// main
	public static void main(String[] args){
		System.out.println("Welcome to Random Guesser!");
		System.out.println("Try to guess a number exclusively between two numbers.\n");
		setup(); 
		RandomGuesser game = new RandomGuesser();
		results(play());
		System.out.println("Thanks for playing!");
		
		input.close();
		return;
	}
}