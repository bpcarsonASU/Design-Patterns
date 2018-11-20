package main.java;

import design2.java.Bee;
import design2.java.Beehive;

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
}
