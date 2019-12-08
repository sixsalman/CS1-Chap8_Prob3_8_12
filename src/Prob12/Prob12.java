package Prob12;
import java.util.*; //all of util package imported

/**
 *  Author: Salman
 *
 *  This program lets a number of users play a face up or face down game and declares the first player to get 5 points
 *  the winner
 */
public class Prob12 {

    /**
     Main handles the driver code for the program. Inputs are taken,
     processed and outputted in this method.
     @param args is not used
     */
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in); //Scanner kbd is created

        System.out.print("Enter number of players: "); //gets number of players
        int nPlayers = kbd.nextInt();

        ArrayList<Integer> points = new ArrayList<>(nPlayers); //An ArrayList named points is created

        Player[] players = new Player[nPlayers]; //An array of Player type is created

        //objects created and initial values assigned to points
        for(int i = 0; i < nPlayers; i++){
            points.add(0);
            players[i] = new Player();
        }

       Coin dime = new Coin(); //a Coin object created

        //coin is tossed and players are asked for choice until one of the players gets 5 points
        while (!(points.contains(5))){
            for(int i = 0; i < nPlayers; i++){
                players[i].obtainChoice();
            }
            dime.toss();
            System.out.println("Result: " + dime.getSideUp());
            for(int i = 0; i < nPlayers; i++){
                if(players[i].getChoice().equals(dime.getSideUp())){
                    points.set(i, (points.get(i) + 1));
                } else {
                    points.set(i, (points.get(i) - 1));
                }
            }
            System.out.println("Points: " + points);
        }

        //winner(s) are declared
        for(int i = 0; i < nPlayers; i++){
            if(points.get(i) == 5){
                System.out.println("\n" + players[i].getName() + " wins");
            }
        }

    }

}
