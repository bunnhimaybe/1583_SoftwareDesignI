// Lab 7
// Problem 2
// Dungeon Crawl

public class Room {
    private String name;
    private String description;
    private Room north;
    private Room south;
    private Room east;
    private Room west;

    public Room(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return this.name;
    }
    
    // getters
    public String getNorth(){
        return this.north.name;
    }

    public String getEast(){
        return this.east.name;
    }

    public String getWest(){
        return this.west.name;
    }

    public String getSouth(){
        return this.south.name;
    }

    public String getExits(){
        String exits = "";
        if (this.north != null)
            exits += String.format("[N]orth: %s\n", getNorth());
        if (this.east != null)
            exits += String.format("[E]ast: %s\n", getEast());
        if (this.west != null)
            exits += String.format("[W]est: %s\n", getWest());
        if (this.south != null)
            exits += String.format("[S]outh: %s\n", getSouth());
        return exits;
    }

    public String toString(){
        return String.format("[%s]\n%s\n%s", getName(), this.description, getExits());

    }

    // setters
    public void setExits(Room n, Room e, Room w, Room s){
        this.north = n;
        this.east = e;
        this.west = w;
        this.south = s;
    }

}
