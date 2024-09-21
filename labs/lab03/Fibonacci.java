// CSCI 1851 Fall 2023
// Lab 03 Problem 9
// Nhi Pham
// due 09.20.23 Wed

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int term = input.nextInt();
        int Fibonacci = 0;

        for(int i = 0; i < term; i++){
            int position = input.nextInt(); // Fibonacci position
            // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
            // f(n) = f(n-1) + f(n-2)

            int n1 = 0;
            int n2 = 1;

            if (position < 2) Fibonacci = position;
            else {
                for (int j = 2; j <= position; j++){
                    Fibonacci = n1 + n2;
                    int temp = n1;
                    n1 = n2;
                    n2 += temp;
                }
            }
            System.out.println(Fibonacci);
        }

        input.close();
    }
}