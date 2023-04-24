package org.openmrs.mobile.activities.patientdashboard.diagnosis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.lifecycle.Observer;
import com.openmrs.android_sdk.library.models.Result;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.activities.patientdashboard.PatientDashboardActivity;
import org.openmrs.mobile.databinding.FragmentPatientDiagnosisBinding;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000fH\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u000fH\u0002J\u0016\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006 "}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/diagnosis/PatientDiagnosisFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentPatientDiagnosisBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentPatientDiagnosisBinding;", "viewModel", "Lorg/openmrs/mobile/activities/patientdashboard/diagnosis/PatientDashboardDiagnosisViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/patientdashboard/diagnosis/PatientDashboardDiagnosisViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "fetchDiagnoses", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "setupListView", "setupObserver", "showDiagnosesList", "diagnoses", "", "", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PatientDiagnosisFragment extends org.openmrs.mobile.activities.BaseFragment {
    private org.openmrs.mobile.databinding.FragmentPatientDiagnosisBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    public static final org.openmrs.mobile.activities.patientdashboard.diagnosis.PatientDiagnosisFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentPatientDiagnosisBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.patientdashboard.diagnosis.PatientDashboardDiagnosisViewModel getViewModel() {
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
    
    private final void setupListView() {
    }
    
    private final void setupObserver() {
    }
    
    private final void fetchDiagnoses() {
    }
    
    private final void showDiagnosesList(java.util.List<java.lang.String> diagnoses) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public PatientDiagnosisFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/diagnosis/PatientDiagnosisFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/patientdashboard/diagnosis/PatientDiagnosisFragment;", "patientId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.patientdashboard.diagnosis.PatientDiagnosisFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String patientId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}