package design3.java;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Acts as a hive in a system where each hive contains a specific type of bee
 * and only that type. Hives are networks of Rooms.
 */

public class HiveD3 {

  private Vector<RoomD3> vec;
  private String type;
  private int id;

  /**
   * Default constructor.
   */
  public HiveD3() {
    vec = new Vector<RoomD3>();
    id = 0;
    type = "Worker";
  }

  /**
   * Constructs hive with given parameters.
   */
  public HiveD3(int id) {
    vec = new Vector<RoomD3>();
    this.id = id;
    type = "Worker";
  }

  /**
   * Adds a new room to the beehive.
   */
  public void addRoom(RoomD3 r) {
    vec.addElement(r);
  }

  /**
   * Removes a room from the beehive through looking it up by id.
   */
  public void removeRoom(int id) {
    RoomD3 target;

    for (Enumeration<RoomD3> e = vec.elements(); 
        e.hasMoreElements();) {
      RoomD3 r = (RoomD3)e.nextElement();
      int n = r.getId();

      if (n == id) {
        target = r;
        vec.remove(target);
      }
    }
  }

  /**
   * Returns room with associated id.
   */
  public RoomD3 getRoom(int id) {
    RoomD3 target = new RoomD3();

    for (Enumeration<RoomD3> e = vec.elements(); 
        e.hasMoreElements();) {
      RoomD3 r = (RoomD3)e.nextElement();
      int n = r.getId();

      if (n == id) {
        target = r;
        return target;
      }
    }

    return target;
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
   * Returns the type of inhabitants associated with this hive.
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the type of inhabitants associated with this hive.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Formats a String to display all rooms within the hive with
   * their associated id's.
   */
  public String toString() {
    String result = "";
    int count = 0;

    for (Enumeration<RoomD3> e = vec.elements(); 
        e.hasMoreElements();) {
      RoomD3 r = (RoomD3)e.nextElement();
      count++;
      result += "Room " + count + ": id = " + r.getId() + "\n";                    
    }

    return result;
  }
}

