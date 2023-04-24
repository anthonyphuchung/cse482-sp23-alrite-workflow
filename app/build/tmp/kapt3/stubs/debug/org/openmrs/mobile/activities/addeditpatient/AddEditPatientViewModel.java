package org.openmrs.mobile.activities.addeditpatient;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.openmrs.android_sdk.library.api.repository.ConceptRepository;
import com.openmrs.android_sdk.library.api.repository.PatientRepository;
import com.openmrs.android_sdk.library.dao.PatientDAO;
import com.openmrs.android_sdk.library.models.ConceptAnswers;
import com.openmrs.android_sdk.library.models.Patient;
import com.openmrs.android_sdk.library.models.ResultType;
import com.openmrs.android_sdk.utilities.PatientValidator;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.joda.time.DateTime;
import org.openmrs.mobile.activities.BaseViewModel;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;
import java.io.File;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010:\u001a\u00020;J\f\u0010<\u001a\b\u0012\u0004\u0012\u00020=0)J\u0006\u0010>\u001a\u00020;J\b\u0010?\u001a\u00020;H\u0002J\u0006\u0010@\u001a\u00020;J\b\u0010A\u001a\u00020;H\u0002R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001e@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u001e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u001e\u0010%\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0002@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0)8F\u00a2\u0006\u0006\u001a\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00100)8F\u00a2\u0006\u0006\u001a\u0004\b9\u0010+\u00a8\u0006B"}, d2 = {"Lorg/openmrs/mobile/activities/addeditpatient/AddEditPatientViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "Lcom/openmrs/android_sdk/library/models/Patient;", "patientDAO", "Lcom/openmrs/android_sdk/library/dao/PatientDAO;", "patientRepository", "Lcom/openmrs/android_sdk/library/api/repository/PatientRepository;", "conceptRepository", "Lcom/openmrs/android_sdk/library/api/repository/ConceptRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/openmrs/android_sdk/library/dao/PatientDAO;Lcom/openmrs/android_sdk/library/api/repository/PatientRepository;Lcom/openmrs/android_sdk/library/api/repository/ConceptRepository;Landroidx/lifecycle/SavedStateHandle;)V", "_patientUpdateLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/openmrs/android_sdk/library/models/ResultType;", "_similarPatientsLiveData", "", "capturedPhotoFile", "Ljava/io/File;", "getCapturedPhotoFile", "()Ljava/io/File;", "setCapturedPhotoFile", "(Ljava/io/File;)V", "dateHolder", "Lorg/joda/time/DateTime;", "getDateHolder", "()Lorg/joda/time/DateTime;", "setDateHolder", "(Lorg/joda/time/DateTime;)V", "value", "", "isPatientUnidentified", "()Z", "setPatientUnidentified", "(Z)V", "<set-?>", "isUpdatePatient", "patient", "getPatient", "()Lcom/openmrs/android_sdk/library/models/Patient;", "patientUpdateLiveData", "Landroidx/lifecycle/LiveData;", "getPatientUpdateLiveData", "()Landroidx/lifecycle/LiveData;", "patientValidator", "Lcom/openmrs/android_sdk/utilities/PatientValidator;", "getPatientValidator", "()Lcom/openmrs/android_sdk/utilities/PatientValidator;", "setPatientValidator", "(Lcom/openmrs/android_sdk/utilities/PatientValidator;)V", "placesClient", "Lcom/google/android/libraries/places/api/net/PlacesClient;", "getPlacesClient", "()Lcom/google/android/libraries/places/api/net/PlacesClient;", "setPlacesClient", "(Lcom/google/android/libraries/places/api/net/PlacesClient;)V", "similarPatientsLiveData", "getSimilarPatientsLiveData", "confirmPatient", "", "fetchCausesOfDeath", "Lcom/openmrs/android_sdk/library/models/ConceptAnswers;", "fetchSimilarPatients", "registerPatient", "resetPatient", "updatePatient", "app_debug"})
public final class AddEditPatientViewModel extends org.openmrs.mobile.activities.BaseViewModel<com.openmrs.android_sdk.library.models.Patient> {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.openmrs.android_sdk.library.models.Patient>> _similarPatientsLiveData = null;
    private final androidx.lifecycle.MutableLiveData<com.openmrs.android_sdk.library.models.ResultType> _patientUpdateLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private com.openmrs.android_sdk.utilities.PatientValidator patientValidator;
    private boolean isUpdatePatient = false;
    @org.jetbrains.annotations.NotNull()
    private com.openmrs.android_sdk.library.models.Patient patient;
    private boolean isPatientUnidentified = false;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.libraries.places.api.net.PlacesClient placesClient;
    @org.jetbrains.annotations.Nullable()
    private org.joda.time.DateTime dateHolder;
    @org.jetbrains.annotations.Nullable()
    private java.io.File capturedPhotoFile;
    private final com.openmrs.android_sdk.library.dao.PatientDAO patientDAO = null;
    private final com.openmrs.android_sdk.library.api.repository.PatientRepository patientRepository = null;
    private final com.openmrs.android_sdk.library.api.repository.ConceptRepository conceptRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.openmrs.android_sdk.library.models.Patient>> getSimilarPatientsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.openmrs.android_sdk.library.models.ResultType> getPatientUpdateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.openmrs.android_sdk.utilities.PatientValidator getPatientValidator() {
        return null;
    }
    
    public final void setPatientValidator(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.utilities.PatientValidator p0) {
    }
    
    public final boolean isUpdatePatient() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.openmrs.android_sdk.library.models.Patient getPatient() {
        return null;
    }
    
    public final boolean isPatientUnidentified() {
        return false;
    }
    
    public final void setPatientUnidentified(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.libraries.places.api.net.PlacesClient getPlacesClient() {
        return null;
    }
    
    public final void setPlacesClient(@org.jetbrains.annotations.Nullable()
    com.google.android.libraries.places.api.net.PlacesClient p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.joda.time.DateTime getDateHolder() {
        return null;
    }
    
    public final void setDateHolder(@org.jetbrains.annotations.Nullable()
    org.joda.time.DateTime p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getCapturedPhotoFile() {
        return null;
    }
    
    public final void setCapturedPhotoFile(@org.jetbrains.annotations.Nullable()
    java.io.File p0) {
    }
    
    public final void resetPatient() {
    }
    
    public final void confirmPatient() {
    }
    
    public final void fetchSimilarPatients() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.openmrs.android_sdk.library.models.ConceptAnswers> fetchCausesOfDeath() {
        return null;
    }
    
    private final void registerPatient() {
    }
    
    private final void updatePatient() {
    }
    
    @javax.inject.Inject()
    public AddEditPatientViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.PatientDAO patientDAO, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.PatientRepository patientRepository, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.ConceptRepository conceptRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}