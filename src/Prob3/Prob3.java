package Prob3;
import java.util.Scanner; //imports util package's Scanner class

/**
 *  Author: Salman
 *
 *  This program asks user for a room's length, width and price of carpet per square foot and outputs that information
 *  along with total cost of carpeting the room
 */
public class Prob3 {

    /**
     Main handles the driver code for the program. Inputs are taken,
     processed and outputted in this method.
     @param args is not used
     */
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in); //a Scanner named kbd is created

        System.out.print("Enter room's length: "); //gets length from user
        double length = kbd.nextDouble();

        System.out.print("Enter room's width: "); //gets width from user
        double width = kbd.nextDouble();

        System.out.print("Enter carpet cost per square foot: "); //gets carpet cost per square foot from user
        double carpetCost = kbd.nextDouble();

        RoomDimension rDim = new RoomDimension(length, width); //creates a RoomDimension object
        RoomCarpet rCrpt = new RoomCarpet(rDim, carpetCost); //creates a RoomCarpet object

        System.out.printf("\n%s\n\n%s\n\nTotal cost of carpeting the room: $%,.2f\n", rDim, rCrpt,
                rCrpt.getTotalCost());

    }

}
