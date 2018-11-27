package design2.java;

import design2.java.Bee;

/**
 * Acts as a Bee in a system where each Bee belongs to a Beehive and the bees contain
 * functionality for battling each other. Every bee has a type as well as a health pool
 * (Max HP and Current HP).
 */

public class Bee {

  private String type;
  private int maxHp;
  private int currentHp;

  /**
   * Default constructor setting the bee automatically to Battle type.
   */
  public Bee() {
    type = "Battle";
    maxHp = 50;
    currentHp = 50;
  }

  /**
   * Constructor setting the bee to the passed type.
   */
  public Bee(String type) {
    this.type = type;

    if (type.equals("Battle")) {
      this.maxHp = 50;
      this.currentHp = 50;
    } else if (type.equals("Killer")) {
      this.maxHp = 65;
      this.currentHp = 65;
    } else if (type.equals("Elite")) {
      this.maxHp = 75;
      this.currentHp = 75;
    }
  }

  /**
   * Returns the type associated with this bee.
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the type associated with this bee.
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Returns the max HP associated with this bee.
   */
  public int getMaxHp() {
    return maxHp;
  }

  /**
   * Sets the max HP associated with this bee.
   */
  public void setMaxHp(int maxHp) {
    this.maxHp = maxHp;
  }

  /**
   * Returns the current HP associated with this bee.
   */
  public int getCurrentHp() {
    return currentHp;
  }

  /**
   * Sets the current HP associated with this bee.
   */
  public void setCurrentHp(int currentHp) {
    this.currentHp = currentHp;
  }

  /**
   * Initiates a battle between two bees, with the result returned as a boolean
   * (true if the challenger wins, false if the challenged wins). Result depends
   * on which bee has a higher current HP. If both bees have the same current HP,
   * the challenger is the winner since they had initiative.
   */
  public boolean battle(Bee other) {

    if (this.currentHp >= other.getCurrentHp()) {
      return true;
    }

    return false;
  }

}