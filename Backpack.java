import java.util.ArrayList;

/**
 * Write a description of class Backpack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Backpack extends Item
{
    // instance variables - replace the example below with your own
    private int size;
    private ArrayList<Item> inventory;
    private int weight_cap;
    
    /**
     * Constructor for objects of class Backpack
     */
    public Backpack()
    {
        // initialise instance variables
        super("a rugged backpack", 4);
        size = 20;
        inventory = new ArrayList(20);
        weight_cap = 60;
    }
}