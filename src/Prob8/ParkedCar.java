package Prob8;

/**
 * Author: Salman
 *
 * This class holds information related to a car
 */
public class ParkedCar {

    private String make; //holds car's make
    private String model; //holds car's model
    private String color; //holds car's color
    private String licNum; //holds car's license number
    private int numMin; //holds the number of minutes for which the car has been parked

    /**
     * creates an instance of this class assigning the values obtained to its fields
     * @param make receives car's make
     * @param model receives car's model
     * @param color receives car's color
     * @param licNum receives car's license number
     * @param numMin receives the number of minutes for which the car has been parked
     */
    public ParkedCar(String make, String model, String color, String licNum, int numMin) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.licNum = licNum;
        this.numMin = numMin;
    }

    /**
     * gets car's make
     * @return car's make
     */
    public String getMake() {
        return make;
    }

    /**
     * sets car's make
     * @param make receives car's make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * gets car's model
     * @return car's model
     */
    public String getModel() {
        return model;
    }

    /**
     * sets car's model
     * @param model car's model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * gets car's color
     * @return car's color
     */
    public String getColor() {
        return color;
    }

    /**
     * sets car's color
     * @param color receives car's color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * gets car's license number
     * @return car's license number
     */
    public String getLicNum() {
        return licNum;
    }

    /**
     * sets car's license number
     * @param licNum receives car's license number
     */
    public void setLicNum(String licNum) {
        this.licNum = licNum;
    }

    /**
     * gets the number of minutes for which the car has been parked
     * @return the number of minutes for which the car has been parked
     */
    public int getNumMin() {
        return numMin;
    }

    /**
     * sets the number of minutes for which the car has been parked
     * @param numMin receives the number of minutes for which the car has been parked
     */
    public void setNumMin(int numMin) {
        this.numMin = numMin;
    }

    /**
     * returns a printable string
     * @return displayable make, model, color and license number contained in an instance of this class
     */
    @Override
    public String toString() {
        return "ParkedCar{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", license number='" + licNum + '\'' +
                '}';
    }
}
