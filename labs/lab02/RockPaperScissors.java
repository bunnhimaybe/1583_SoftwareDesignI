// CSCI 1851 Fall 2023
// Lab 02 Problem 7
// due 9.12.23 wed
// Nhi Pham

import java.util.Scanner;

public class RockPaperScissors{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();
        String player1;
        String player2;
        int winner = 0;
        
        for (int i = 0; i < cases; i++){
            player1 = input.next();
            player2 = input.next();

            switch ("player1"){
                case "rock":
                    if (player2 == "paper") winner = 2;
                    else if (player2 == "scissors") winner = 1;
                    break;
                case "paper":
                    if (player2 == "rock") winner = 1;
                    if (player2 == "scissors") winner = 2;
                    break;
                case "scissors":
                    if (player2 == "rock") winner = 1;
                    else if (player2 == "paper") winner = 2;
                    break;
                default:
                    winner = 0;
                }
        }

        if (winner == 0) System.out.println("Tie!");
        if (winner == 1) System.out.println("Player 1 wins!");
        else if (winner == 2) System.out.println("Player 2 wins!");
        
        input.close();
        return;
    }
}