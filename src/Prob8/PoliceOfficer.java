package Prob8;

/**
 * Author: Salman
 *
 * This class holds information of a police officer and has methods to determine whether a ticket should be issued and
 * issuing one
 */
public class PoliceOfficer {

    private String name; //holds police officer's name
    private String bNum; //holds police officer's badge number
    private ParkedCar pCar; //holds a ParkedCar object
    private ParkingMeter pMet; //holds a ParkingMeter object

    /**
     * creates an instance of this class assigning the values obtained to its fields
     * @param name receives police officer's name
     * @param bNum receives police officer's badge number
     * @param pCar receives a ParkedCar object
     * @param pMet receives a ParkingMeter object
     */
    public PoliceOfficer(String name, String bNum, ParkedCar pCar, ParkingMeter pMet) {
        this.name = name;
        this.bNum = bNum;
        this.pCar = pCar;
        this.pMet = pMet;
    }

    /**
     * gets police officer's name
     * @return police officer's name
     */
    public String getName() {
        return name;
    }

    /**
     * sets police officer's name
     * @param name receives police officer's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * gets police officer's badge number
     * @return police officer's badge number
     */
    public String getbNum() {
        return bNum;
    }

    /**
     * sets police officer's badge number
     * @param bNum receives police officer's badge number
     */
    public void setbNum(String bNum) {
        this.bNum = bNum;
    }

    /**
     * gets ParkedCar object
     * @return ParkedCar object
     */
    public ParkedCar getpCar() {
        return pCar;
    }

    /**
     * sets ParkedCar object
     * @param pCar ParkedCar object
     */
    public void setpCar(ParkedCar pCar) {
        this.pCar = pCar;
    }

    /**
     * gets ParkingMeter object
     * @return ParkingMeter object
     */
    public ParkingMeter getpMet() {
        return pMet;
    }

    /**
     * sets ParkingMeter object
     * @param pMet receives ParkingMeter object
     */
    public void setpMet(ParkingMeter pMet) {
        this.pMet = pMet;
    }

    /**
     * checks meter minutes for expiry
     * @return boolean indicated expiry of meter minutes purchased
     */
    public boolean isExpired() {
        if (this.pCar.getNumMin() > this.pMet.getNumPur()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * creates and returns a parking ticket object
     * @return a ParkingTicket object
     */
    public ParkingTicket getTicket (){
        return new ParkingTicket(this);
    }

    /**
     * returns a printable string
     * @return displayable name and badge number contained in an instance of this class
     */
    @Override
    public String toString() {
        return "PoliceOfficer{" +
                "name='" + name + '\'' +
                ", badge number='" + bNum + '\'' +
                '}';
    }
}
