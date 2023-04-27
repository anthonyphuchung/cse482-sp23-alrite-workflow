package org.openmrs.mobile.activities.patientdashboard.charts;

import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.dao.VisitDAO;
import com.openmrs.android_sdk.library.models.Visit;
import com.openmrs.android_sdk.utilities.ApplicationConstants;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openmrs.mobile.activities.BaseViewModel;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;
import java.util.HashSet;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/charts/PatientDashboardChartsViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "Lorg/json/JSONObject;", "visitDAO", "Lcom/openmrs/android_sdk/library/dao/VisitDAO;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/openmrs/android_sdk/library/dao/VisitDAO;Landroidx/lifecycle/SavedStateHandle;)V", "patientId", "", "fetchChartsData", "", "getObservationListFromVisits", "visits", "", "Lcom/openmrs/android_sdk/library/models/Visit;", "app_debug"})
public final class PatientDashboardChartsViewModel extends org.openmrs.mobile.activities.BaseViewModel<org.json.JSONObject> {
    private final java.lang.String patientId = null;
    private final com.openmrs.android_sdk.library.dao.VisitDAO visitDAO = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    public final void fetchChartsData() {
    }
    
    private final org.json.JSONObject getObservationListFromVisits(java.util.List<com.openmrs.android_sdk.library.models.Visit> visits) {
        return null;
    }
    
    @javax.inject.Inject()
    public PatientDashboardChartsViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.VisitDAO visitDAO, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}