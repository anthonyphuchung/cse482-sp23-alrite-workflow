package org.openmrs.mobile.activities.syncedpatients;

import com.openmrs.android_sdk.library.dao.PatientDAO;
import com.openmrs.android_sdk.library.dao.VisitDAO;
import com.openmrs.android_sdk.library.models.OperationType;
import com.openmrs.android_sdk.library.models.Patient;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import org.openmrs.mobile.utilities.FilterUtil;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003J\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/openmrs/mobile/activities/syncedpatients/SyncedPatientsViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "Lcom/openmrs/android_sdk/library/models/Patient;", "patientDAO", "Lcom/openmrs/android_sdk/library/dao/PatientDAO;", "visitDAO", "Lcom/openmrs/android_sdk/library/dao/VisitDAO;", "(Lcom/openmrs/android_sdk/library/dao/PatientDAO;Lcom/openmrs/android_sdk/library/dao/VisitDAO;)V", "deleteSyncedPatient", "", "patient", "fetchSyncedPatients", "query", "", "app_debug"})
public final class SyncedPatientsViewModel extends org.openmrs.mobile.activities.BaseViewModel<java.util.List<? extends com.openmrs.android_sdk.library.models.Patient>> {
    private final com.openmrs.android_sdk.library.dao.PatientDAO patientDAO = null;
    private final com.openmrs.android_sdk.library.dao.VisitDAO visitDAO = null;
    
    public final void fetchSyncedPatients() {
    }
    
    public final void fetchSyncedPatients(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void deleteSyncedPatient(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.models.Patient patient) {
    }
    
    @javax.inject.Inject()
    public SyncedPatientsViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.PatientDAO patientDAO, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.VisitDAO visitDAO) {
        super();
    }
}