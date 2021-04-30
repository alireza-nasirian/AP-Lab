import java.util.ArrayList;

/**
 * Implementation of doctor
 */
public abstract class Doctor {

    ArrayList<Sickness> sicknesses = new ArrayList<>();

    /**
     * prescribe given medicines to given patient
     * @param patient is given patient
     * @param medicines is given medicines
     */
    public abstract void prescribe(Patient patient, ArrayList<Medicine> medicines);

    /**
     * refer ti another doctor
     * @param doctor is next doctor
     * @param patient is given patient
     */
    public abstract void refer(Doctor doctor, Patient patient);

    /**
     * creat medical history for given patient
     * @param patient is given patient
     */
    public abstract void creatMedicalHistory(Patient patient);
}
