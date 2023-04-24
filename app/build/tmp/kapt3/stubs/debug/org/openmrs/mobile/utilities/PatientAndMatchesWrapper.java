package org.openmrs.mobile.utilities;

import com.openmrs.android_sdk.utilities.PatientAndMatchingPatients;
import java.io.Serializable;
import java.util.*;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u0015\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lorg/openmrs/mobile/utilities/PatientAndMatchesWrapper;", "Ljava/io/Serializable;", "()V", "matchingPatients", "Ljava/util/Queue;", "Lcom/openmrs/android_sdk/utilities/PatientAndMatchingPatients;", "(Ljava/util/Queue;)V", "getMatchingPatients", "()Ljava/util/Queue;", "setMatchingPatients", "addToList", "", "element", "remove", "app_debug"})
public final class PatientAndMatchesWrapper implements java.io.Serializable {
    @org.jetbrains.annotations.NotNull()
    private java.util.Queue<com.openmrs.android_sdk.utilities.PatientAndMatchingPatients> matchingPatients;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Queue<com.openmrs.android_sdk.utilities.PatientAndMatchingPatients> getMatchingPatients() {
        return null;
    }
    
    public final void setMatchingPatients(@org.jetbrains.annotations.NotNull()
    java.util.Queue<com.openmrs.android_sdk.utilities.PatientAndMatchingPatients> p0) {
    }
    
    public final void addToList(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.utilities.PatientAndMatchingPatients element) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.utilities.PatientAndMatchingPatients element) {
    }
    
    public PatientAndMatchesWrapper() {
        super();
    }
    
    public PatientAndMatchesWrapper(@org.jetbrains.annotations.NotNull()
    java.util.Queue<com.openmrs.android_sdk.utilities.PatientAndMatchingPatients> matchingPatients) {
        super();
    }
}