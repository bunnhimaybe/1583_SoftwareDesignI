// Nhi Pham
// Greeting.java
// modified HelloWorld program
// due 08.24.23 Thu

import java.util.Scanner; // imports Scanner class

public class Greeting{ // class declaration
	public static void main(String[] args){ // begins w/ main method 
		Scanner input = new Scanner(System.in);	// creates Scanner obj
		System.out.println("What is your name?"); // displays prompt for input
		String name = input.nextLine(); // saves input data into name var
		System.out.println("What salutation would you like me to use?"); // prompt
		String salutation = input.nextLine(); // saves input into salutation
		System.out.printf("\n%s%s%s%s\n", salutation, " ", name, ", it is nice to meet you! Goodbye!"); // greets user
		input.close(); // frees memory
	} // end method main
} // end class Greeting