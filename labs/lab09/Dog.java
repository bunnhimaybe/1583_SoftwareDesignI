// Lab 9
// Problem 1
// Animal 

public class Dog extends Animal {
    public Dog(){
        super("Dog"); // calling super class's constructor
    }

    public void move(){
        System.out.println(super.getType() + " runs"); 
    }

    public String call(){
        return "roof roof";
    }
}