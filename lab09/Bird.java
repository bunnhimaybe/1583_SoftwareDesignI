// Lab 9
// Problem 1
// Animal 

public class Bird extends Animal {
    public Bird(){
        super("Bird");
    }

    public void move(){
        System.out.println(super.getType() + " flies"); 
    }

    public String call(){
        return "chirp chirp";
    }
}