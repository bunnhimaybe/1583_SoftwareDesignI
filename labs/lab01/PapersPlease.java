// CSCI 1851 Fall 2023
// Lab 01 Problem 3
// Nhi Pham

import java.util.Scanner;

public class PapersPlease{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        boolean passport = input.nextBoolean(); 
        boolean driverID = input.nextBoolean();
        boolean birthID = input.nextBoolean();
        
        if (passport == true){
            System.out.println("true");
        }
        else if(driverID == true && birthID == true){
            System.out.println("true");
        } 
        else System.out.println("false");
        input.close();        
    }
}