package org.openmrs.mobile.activities.patientdashboard.details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.openmrs.android_sdk.library.models.Patient;
import com.openmrs.android_sdk.library.models.Result;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.activities.patientdashboard.PatientDashboardActivity;
import org.openmrs.mobile.databinding.FragmentPatientDetailsBinding;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u000fH\u0002J\"\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u001bH\u0002J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\'"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/details/PatientDetailsFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentPatientDetailsBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentPatientDetailsBinding;", "viewModel", "Lorg/openmrs/mobile/activities/patientdashboard/details/PatientDashboardDetailsViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/patientdashboard/details/PatientDashboardDetailsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "fetchPatientDetails", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "setMenuTitle", "nameString", "", "identifier", "setupObserver", "showAddressDetailsViewElement", "detailsViewLabel", "Landroid/widget/TextView;", "detailsView", "detailsText", "showPatientDetails", "patient", "Lcom/openmrs/android_sdk/library/models/Patient;", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PatientDetailsFragment extends org.openmrs.mobile.activities.BaseFragment {
    private org.openmrs.mobile.databinding.FragmentPatientDetailsBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    public static final org.openmrs.mobile.activities.patientdashboard.details.PatientDetailsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentPatientDetailsBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.patientdashboard.details.PatientDashboardDetailsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupObserver() {
    }
    
    private final void fetchPatientDetails() {
    }
    
    private final void showPatientDetails(com.openmrs.android_sdk.library.models.Patient patient) {
    }
    
    private final void showAddressDetailsViewElement(android.widget.TextView detailsViewLabel, android.widget.TextView detailsView, java.lang.String detailsText) {
    }
    
    private final void setMenuTitle(java.lang.String nameString, java.lang.String identifier) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public PatientDetailsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/details/PatientDetailsFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/patientdashboard/details/PatientDetailsFragment;", "patientId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.patientdashboard.details.PatientDetailsFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String patientId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}