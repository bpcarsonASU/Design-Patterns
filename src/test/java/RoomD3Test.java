package test.java;

import static org.junit.Assert.assertTrue;

import design3.java.BeeD3;
import design3.java.RestRoom;
import design3.java.RoomD3;

import org.junit.Test;

public class RoomD3Test {

  /**
   * defaultConstructor checks that when the Room object is initialized
   * with no passed parameters the fields are actually set to default values.
   */
  @Test
  public void defaultConstructor() {
    RoomD3 room = new RoomD3();

    assertTrue(room.getId() == 0);
    assertTrue(room.getNumBees() == 0);
  }

  /**
   * paramConstructor checks that the variables for the Room object
   * are properly initialized when the parameterized constructor is used.
   */
  @Test
  public void paramConstructor() {
    RoomD3 room = new RoomD3(15);

    assertTrue(room.getId() == 15);
  }

  /**
   * mutator checks that the id value is correctly mutated using set method.
   */   
  @Test
  public void mutator() {
    RoomD3 room = new RoomD3(15);
    room.setId(5);

    assertTrue(room.getId() == 5);
  }

  /**
   * modifyColl tests that modifications to the collection function.
   */   
  @Test
  public void modifyColl() {
    RoomD3 room = new RoomD3(15);
    BeeD3 bee = new BeeD3("Worker");
    room.addBee(bee);

    assertTrue(room.getNumBees() == 1);

    room.removeBee(bee);

    assertTrue(room.getNumBees() == 0);
  }

  /**
   * restTest tests the functionality of the RestRoom.
   */   
  @Test
  public void restTest() {
    RestRoom room = new RestRoom(2);

    assertTrue(room.getFood() == 10);
    room.setFood(5);
    assertTrue(room.getFood() == 5);
  }
}
