// Lab 9
// Problem 2
// Employee

public class CommissionEmployee extends Employee{
    private double commissionRate = 0, totalSales = 0;

    public CommissionEmployee(String name, double rate, double sales){
        super(name);
        commissionRate = rate;
        totalSales = sales;
    }

    public double getPayment(){
        return commissionRate * totalSales;
    }

    @Override
    public String toString(){
        // String comString = String.format("%s, commission:%.02f% @ $%.02f sales", super.name, commissionRate, totalSales);
        String comString = String.format("%s, commission:%.2f%% @ $%.2f sales", super.name, commissionRate, totalSales);
        return comString;
    }
}