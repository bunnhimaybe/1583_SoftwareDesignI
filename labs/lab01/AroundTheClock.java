// CSCI 1851 Fall 2023
// Lab 01 Problem 8
// Nhi Pham

import java.util.Scanner;

public class AroundTheClock{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int depart = scan.nextInt();
        int travel = scan.nextInt();
        int arrival = depart + travel;
        
        while (arrival >=12) arrival = arrival - 12;
        System.out.println(arrival);

        scan.close();
    }
}