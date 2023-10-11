/*  Random Guesser
    
    Homework 5
    Nhi Pham
    due 10/11 Wed

*/

import java.util.Scanner;
import java.util.Random;

public class RandomGuesser{
	private int MAX_BOUND, MIN_BOUND, MAX_GUESSES;

	public RandomGuesser(){ // constructor
		// Greeting
		System.out.println("Hello! We're going to play a game.")
	}

	public static void main(String[] args){
		RandomGuesser game = new RandomGuesser();
		Scanner input = new Scanner(System.in);

		game.close();
		input.close();
		return;
	}
}