package org.openmrs.mobile.activities.patientdashboard.visits;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.api.repository.VisitRepository;
import com.openmrs.android_sdk.library.dao.PatientDAO;
import com.openmrs.android_sdk.library.dao.VisitDAO;
import com.openmrs.android_sdk.library.models.Patient;
import com.openmrs.android_sdk.library.models.Visit;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J\u0006\u0010\u0016\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/visits/PatientDashboardVisitsViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "Lcom/openmrs/android_sdk/library/models/Visit;", "patientDAO", "Lcom/openmrs/android_sdk/library/dao/PatientDAO;", "visitDAO", "Lcom/openmrs/android_sdk/library/dao/VisitDAO;", "visitRepository", "Lcom/openmrs/android_sdk/library/api/repository/VisitRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/openmrs/android_sdk/library/dao/PatientDAO;Lcom/openmrs/android_sdk/library/dao/VisitDAO;Lcom/openmrs/android_sdk/library/api/repository/VisitRepository;Landroidx/lifecycle/SavedStateHandle;)V", "patientId", "", "fetchVisitsData", "", "getPatient", "Lcom/openmrs/android_sdk/library/models/Patient;", "hasActiveVisit", "Landroidx/lifecycle/LiveData;", "", "startVisit", "app_debug"})
public final class PatientDashboardVisitsViewModel extends org.openmrs.mobile.activities.BaseViewModel<java.util.List<? extends com.openmrs.android_sdk.library.models.Visit>> {
    private final java.lang.String patientId = null;
    private final com.openmrs.android_sdk.library.dao.PatientDAO patientDAO = null;
    private final com.openmrs.android_sdk.library.dao.VisitDAO visitDAO = null;
    private final com.openmrs.android_sdk.library.api.repository.VisitRepository visitRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.openmrs.android_sdk.library.models.Patient getPatient() {
        return null;
    }
    
    public final void fetchVisitsData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> hasActiveVisit() {
        return null;
    }
    
    public final void startVisit() {
    }
    
    @javax.inject.Inject()
    public PatientDashboardVisitsViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.PatientDAO patientDAO, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.VisitDAO visitDAO, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.VisitRepository visitRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}