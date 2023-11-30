// Lab 9
// Problem 2
// Employee

public abstract class Employee{
    public String name;

    public Employee(String name){
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public abstract double getPayment();
}