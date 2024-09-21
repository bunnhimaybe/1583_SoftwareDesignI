// CSCI 1851 Fall 2023
// Lab 0 Problem 6
// Nhi Pham

import java.util.Scanner;

public class SecondsToMinutes{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double sec = input.nextInt();
		double min = sec / 60;
		System.out.println(min);
		input.close();
	}
}