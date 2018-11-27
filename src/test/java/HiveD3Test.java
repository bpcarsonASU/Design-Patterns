package test.java;

import static org.junit.Assert.assertTrue;

import design3.java.HiveD3;
import design3.java.RoomD3;

import org.junit.Test;

public class HiveD3Test {

    /**
    * defaultConstructor checks that when the Hive object is initialized
    * with no passed parameters the fields are actually set to default values.
    */
    @Test
    public void defaultConstructor() {
        HiveD3 hive = new HiveD3();
        
        assertTrue(hive.getId() == 0);
        assertTrue(hive.getType().equals("Worker"));
    }
    
    /**
    * paramConstructor checks that the variables for the Hive object
    * are properly initialized when the parameterized constructor is used.
    */
    @Test
    public void paramConstructor() {
        HiveD3 hive = new HiveD3(3);
        
        assertTrue(hive.getId() == 3);
        assertTrue(hive.getType().equals("Worker"));
    }
    
    /**
    * mutator checks that the mutator functions correctly set values.
    */   
    @Test
    public void mutator() {
        HiveD3 hive = new HiveD3(3);
        hive.setId(8);
        hive.setType("Killer");
        
        assertTrue(hive.getId() == 8);
        assertTrue(hive.getType().equals("Killer"));
    }
    
    /**
    * modifyColl ensures that all modifications to the collection (vector)
    * are correctly implemented.
    */  
    @Test
    public void modifyColl() {
        HiveD3 hive = new HiveD3();
        
        RoomD3 room1 = new RoomD3();
        RoomD3 room2 = new RoomD3(13);
        RoomD3 room3 = new RoomD3(29);
        
        hive.addRoom(room1);
        hive.addRoom(room2);
        hive.addRoom(room3);
        
        assertTrue((hive.toString()).equals("Room 1: id = 0\n" 
                    + "Room 2: id = 13\n" + "Room 3: id = 29\n"));
        
        hive.removeRoom(13);
        
        assertTrue((hive.toString()).equals("Room 1: id = 0\n" 
                    + "Room 2: id = 29\n"));
    }
}
