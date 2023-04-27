package org.openmrs.mobile.activities.formentrypatientlist;

import com.openmrs.android_sdk.library.dao.VisitDAO;
import com.openmrs.android_sdk.library.models.Patient;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import org.openmrs.mobile.utilities.FilterUtil;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/openmrs/mobile/activities/formentrypatientlist/FormEntryPatientListViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "Lcom/openmrs/android_sdk/library/models/Patient;", "visitDAO", "Lcom/openmrs/android_sdk/library/dao/VisitDAO;", "(Lcom/openmrs/android_sdk/library/dao/VisitDAO;)V", "mQuery", "", "getMQuery", "()Ljava/lang/String;", "setMQuery", "(Ljava/lang/String;)V", "fetchSavedPatientsWithActiveVisits", "", "query", "app_debug"})
public final class FormEntryPatientListViewModel extends org.openmrs.mobile.activities.BaseViewModel<java.util.List<? extends com.openmrs.android_sdk.library.models.Patient>> {
    @org.jetbrains.annotations.Nullable()
    private java.lang.String mQuery;
    private final com.openmrs.android_sdk.library.dao.VisitDAO visitDAO = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMQuery() {
        return null;
    }
    
    public final void setMQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final void fetchSavedPatientsWithActiveVisits(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    @javax.inject.Inject()
    public FormEntryPatientListViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.VisitDAO visitDAO) {
        super();
    }
}