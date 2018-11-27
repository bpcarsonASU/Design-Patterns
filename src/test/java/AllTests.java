package test.java;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ApiaryTest.class, BeeD3Test.class, BeehiveTest.class, BeeTest.class, HiveD3Test.class, HiveTest.class,
    RoomD3Test.class, RoomTest.class })
public class AllTests {

}
