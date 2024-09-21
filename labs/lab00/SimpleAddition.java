// CSCI 1851 Fall 2023
// Lab 0 Problem 4
// Nhi Pham

import java.util.Scanner;

public class SimpleAddition{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = n1 + n2;
		System.out.println(n3);
		input.close();
	}
}