// Lab 9 
// Problem 3
// Shape

public class Rectangle extends Shape{
    private double width, length;

    public Rectangle(){
        width = 1; 
        length = 1;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double area(){
        return width * length;
    }

    public double perimeter(){
        return 2 * (width + length);
    }

    @Override
    public String toString(){
        return "Rectangle";
    }
}