package design1.java;

import java.util.Enumeration;
import java.util.Vector;

/**
* Acts as a hive within an Apiary. A hive can hold an unlimited number 
* of rooms in its network.
*/

public class Hive {

    private Vector<Room> vec;
    private int id;

    public Hive() {
        vec = new Vector<Room>();
        id = 0;
    }
    
    public Hive(int id) {
        vec = new Vector<Room>();
        this.id = id;
    }
    
    /**
    * Adds a new room to the beehive.
    */
    public void addRoom(Room r) {
        vec.addElement(r);
    }
    
    /**
    * Removes a room from the beehive through looking it up by id.
    */
    public void removeRoom(int id) {
        Room target;
        
        for (Enumeration<Room> e = vec.elements(); 
                e.hasMoreElements();) {
            Room r = (Room)e.nextElement();
            int n = r.getId();
            
            if (n == id) {
                target = r;
                vec.remove(target);
            }
        }
    }
    
    /**
    * Returns the id associated with this hive.
    */
    public int getId() {
        return id;
    }
    
    /**
    * Sets the id associated with this hive.
    */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
    * Formats a String to display all rooms within the hive with
    * their associated id's.
    */
    public String toString() {
        String result = "";
        int count = 0;
        
        for (Enumeration<Room> e = vec.elements(); 
                e.hasMoreElements();) {
            Room r = (Room)e.nextElement();
            count++;
            result += "Room " + count + ": id = " + r.getId() + "\n";                    
        }
        
        return result;
    }
}
