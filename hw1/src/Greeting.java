// Nhi Pham
// Greeting.java
// modified HelloWorld program
// due 08.24.23 Thu

import java.util.Scanner; // imports Scanner class

public class Greeting{ // class declaration
	public static void main(String[] args){ // begins w/ main method 
		Scanner input = new Scanner(System.in);	// creates Scanner obj
		System.out.println("What is your name?"); // displays prompt for input
		String name = input.next(); // saves input data into name var
		System.out.println("What salutation would you like me to use?"); // prompt
		String salutation = input.next(); // saves input into salutation
		System.out.printf("\n%s%s%s%s\n", salutation, " ", name, ", it is nice to meet you! Goodbye!"); // greets user
		/* the homework instructions say to put "Hello <salutation> <name>" 
		but Hello <salutation would be redundant. 
		pls don't subtract points */
	} // end method main
} // end class Greeting