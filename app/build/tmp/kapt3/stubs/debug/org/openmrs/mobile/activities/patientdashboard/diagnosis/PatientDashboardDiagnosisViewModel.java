package org.openmrs.mobile.activities.patientdashboard.diagnosis;

import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.dao.EncounterDAO;
import com.openmrs.android_sdk.library.models.Encounter;
import com.openmrs.android_sdk.library.models.EncounterType;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;
import java.util.ArrayList;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\n\u001a\u00020\u000bJ\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/diagnosis/PatientDashboardDiagnosisViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "", "encounterDAO", "Lcom/openmrs/android_sdk/library/dao/EncounterDAO;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/openmrs/android_sdk/library/dao/EncounterDAO;Landroidx/lifecycle/SavedStateHandle;)V", "patientId", "fetchDiagnoses", "", "loadDiagnosesFromEncounters", "encounters", "Lcom/openmrs/android_sdk/library/models/Encounter;", "app_debug"})
public final class PatientDashboardDiagnosisViewModel extends org.openmrs.mobile.activities.BaseViewModel<java.util.List<? extends java.lang.String>> {
    private final java.lang.String patientId = null;
    private final com.openmrs.android_sdk.library.dao.EncounterDAO encounterDAO = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    public final void fetchDiagnoses() {
    }
    
    private final java.util.List<java.lang.String> loadDiagnosesFromEncounters(java.util.List<com.openmrs.android_sdk.library.models.Encounter> encounters) {
        return null;
    }
    
    @javax.inject.Inject()
    public PatientDashboardDiagnosisViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.EncounterDAO encounterDAO, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}