package org.openmrs.mobile.activities.matchingpatients;

import com.openmrs.android_sdk.library.api.repository.PatientRepository;
import com.openmrs.android_sdk.library.dao.PatientDAO;
import com.openmrs.android_sdk.library.models.Patient;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import org.openmrs.mobile.utilities.PatientMerger;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lorg/openmrs/mobile/activities/matchingpatients/MatchingPatientsViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "Lcom/openmrs/android_sdk/library/models/Patient;", "patientDAO", "Lcom/openmrs/android_sdk/library/dao/PatientDAO;", "patientRepository", "Lcom/openmrs/android_sdk/library/api/repository/PatientRepository;", "(Lcom/openmrs/android_sdk/library/dao/PatientDAO;Lcom/openmrs/android_sdk/library/api/repository/PatientRepository;)V", "mergePatients", "", "selectedPatient", "currentPatient", "registerNewPatient", "patient", "app_debug"})
public final class MatchingPatientsViewModel extends org.openmrs.mobile.activities.BaseViewModel<com.openmrs.android_sdk.library.models.Patient> {
    private final com.openmrs.android_sdk.library.dao.PatientDAO patientDAO = null;
    private final com.openmrs.android_sdk.library.api.repository.PatientRepository patientRepository = null;
    
    public final void registerNewPatient(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.models.Patient patient) {
    }
    
    /**
     * Updates a selected patient with current patient data.
     *
     * @param selectedPatient the old patient to be updated
     * @param currentPatient the new patient to be merged to the old patient
     */
    public final void mergePatients(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.models.Patient selectedPatient, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.models.Patient currentPatient) {
    }
    
    @javax.inject.Inject()
    public MatchingPatientsViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.PatientDAO patientDAO, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.PatientRepository patientRepository) {
        super();
    }
}