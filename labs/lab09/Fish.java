// Lab 9
// Problem 1
// Animal 

public class Fish extends Animal {
    public Fish(){
        super("Fish");
    }

    public void move(){
        System.out.println(super.getType() + " swims"); 
    }

    public String call(){
        return "glub glub";
    }
}