package org.openmrs.mobile.activities.lastviewedpatients;

import com.openmrs.android_sdk.library.api.repository.PatientRepository;
import com.openmrs.android_sdk.library.dao.PatientDAO;
import com.openmrs.android_sdk.library.models.Link;
import com.openmrs.android_sdk.library.models.Patient;
import com.openmrs.android_sdk.library.models.Results;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\u001e\u0010\u0019\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0006\u0010\u001c\u001a\u00020\u0015J\u001e\u0010\u001d\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006 "}, d2 = {"Lorg/openmrs/mobile/activities/lastviewedpatients/LastViewedPatientsViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "Lcom/openmrs/android_sdk/library/models/Patient;", "patientDAO", "Lcom/openmrs/android_sdk/library/dao/PatientDAO;", "patientRepository", "Lcom/openmrs/android_sdk/library/api/repository/PatientRepository;", "(Lcom/openmrs/android_sdk/library/dao/PatientDAO;Lcom/openmrs/android_sdk/library/api/repository/PatientRepository;)V", "<set-?>", "", "isDownloadedAll", "()Z", "limit", "", "paginatedPatients", "", "startIndex", "getStartIndex", "()I", "fetchLastViewedPatients", "", "fetchPatients", "query", "", "processPagination", "patientResults", "Lcom/openmrs/android_sdk/library/models/Results;", "resetPagination", "updateStartIndex", "links", "Lcom/openmrs/android_sdk/library/models/Link;", "app_debug"})
public final class LastViewedPatientsViewModel extends org.openmrs.mobile.activities.BaseViewModel<java.util.List<? extends com.openmrs.android_sdk.library.models.Patient>> {
    private final java.util.List<com.openmrs.android_sdk.library.models.Patient> paginatedPatients = null;
    private boolean isDownloadedAll = false;
    private int startIndex = 0;
    private final int limit = 15;
    private final com.openmrs.android_sdk.library.dao.PatientDAO patientDAO = null;
    private final com.openmrs.android_sdk.library.api.repository.PatientRepository patientRepository = null;
    
    public final boolean isDownloadedAll() {
        return false;
    }
    
    public final int getStartIndex() {
        return 0;
    }
    
    public final void fetchLastViewedPatients(int limit) {
    }
    
    public final void fetchPatients(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    private final void updateStartIndex(java.util.List<com.openmrs.android_sdk.library.models.Link> links, int limit) {
    }
    
    private final void processPagination(com.openmrs.android_sdk.library.models.Results<com.openmrs.android_sdk.library.models.Patient> patientResults, int limit) {
    }
    
    public final void resetPagination() {
    }
    
    @javax.inject.Inject()
    public LastViewedPatientsViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.PatientDAO patientDAO, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.PatientRepository patientRepository) {
        super();
    }
}