package design3.java;

import design3.java.BeeD3;

/**
 * Acts as a Bee in a system where each bee has some sort of proficiency over
 * other bees depending on its type. There are bees that construct rooms quickly,
 * others that harvest quickly, and another type that battles efficiently.
 */

public class BeeD3 {

  private String type;
  private int maxHp;
  private int currentHp;
  private int constructPower; // how effective the bee is at building (1-3)
  private int harvestPower;   // how effective the bee is at harvesting nectar (1-3)
  private int battlePower;    // how effective the bee is at battling (1-3)


  /**
   * Default constructor setting the bee automatically to Worker type.
   */
  public BeeD3() {
    type = "Worker";
    maxHp = 50;
    currentHp = 50;
    this.constructPower = 3;
    this.harvestPower = 2;
    this.battlePower = 1;
  }

  /**
   * Constructor setting the bee to the passed type.
   */
  public BeeD3(String type) {
    this.type = type;

    if (type.equals("Worker")) {
      this.maxHp = 50;
      this.currentHp = 50;
      this.constructPower = 3;
      this.harvestPower = 2;
      this.battlePower = 1;
    } else if (type.equals("Collector")) {
      this.maxHp = 50;
      this.currentHp = 50;
      this.constructPower = 1;
      this.harvestPower = 3;
      this.battlePower = 1;
    } else if (type.equals("Killer")) {
      this.maxHp = 175;
      this.currentHp = 175;
      this.constructPower = 1;
      this.harvestPower = 1;
      this.battlePower = 3;
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
   * Returns the level of construct power associated with this bee.
   */
  public int getConstructPower() {
    return constructPower;
  }

  /**
   * Sets the level of construct power associated with this bee.
   */
  public void setConstructPower(int constructPower) {
    this.constructPower = constructPower;
  }

  /**
   * Returns the level of harvest power associated with this bee.
   */
  public int getHarvestPower() {
    return harvestPower;
  }

  /**
   * Sets the level of harvest power associated with this bee.
   */
  public void setHarvestPower(int harvestPower) {
    this.harvestPower = harvestPower;
  }

  /**
   * Returns the level of battle power associated with this bee.
   */
  public int getBattlePower() {
    return battlePower;
  }

  /**
   * Sets the level of battle power associated with this bee.
   */
  public void setBattlePower(int battlePower) {
    this.battlePower = battlePower;
  }
}