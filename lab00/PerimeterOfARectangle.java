// CSCI 1851 Fall 2023
// Lab 0 Problem 8
// Nhi Pham

import java.util.Scanner;

public class PerimeterOfARectangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double height = input.nextInt();
		double width = input.nextInt();
		double perimeter = 2 * (height + width);
		System.out.println(perimeter);
		input.close();
	}
}