// Lab 9 
// Problem 2
// Employee

public class HourlyEmployee extends Employee{
    private double hourlyRate = 0, hoursWorked = 0;

    public HourlyEmployee(String name, double rate, double hours){
        super(name);
        hourlyRate = rate;
        hoursWorked = hours;
    }

    public double getPayment(){
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString(){
        String hourString = String.format("%s, hourly:$%.2f @ %.2f hours", super.name, hourlyRate, hoursWorked);
        return hourString;
    }
}