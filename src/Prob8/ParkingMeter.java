package Prob8;

/**
 * Author: Salman
 *
 * This class holds the number of meter minutes purchased
 */
public class ParkingMeter {

    private int numPur; //holds the number of meter minutes purchased

    /**
     * Creates an instance of this class assigned the obtained value to its field
     * @param numPur receives the number of meter minutes purchased
     */
    public ParkingMeter(int numPur) {
        this.numPur = numPur;
    }

    /**
     * gets the number of meter minutes purchased
     * @return the number of meter minutes purchased
     */
    public int getNumPur() {
        return numPur;
    }

    /**
     * sets the number of meter minutes purchased
     * @param numPur receives the number of meter minutes purchased
     */
    public void setNumPur(int numPur) {
        this.numPur = numPur;
    }

    /**
     * returns a printable string
     * @return prints information contained and calculated in an instance of this class
     */
    @Override
    public String toString() {
        return "ParkingMeter{" +
                "numPur=" + numPur +
                '}';
    }
}
