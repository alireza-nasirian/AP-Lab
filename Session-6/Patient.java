import java.util.ArrayList;

/**
 * details of a patient and sicknesses and doctors of patient
 */
public abstract class Patient {

    ArrayList<Sickness> sicknesses = new ArrayList<>();
    ArrayList<Doctor> doctors = new ArrayList<>();

    /**
     * permission to use information
     */
    public abstract void permission();
}
