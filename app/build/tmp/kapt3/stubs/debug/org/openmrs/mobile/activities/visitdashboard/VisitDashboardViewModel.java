package org.openmrs.mobile.activities.visitdashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.api.repository.VisitRepository;
import com.openmrs.android_sdk.library.dao.VisitDAO;
import com.openmrs.android_sdk.library.models.Result;
import com.openmrs.android_sdk.library.models.Visit;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/openmrs/mobile/activities/visitdashboard/VisitDashboardViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "Lcom/openmrs/android_sdk/library/models/Visit;", "visitDAO", "Lcom/openmrs/android_sdk/library/dao/VisitDAO;", "visitRepository", "Lcom/openmrs/android_sdk/library/api/repository/VisitRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/openmrs/android_sdk/library/dao/VisitDAO;Lcom/openmrs/android_sdk/library/api/repository/VisitRepository;Landroidx/lifecycle/SavedStateHandle;)V", "visit", "getVisit", "()Lcom/openmrs/android_sdk/library/models/Visit;", "visitId", "", "endCurrentVisit", "Landroidx/lifecycle/LiveData;", "", "fetchCurrentVisit", "", "app_debug"})
public final class VisitDashboardViewModel extends org.openmrs.mobile.activities.BaseViewModel<com.openmrs.android_sdk.library.models.Visit> {
    private final long visitId = 0L;
    private final com.openmrs.android_sdk.library.dao.VisitDAO visitDAO = null;
    private final com.openmrs.android_sdk.library.api.repository.VisitRepository visitRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.openmrs.android_sdk.library.models.Visit getVisit() {
        return null;
    }
    
    public final void fetchCurrentVisit() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> endCurrentVisit() {
        return null;
    }
    
    @javax.inject.Inject()
    public VisitDashboardViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.VisitDAO visitDAO, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.VisitRepository visitRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}