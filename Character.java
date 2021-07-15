
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class Character
{
    // instance variables - replace the example below with your own
    
    private int health;
    private int strength;
    private int constitution;
    private int dexterity;
    private int wisdom;
    

    /**
     * Constructor for objects of class Character
     */
    public Character()
    {
        // initialise instance variables
        health = 100;
        strength = 80;
        constitution = 90;
        dexterity = 85;
        wisdom = 100;
    }

    public int getStrength()
    {
        return strength;
    }
    
    public int getConstitution()
    {
        return constitution;
    }
    
    public int getDexterity()
    {
        return dexterity;
    }
    
    public int getWisdom()
    {
        return wisdom;
    }
}
