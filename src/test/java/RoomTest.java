package test.java;

import static org.junit.Assert.assertTrue;

import design1.java.Room;
import design1.java.SpawnRoom;

import org.junit.Test;

public class RoomTest {

    /**
    * defaultConstructor checks that when the Room object is initialized
    * with no passed parameters the fields are actually set to default values.
    */
    @Test
    public void defaultConstructor() {
        Room room = new Room();
        
        assertTrue(room.getId() == 0);
        assertTrue(room.getNumBees() == 0);
    }

    /**
    * paramConstructor checks that the variables for the Room object
    * are properly initialized when the parameterized constructor is used.
    */
    @Test
    public void paramConstructor() {
        Room room = new Room(15, 50);
        
        assertTrue(room.getId() == 15);
        assertTrue(room.getNumBees() == 50);
    }
    
    /**
    * mutator checks that the id value is correctly mutated using set method.
    */   
    @Test
    public void mutator() {
        Room room = new Room(15, 50);
        room.setId(5);
        
        assertTrue(room.getId() == 5);
        assertTrue(room.getNumBees() == 50);
    }
    
    /**
    * spawnTest ensures that the SpawnRoom extension of Room can correctly spawn
    * more bees.
    */   
    @Test
    public void spawnTest() {
        SpawnRoom room = new SpawnRoom(15, 50);
        room.spawn(5);
        
        assertTrue(room.getNumBees() == 55);
    }
}
