// Lab 9 
// Problem 3
// Shape

public class Circle extends Shape{
    private double radius;
    
    public Circle (){
        radius = 1;
    }

    public Circle (double radius){
        this.radius = radius;
    }

    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Circle";
    }
}