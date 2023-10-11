/*  Sum of Digits
    
    Homework 4
    Nhi Pham
    due 10/3 Tue

    Calculates the sum of individual digits in a given positive integer. 
    Continues to calculate the sum to get a single digit. 
*/

import java.util.Scanner;

public class SumOfDigits{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int value = Math.abs(input.nextInt());  // takes absoloute value of input
        int temp = value;                       // temp contains working number, beginning with value input
        
        while (temp != 0){                      // loops until all digits have been added
            sum += temp % 10;                       // last digit of working number added to sum
            temp /= 10;                             // last digit is removed from working number
            if (temp == 0 && sum > 10) {                // if sum of digits in working number is more than one digit, 
                temp = sum;                             // set sum as nworking number
                sum = 0;                                // reset sum
            }
        }
        
        System.out.println(sum);                // output final single-digit sum
        input.close();                          // that's it
    }
}
