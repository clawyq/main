package seedu.address.model;

import java.util.ArrayList;

import seedu.address.commons.core.index.Index;
import seedu.address.model.person.Patient;
import seedu.address.model.person.ServedPatient;

/**
 * The API of the ServedPatientList component.
 */
public interface ServedPatientList {

    /**
     * Displays the served patient list.
     * Mainly for debugging.
     * @return String representation of the current list.
     */
    String displayServedPatientList();

    /**
     * @return Length of the current ServedPatientList.
     */
    int getServedPatientListLength();

    /**
     * Add a served patient to the ServedPatientList.
     */
    void addServedPatient(ServedPatient patient);

    /**
     * Remove served patient based on the index from the ServedPatientList.
     */
    public ServedPatient removeAtIndex(int index);

    /**
     * Reset the served patient list.
     */
    void reset ();

    /**
     * Selects a served patient in the served patient list.
     * @return The servedPatient object that was specified bu {@code index}.
     */
    ServedPatient selectServedPatient(Index index);

    /**
     * Checks whether the served patient list is empty.
     * @return true if the list is empty.
     */
    boolean isEmpty();

    /**
     * Checks whether served patient list contains a specified served patient.
     * @return true if the list contains patient.
     */
    boolean contains(ServedPatient patient);

    /**
     * Returns the PatientQueue as a List object
     * @return List object of Patients
     */
    ArrayList<ServedPatient> getPatientsAsList();

    /**
     * Checks whether served patient list contains a specified patient.
     * @return true if the list contains patient.
     */
    boolean containsPatient(Patient patient);

    /**
     * @return the size of the ServedPatientList.
     */
    int size();
}
