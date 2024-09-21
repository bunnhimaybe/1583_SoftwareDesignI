// CSCI 1851 Fall 2023
// Lab 0 Problem 5
// Nhi Pham

import java.util.Scanner;

public class AreaOfATriangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double base = input.nextInt();
		double height = input.nextInt();
		double area = 0.5 * base * height;
		System.out.println(area);
		input.close();
	}
}