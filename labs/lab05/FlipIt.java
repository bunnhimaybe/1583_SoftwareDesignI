// CSCI 1851 Fall 2023
// Lab 05 Problem 7
// Nhi Pham
// Scanner reader = new Scanner(text);
// Hello World 
// Hello,World
// Java Scanner useDelimiter

import java.util.Scanner;

public class FlipIt{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in).useDelimiter("");
		int length, cases = input.nextInt();
		String text; // reverse;

		for (int i = 0; i < cases; i++){
			while (input.hasNext()){
				text = input.next(); /*
				for (int j = text.length() - 1; j >= 0; j--){
					reverse.concat(text.charAt(j));
				} */
			}
			// System.out.println(reverse);
		}
		return;
	}
}