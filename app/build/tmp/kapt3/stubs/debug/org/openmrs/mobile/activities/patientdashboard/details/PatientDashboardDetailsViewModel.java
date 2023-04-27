package org.openmrs.mobile.activities.patientdashboard.details;

import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.api.repository.PatientRepository;
import com.openmrs.android_sdk.library.dao.PatientDAO;
import com.openmrs.android_sdk.library.models.Patient;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/details/PatientDashboardDetailsViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "Lcom/openmrs/android_sdk/library/models/Patient;", "patientDAO", "Lcom/openmrs/android_sdk/library/dao/PatientDAO;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/openmrs/android_sdk/library/dao/PatientDAO;Landroidx/lifecycle/SavedStateHandle;)V", "patientId", "", "fetchPatientData", "", "app_debug"})
public final class PatientDashboardDetailsViewModel extends org.openmrs.mobile.activities.BaseViewModel<com.openmrs.android_sdk.library.models.Patient> {
    private final java.lang.String patientId = null;
    private final com.openmrs.android_sdk.library.dao.PatientDAO patientDAO = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    public final void fetchPatientData() {
    }
    
    @javax.inject.Inject()
    public PatientDashboardDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.PatientDAO patientDAO, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}