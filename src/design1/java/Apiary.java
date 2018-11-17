package design1.java;

import java.util.Enumeration;
import java.util.Vector;

/**
* Acts as an Apiary (collection of bee hives) by containing a network of
* hives and rooms.
*/

public class Apiary {

    private static Vector<Hive> vec; // Only one Apiary should exist
    
    public Apiary() {
        vec = new Vector<Hive>();
    }
 
    /**
    * Adds a new hive to the Apiary.
    */
    public void addHive(Hive h) {
        vec.addElement(h);
    }

    /**
    * Removes a hive from the Apiary through looking it up by id.
    */
    public void removeHive(int id) {
        Hive target;
        
        for (Enumeration<Hive> e = vec.elements(); 
                e.hasMoreElements();) {
            Hive h = (Hive)e.nextElement();
            int n = h.getId();
            
            if (n == id) {
                target = h;
                vec.remove(target);
            }
        }
    }
    
    /**
    * Returns the amount of components (hives) in the collection.
    */
    public int numHives() {
        return vec.size();
    }
    
    /**
    * Formats a String to display the number of hives in this Apiary.
    */
    public String toString() {
        String result = "Number of hives in Apiary: " + numHives();
        return result;
    }
}
