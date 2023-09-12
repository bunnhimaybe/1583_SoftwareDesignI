// Nhi Pham
// ClassAverage.java
// Averages test scores for a class. Exit by entering a negative number.
// due 09.10.23 Sun

import java.util.Scanner;

public class ClassAverage{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double temp = 1.0; 
        double scoreAvg = 0.0;
        double scoreSum = 0.0;
        double scoreCount = 0.0;
        char grade = 'F';

        System.out.print("Please begin typing your scores. Insert a negative number to end the program.\n> ");
        temp = input.nextDouble();

        while (temp > 0.0){
            scoreCount++;
            scoreSum += temp;
            scoreAvg = scoreSum / scoreCount;
            if (scoreAvg >= 90){
                grade = 'A';
            } else if (scoreAvg >= 80){
                grade = 'B';
            } else if (scoreAvg >= 70){
                grade = 'C';
            } else if (scoreAvg >= 60){
                grade = 'D';
            }
            
            System.out.printf("\nClass average: %.2f (graded %.0f)%n", scoreAvg, scoreCount);
            System.out.print("Enter your next score (negative to end):\n> "); 
            temp = input.nextDouble();
        }

        System.out.printf("\nYour class average was %.2f (grade %c) with a total of %.0f grades entered.\n", scoreAvg, grade, scoreCount);
        System.out.println("Goodbye!");
        input.close();
    }
}