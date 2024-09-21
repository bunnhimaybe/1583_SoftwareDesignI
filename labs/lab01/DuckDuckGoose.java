// CSCI 1851 Fall 2023
// Lab 01 Problem 9
// Nhi Pham

import java.util.Scanner;

public class DuckDuckGoose{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int kids = scan.nextInt();
        int ducks = scan.nextInt();
        int goose = ducks;
        
        while  (goose >= kids) goose = goose - kids; 
        System.out.println(goose);

        scan.close();
    }
}