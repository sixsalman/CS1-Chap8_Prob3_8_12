package Prob8;

/**
 * Author: Salman
 *
 * This class calculates fine and print a ticket
 */
public class ParkingTicket {

    private PoliceOfficer pOff; //holds a PoliceOfficer object

    /**
     * Created an instance of this class assigning the object obtained to its field
     * @param pOff receives a PoliceOfficer Object
     */
    public ParkingTicket(PoliceOfficer pOff) {
        this.pOff = pOff;
    }

    /**
     * gets policeOfficer object
     * @return PoliceOfficer object
     */
    public PoliceOfficer getpOff() {
        return pOff;
    }

    /**
     * sets PoliceOfficer object
     * @param pOff receives a PoliceOfficer object
     */
    public void setpOff(PoliceOfficer pOff) {
        this.pOff = pOff;
    }

    /**
     * Calculates fine
     * @return calculated fine
     */
    public int getFine(){
        if(pOff.getpMet().getNumPur() < pOff.getpCar().getNumMin()){
            if((pOff.getpCar().getNumMin() - pOff.getpMet().getNumPur()) == 1){
                return 25;
            } else{
                return (25 + ((pOff.getpCar().getNumMin() - pOff.getpMet().getNumPur() - 1) * 10));
            }
        } else{
            return 0;
        }
    }

    /**
     * returns a printable string
     * @return displayable relevant car and police officer information along with calculated fine
     */
    @Override
    public String toString() {
        return pOff.getpCar() + "\nFine: $" + getFine() + ".00\n" + pOff;
    }
}
