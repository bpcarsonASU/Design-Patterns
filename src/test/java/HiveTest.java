package test.java;

import static org.junit.Assert.assertTrue;

import design1.java.Hive;
import design1.java.Room;

import org.junit.Test;

public class HiveTest {

  /**
   * defaultConstructor checks that when the Hive object is initialized
   * with no passed parameters the fields are actually set to default values.
   */
  @Test
  public void defaultConstructor() {
    Hive hive = new Hive();

    assertTrue(hive.getId() == 0);
  }

  /**
   * paramConstructor checks that the variables for the Hive object
   * are properly initialized when the parameterized constructor is used.
   */
  @Test
  public void paramConstructor() {
    Hive hive = new Hive(3);

    assertTrue(hive.getId() == 3);
  }

  /**
   * mutator checks that the id value is correctly mutated using set method.
   */   
  @Test
  public void mutator() {
    Hive hive = new Hive(3);
    hive.setId(8);

    assertTrue(hive.getId() == 8);
  }

  /**
   * modifyColl ensures that all modifications to the collection (vector)
   * are correctly implemented.
   */  
  @Test
  public void modifyColl() {
    Hive hive = new Hive();

    Room room1 = new Room();
    Room room2 = new Room(13, 50);
    Room room3 = new Room(29, 65);

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
