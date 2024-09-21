// CSCI 1851 Fall 2023
// Lab 01 Problem 5
// Nhi Pham

import java.util.Scanner;

public class StudentGrader{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float testAvg = scan.nextFloat();
        float hwAvg = scan.nextFloat();
        float labAvg = scan.nextFloat();
        float finalAvg = (testAvg * 0.4f) + (labAvg * 0.1f) + (hwAvg * 0.5f);
        System.out.println(finalAvg);
        scan.close();
    }
}