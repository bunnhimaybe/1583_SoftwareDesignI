// CSCI 1851 Fall 2023
// Lab 02 Problem 1
// due 9.12.23 wed
// Nhi Pham

import java.util.Scanner;

public class SummingItUp{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        int sum = 0;
        
        for (int i = 0; i < testCases; i++){
            int start = input.nextInt();
            int end = input.nextInt();

            if (start > end){
                int temp = start;
                start = end;
                end = temp;
            }
            for (int j = start; j <= end; j++){
                sum = sum + j;
            }
            System.out.println(sum);
            sum = 0;
        }
        input.close();
    }
}