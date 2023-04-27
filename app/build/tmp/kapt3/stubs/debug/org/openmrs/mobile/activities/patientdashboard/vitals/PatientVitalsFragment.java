package org.openmrs.mobile.activities.patientdashboard.vitals;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import com.openmrs.android_sdk.library.models.Encounter;
import com.openmrs.android_sdk.library.models.Result;
import com.openmrs.android_sdk.utilities.DateUtils;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.activities.formdisplay.FormDisplayActivity;
import org.openmrs.mobile.application.OpenMRSInflater;
import org.openmrs.mobile.bundle.FormFieldsWrapper;
import org.openmrs.mobile.databinding.FragmentPatientVitalsBinding;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0002J$\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0016J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\b\u0010\u001b\u001a\u00020\u000fH\u0002J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u000fH\u0002J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\""}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/vitals/PatientVitalsFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentPatientVitalsBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentPatientVitalsBinding;", "viewModel", "Lorg/openmrs/mobile/activities/patientdashboard/vitals/PatientDashboardVitalsViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/patientdashboard/vitals/PatientDashboardVitalsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "fetchEncounterAndStartFormEdit", "", "fetchLastVitals", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "setupObserver", "showEncounterVitals", "encounter", "Lcom/openmrs/android_sdk/library/models/Encounter;", "showNoVitals", "startFormDisplayActivity", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PatientVitalsFragment extends org.openmrs.mobile.activities.BaseFragment {
    private org.openmrs.mobile.databinding.FragmentPatientVitalsBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    public static final org.openmrs.mobile.activities.patientdashboard.vitals.PatientVitalsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentPatientVitalsBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.patientdashboard.vitals.PatientDashboardVitalsViewModel getViewModel() {
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
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void setupObserver() {
    }
    
    private final void fetchLastVitals() {
    }
    
    private final void fetchEncounterAndStartFormEdit() {
    }
    
    private final void showEncounterVitals(com.openmrs.android_sdk.library.models.Encounter encounter) {
    }
    
    private final void showNoVitals() {
    }
    
    private final void startFormDisplayActivity(com.openmrs.android_sdk.library.models.Encounter encounter) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public PatientVitalsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/vitals/PatientVitalsFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/patientdashboard/vitals/PatientVitalsFragment;", "patientId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.patientdashboard.vitals.PatientVitalsFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String patientId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}