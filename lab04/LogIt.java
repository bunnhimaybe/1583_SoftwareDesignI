// Lab 4
// Problem 6
// Nhi Pham

import java.util.Scanner;

public class LogIt{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		int max = 0, guesses = 0;

		for (int i = 0; i < cases; i++){
			max = input.nextInt();
			guesses = (int) Math.ceil((Math.log(max))/Math.log(2));
			System.out.println(guesses);
		}

		input.close();
		return;
	}
}