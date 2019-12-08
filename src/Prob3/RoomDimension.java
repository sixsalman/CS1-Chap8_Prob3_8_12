package Prob3;

/**
 *  Author: Salman
 *
 *  This class holds a room's length and width and calculates its area
 */
public class RoomDimension {

    private double length; //holds a room's length
    private double width; //holds a room's width

    /**
     * Constructs an instance of class initializing all of its fields with the values obtained
     * @param length receives a room's length
     * @param width receives a room's width
     */
    public RoomDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * gets calculated area of the room
     * @return room's area
     */
    public double getArea() {
        return width*length;
    }

    /**
     * returns a printable string
     * @return prints information contained and calculated in an instance of this class
     */
    @Override
    public String toString() {
        return "RoomDimension{" +
                "length=" + length +
                ", width=" + width +
                ", Area=" + this.getArea() +
                '}';
    }
}
