package Prob12;
import java.util.Scanner; //util package's Scanner class is imported

/**
 * Author: Salman
 *
 * This class serves a blueprint an object which holds information related to a player
 */
public class Player {

    private String choice; //holds player's choice
    private String name; //holds player's name

    /**
     * Creates a Player object and asks user for his/her name which is store in a field of the object
     */
    public Player() {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter Player name: ");
        name = kbd.nextLine();
    }

    /**
     * gets player's choice
     * @return player's choice
     */
    public String getChoice() {
        return choice;
    }

    /**
     * Asks, validates and stores player's choice
     */
    public void obtainChoice() {
        Scanner kbd = new Scanner(System.in);
        boolean valid = false;
        do{
        System.out.print(getName() + " - enter 1 to choose face up or 2 to choose face down: ");
            switch (kbd.nextInt()) {
                case 1:
                    choice = "face up";
                    valid = true;
                    break;
                case 2:
                    choice = "face down";
                    valid = true;
                    break;
                    default:
                        System.out.println("Invalid entry");
            }
        }while(!valid);
    }

    /**
     * gets player's name
     * @return player's name
     */
    public String getName() {
        return name;
    }
}
