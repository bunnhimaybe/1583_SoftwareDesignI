// Lab 7
// Problem 1
// Fraction

public class Fraction {
    // instance var of the class or attributes
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        // sign is carried in numerator
        int sign = (numerator * denominator > 0 ) ? 1 : -1;
        this.numerator = sign * Math.abs(numerator);
        this.denominator = Math.abs(denominator);
    }

    public int getDenominator(){
        return this.denominator;
    }

    public int getNumerator(){
        return this.numerator;
    }

    public Fraction add(Fraction other){
        int numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int denominator = this.denominator * other.denominator;
        return simplify(numerator, denominator);
    }
    
    public Fraction subtract(Fraction other){
        int numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int denominator = this.denominator * other.denominator;
        return simplify(numerator, denominator);
    }

    public Fraction divide(Fraction other){
        int numerator = this.numerator * other.denominator;
        int denominator = this.denominator * other.numerator;
        return simplify(numerator, denominator);
    }

    public Fraction multiply(Fraction other){
        int numerator = this.numerator * other.numerator;
        int denominator = this.denominator * other.denominator;
        return simplify(numerator, denominator);
    }

    public Fraction simplify(int numerator, int denominator){
        for (int i = denominator; i > 1; i--){
            if (numerator % i == 0 && denominator % i == 0){
                numerator = numerator / i;
                denominator = denominator / i;
            }
        }
        return new Fraction(numerator, denominator);
    }

    public String toString(){
        return String.format("(%d/%d)", this.numerator, this.denominator);
    }
    
}
