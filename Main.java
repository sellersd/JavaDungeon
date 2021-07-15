
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String command;
        boolean running = true;
        Game g = new Game();
        PlayerCharacter player = new PlayerCharacter();
        Scanner cmdReader = new Scanner(System.in);
        while (running)
        {
            System.out.print(">>> ");
            
            command = cmdReader.next();
            if (command.equals("stats"))
            {
                System.out.println(player);
            }
            else if (command.equals("quit"))
            {
                running = false;
            }
            else if (command.equals("inventory"))
            {
                player.getInventory();
            }
            else
            {
                System.out.println("I do not know how to do that!");
            } 
        }
    }
}
