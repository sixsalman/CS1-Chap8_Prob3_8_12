package Prob12;
import java.util.Random;

/**
 *  Author: Salman
 *
 *  This class serves as blueprint for creation of a Coin object in which a coin is tossed and the result is returned
 */
public class Coin {

    private String sideUp; //holds state of the coin (face up or face down)
    private Random rand; //hold a Random object

    /**
     * This no-arg constructor tosses the coin initially
     */
    public Coin() {
        rand = new Random();
        sideUp = rand.nextBoolean() ? "face up" : "face down";
    }

    /**
     * This method tosses the coin
     */
    public void toss() {
        sideUp = rand.nextBoolean() ? "face up" : "face down";
    }

    /**
     * Get's sideUp/state
     * @return state of the coin (face up or face down)
     */
    public String getSideUp(){
        return sideUp;
    }

}
