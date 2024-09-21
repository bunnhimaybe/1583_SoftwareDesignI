// CSCI 1851 Fall 2023
// Lab 01 Problem 1
// Nhi Pham

import java.util.Scanner;

public class DraughtingDollars{
    public static void main(String[] args){
        //Data Model: keg ratio, price by pint, keg in gallons, gallon in ounces, pint in ounces, price by keg
        double kegInGallons = 15.5;
        double gallonInOunces = 128;
        double pintInOunces = 16;

        // Step 0: Given: keg left as percentage, price per pint
        Scanner input = new Scanner(System.in);
        double kegRatio = input.nextDouble();
        double priceOfPint = input.nextDouble();

        // Step 1: Convert kegs into ounces and pints into ounces
        double kegInOunces = kegInGallons * gallonInOunces;

        // Step 2: Determine how many ounces are left in the keg, given the percentage
        double ouncesLeft = kegInOunces * kegRatio;

        // Step 3: Determine how many pints are left in keg, i.e. beer servings
        int pintsLeft = (int) (ouncesLeft / pintInOunces);

        // Step 4: Determine price for beer left
        double priceOfKeg = priceOfPint * pintsLeft;
        
        // Step 5: Print the result as specified
        System.out.printf("There is $%.2f of beer left in keg\n", priceOfKeg);
        input.close();
    }
}
