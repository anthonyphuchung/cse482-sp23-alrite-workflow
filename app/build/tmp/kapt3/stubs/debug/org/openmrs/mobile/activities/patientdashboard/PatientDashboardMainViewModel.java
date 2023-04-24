package org.openmrs.mobile.activities.patientdashboard;

import android.util.Log;
import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.api.repository.AllergyRepository;
import com.openmrs.android_sdk.library.api.repository.PatientRepository;
import com.openmrs.android_sdk.library.api.repository.VisitRepository;
import com.openmrs.android_sdk.library.dao.PatientDAO;
import com.openmrs.android_sdk.library.dao.VisitDAO;
import com.openmrs.android_sdk.library.models.OperationType;
import com.openmrs.android_sdk.library.models.Patient;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0006\u0010\u0019\u001a\u00020\u0002J\u001d\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001dH\u0014\u00a2\u0006\u0002\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\"\u001a\u00020\u0002H\u0002J\b\u0010#\u001a\u00020\u0002H\u0002J\u0006\u0010$\u001a\u00020\u0002J\b\u0010%\u001a\u00020\u0002H\u0002J\b\u0010&\u001a\u00020\u0002H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/PatientDashboardMainViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "patientDAO", "Lcom/openmrs/android_sdk/library/dao/PatientDAO;", "visitDAO", "Lcom/openmrs/android_sdk/library/dao/VisitDAO;", "patientRepository", "Lcom/openmrs/android_sdk/library/api/repository/PatientRepository;", "visitRepository", "Lcom/openmrs/android_sdk/library/api/repository/VisitRepository;", "allergyRepository", "Lcom/openmrs/android_sdk/library/api/repository/AllergyRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/openmrs/android_sdk/library/dao/PatientDAO;Lcom/openmrs/android_sdk/library/dao/VisitDAO;Lcom/openmrs/android_sdk/library/api/repository/PatientRepository;Lcom/openmrs/android_sdk/library/api/repository/VisitRepository;Lcom/openmrs/android_sdk/library/api/repository/AllergyRepository;Landroidx/lifecycle/SavedStateHandle;)V", "patient", "Lcom/openmrs/android_sdk/library/models/Patient;", "patientId", "", "getPatientId", "()Ljava/lang/String;", "patientUuid", "runningSyncs", "", "deletePatient", "setContent", "data", "operationType", "Lcom/openmrs/android_sdk/library/models/OperationType;", "(Lkotlin/Unit;Lcom/openmrs/android_sdk/library/models/OperationType;)V", "setError", "t", "", "syncAllergies", "syncDetails", "syncPatientData", "syncVisits", "syncVitals", "app_debug"})
public final class PatientDashboardMainViewModel extends org.openmrs.mobile.activities.BaseViewModel<kotlin.Unit> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String patientId = null;
    private final com.openmrs.android_sdk.library.models.Patient patient = null;
    private final java.lang.String patientUuid = null;
    private int runningSyncs = 0;
    private final com.openmrs.android_sdk.library.dao.PatientDAO patientDAO = null;
    private final com.openmrs.android_sdk.library.dao.VisitDAO visitDAO = null;
    private final com.openmrs.android_sdk.library.api.repository.PatientRepository patientRepository = null;
    private final com.openmrs.android_sdk.library.api.repository.VisitRepository visitRepository = null;
    private final com.openmrs.android_sdk.library.api.repository.AllergyRepository allergyRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPatientId() {
        return null;
    }
    
    public final void deletePatient() {
    }
    
    public final void syncPatientData() {
    }
    
    private final void syncDetails() {
    }
    
    private final void syncVisits() {
    }
    
    private final void syncAllergies() {
    }
    
    private final void syncVitals() {
    }
    
    @java.lang.Override()
    protected void setContent(@org.jetbrains.annotations.NotNull()
    kotlin.Unit data, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.models.OperationType operationType) {
    }
    
    @java.lang.Override()
    protected void setError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable t, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.models.OperationType operationType) {
    }
    
    @javax.inject.Inject()
    public PatientDashboardMainViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.PatientDAO patientDAO, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.VisitDAO visitDAO, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.PatientRepository patientRepository, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.VisitRepository visitRepository, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.AllergyRepository allergyRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}