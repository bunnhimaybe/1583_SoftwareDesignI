// CSCI 1851 Fall 2023
// Lab 01 Problem 4
// Nhi Pham

import java.util.Scanner;

public class BouncerBot{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int currentMonth = scan.nextInt();
        int currentDay = scan.nextInt();
        int currentYear = scan.nextInt();
        int birthMonth = scan.nextInt();
        int birthDay = scan.nextInt();
        int birthYear = scan.nextInt();
        int age = currentYear - birthYear;

        if (age >= 21 && currentMonth == birthMonth && currentDay == birthDay){
                System.out.println(true);
        } else {
            System.out.println(false);
        }
        scan.close();
    }
}