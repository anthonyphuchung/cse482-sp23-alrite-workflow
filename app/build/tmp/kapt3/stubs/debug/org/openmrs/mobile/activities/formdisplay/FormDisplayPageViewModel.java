package org.openmrs.mobile.activities.formdisplay;

import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.models.Page;
import com.openmrs.android_sdk.utilities.InputField;
import com.openmrs.android_sdk.utilities.SelectOneField;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import org.openmrs.mobile.bundle.FormFieldsWrapper;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f\u00a8\u0006\u001a"}, d2 = {"Lorg/openmrs/mobile/activities/formdisplay/FormDisplayPageViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "inputFields", "", "Lcom/openmrs/android_sdk/utilities/InputField;", "getInputFields", "()Ljava/util/List;", "setInputFields", "(Ljava/util/List;)V", "page", "Lcom/openmrs/android_sdk/library/models/Page;", "getPage", "()Lcom/openmrs/android_sdk/library/models/Page;", "selectOneFields", "Lcom/openmrs/android_sdk/utilities/SelectOneField;", "getSelectOneFields", "setSelectOneFields", "findInputFieldByConcept", "concept", "", "findSelectOneFieldById", "getOrCreateInputField", "app_debug"})
public final class FormDisplayPageViewModel extends org.openmrs.mobile.activities.BaseViewModel<kotlin.Unit> {
    @org.jetbrains.annotations.NotNull()
    private final com.openmrs.android_sdk.library.models.Page page = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.openmrs.android_sdk.utilities.InputField> inputFields;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.openmrs.android_sdk.utilities.SelectOneField> selectOneFields;
    
    @org.jetbrains.annotations.NotNull()
    public final com.openmrs.android_sdk.library.models.Page getPage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.openmrs.android_sdk.utilities.InputField> getInputFields() {
        return null;
    }
    
    public final void setInputFields(@org.jetbrains.annotations.NotNull()
    java.util.List<com.openmrs.android_sdk.utilities.InputField> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.openmrs.android_sdk.utilities.SelectOneField> getSelectOneFields() {
        return null;
    }
    
    public final void setSelectOneFields(@org.jetbrains.annotations.NotNull()
    java.util.List<com.openmrs.android_sdk.utilities.SelectOneField> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.openmrs.android_sdk.utilities.InputField getOrCreateInputField(@org.jetbrains.annotations.NotNull()
    java.lang.String concept) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.openmrs.android_sdk.utilities.InputField findInputFieldByConcept(@org.jetbrains.annotations.NotNull()
    java.lang.String concept) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.openmrs.android_sdk.utilities.SelectOneField findSelectOneFieldById(@org.jetbrains.annotations.NotNull()
    java.lang.String concept) {
        return null;
    }
    
    @javax.inject.Inject()
    public FormDisplayPageViewModel(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}