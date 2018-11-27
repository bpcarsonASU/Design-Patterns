package test.java;

import static org.junit.Assert.assertTrue;

import design3.java.BeeD3;

import org.junit.Test;

public class BeeD3Test {

  /**
   * defaultConstructor checks that when the Bee object is initialized
   * with no passed parameters the fields are actually set to default values.
   */
  @Test
  public void defaultConstructor() {
    BeeD3 bee = new BeeD3();

    assertTrue((bee.getType()).equals("Worker"));
    assertTrue(bee.getMaxHp() == 50);
    assertTrue(bee.getCurrentHp() == 50);
    assertTrue(bee.getConstructPower() == 3);
    assertTrue(bee.getHarvestPower() == 2);
    assertTrue(bee.getBattlePower() == 1);
  }

  /**
   * paramConstructor checks that when the Bee object is initialized
   * with passed parameters the fields are actually set to the correct values.
   */
  @Test
  public void paramConstructor() {
    BeeD3 bee1 = new BeeD3("Worker");

    assertTrue((bee1.getType()).equals("Worker"));
    assertTrue(bee1.getConstructPower() == 3);

    BeeD3 bee2 = new BeeD3("Collector");

    assertTrue((bee2.getType()).equals("Collector"));
    assertTrue(bee2.getHarvestPower() == 3);

    BeeD3 bee3 = new BeeD3("Killer");

    assertTrue((bee3.getType()).equals("Killer"));
    assertTrue(bee3.getBattlePower() == 3);
  }

  /**
   * allMutators ensures that all mutator (set) methods correctly modify
   * the corresponding variables.
   */
  @Test
  public void allMutators() {
    BeeD3 bee = new BeeD3("Killer");

    bee.setType("Collector");
    bee.setMaxHp(75);
    bee.setCurrentHp(75);
    bee.setBattlePower(1);
    bee.setHarvestPower(3);
    bee.setConstructPower(1);

    assertTrue((bee.getType()).equals("Collector"));
    assertTrue(bee.getMaxHp() == 75);
    assertTrue(bee.getCurrentHp() == 75);
    assertTrue(bee.getBattlePower() == 1);
    assertTrue(bee.getHarvestPower() == 3);
    assertTrue(bee.getConstructPower() == 1);
  }

}