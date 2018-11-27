package main.java;

import design1.java.Apiary;
import design1.java.Hive;
import design1.java.Room;
import design1.java.SpawnRoom;
import design2.java.Bee;
import design2.java.Beehive;
import design3.java.BeeD3;
import design3.java.HiveD3;
import design3.java.RestRoom;
import design3.java.RoomD3;

import java.util.Scanner;

/**
 * Tests all design patterns and proves their functionality towards at least one
 * requirement.
 */

public class Main {

  /**
   * Main method displaying all patterns.
   */
  public static void main(String[] args) {   

    Scanner scan = new Scanner(System.in);
    System.out.println("Which design pattern would you like to test?");
    System.out.println("Type '1' for the first design pattern");
    System.out.println("Type '2' for the second design pattern");
    System.out.println("Type '3' for the third design pattern");

    String input = scan.nextLine();
    int value = Integer.parseInt(input);

    if (!(value == 1 || value == 2 || value == 3)) {
      System.out.println("Please provide valid input next time.");
      scan.close();
      return;
    } else {
      if (value == 1) {
        design1();
      } else if (value == 2) {
        design2();
      } else if (value == 3) {
        design3();
      }
    }

    scan.close();
  }

  /**
   * First design pattern.
   */
  public static void design1() {
    Apiary ap = new Apiary();
    Hive hive1 = new Hive(0);
    Hive hive2 = new Hive(1);
    Hive hive3 = new Hive(2);

    ap.addHive(hive1);
    ap.addHive(hive2);
    ap.addHive(hive3);

    for (int i = 0; i < 2; i++) {
      Room room = new Room(i, 30);
      hive1.addRoom(room);
      hive2.addRoom(room);
      hive3.addRoom(room);
    }

    System.out.println("This a builder pattern: One Apiary has been created with " 
        + "three hives and two rooms in each.");

    SpawnRoom spawner = new SpawnRoom(30, 0);

    System.out.println("\nA spawn room has been created with 30 bees in it.");
    spawner.spawn(20);

    System.out.println("\n20 bees have been spawned, there are now " 
        + spawner.getNumBees() + " bees in this room");
  }

