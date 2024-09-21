// CSCI 1851 Fall 2023
// Lab 03 Problem 3
// Nhi Pham

import java.util.Scanner;

public class RSAPrivateKey{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		long a, m, x = 0;

		for (int i = 0; i < cases; i++){
			a = input.nextLong();
			m = input.nextLong();
			x = 2 * (m / a);

			System.out.println(x);
		}

		input.close();
		return;
	}
}