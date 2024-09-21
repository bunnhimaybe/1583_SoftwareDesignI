// CSCI 1851 Fall 2023
// Lab 01 Problem 2
// Nhi Pham

import java.util.Scanner;

public class BloggingInHTML{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        String header = input.nextLine();
        String filePath = input.nextLine();
        String text = input.nextLine();
        String author = input.nextLine();
        String date = input.nextLine();

        System.out.print("<html><body>");   // open HTML and body tags
        System.out.printf("%s%s%s", "<h1>", header, "</h1>");   // heading
        System.out.printf("%s%s%s", "<img src=\'", filePath, "' \"/>");   // image source
        System.out.printf("%s%s%s", "<p>", text, "</p>");   // paragraph
        System.out.printf("%s%s%s%s%s", "<small>By ", author, ", ", date, "</small>");   // author and date in small text
        System.out.print("</body></html>");   // close HTML and body tags

        input.close();
    }
}