package Prob3;

/**
 *  Author: Salman
 *
 *  This class holds an object which holds a room's dimensions and carpet's cost per square foot and calculates total
 *  cost of carpeting the room
 */
public class RoomCarpet {

    private RoomDimension size; //holds a RoomDimension object holding the room's width, length and calculated area
    private double carpetCost; //holds carpet's cost per square foot

    /**
     * Constructs an instance initializing all of the object's fields with the values obtained
     * @param size receives a RoomDimension object holding the room's width, length and calculated area
     * @param carpetCost receives carpet's cost per square foot
     */
    public RoomCarpet(RoomDimension size, double carpetCost) {
        this.size = size;
        this.carpetCost = carpetCost;
    }

    /**
     * gets calculated total cost of carpeting the room
     * @return total cost of carpeting the room
     */
    public double getTotalCost() {
        return size.getArea() * carpetCost;
    }

    /**
     * returns a printable string
     * @return prints information contained and calculated in an instance of this class
     */
    @Override
    public String toString() {
        return "RoomCarpet{" +
                "size=" + size +
                ", carpetCost=" + carpetCost +
                ", Total Cost=" + this.getTotalCost() +
                '}';
    }
}
