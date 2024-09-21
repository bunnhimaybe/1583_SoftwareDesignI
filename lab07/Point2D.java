// Lab 7
// Problem 3
// Point 2D

public class Point2D {
    private double x; 
    private double y;

    public Point2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }

    public void moveTo(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void moveBy(double dx, double dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }

    public double distance(Point2D other){
        double value = Math.pow( (other.x - this.x), 2 ) + Math.pow( (other.y - this.y), 2 );
        value = Math.sqrt( Math.abs(value) );
        return value;
    }

    public String toString(){
        return String.format("(%.1f,%.1f)", x, y);
    }
}