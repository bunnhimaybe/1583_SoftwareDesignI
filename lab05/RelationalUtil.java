// CSCI 1851 Fall 2023
// Lab 05 Problem 4
// Nhi Pham

public class RelationalUtil{
	static boolean isIncreasing(int x, int y, int z){
		return (x < y && y < z);
	}

	static boolean isDecreasing(int x, int y, int z){
		return (x > y && y > z);
	}

	static boolean isBetween(int x, int y, int z){
		return (x < y && y < z);
	}

	static boolean isPositive(int x){
		return (x > 0);
	}

	static boolean isNegative(int x){
		return !isPositive(x); // (x < 0)
	}

	static boolean overlaps(int min1, int max1, int min2, int max2){
		/* 	min1 ------------ max1
					min2 ------------ max2
			min2 ------------ max2
					min1 ------------ max1 */
		return (min2 <= max1 && max2 >= min1);
	}
}