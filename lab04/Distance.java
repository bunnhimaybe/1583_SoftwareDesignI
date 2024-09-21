// Lab 4
// Problem 7
// Nhi Pham

import java.util.Scanner;

public class Distance{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		double x1, y1, x2, y2, distance;

		for (int i = 0; i < cases; i++){
			x1 = input.nextDouble();
			y1 = input.nextDouble();
			x2 = input.nextDouble();
			y2 = input.nextDouble();

			distance = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
			System.out.println(distance);
		}
	}
}