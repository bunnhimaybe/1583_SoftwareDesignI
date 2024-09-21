// CSCI 1851 Fall 2023
// Lab 03 Problem 1
// Nhi Pham
// due 09.20.23 Wed

import java.util.Scanner;

public class PrimeNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cases = Math.abs(input.nextInt());
		int number;
		boolean prime = true;

		for (int i = 0; i < cases; i++){
			number = input.nextInt();

			for (int j = 3; j < number; j++){
				if (number % j == 0){
					prime = false;
				}
			}
			System.out.printf("%s\n", String.valueOf(prime));
			prime = true;
		}
		
		input.close();
		return;
	}
}