  /**
   * Second design pattern.
   */
  public static void design2() {

    Beehive hive1 = new Beehive();
    Beehive hive2 = new Beehive();
    Beehive hive3 = new Beehive();

    for (int i = 0; i < 3; i++) {

      Bee b1 = new Bee("Battle");
      Bee b2 = new Bee("Battle");
      Bee b3 = new Bee("Killer");
      Bee b4 = new Bee("Killer");
      Bee b5 = new Bee("Elite");

      if (i == 0) {
        hive1.addBee(b1);
        hive1.addBee(b2);
        hive1.addBee(b3);
        hive1.addBee(b4);
        hive1.addBee(b5);
      } else if (i == 1) {
        hive2.addBee(b1);
        hive2.addBee(b2);
        hive2.addBee(b3);
        hive2.addBee(b4);
        hive2.addBee(b5);
      } else {
        hive3.addBee(b1);
        hive3.addBee(b2);
        hive3.addBee(b3);
        hive3.addBee(b4);
        hive3.addBee(b5);
      }
    }

    System.out.println("Three beehives have been created: each hive contains two Battle" 
        + "bees (50 HP), two Killer bees (65 HP), and one Elite bee (75 HP).\n");

    System.out.println("The first battle is about to erupt!");
    int count = 0;
    String input;
    Scanner scan = new Scanner(System.in);

    do {
      System.out.println("\nPress ENTER to view the next battle");
      input = scan.nextLine();
      count++;
      boolean result;

      if (count == 1) {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Killer bee #1 from the first beehive challenges Battle" 
            + " bee #2 from the third beehive.");
        System.out.println("...");

        result = ((hive1.getBee(2)).battle(hive3.getBee(1)));

        if (result) {
          System.out.println("Killer bee #1 from the first beehive wins! It gains max " 
              + "HP as a result! The other bee has been defeated!");

          hive1.getBee(2).setMaxHp(115);
          hive1.getBee(2).setCurrentHp(15);
          hive3.removeBee(1);
        } else if (!result) {
          System.out.println("Battle bee #2 from the third beehive wins! It gains max " 
              + "HP as a result! The other bee has been defeated!");

          hive3.getBee(1).setMaxHp(115);
          hive3.getBee(1).setCurrentHp(-15);
          hive1.removeBee(2);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      } else if (count == 2) {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Battle bee #1 from the third beehive challenges Battle" 
            + " bee #1 from the second beehive.");
        System.out.println("...");

        result = ((hive3.getBee(0)).battle(hive2.getBee(0)));

        if (result) {
          System.out.println("Battle bee #1 from the third beehive wins! It gains max " 
              + "HP as a result! The other bee has been defeated!");

          hive3.getBee(0).setMaxHp(100);
          hive3.getBee(0).setCurrentHp(1);
          hive2.removeBee(0);
        } else if (!result) {
          System.out.println("Battle bee #1 from the second beehive wins! It gains max " 
              + "HP as a result! The other bee has been defeated!");

          hive2.getBee(0).setMaxHp(100);
          hive2.getBee(0).setCurrentHp(1);
          hive3.removeBee(0);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      } else if (count == 3) {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Elite bee from the third beehive challenges Killer" 
            + " bee #1 from the second beehive.");
        System.out.println("...");

        result = ((hive3.getBee(3)).battle(hive2.getBee(1)));

        if (result) {
          System.out.println("Elite bee from the third beehive wins! It gains max " 
              + "HP as a result! The other bee has been defeated!");

          hive3.getBee(3).setMaxHp(140);
          hive3.getBee(3).setCurrentHp(10);
          hive2.removeBee(1);
        } else if (!result) {
          System.out.println("Killer bee #1 from the second beehive wins! It gains max " 
              + "HP as a result! The other bee has been defeated!");

          hive2.getBee(1).setMaxHp(140);
          hive2.getBee(1).setCurrentHp(-10);
          hive3.removeBee(3);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      } else {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Elite bee from the third beehive challenges Killer" 
            + " bee #2 from the first beehive.");
        System.out.println("...");

        result = ((hive3.getBee(3)).battle(hive1.getBee(3)));

        if (!result) {
          System.out.println("Killer bee #2 from the first beehive wins! It gains max " 
              + "HP as a result! The other bee has been defeated!");

          hive1.getBee(3).setMaxHp(140);
          hive1.getBee(3).setCurrentHp(55);
          hive3.removeBee(3);
        } else if (result) {
          System.out.println("Elite bee from the third beehive wins! It gains max " 
              + "HP as a result! The other bee has been defeated!");

          hive3.getBee(3).setMaxHp(205);
          hive3.getBee(3).setCurrentHp(-75);
          hive1.removeBee(3);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

      }
    } while (count < 4);        

    System.out.println("\nThe fighting has ended, the results are in!");
    System.out.println("Press ENTER to view the results");

    input = scan.nextLine();
    scan.close();
    System.out.println("\n~Beehive 1 Population~");
    System.out.println(hive1.toString());

    System.out.println("\n~Beehive 2 Population~");
    System.out.println(hive2.toString());

    System.out.println("\n~Beehive 3 Population~");
    System.out.println(hive3.toString());

    System.out.println(input);
  }

