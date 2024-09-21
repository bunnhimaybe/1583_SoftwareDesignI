// CSCI 1851 Fall 2023
// Lab 03 Problem 2
// Nhi Pham
// due 09.20.23 Wed

import java.util.Scanner;

public class RSAPublicKey{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		long p, q, e, n = 0, totient = 0;
		boolean composite = false;

		for (int i = 0; i < cases; i++){
			p = input.nextInt();
			q = input.nextInt();
			e = input.nextInt();
			n = p * q;
			totient = (p - 1) * (q - 1); 

			/*
			if (n == 0 || n == 1 || n == 2){
				invalid = true;
			} else if ((e < n && e % n == 0) || e > totient || e < 2){
				System.out.println("Invalid e for RSA Key!");
				invalid = true;
			} else {
				for (int j = (int) n - 1; j > 1; j--){
					if (n % j == 0){
						invalid = true;
					}
				}
			}

			if (invalid == false){
				System.out.printf("RSA Public Key: n=%d e=%d\n", n, e);
			} */

			if (e % n == 0 || e > totient || e < 2){
				System.out.println("Invalid e for RSA Key!");
			} else {

				if (n == 0 || n == 1 || n == 2)
					System.out.println("Invalid n for RSA Key!");
				else {
					for (int j = (int) n - 1; j > 2; j--){
						if (n % j == 0)
							composite = true;
					}
					if (composite != true){
						System.out.println("Invalid n for RSA Key!");
					} else 
						System.out.printf("RSA Public Key: n=%d e=%d\n", n, e);
				}
			}
		}

		input.close();
		return;
	}
}