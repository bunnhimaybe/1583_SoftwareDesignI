// Lab 4
// Problem 8
// Nhi Pham
import java.util.Scanner;

public class EnemyMove{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		double x1, y1, x2, y2, speed, distance;

		for (int i = 0; i < cases; i++){
			x1 = input.nextDouble();
			y1 = input.nextDouble();
			speed = input.nextDouble();
			x2 = input.nextDouble();
			y2 = input.nextDouble();

			distance = Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );

			if (speed < distance){
				x1 = x1 + speed / distance * (x2 - x1);
				y1 = y1 + speed / distance * (y2 - y1);
			} else {
				x1 = x2;
				y1 = y2;
			}

			System.out.printf("x = %.1f, y = %.1f\n", x1, y1);
		}

		input.close();
		return;
	}
}