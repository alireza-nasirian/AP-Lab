import java.util.ArrayList;

/**
 * Implementation of pharmacy
 */
public abstract class Pharmacy {

    ArrayList<Medicine> medicines = new ArrayList<>();

    /**
     * @param patient take medicines
     * @param medicine is given medicine
     */
     public abstract void giveMedicine(Patient patient, Medicine medicine);
}
