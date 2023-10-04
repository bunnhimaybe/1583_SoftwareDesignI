import java.util.Scanner;

public class FizzBuzz{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		int number;

		for (int i = 0; i < cases; i++){
			number = input.nextInt();
			if (number % 3 == 0){
				System.out.print("fizz");
			}
			if (number % 5 == 0){
				System.out.print("buzz");
			}
			if (number % 3 != 0 && number % 5 != 0){
				System.out.print(number);
			}
			System.out.println();
		}

		input.close();
		return;
	}
}