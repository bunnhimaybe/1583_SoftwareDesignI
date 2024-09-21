// CSCI 1851 Fall 2023
// Lab 0 Problem 2
// Nhi Pham

import java.util.Scanner;

public class MinutesToSeconds{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int min = input.nextInt();
		int sec = min * 60;
		System.out.println(sec);
		input.close();
	}
}