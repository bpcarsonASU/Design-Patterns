package design3.java;

import design3.java.RoomD3;

/**
 * Acts as a special type of room within a bee hive (network) by holding
 * the ability to store food and let bees rest when they are weary.
 */

public class RestRoom extends RoomD3 {

  private int foodStores;

  public RestRoom(int id) {
    super(id);
    foodStores = 10;
  }

  /**
   * Returns the remaining food in this resting room.
   */
  public int getFood() {
    return foodStores;
  }

  /**
   * Sets the remaining food in this resting room.
   */
  public void setFood(int food) {
    foodStores = food;
  }

}
