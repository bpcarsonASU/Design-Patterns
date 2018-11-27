package design3.java;

import java.util.Vector;

/**
 * Acts as a room within a bee hive (network).
 */

public class RoomD3 {

  private Vector<BeeD3> vec;
  private int id;

  public RoomD3() {
    vec = new Vector<BeeD3>();
    id = 0;
  }

  public RoomD3(int id) {
    vec = new Vector<BeeD3>();
    this.id = id;
  }

  /**
   * Adds a new bee to the room.
   */
  public void addBee(BeeD3 b) {
    vec.addElement(b);
  }

  /**
   * Removes a bee from the room.
   */
  public void removeBee(BeeD3 b) {
    vec.remove(b);
  }

  /**
   * Returns the number of bees in the room.
   */
  public int getNumBees() {
    return vec.size();
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
