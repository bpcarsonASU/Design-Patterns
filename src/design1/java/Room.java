package design1.java;

/**
* Acts as a room within a bee hive (network).
*/

public class Room {
    
    public int numBees; // Current number of bees
    private int id;
    
    public Room() {
        numBees = 0;
        id = 0;
    }
    
    public Room(int id, int numBees) {
        this.numBees = numBees;
        this.id = id;
    }

    /**
    * Returns the number of bees in the room.
    */
    public int getNumBees() {
        return numBees;
    }

    /**
    * Returns the id associated with the room.
    */
    public int getId() {
        return id;
    }
    
    /**
    * Sets the id associated with the room.
    */
    public void setId(int id) {
        this.id = id;
    }
}
