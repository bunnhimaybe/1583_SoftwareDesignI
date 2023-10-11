/*  Random Guesser
    
    Homework 5
    Nhi Pham
    due 10/11 Wed

*/

import java.util.Scanner;
import java.util.Random;

public class RandomGuesser{
	private static int MAX_BOUND, MIN_BOUND, MAX_GUESSES, SECRET, RANGE, temp = 0; // constants
	private static int[] gameRecord; // keep track of guesses
	private enum Grade {PASS, EXCELLENT, GOOD, FAILED, LUCKY}; // guess grading
	public static Scanner input = new Scanner(System.in);

	public RandomGuesser(){ // constructor
		gameRecord = new int[MAX_GUESSES];
	}

	public static void setup(){ // set constants
		System.out.println("Hello! We're going to play a game.");
		System.out.println("Try to guess a number between two numbers.");

		do { // set range
			System.out.print("\nGive me a number: ");
			MIN_BOUND = input.nextInt();
			System.out.print("\nGive me another number: ");
			MAX_BOUND = input.nextInt();

			if (MAX_BOUND < MIN_BOUND) { // switch MIN/MAX if second number is smaller
				temp = MAX_BOUND;
				MAX_BOUND = MIN_BOUND;
				MIN_BOUND = temp;
			}

			RANGE = MAX_BOUND - MIN_BOUND; // validate range
			if (RANGE < 2){
				System.out.println("ERROR: INVALID RANGE");
				System.out.println("There must be at least two possible integers in your range (noninclusive). Try again!");
			} else if (RANGE == 2){ 
				System.out.println("ERROR: CHEATER");
				System.out.println("There is only one possible number in that range.");
				System.out.println("This isn't fun if you don't have to guess. Try again!");
			} else {
				Random rand = new Random();
				SECRET = MIN_BOUND + rand.nextInt(RANGE - 1) + 1; // random number between MIN_BOUND and MAX_BOUND
				System.out.printf("\nGreat! I chose a number between %d and %d.", MIN_BOUND, MAX_BOUND); // valid range
			}
		} while (RANGE <= 2); 

		do { // set # of guesses
			System.out.print("\nHow many times would you like to guess?: ");
			MAX_GUESSES = input.nextInt();

			if (MAX_GUESSES <= 0){
				System.out.println("ERROR: YOU HAVE TO GUESS AT LEAST ONCE");
				System.out.println("You should enter a positive number. Try again!");
			}
		} while (MAX_GUESSES <= 0);
		
		System.out.println("\nGOOD LUCK !\n");
		System.out.println("-----\n"); // finished game setup
	}

	/*
	public static int guess(){
		int n;
		for (n = 0; n < MAX_GUESSES; n++){
			System.out.print("Guess a number: ");
			gameRecord[n] = input.nextInt();

			if (gameRecord[n] == SECRET){
				return n;
			}

			for (int j = 0; j < n; j++){
				if (gameRecord[j] == gameRecord[n]){
					if (RandomGuesser.warned() == true){
						System.out.println("You lose because you're silly.");
						return n;
					} else {
						gameRecord[n] = input.nextInt(); // enter another number
					}
				}
			}
		}
		return n;
	}
	*/

	public static boolean warned(){
		if (temp != -1){
			System.out.println("ERROR: DUPLICATE GUESS");
			System.out.println("You've already guessed that number. This is your only warning!");
			System.out.print("Try again.");

			temp = -1;
			return false;
		} else return true;
	}

	public static void main(String[] args){
		RandomGuesser.setup();
		RandomGuesser game = new RandomGuesser();
		// RandomGuesser.guess();

		int n;

		for (n = 0; n < MAX_GUESSES; n++){
			System.out.print("Guess a number: ");
			gameRecord[n] = input.nextInt();

			for (int j = 0; j < n; j++){ // check if warned about duplicate guess
				if (gameRecord[j] == gameRecord[n]){
					if (RandomGuesser.warned() == true){
						System.out.println("You lose because you're silly.");
					} else {
						n--; // repeat loop
					}
				}
			}

			if (gameRecord[n] == SECRET){
				System.out.println("Nice! That's correct.");
			}
		}

		if (n == MAX_GUESSES){
			System.out.printf("Sorry, the number was %d. You suck.\n", SECRET);
		}
		
		input.close();
		return;
	}

}