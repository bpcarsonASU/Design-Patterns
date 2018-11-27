package design1.java;

/**
 * Acts as a special type of room within a bee hive (network) by holding
 * the ability to spawn more bees.
 */

public class SpawnRoom extends Room {

  public SpawnRoom(int numBees, int id) {
    super(id, numBees);
  }

  /**
   * Spawns additional bees for this room.
   */
  public void spawn(int bees) {
    this.numBees += bees;
  }

}
