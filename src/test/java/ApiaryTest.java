package test.java;

import static org.junit.Assert.assertTrue;

import design1.java.Apiary;
import design1.java.Hive;

import org.junit.Test;

public class ApiaryTest {

  Apiary ap;

  /**
   * defaultConstructor checks that when the Hive object is initialized
   * with no passed parameters the fields are actually set to default values.
   */
  @Test
  public void defaultConstructor() {     
    ap = new Apiary();
    assertTrue(ap.numHives() == 0);
  }

  /**
   * modifyColl ensures that all modifications to the collection (vector)
   * are correctly implemented.
   */  
  @Test
  public void modifyColl() {     
    ap = new Apiary();

    Hive hive1 = new Hive();
    Hive hive2 = new Hive(3);
    Hive hive3 = new Hive(10);

    ap.addHive(hive1);
    ap.addHive(hive2);
    ap.addHive(hive3);

    assertTrue((ap.toString()).equals("Number of hives in Apiary: 3"));

    ap.removeHive(10);

    assertTrue(ap.numHives() == 2);
  }
}
