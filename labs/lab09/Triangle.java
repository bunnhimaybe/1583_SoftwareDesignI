// Lab 9 
// Problem 3
// Shape

public class Triangle extends Shape{
    private double a, b, c;

    public Triangle(){
        a = 1;
        b = 1;
        c = 1;
    }

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area(){
        double s = (a + b + c) / 2;
        return Math.sqrt( s * (s - a) * (s - b) * (s - c) );
    }

    public double perimeter(){
        return a + b + c;
    }

    @Override
    public String toString(){
        return "Triangle";
    }
}