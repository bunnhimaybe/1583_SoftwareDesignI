// Lab 04
// Problem 5
// Nhi Pham
// due Thu 10/5
import java.util.Scanner;

public class Autocorrect{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();
        input.nextLine(); // consume \n from buffer after hitting newLine

        for (int i = 0; i < testCases; i++){
            String first = input.nextLine();
            String second = input.nextLine();
            String result = textReplacement(first, second);
            System.out.println(result);
        }
    }

    public static String textReplacement(String text, String replacement){
        Scanner reader = new Scanner(replacement);
        
        while(reader.hasNext()){
            /* Helo Wolrd
             * Helo Hello Wolrd */
            String oldWord = reader.next(); // 1st, 3rd, 5th, ... word in 2nd input line
            String newWord = reader.next(); // 2nd, 4th, 6th, ... word in 2nd input line
            text = text.replace(oldWord, newWord);
        }
        return text;
    }
}