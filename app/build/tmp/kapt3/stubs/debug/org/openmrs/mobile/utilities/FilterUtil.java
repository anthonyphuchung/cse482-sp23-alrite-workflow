package org.openmrs.mobile.utilities;

import com.openmrs.android_sdk.library.models.Patient;
import com.openmrs.android_sdk.library.models.Provider;
import com.openmrs.android_sdk.library.models.Visit;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0003J\u001a\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0003J(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0003J$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0007J\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fH\u0003\u00a8\u0006\u0018"}, d2 = {"Lorg/openmrs/mobile/utilities/FilterUtil;", "", "()V", "doesAnySearchableWordFitQuery", "", "searchableWords", "", "", "query", "getPatientSearchableWords", "patient", "Lcom/openmrs/android_sdk/library/models/Patient;", "getPatientsFilteredByQuery", "patientList", "getPatientsWithActiveVisitsFilteredByQuery", "Lcom/openmrs/android_sdk/library/models/Visit;", "visitList", "getProviderSearchableWords", "provider", "Lcom/openmrs/android_sdk/library/models/Provider;", "getProvidersFilteredByQuery", "providerList", "getVisitSearchableWords", "visit", "app_debug"})
public final class FilterUtil {
    public static final org.openmrs.mobile.utilities.FilterUtil INSTANCE = null;
    
    /**
     * Used to filter list by specified query
     * Its possible to filter patients by: Name, Surname (Family Name) or ID.
     * @param patientList list of patients to filter
     * @param query query that needs to be contained in Name, Surname or ID.
     * @return patient list filtered by query
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.openmrs.android_sdk.library.models.Patient> getPatientsFilteredByQuery(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.openmrs.android_sdk.library.models.Patient> patientList, @org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.openmrs.android_sdk.library.models.Provider> getProvidersFilteredByQuery(@org.jetbrains.annotations.NotNull()
    java.util.List<com.openmrs.android_sdk.library.models.Provider> providerList, @org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.openmrs.android_sdk.library.models.Visit> getPatientsWithActiveVisitsFilteredByQuery(@org.jetbrains.annotations.Nullable()
    java.util.List<com.openmrs.android_sdk.library.models.Visit> visitList, @org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return null;
    }
    
    private static final java.util.List<java.lang.String> getPatientSearchableWords(com.openmrs.android_sdk.library.models.Patient patient) {
        return null;
    }
    
    private static final java.util.List<java.lang.String> getProviderSearchableWords(com.openmrs.android_sdk.library.models.Provider provider) {
        return null;
    }
    
    private static final java.util.List<java.lang.String> getVisitSearchableWords(com.openmrs.android_sdk.library.models.Visit visit) {
        return null;
    }
    
    private static final boolean doesAnySearchableWordFitQuery(java.util.List<java.lang.String> searchableWords, java.lang.String query) {
        return false;
    }
    
    private FilterUtil() {
        super();
    }
}