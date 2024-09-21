import java.util.Scanner;

public class Factorials{
	public static long factorial(int n){
	if (n == 0){
		return 1;
	} else {
		return n * factorial(n - 1);
	}
}

public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		for (int i = 0; i < cases; i++){
			System.out.println(factorial(input.nextInt()));
		}
	}
}