  /**
   * Third design pattern.
   */
  public static void design3() {

    HiveD3 hive1 = new HiveD3(0);

    for (int i = 0; i < 5; i++) {
      if (i < 3) {
        RoomD3 room = new RoomD3(i);
        hive1.addRoom(room);
      } else {
        RoomD3 room = new RestRoom(i);
        hive1.addRoom(room);
      }
    }

    HiveD3 hive2 = new HiveD3(1);

    for (int i = 0; i < 5; i++) {
      if (i < 3) {
        RoomD3 room = new RoomD3(i);
        hive2.addRoom(room);
      } else {
        RoomD3 room = new RestRoom(i);
        hive2.addRoom(room);
      }
    }

    System.out.println("Two Hives have been created, each with five Rooms, two of which" 
        + " are resting Rooms.\n");

    System.out.println("What type of bees should inhabit the first hive?");
    System.out.println("Type '1' for Worker bees");
    System.out.println("Type '2' for Collector bees");
    System.out.println("Type '3' for Killer bees\n");

    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    int value = Integer.parseInt(input);

    if (!(value == 1 || value == 2 || value == 3)) {
      System.out.println("Please provide valid input next time.");
      scan.close();
      return;
    } else {
      if (value == 1) {
        hive1.setType("Worker");
      } else if (value == 2) {
        hive1.setType("Collector");
      } else if (value == 3) {
        hive1.setType("Killer");
      }
    }

    System.out.println("\nHow many bees are in this hive? (1-10)");
    input = scan.nextLine();
    value = Integer.parseInt(input);

    if (!(value >= 1 && value <= 10)) {
      System.out.println("Please provide valid input next time.");
      scan.close();
      return;
    } else {
      for (int i = 1; i < 11; i++) {
        BeeD3 bee = new BeeD3(hive1.getType());
        hive1.getRoom(0).addBee(bee);
      }
    }

    System.out.println("\nWhat type of bees should inhabit the second hive?");
    System.out.println("Type '1' for Worker bees");
    System.out.println("Type '2' for Collector bees");
    System.out.println("Type '3' for Killer bees\n");

    input = scan.nextLine();
    value = Integer.parseInt(input);

    if (!(value == 1 || value == 2 || value == 3)) {
      System.out.println("Please provide valid input next time.");
      scan.close();
      return;
    } else {
      if (value == 1) {
        hive2.setType("Worker");
      } else if (value == 2) {
        hive2.setType("Collector");
      } else if (value == 3) {
        hive2.setType("Killer");
      }
    }

    System.out.println("\nHow many bees are in this hive? (1-10)");
    input = scan.nextLine();
    value = Integer.parseInt(input);

    if (!(value >= 1 && value <= 10)) {
      System.out.println("Please provide valid input next time.");
      scan.close();
      return;
    } else {
      for (int i = 1; i < 11; i++) {
        BeeD3 bee = new BeeD3(hive1.getType());
        hive2.getRoom(0).addBee(bee);
      }
    }

    System.out.println("\nChoose an action for the first beehive to take:");
    System.out.println("Type '1' for 'construct additional room'");
    System.out.println("Type '2' for 'harvest nectar'");
    System.out.println("Type '3' for 'battle another hive'");
    input = scan.nextLine();
    value = Integer.parseInt(input);


    if (!(value == 1 || value == 2 || value == 3)) {
      System.out.println("Please provide valid input next time.");
      scan.close();
      return;
    } else {
      if (value == 1) {
        constructRoom(hive1);
      } else if (value == 2) {
        harvestNectar(hive1);
      } else {
        battleTime(hive1);
      }
    }

    System.out.println("\nChoose an action for the second beehive to take:");
    System.out.println("Type '1' for 'construct additional room'");
    System.out.println("Type '2' for 'harvest nectar'");
    System.out.println("Type '3' for 'battle another hive'");
    input = scan.nextLine();
    value = Integer.parseInt(input);

    if (!(value == 1 || value == 2 || value == 3)) {
      System.out.println("Please provide valid input next time.");
      scan.close();
      return;
    } else {
      if (value == 1) {
        constructRoom(hive2);
      } else if (value == 2) {
        harvestNectar(hive2);
      } else {
        battleTime(hive2);
      }
    }

    System.out.println("The type of bees in beehive 1: " + hive1.getType());
    System.out.println("The type of bees in beehive 2: " + hive2.getType());

    scan.close();
  }

  /**
   * Construction of rooms in hive.
   */
  public static void constructRoom(HiveD3 hive) {
    if (hive.getType().equals("Worker")) {
      System.out.println("\nAn additional room was constructed in only 1 tick!");
    } else if (hive.getType().equals("Collector")) {
      System.out.println("\nAn additional room was constructed in 3 ticks.");
    } else {
      System.out.println("\nAn additional room was constructed in 3 ticks.");
    }
  }

  /**
   * Harvesting nectar for supporting the hive.
   */
  public static void harvestNectar(HiveD3 hive) {
    if (hive.getType().equals("Collector")) {
      System.out.println("\nSufficient nectar has been harvested in only 1 tick!");
    } else if (hive.getType().equals("Worker")) {
      System.out.println("\nSufficient nectar has been harvested in 2 ticks!");
    } else {
      System.out.println("\nSufficient nectar has been harvested in 3 ticks.");
    }
  }

  /**
   * Battling other hives for territory.
   */
  public static void battleTime(HiveD3 hive) {
    if (hive.getType().equals("Killer")) {
      System.out.println("\nThe battle has been settled in only 1 tick!");
    } else if (hive.getType().equals("Collector")) {
      System.out.println("\nThe battle has been settled in 3 ticks.");
    } else {
      System.out.println("\nThe battle has been settled in 3 ticks.");
    }
  }
}
