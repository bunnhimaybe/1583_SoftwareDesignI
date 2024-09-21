// Lab 4
// Problem 2
// Nhi Pham
// due Thu 10/5

public class Time{
    public static double secondsToMinutes(int seconds){
        return (double) seconds / 60;
    }

    public static double secondsToHours(int seconds){
        return (double) seconds / 3600.0;
    }

    public static double secondsToDays(int seconds){
        return (double) seconds / 8640;
    }

    public static double secondsToYears(int seconds){
        return (double) seconds / 31536000;
    }

    public static double minutesToSeconds(double minutes){
        return minutes * 60;
    }

    public static double hoursToSeconds(double hours){
        return hours * 3600;
    }

    public static double daysToSeconds(double days){
        return days * 8640;
    }

    public static double yearsToSeconds(double years){
        return years * 31536000;
    }
}