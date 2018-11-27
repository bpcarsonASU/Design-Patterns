package test.java;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import design2.java.Bee;

import org.junit.Test;

public class BeeTest {

  /**
   * defaultConstructor checks that when the Bee object is initialized
   * with no passed parameters the fields are actually set to default values.
   */
  @Test
  public void defaultConstructor() {
    Bee bee = new Bee();

    assertTrue((bee.getType()).equals("Battle"));
    assertTrue(bee.getMaxHp() == 50);
    assertTrue(bee.getCurrentHp() == 50);
  }

  /**
   * paramConstructor checks that when the Bee object is initialized
   * with passed parameters the fields are actually set to the correct values.
   */
  @Test
  public void paramConstructor() {
    Bee bee1 = new Bee("Killer");

    assertTrue((bee1.getType()).equals("Killer"));
    assertTrue(bee1.getMaxHp() == 65);
    assertTrue(bee1.getCurrentHp() == 65);

    Bee bee2 = new Bee("Elite");

    assertTrue((bee2.getType()).equals("Elite"));
    assertTrue(bee2.getMaxHp() == 75);
    assertTrue(bee2.getCurrentHp() == 75);

    Bee bee3 = new Bee("Battle");

    assertTrue((bee3.getType()).equals("Battle"));
    assertTrue(bee3.getMaxHp() == 50);
    assertTrue(bee3.getCurrentHp() == 50);
  }

  /**
   * allMutators ensures that all mutator (set) methods correctly modify
   * the corresponding variables.
   */
  @Test
  public void allMutators() {
    Bee bee = new Bee("Killer");

    bee.setType("Elite");
    bee.setMaxHp(75);
    bee.setCurrentHp(70);

    assertTrue((bee.getType()).equals("Elite"));
    assertTrue(bee.getMaxHp() == 75);
    assertTrue(bee.getCurrentHp() == 70);
  }

  /**
   * battleTest checks the results are correct for battles between bees.
   */
  @Test
  public void battleTest() {
    Bee bee1 = new Bee("Killer");
    Bee bee2 = new Bee("Battle");
    Bee bee3 = new Bee("Battle");

    assertTrue(bee1.battle(bee2));
    assertTrue(bee2.battle(bee3));

    bee1.setCurrentHp(35);

    assertFalse(bee1.battle(bee2));
  }
}
