// CSCI 1851 Fall 2023
// Lab 05 Problem 5
// Nhi Pham

public class DateUtil{
	static String format(int month, int day, int year){
		return String.format("%d/%d/%d", month, day, year);
	}

	static String format(String date, int year){
		return String.format("%s, %d", date, year);
	}

	static String format(String month, int day, int year){
		return String.format("%s %d, %d", month, day, year);
	}

	static String format(String month, String day, String year){
		return String.format("%s %s, %s", month, day, year);
	}
}