// CSCI 1851 Fall 2023
// Lab 02 Problem 3
// due 9.12.23 wed
// Nhi Pham

import java.util.Scanner;

public class AnInterestingProblem{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        double balance = 0;
        double interest = 0;
        int years;

        for (int i = 0; i < cases; i++){
            input.nextLine();
            balance = input.nextDouble();
            interest = input.nextDouble();
            years = 0;
            while (balance < 1000000){
                balance = (1+ .01 * interest) * balance;
                years++;
            }

            System.out.printf("%d years%n", years);
        }
        input.close();
    }
}