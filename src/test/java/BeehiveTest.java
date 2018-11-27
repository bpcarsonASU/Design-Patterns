package test.java;

import static org.junit.Assert.assertTrue;

import design2.java.Bee;
import design2.java.Beehive;

import org.junit.Test;

public class BeehiveTest {

  Beehive hive = new Beehive();

  /**
   * defaultConstructor checks that when the Beehive object is initialized
   * with no passed parameters the fields are actually set to default values.
   */
  @Test
  public void defaultConstructor() {

    assertTrue(hive.getColl() != null);

  }

  /**
   * modifyColl ensures that all modifications to the collection (vector)
   * are correctly implemented.
   */  
  @Test
  public void modifyCollection() {      

    assertTrue(hive.getColl().size() == 0);

    Bee bee1 = new Bee("Battle");
    Bee bee2 = new Bee("Killer");
    Bee bee3 = new Bee("Elite");

    hive.addBee(bee1);
    hive.addBee(bee2);
    hive.addBee(bee3);

    assertTrue(hive.getColl().size() == 3);
    assertTrue((hive.getBee(0).getType()).equals("Battle"));
    assertTrue((hive.getBee(1).getType()).equals("Killer"));
    assertTrue((hive.getBee(2).getType()).equals("Elite"));

    hive.removeBee(2);

    assertTrue(hive.getColl().size() == 2);
  }

  /**
   * stringTest ensures that the toString method delivers a proper String
   * detailing the bee population in the hive.
   */  
  @Test
  public void stringTest() {
    Bee bee1 = new Bee("Battle");
    Bee bee2 = new Bee("Killer");
    Bee bee3 = new Bee("Elite");

    hive.addBee(bee1);
    hive.addBee(bee2);
    hive.addBee(bee3);

    assertTrue((hive.toString()).equals("Bee 1: Battle (50/50 HP)\n" 
        + "Bee 2: Killer (65/65 HP)\n" 
        + "Bee 3: Elite (75/75 HP)\n"));
  }
}
