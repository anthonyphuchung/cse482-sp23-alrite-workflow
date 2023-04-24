package org.openmrs.mobile.utilities;

import com.openmrs.android_sdk.library.models.Patient;
import com.openmrs.android_sdk.library.models.PersonAddress;
import com.openmrs.android_sdk.library.models.PersonName;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a8\u0006\u0015"}, d2 = {"Lorg/openmrs/mobile/utilities/PatientMerger;", "", "()V", "getNewValueIfOldIsNull", "", "oldValue", "newValue", "mergePatient", "Lcom/openmrs/android_sdk/library/models/Patient;", "oldPatient", "newPatient", "mergePatientsPerson", "", "mergePersonAddress", "oldAddress", "Lcom/openmrs/android_sdk/library/models/PersonAddress;", "newAddress", "mergePersonNames", "oldName", "Lcom/openmrs/android_sdk/library/models/PersonName;", "newName", "app_debug"})
public final class PatientMerger {
    
    @org.jetbrains.annotations.NotNull()
    public final com.openmrs.android_sdk.library.models.Patient mergePatient(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.models.Patient oldPatient, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.models.Patient newPatient) {
        return null;
    }
    
    private final void mergePatientsPerson(com.openmrs.android_sdk.library.models.Patient oldPatient, com.openmrs.android_sdk.library.models.Patient newPatient) {
    }
    
    private final void mergePersonAddress(com.openmrs.android_sdk.library.models.PersonAddress oldAddress, com.openmrs.android_sdk.library.models.PersonAddress newAddress) {
    }
    
    private final void mergePersonNames(com.openmrs.android_sdk.library.models.PersonName oldName, com.openmrs.android_sdk.library.models.PersonName newName) {
    }
    
    private final java.lang.String getNewValueIfOldIsNull(java.lang.String oldValue, java.lang.String newValue) {
        return null;
    }
    
    public PatientMerger() {
        super();
    }
}