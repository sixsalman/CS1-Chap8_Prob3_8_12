package Prob8;
import java.util.Scanner; //util package's scanner class is imported

/**
 *  Author: Salman
 *
 *  This program gets information about a car, police officer and number of parking meter minutes purchased and outs
 *  ticket amount if applicable.
 */
public class Prob8 {

    /**
     Main handles the driver code for the program. Inputs are taken,
     processed and outputted in this method.
     @param args is not used
     */
    public static void main(String[] args) {

        Scanner kbdTxt = new Scanner(System.in); //Scanner named kbdTxt created to obtain string inputs
        Scanner kbdNum = new Scanner(System.in); //Scanner named kbdNum created to obtain numerical inputs

        System.out.print("Enter car's make: "); //gets car's make
        String make = kbdTxt.nextLine();

        System.out.print("Enter car's model: "); //gets car's model
        String model = kbdTxt.nextLine();

        System.out.print("Enter car's color: "); //gets car's color
        String color = kbdTxt.nextLine();

        System.out.print("Enter car's license number: "); //gets car's license number
        String licNum = kbdTxt.nextLine();

        System.out.print("Enter the number of minutes for which the car has been parked: "); //gets car's parked minutes
        int numMin = kbdNum.nextInt();

        System.out.print("Enter the number of minutes of parking that has been purchased: "); //gets purchased minutes
        int numPur = kbdNum.nextInt();

        System.out.print("Enter police officer's name: "); //gets police officer's name
        String name = kbdTxt.nextLine();

        System.out.print("Enter police officer's badge number: "); //gets police officer's badge number
        String bNum = kbdTxt.nextLine();


        ParkedCar pCar = new ParkedCar(make, model, color, licNum, numMin); //creates a ParkedCar object
        ParkingMeter pMet = new ParkingMeter(numPur); //creates a ParkingMeter object
        PoliceOfficer pOff = new PoliceOfficer(name, bNum, pCar, pMet); //creates a PoliceOfficer object

        //prints ticket or text indicating otherwise
        if(pOff.isExpired()){
            System.out.println("\n" + pOff.getTicket());
        } else{
            System.out.println("\nPurchased minutes are not yet over");
        }
    }

}
