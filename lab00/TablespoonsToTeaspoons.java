// CSCI 1851 Fall 2023
// Lab 0 Problem 3
// Nhi Pham

import java.util.Scanner;

public class TablespoonsToTeaspoons{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int tbsp = input.nextInt();
		int tsp = tbsp * 3;
		System.out.println(tsp);
		input.close();
	}
}