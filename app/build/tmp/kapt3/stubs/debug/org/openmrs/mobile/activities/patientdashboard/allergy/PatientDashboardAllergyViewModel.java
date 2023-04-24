package org.openmrs.mobile.activities.patientdashboard.allergy;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.api.repository.AllergyRepository;
import com.openmrs.android_sdk.library.dao.PatientDAO;
import com.openmrs.android_sdk.library.models.Allergy;
import com.openmrs.android_sdk.library.models.Patient;
import com.openmrs.android_sdk.library.models.ResultType;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/allergy/PatientDashboardAllergyViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "Lcom/openmrs/android_sdk/library/models/Allergy;", "patientDAO", "Lcom/openmrs/android_sdk/library/dao/PatientDAO;", "allergyRepository", "Lcom/openmrs/android_sdk/library/api/repository/AllergyRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/openmrs/android_sdk/library/dao/PatientDAO;Lcom/openmrs/android_sdk/library/api/repository/AllergyRepository;Landroidx/lifecycle/SavedStateHandle;)V", "patientId", "", "deleteAllergy", "Landroidx/lifecycle/LiveData;", "Lcom/openmrs/android_sdk/library/models/ResultType;", "allergyUuid", "fetchAllergies", "", "getPatient", "Lcom/openmrs/android_sdk/library/models/Patient;", "app_debug"})
public final class PatientDashboardAllergyViewModel extends org.openmrs.mobile.activities.BaseViewModel<java.util.List<? extends com.openmrs.android_sdk.library.models.Allergy>> {
    private final java.lang.String patientId = null;
    private final com.openmrs.android_sdk.library.dao.PatientDAO patientDAO = null;
    private final com.openmrs.android_sdk.library.api.repository.AllergyRepository allergyRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.openmrs.android_sdk.library.models.Patient getPatient() {
        return null;
    }
    
    public final void fetchAllergies() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.openmrs.android_sdk.library.models.ResultType> deleteAllergy(@org.jetbrains.annotations.NotNull()
    java.lang.String allergyUuid) {
        return null;
    }
    
    @javax.inject.Inject()
    public PatientDashboardAllergyViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.PatientDAO patientDAO, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.AllergyRepository allergyRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}