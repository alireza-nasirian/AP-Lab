import java.util.ArrayList;

/**
 * Implementation of centralized health system
 */
public abstract class HealthSystem {

    ArrayList<Patient> patients = new ArrayList<>();
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Pharmacy> pharmacies = new ArrayList<>();
    ArrayList<University> universities = new ArrayList<>();

    /**
     * add new patient
     * @param patient is patient to add
     */
    public abstract void addPatient(Patient patient);

    /**
     * give the information of given patient to given university
     * @param patient is given patient
     * @param university is given university
     */
    public abstract void givePatientInformationToUniversity(Patient patient, University university);

    /**
     * add a trusted doctor
     * @param doctor is doctor to add
     */
    public abstract void addDoctor(Doctor doctor);
}
