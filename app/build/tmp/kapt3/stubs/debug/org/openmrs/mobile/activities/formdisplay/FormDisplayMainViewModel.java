package org.openmrs.mobile.activities.formdisplay;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.api.repository.EncounterRepository;
import com.openmrs.android_sdk.library.api.repository.FormRepository;
import com.openmrs.android_sdk.library.dao.PatientDAO;
import com.openmrs.android_sdk.library.models.Encountercreate;
import com.openmrs.android_sdk.library.models.Obscreate;
import com.openmrs.android_sdk.library.models.Patient;
import com.openmrs.android_sdk.library.models.ResultType;
import com.openmrs.android_sdk.utilities.InputField;
import com.openmrs.android_sdk.utilities.SelectOneField;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.joda.time.LocalDateTime;
import org.openmrs.mobile.activities.BaseViewModel;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019H\u0002J\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0019H\u0002J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010#\u001a\u00020$H\u0002J(\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0019J\u001e\u0010&\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lorg/openmrs/mobile/activities/formdisplay/FormDisplayMainViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "patientDAO", "Lcom/openmrs/android_sdk/library/dao/PatientDAO;", "formRepository", "Lcom/openmrs/android_sdk/library/api/repository/FormRepository;", "encounterRepository", "Lcom/openmrs/android_sdk/library/api/repository/EncounterRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/openmrs/android_sdk/library/dao/PatientDAO;Lcom/openmrs/android_sdk/library/api/repository/FormRepository;Lcom/openmrs/android_sdk/library/api/repository/EncounterRepository;Landroidx/lifecycle/SavedStateHandle;)V", "encounterType", "", "encounterUuid", "formName", "isUpdateEncounter", "", "patient", "Lcom/openmrs/android_sdk/library/models/Patient;", "getPatient", "()Lcom/openmrs/android_sdk/library/models/Patient;", "patientId", "", "createObservationsFromInputFields", "", "Lcom/openmrs/android_sdk/library/models/Obscreate;", "inputFields", "Lcom/openmrs/android_sdk/utilities/InputField;", "createObservationsFromRadioGroupFields", "radioGroupFields", "Lcom/openmrs/android_sdk/utilities/SelectOneField;", "createRecords", "Landroidx/lifecycle/LiveData;", "Lcom/openmrs/android_sdk/library/models/ResultType;", "enc", "Lcom/openmrs/android_sdk/library/models/Encountercreate;", "submitForm", "updateRecords", "app_debug"})
public final class FormDisplayMainViewModel extends org.openmrs.mobile.activities.BaseViewModel<kotlin.Unit> {
    private final long patientId = 0L;
    private final java.lang.String encounterType = null;
    private final java.lang.String formName = null;
    private final java.lang.String encounterUuid = null;
    private final boolean isUpdateEncounter = false;
    @org.jetbrains.annotations.NotNull()
    private final com.openmrs.android_sdk.library.models.Patient patient = null;
    private final com.openmrs.android_sdk.library.dao.PatientDAO patientDAO = null;
    private final com.openmrs.android_sdk.library.api.repository.FormRepository formRepository = null;
    private final com.openmrs.android_sdk.library.api.repository.EncounterRepository encounterRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.openmrs.android_sdk.library.models.Patient getPatient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.openmrs.android_sdk.library.models.ResultType> submitForm(@org.jetbrains.annotations.NotNull()
    java.util.List<com.openmrs.android_sdk.utilities.InputField> inputFields, @org.jetbrains.annotations.NotNull()
    java.util.List<com.openmrs.android_sdk.utilities.SelectOneField> radioGroupFields) {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<com.openmrs.android_sdk.library.models.ResultType> createRecords(com.openmrs.android_sdk.library.models.Encountercreate enc) {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<com.openmrs.android_sdk.library.models.ResultType> updateRecords(java.lang.String encounterUuid, com.openmrs.android_sdk.library.models.Encountercreate enc) {
        return null;
    }
    
    private final java.util.List<com.openmrs.android_sdk.library.models.Obscreate> createObservationsFromInputFields(java.util.List<com.openmrs.android_sdk.utilities.InputField> inputFields) {
        return null;
    }
    
    private final java.util.List<com.openmrs.android_sdk.library.models.Obscreate> createObservationsFromRadioGroupFields(java.util.List<com.openmrs.android_sdk.utilities.SelectOneField> radioGroupFields) {
        return null;
    }
    
    @javax.inject.Inject()
    public FormDisplayMainViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.PatientDAO patientDAO, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.FormRepository formRepository, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.EncounterRepository encounterRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}