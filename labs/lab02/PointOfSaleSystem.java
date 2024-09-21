// CSCI 1851 Fall 2023
// Lab 02 Problem 2
// due 9.12.23 wed
// Nhi Pham

import java.util.Scanner;
import java.lang.Integer;

public class PointOfSaleSystem{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double subtotal = 0;
        double tax = 1.065;

        int items = input.nextInt();
        input.nextLine();
        for (int i = 0; i < items; i++){
            String[] order = input.nextLine().split(" ");

            for (String selection:order){
                int choice = Integer.parseInt(selection);
                
                switch (choice){
                    case 1:
                        subtotal += 1.5;
                        break;
                    case 2:
                        subtotal += 1.75;
                        break;
                    case 3:
                        subtotal += 2.5;
                        break;
                    case 4: 
                        subtotal += 2.75;
                        break;
                    case 5:
                        subtotal += .99;
                        break;
                    case 6:
                        subtotal += 1.25;
                        break;
                }
            }
        }

        double total = subtotal * tax;
        System.out.printf("Please pay $%.2f%nThank you for eating at McDowell's!%n", total);
        input.close();
    }
}