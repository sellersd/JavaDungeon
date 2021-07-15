
/**
 * Write a description of class PlayerCharacter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.ArrayList;

public class PlayerCharacter extends Character
{
    // instance variables - replace the example below with your own
    private String name;
    private String race;
    private Backpack pack;
    private ArrayList<Item> inventory;
    
    private Scanner scan = new Scanner(System.in);

    /**
     * Constructor for objects of class PlayerCharacter
     */
    public PlayerCharacter()
    {
        // initialise instance variables
        super();
        System.out.print("What is your name travler? ");
        name = scan.next();
        pack = new Backpack();
        inventory = new ArrayList<Item>();
        inventory.add(pack);
    }

    
    public void getInventory()
    {
        inventory.forEach(n -> System.out.println(n));
    }
    
    public String toString()
    {
        return name + "\n\tStrength:\t" + super.getStrength()
                    + "\n\tConstitution:\t" + super.getConstitution()
                    + "\n\tDexterity:\t" + super.getDexterity()
                    + "\n\tWisdom:\t" + super.getWisdom()
                    + "\n\n";
                }
}
