// Lab 7
// Problem 5
// Monster Factory

public class Monster {
    private String name;
    private int health;
    private int strength;
    private int xp;

    public Monster(String name, int health, int strength, int xp){
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.xp = xp;
    }

    public String getName(){
        return this.name;
    }

    public int getHealth(){
        return this.health;
    }

    public int getStrength(){
        return this.strength;
    }

    public int getXP(){
        return this.xp;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }
}