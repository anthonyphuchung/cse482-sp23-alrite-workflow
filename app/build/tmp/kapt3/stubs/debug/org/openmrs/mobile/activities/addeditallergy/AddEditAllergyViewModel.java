package org.openmrs.mobile.activities.addeditallergy;

import androidx.annotation.IdRes;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.api.repository.AllergyRepository;
import com.openmrs.android_sdk.library.api.repository.ConceptRepository;
import com.openmrs.android_sdk.library.dao.PatientDAO;
import com.openmrs.android_sdk.library.models.AllergenCreate;
import com.openmrs.android_sdk.library.models.Allergy;
import com.openmrs.android_sdk.library.models.AllergyCreate;
import com.openmrs.android_sdk.library.models.AllergyPatient;
import com.openmrs.android_sdk.library.models.AllergyReactionCreate;
import com.openmrs.android_sdk.library.models.AllergyUuid;
import com.openmrs.android_sdk.library.models.Patient;
import com.openmrs.android_sdk.library.models.Resource;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseViewModel;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010O\u001a\u00020\u00022\u0006\u0010P\u001a\u00020*J\u000e\u0010Q\u001a\b\u0012\u0004\u0012\u00020,0RH\u0002J\b\u0010S\u001a\u00020\u0002H\u0002J\b\u0010T\u001a\u00020\u0002H\u0002J\u0010\u0010U\u001a\u0004\u0018\u00010K2\u0006\u0010P\u001a\u00020*J\u001e\u0010V\u001a\u00020\u00022\u0006\u0010W\u001a\u00020*2\u0006\u0010X\u001a\u00020\r2\u0006\u0010Y\u001a\u00020*J\u0010\u0010Z\u001a\u00020\u00022\b\b\u0001\u0010[\u001a\u00020\rJ\u0010\u0010\\\u001a\u00020\u00022\b\b\u0001\u0010[\u001a\u00020\rJ\f\u0010]\u001a\b\u0012\u0004\u0012\u00020,0RJ\u000e\u0010^\u001a\b\u0012\u0004\u0012\u00020,0RH\u0002R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001d0\u001c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010&\u001a\u0004\u0018\u00010%2\b\u0010$\u001a\u0004\u0018\u00010%@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u00020,8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000RV\u00107\u001a\u001e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020504j\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u000205`62\"\u0010$\u001a\u001e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020504j\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u000205`6@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109RV\u0010:\u001a\u001e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020504j\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u000205`62\"\u0010$\u001a\u001e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020504j\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u000205`6@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00109RV\u0010<\u001a\u001e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020504j\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u000205`62\"\u0010$\u001a\u001e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020504j\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u000205`6@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00109R\u001e\u0010>\u001a\u00020,2\u0006\u0010$\u001a\u00020,@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010.R\u001e\u0010?\u001a\u00020*2\u0006\u0010$\u001a\u00020*@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00101R\u001e\u0010A\u001a\u00020*2\u0006\u0010$\u001a\u00020*@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00101R\u0011\u0010C\u001a\u00020D\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020*X\u0082\u0004\u00a2\u0006\u0002\n\u0000RV\u0010H\u001a\u001e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020504j\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u000205`62\"\u0010$\u001a\u001e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020504j\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u000205`6@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00109R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R-\u0010J\u001a\u001e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020K04j\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020K`6\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00109R\u001e\u0010M\u001a\u00020*2\u0006\u0010$\u001a\u00020*@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00101\u00a8\u0006_"}, d2 = {"Lorg/openmrs/mobile/activities/addeditallergy/AddEditAllergyViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "patientDAO", "Lcom/openmrs/android_sdk/library/dao/PatientDAO;", "conceptRepository", "Lcom/openmrs/android_sdk/library/api/repository/ConceptRepository;", "allergyRepository", "Lcom/openmrs/android_sdk/library/api/repository/AllergyRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/openmrs/android_sdk/library/dao/PatientDAO;Lcom/openmrs/android_sdk/library/api/repository/ConceptRepository;Lcom/openmrs/android_sdk/library/api/repository/AllergyRepository;Landroidx/lifecycle/SavedStateHandle;)V", "allergenListPosition", "", "getAllergenListPosition", "()I", "setAllergenListPosition", "(I)V", "allergenSeverityChipId", "getAllergenSeverityChipId", "()Ljava/lang/Integer;", "setAllergenSeverityChipId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "allergenTypeChipId", "getAllergenTypeChipId", "setAllergenTypeChipId", "allergyConceptsObservables", "", "Lrx/Observable;", "getAllergyConceptsObservables", "()Ljava/util/List;", "allergyCreate", "Lcom/openmrs/android_sdk/library/models/AllergyCreate;", "getAllergyCreate", "()Lcom/openmrs/android_sdk/library/models/AllergyCreate;", "<set-?>", "Lcom/openmrs/android_sdk/library/models/Allergy;", "allergyToUpdate", "getAllergyToUpdate", "()Lcom/openmrs/android_sdk/library/models/Allergy;", "allergyUuid", "", "areAllConceptsNotEmpty", "", "getAreAllConceptsNotEmpty", "()Z", "comment", "getComment", "()Ljava/lang/String;", "setComment", "(Ljava/lang/String;)V", "Ljava/util/LinkedHashMap;", "Lcom/openmrs/android_sdk/library/models/Resource;", "Lkotlin/collections/LinkedHashMap;", "drugAllergens", "getDrugAllergens", "()Ljava/util/LinkedHashMap;", "environmentAllergens", "getEnvironmentAllergens", "foodAllergens", "getFoodAllergens", "isUpdateAllergy", "mildSeverity", "getMildSeverity", "moderateSeverity", "getModerateSeverity", "patient", "Lcom/openmrs/android_sdk/library/models/Patient;", "getPatient", "()Lcom/openmrs/android_sdk/library/models/Patient;", "patientId", "reactionList", "getReactionList", "selectedReactions", "Lcom/openmrs/android_sdk/library/models/AllergyReactionCreate;", "getSelectedReactions", "severeSeverity", "getSevereSeverity", "addReaction", "reactionName", "createAllergy", "Landroidx/lifecycle/LiveData;", "fetchAllergyConcepts", "fetchOldAllergyIfPresentThenSuccess", "removeReaction", "selectAllergen", "allergenName", "listPosition", "allergenType", "selectAllergenSeverityChip", "chipViewId", "selectAllergenTypeChip", "submitAllergy", "updateAllergy", "app_debug"})
public final class AddEditAllergyViewModel extends org.openmrs.mobile.activities.BaseViewModel<kotlin.Unit> {
    private int allergenTypeChipId = org.openmrs.mobile.R.id.allergen_drug;
    private int allergenListPosition = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer allergenSeverityChipId;
    @org.jetbrains.annotations.NotNull()
    private final java.util.LinkedHashMap<java.lang.String, com.openmrs.android_sdk.library.models.AllergyReactionCreate> selectedReactions = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String comment;
    private final java.lang.String patientId = null;
    private final java.lang.String allergyUuid = null;
    private boolean isUpdateAllergy;
    @org.jetbrains.annotations.NotNull()
    private final com.openmrs.android_sdk.library.models.Patient patient = null;
    @org.jetbrains.annotations.Nullable()
    private com.openmrs.android_sdk.library.models.Allergy allergyToUpdate;
    @org.jetbrains.annotations.NotNull()
    private final com.openmrs.android_sdk.library.models.AllergyCreate allergyCreate = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, com.openmrs.android_sdk.library.models.Resource> drugAllergens;
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, com.openmrs.android_sdk.library.models.Resource> foodAllergens;
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, com.openmrs.android_sdk.library.models.Resource> environmentAllergens;
    @org.jetbrains.annotations.NotNull()
    private java.util.LinkedHashMap<java.lang.String, com.openmrs.android_sdk.library.models.Resource> reactionList;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String mildSeverity = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String moderateSeverity = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String severeSeverity = "";
    private final com.openmrs.android_sdk.library.dao.PatientDAO patientDAO = null;
    private final com.openmrs.android_sdk.library.api.repository.ConceptRepository conceptRepository = null;
    private final com.openmrs.android_sdk.library.api.repository.AllergyRepository allergyRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    public final int getAllergenTypeChipId() {
        return 0;
    }
    
    public final void setAllergenTypeChipId(int p0) {
    }
    
    public final int getAllergenListPosition() {
        return 0;
    }
    
    public final void setAllergenListPosition(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAllergenSeverityChipId() {
        return null;
    }
    
    public final void setAllergenSeverityChipId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, com.openmrs.android_sdk.library.models.AllergyReactionCreate> getSelectedReactions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getComment() {
        return null;
    }
    
    public final void setComment(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isUpdateAllergy() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.openmrs.android_sdk.library.models.Patient getPatient() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.openmrs.android_sdk.library.models.Allergy getAllergyToUpdate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.openmrs.android_sdk.library.models.AllergyCreate getAllergyCreate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, com.openmrs.android_sdk.library.models.Resource> getDrugAllergens() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, com.openmrs.android_sdk.library.models.Resource> getFoodAllergens() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, com.openmrs.android_sdk.library.models.Resource> getEnvironmentAllergens() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.LinkedHashMap<java.lang.String, com.openmrs.android_sdk.library.models.Resource> getReactionList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMildSeverity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getModerateSeverity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSevereSeverity() {
        return null;
    }
    
    private final java.util.List<rx.Observable<kotlin.Unit>> getAllergyConceptsObservables() {
        return null;
    }
    
    private final boolean getAreAllConceptsNotEmpty() {
        return false;
    }
    
    private final void fetchAllergyConcepts() {
    }
    
    private final void fetchOldAllergyIfPresentThenSuccess() {
    }
    
    public final void selectAllergenTypeChip(@androidx.annotation.IdRes()
    int chipViewId) {
    }
    
    public final void selectAllergenSeverityChip(@androidx.annotation.IdRes()
    int chipViewId) {
    }
    
    public final void selectAllergen(@org.jetbrains.annotations.NotNull()
    java.lang.String allergenName, int listPosition, @org.jetbrains.annotations.NotNull()
    java.lang.String allergenType) {
    }
    
    public final void addReaction(@org.jetbrains.annotations.NotNull()
    java.lang.String reactionName) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.openmrs.android_sdk.library.models.AllergyReactionCreate removeReaction(@org.jetbrains.annotations.NotNull()
    java.lang.String reactionName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> submitAllergy() {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<java.lang.Boolean> createAllergy() {
        return null;
    }
    
    private final androidx.lifecycle.LiveData<java.lang.Boolean> updateAllergy() {
        return null;
    }
    
    @javax.inject.Inject()
    public AddEditAllergyViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.PatientDAO patientDAO, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.ConceptRepository conceptRepository, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.AllergyRepository allergyRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}