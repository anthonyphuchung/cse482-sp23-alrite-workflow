package org.openmrs.mobile.activities.activevisits;

import com.openmrs.android_sdk.library.dao.VisitDAO;
import com.openmrs.android_sdk.library.models.Visit;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import org.openmrs.mobile.utilities.FilterUtil;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/openmrs/mobile/activities/activevisits/ActiveVisitsViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "Lcom/openmrs/android_sdk/library/models/Visit;", "visitDAO", "Lcom/openmrs/android_sdk/library/dao/VisitDAO;", "(Lcom/openmrs/android_sdk/library/dao/VisitDAO;)V", "fetchActiveVisits", "", "query", "", "app_debug"})
public final class ActiveVisitsViewModel extends org.openmrs.mobile.activities.BaseViewModel<java.util.List<? extends com.openmrs.android_sdk.library.models.Visit>> {
    private final com.openmrs.android_sdk.library.dao.VisitDAO visitDAO = null;
    
    public final void fetchActiveVisits() {
    }
    
    public final void fetchActiveVisits(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @javax.inject.Inject()
    public ActiveVisitsViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.VisitDAO visitDAO) {
        super();
    }
}