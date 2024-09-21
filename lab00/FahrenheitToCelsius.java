// CSCI 1851 Fall 2023
// Lab 0 Problem 7
// Nhi Pham

import java.util.Scanner;

public class FahrenheitToCelsius{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double ftemp = input.nextInt();
		double ctemp = (ftemp - 32.0) * (5.0/9);
		System.out.println(ctemp);
		input.close();
	}
}