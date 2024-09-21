// Lab 8
// Problem 2
// RGBColor

public class RGBColor{

    private int red, green, blue;

    public RGBColor(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public boolean equals(RGBColor other){
        if(this.red == other.red && this.green == other.green && this.blue == other.blue) {
            return true;
        } else return false;
    }

    public int getRed(){
        return this.red;
    }
    
    public int getBlue(){
        return this.blue;
    }

    public int getGreen(){
        return this.green;
    }

    public String toString(){
        return String.format("rgb(%d,%d,%d)", getRed(), getGreen(), getBlue());
    }

    public String toHex(){
        return String.format("#%02x%02x%02x", getRed(), getGreen(), getBlue());
    }

}