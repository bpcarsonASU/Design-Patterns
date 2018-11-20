package design2.java;

import java.util.Enumeration;
import java.util.Vector;

/**
* Acts as a Beehive in a system where bees from different hives can battle
* each other. A Beehive holds a collection of Bees as its population.
*/

public class Beehive {
    
    private Vector<Bee> vec;

    public Beehive() {
        vec = new Vector<Bee>();
    }
    
    /**
    * Adds a new bee to the beehive.
    */
    public void addBee(Bee b) {
        vec.addElement(b);
    }
    
    /**
    * Removes a bee from the beehive through its position in the coll.
    */
    public void removeBee(int pos) {
        vec.remove(pos);
    }
    
    /**
    * Returns the collection associated with this beehive.
    */
    public Vector<Bee> getColl() {
        return vec;
    }
  
    /**
    * Returns the bee at the given position in the coll.
    */
    public Bee getBee(int pos) {
        return vec.elementAt(pos);
    }
    
    /**
    * Formats a String to display the population corresponding to this hive.
    */
    public String toString() {
        String result = "";
        int count = 0;
        
        for (Enumeration<Bee> e = vec.elements(); 
                e.hasMoreElements();) {
            Bee b = (Bee)e.nextElement();
            count++;
            result += "Bee " + count + ": " + b.getType() + " (" + b.getCurrentHp() + "/" 
                        + b.getMaxHp() + " HP)\n";
        }
        
        return result;
    }
}
