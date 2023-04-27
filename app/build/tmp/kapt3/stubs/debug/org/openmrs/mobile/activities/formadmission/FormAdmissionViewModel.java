package org.openmrs.mobile.activities.formadmission;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.api.repository.EncounterRepository;
import com.openmrs.android_sdk.library.api.repository.FormRepository;
import com.openmrs.android_sdk.library.api.repository.ProviderRepository;
import com.openmrs.android_sdk.library.dao.PatientDAO;
import com.openmrs.android_sdk.library.databases.entities.LocationEntity;
import com.openmrs.android_sdk.library.models.EncounterProviderCreate;
import com.openmrs.android_sdk.library.models.Encountercreate;
import com.openmrs.android_sdk.library.models.Patient;
import com.openmrs.android_sdk.library.models.Provider;
import com.openmrs.android_sdk.library.models.Resource;
import com.openmrs.android_sdk.library.models.ResultType;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010>\u001a\u00020\u0002H\u0002J\u0016\u0010?\u001a\u00020\u00022\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u0011J\u0016\u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u0011J\u0016\u0010D\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u0011J\f\u0010F\u001a\b\u0012\u0004\u0012\u00020H0GR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019RV\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u001aj\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b`\u001c2\"\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u001aj\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b`\u001c@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R>\u0010\"\u001a,\u0012(\u0012&\u0012\f\u0012\n %*\u0004\u0018\u00010\u00020\u0002 %*\u0012\u0012\f\u0012\n %*\u0004\u0018\u00010\u00020\u0002\u0018\u00010$0$0#8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b&\u0010\'R\u0011\u0010(\u001a\u00020)\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010.\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0013\"\u0004\b0\u0010\u0015R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u00101\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0019RV\u00104\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002030\u001aj\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u000203`\u001c2\"\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u0002030\u001aj\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u000203`\u001c@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u00106\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0013\"\u0004\b8\u0010\u0015R\"\u00109\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0019RV\u0010<\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020;0\u001aj\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020;`\u001c2\"\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020;0\u001aj\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020;`\u001c@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\u001f\u00a8\u0006I"}, d2 = {"Lorg/openmrs/mobile/activities/formadmission/FormAdmissionViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "patientDAO", "Lcom/openmrs/android_sdk/library/dao/PatientDAO;", "formRepository", "Lcom/openmrs/android_sdk/library/api/repository/FormRepository;", "encounterRepository", "Lcom/openmrs/android_sdk/library/api/repository/EncounterRepository;", "providerRepository", "Lcom/openmrs/android_sdk/library/api/repository/ProviderRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/openmrs/android_sdk/library/dao/PatientDAO;Lcom/openmrs/android_sdk/library/api/repository/FormRepository;Lcom/openmrs/android_sdk/library/api/repository/EncounterRepository;Lcom/openmrs/android_sdk/library/api/repository/ProviderRepository;Landroidx/lifecycle/SavedStateHandle;)V", "currentLocation", "", "encounterRoleListPosition", "", "getEncounterRoleListPosition", "()I", "setEncounterRoleListPosition", "(I)V", "<set-?>", "encounterRoleUuid", "getEncounterRoleUuid", "()Ljava/lang/String;", "Ljava/util/LinkedHashMap;", "Lcom/openmrs/android_sdk/library/models/Resource;", "Lkotlin/collections/LinkedHashMap;", "encounterRoles", "getEncounterRoles", "()Ljava/util/LinkedHashMap;", "encounterType", "formName", "listsObservables", "", "Lrx/Observable;", "kotlin.jvm.PlatformType", "getListsObservables", "()Ljava/util/List;", "patient", "Lcom/openmrs/android_sdk/library/models/Patient;", "getPatient", "()Lcom/openmrs/android_sdk/library/models/Patient;", "patientId", "", "providerListPosition", "getProviderListPosition", "setProviderListPosition", "providerUuid", "getProviderUuid", "Lcom/openmrs/android_sdk/library/models/Provider;", "providers", "getProviders", "targetLocationListPosition", "getTargetLocationListPosition", "setTargetLocationListPosition", "targetLocationUuid", "getTargetLocationUuid", "Lcom/openmrs/android_sdk/library/databases/entities/LocationEntity;", "targetLocations", "getTargetLocations", "fetchFormFields", "selectEncounterRole", "roleName", "listPosition", "selectProvider", "providerName", "selectTargetLocation", "locationName", "submitAdmission", "Landroidx/lifecycle/LiveData;", "Lcom/openmrs/android_sdk/library/models/ResultType;", "app_debug"})
public final class FormAdmissionViewModel extends org.openmrs.mobile.activities.BaseViewModel<kotlin.Unit> {
    private int providerListPosition = 0;
    private int encounterRoleListPosition = 0;
    private int targetLocationListPosition = 0;
    private final long patientId = 0L;
    private final java.lang.String encounterType = null;
    private final java.lang.String formName = null;
    private final java.lang.String currentLocation = null;
    @org.jetbrains.annotations.NotNull()
    private final com.openmrs.android_sdk.library.models.Patient patient = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, com.openmrs.android_sdk.library.models.Provider> providers;
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, com.openmrs.android_sdk.library.models.Resource> encounterRoles;
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, com.openmrs.android_sdk.library.databases.entities.LocationEntity> targetLocations;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String providerUuid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String encounterRoleUuid;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String targetLocationUuid;
    private final com.openmrs.android_sdk.library.dao.PatientDAO patientDAO = null;
    private final com.openmrs.android_sdk.library.api.repository.FormRepository formRepository = null;
    private final com.openmrs.android_sdk.library.api.repository.EncounterRepository encounterRepository = null;
    private final com.openmrs.android_sdk.library.api.repository.ProviderRepository providerRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    public final int getProviderListPosition() {
        return 0;
    }
    
    public final void setProviderListPosition(int p0) {
    }
    
    public final int getEncounterRoleListPosition() {
        return 0;
    }
    
    public final void setEncounterRoleListPosition(int p0) {
    }
    
    public final int getTargetLocationListPosition() {
        return 0;
    }
    
    public final void setTargetLocationListPosition(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.openmrs.android_sdk.library.models.Patient getPatient() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, com.openmrs.android_sdk.library.models.Provider> getProviders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, com.openmrs.android_sdk.library.models.Resource> getEncounterRoles() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, com.openmrs.android_sdk.library.databases.entities.LocationEntity> getTargetLocations() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getProviderUuid() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEncounterRoleUuid() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTargetLocationUuid() {
        return null;
    }
    
    private final java.util.List<rx.Observable<kotlin.Unit>> getListsObservables() {
        return null;
    }
    
    private final void fetchFormFields() {
    }
    
    public final void selectProvider(@org.jetbrains.annotations.NotNull()
    java.lang.String providerName, int listPosition) {
    }
    
    public final void selectEncounterRole(@org.jetbrains.annotations.NotNull()
    java.lang.String roleName, int listPosition) {
    }
    
    public final void selectTargetLocation(@org.jetbrains.annotations.NotNull()
    java.lang.String locationName, int listPosition) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.openmrs.android_sdk.library.models.ResultType> submitAdmission() {
        return null;
    }
    
    @javax.inject.Inject()
    public FormAdmissionViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.PatientDAO patientDAO, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.FormRepository formRepository, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.EncounterRepository encounterRepository, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.ProviderRepository providerRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}