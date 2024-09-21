// CSCI 1851 Fall 2023
// Lab 02 Problem 6
// due 9.12.23 wed
// Nhi Pham

import java.util.Scanner;

public class ChairScavenging{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int people = 0;
        int chairs = 0;
        int missing = 0;

        int items = input.nextInt();
        for (int i = 0; i < items; i++){
            people = input.nextInt();
            chairs = input.nextInt();
            missing = people - chairs;
            if (missing < 0) missing = 0;
            System.out.println(missing);
        }
    input.close();
    }
}