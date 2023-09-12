// ClassAverage.java
// Averages test scores for a class. Exit by entering a negative number.
//
// Nhi Pham
// due 09.10.23 Sun

import java.util.Scanner;

public class ClassAverage{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double scoreAvg = 0.0; 
        double scoreSum = 0.0;
        double scoreCount = 0.0;
        char grade = 'F'; // default score if no scores added

        System.out.print("Please begin typing your scores. Insert a negative number to end the program.\n> ");
        double temp = input.nextDouble(); // takes first score

        while (temp > 0.0){ // executes if positive number is entered
            scoreCount++; // new score was entered
            scoreSum += temp; // new score added to total
            scoreAvg = scoreSum / scoreCount; // new class average calculated
            if (scoreAvg >= 90){ // determine letter grade
                grade = 'A';
            } else if (scoreAvg >= 80){
                grade = 'B';
            } else if (scoreAvg >= 70){
                grade = 'C';
            } else if (scoreAvg >= 60){
                grade = 'D';
            }
            
            // print current average and prompt for next score
            System.out.printf("\nClass average: %.2f (graded %.0f)%n", scoreAvg, scoreCount);
            System.out.print("Enter your next score (negative to end):\n> "); 
            temp = input.nextDouble();
        }

        // final average 
        System.out.printf("\nYour class average was %.2f (grade %c) with a total of %.0f grades entered.\n", scoreAvg, grade, scoreCount);
        System.out.println("Goodbye!");
        input.close();
    }
}