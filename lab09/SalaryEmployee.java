// Lab 9
// Problem 2
// Employee

public class SalaryEmployee extends Employee{
    private double salary;
    
    public SalaryEmployee(String name, double salary){
        super(name);
        this.salary = salary;
    }

    public double getPayment(){
        return salary / 12 / 2;
    }

    @Override
    public String toString(){
        String salaryString = String.format("%s, salary:$%.02f", super.name, salary);
        return salaryString;
    }
}