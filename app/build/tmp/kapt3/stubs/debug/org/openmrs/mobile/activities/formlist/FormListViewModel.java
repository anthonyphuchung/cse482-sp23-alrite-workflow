package org.openmrs.mobile.activities.formlist;

import com.openmrs.android_sdk.library.OpenmrsAndroid;
import com.openmrs.android_sdk.library.api.repository.FormRepository;
import com.openmrs.android_sdk.library.dao.EncounterDAO;
import com.openmrs.android_sdk.library.databases.entities.FormResourceEntity;
import com.openmrs.android_sdk.library.models.FormData;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.json.JSONException;
import org.json.JSONObject;
import org.openmrs.mobile.activities.BaseViewModel;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0013B\u0017\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/openmrs/mobile/activities/formlist/FormListViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "", "encounterDAO", "Lcom/openmrs/android_sdk/library/dao/EncounterDAO;", "formRepository", "Lcom/openmrs/android_sdk/library/api/repository/FormRepository;", "(Lcom/openmrs/android_sdk/library/dao/EncounterDAO;Lcom/openmrs/android_sdk/library/api/repository/FormRepository;)V", "formResourceList", "", "Lcom/openmrs/android_sdk/library/databases/entities/FormResourceEntity;", "createFormDataFromAsset", "Lcom/openmrs/android_sdk/library/models/FormData;", "formName", "loadFormResourceList", "", "parseFormDataFromAsset", "filename", "SelectedForm", "app_debug"})
public final class FormListViewModel extends org.openmrs.mobile.activities.BaseViewModel<java.lang.String[]> {
    private final java.util.List<com.openmrs.android_sdk.library.databases.entities.FormResourceEntity> formResourceList = null;
    private final com.openmrs.android_sdk.library.dao.EncounterDAO encounterDAO = null;
    private final com.openmrs.android_sdk.library.api.repository.FormRepository formRepository = null;
    
    private final void loadFormResourceList() {
    }
    
    private final com.openmrs.android_sdk.library.models.FormData createFormDataFromAsset(java.lang.String formName) {
        return null;
    }
    
    private final com.openmrs.android_sdk.library.models.FormData parseFormDataFromAsset(java.lang.String filename) {
        return null;
    }
    
    @javax.inject.Inject()
    public FormListViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.EncounterDAO encounterDAO, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.FormRepository formRepository) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0002R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\"\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/openmrs/mobile/activities/formlist/FormListViewModel$SelectedForm;", "", "position", "", "(Lorg/openmrs/mobile/activities/formlist/FormListViewModel;I)V", "<set-?>", "", "encounterName", "getEncounterName", "()Ljava/lang/String;", "encounterType", "getEncounterType", "formFieldsJson", "getFormFieldsJson", "formName", "getFormName", "click", "", "app_debug"})
    public final class SelectedForm {
        @org.jetbrains.annotations.Nullable()
        private java.lang.String formName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String encounterName;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String encounterType;
        @org.jetbrains.annotations.Nullable()
        private java.lang.String formFieldsJson;
        private final int position = 0;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFormName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEncounterName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getEncounterType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getFormFieldsJson() {
            return null;
        }
        
        private final void click() {
        }
        
        public SelectedForm(int position) {
            super();
        }
    }
}