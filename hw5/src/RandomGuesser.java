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
						System.out.println("You suck!\n");
					} else {
						System.out.println("ERROR: DUPLICATE GUESS");
						System.out.println("You've already guessed that number. Try again!\n");
						TEMP = 1; turn--; // repeat turn if guess already made 
					}
				}
			}

			if (history[turn] == SECRET){
				System.out.println("Nice, That's correct!\n");
			}
			TEMP = 0;
		}
		return turn;
	}

	// grade player and reveal SECRET
	public static void results(int n){
		System.out.printf("The number was %d.\n\n", SECRET);
		Grade score;
		if (n == MAX_GUESSES){
			score = Grade.FAILED;
		} else if (n == 1){
			score = Grade.LUCKY;
		} else if (n <= Math.log(MAX_BOUND - MIN_BOUND) / Math.log(2)) { // log base 2
			score = Grade.EXCELLENT;
		} else {
			score = Grade.GOOD;
		}

		switch (score){
			case FAILED:
				System.out.println("You FAILED and you're awful.");
				break;
			case LUCKY:
				System.out.println("You were LUCKY!");
				break;
			case EXCELLENT:
				System.out.println("You did EXCELLENT!");
				break;
			case GOOD:
				System.out.println("You did GOOD!");
				break;
		}

		// goodbye
		System.out.println("Thanks for playing!");
	} 

	// main
	public static void main(String[] args){
		System.out.println("Welcome to Random Guesser!");
		System.out.println("Try to guess a number exclusively between two numbers.\n");
		
		setup(); 
		results(play());
		
		input.close();
		return;
	}
}