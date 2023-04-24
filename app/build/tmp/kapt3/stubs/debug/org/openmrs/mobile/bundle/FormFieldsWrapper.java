package org.openmrs.mobile.bundle;

import com.openmrs.android_sdk.library.models.Answer;
import com.openmrs.android_sdk.library.models.Encounter;
import com.openmrs.android_sdk.library.models.Observation;
import com.openmrs.android_sdk.utilities.InputField;
import com.openmrs.android_sdk.utilities.SelectOneField;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lorg/openmrs/mobile/bundle/FormFieldsWrapper;", "Ljava/io/Serializable;", "()V", "inputFields", "", "Lcom/openmrs/android_sdk/utilities/InputField;", "getInputFields", "()Ljava/util/List;", "setInputFields", "(Ljava/util/List;)V", "selectOneFields", "Lcom/openmrs/android_sdk/utilities/SelectOneField;", "getSelectOneFields", "setSelectOneFields", "Companion", "app_debug"})
public final class FormFieldsWrapper implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.openmrs.android_sdk.utilities.InputField> inputFields;
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.openmrs.android_sdk.utilities.SelectOneField> selectOneFields;
    public static final org.openmrs.mobile.bundle.FormFieldsWrapper.Companion Companion = null;
    
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
    
    public FormFieldsWrapper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J \u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0002\u00a8\u0006\u000f"}, d2 = {"Lorg/openmrs/mobile/bundle/FormFieldsWrapper$Companion;", "", "()V", "create", "Ljava/util/ArrayList;", "Lorg/openmrs/mobile/bundle/FormFieldsWrapper;", "encounter", "Lcom/openmrs/android_sdk/library/models/Encounter;", "getValue", "", "observations", "", "Lcom/openmrs/android_sdk/library/models/Observation;", "conceptUuid", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.ArrayList<org.openmrs.mobile.bundle.FormFieldsWrapper> create(@org.jetbrains.annotations.NotNull()
        com.openmrs.android_sdk.library.models.Encounter encounter) {
            return null;
        }
        
        private final double getValue(java.util.List<com.openmrs.android_sdk.library.models.Observation> observations, java.lang.String conceptUuid) {
            return 0.0;
        }
        
        private Companion() {
            super();
        }
    }
}