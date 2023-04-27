package org.openmrs.mobile.activities.patientdashboard.visits;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.openmrs.android_sdk.library.models.Result;
import com.openmrs.android_sdk.library.models.Visit;
import com.openmrs.android_sdk.utilities.ApplicationConstants;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.activities.patientdashboard.PatientDashboardActivity;
import org.openmrs.mobile.activities.visitdashboard.VisitDashboardActivity;
import org.openmrs.mobile.databinding.FragmentPatientVisitBinding;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 62\u00020\u0001:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015J\u0010\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J$\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010&\u001a\u00020\u0011H\u0016J\u0010\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0011H\u0016J\b\u0010,\u001a\u00020\u0011H\u0002J\b\u0010-\u001a\u00020\u0011H\u0002J\b\u0010.\u001a\u00020\u0011H\u0002J\b\u0010/\u001a\u00020\u0011H\u0002J\b\u00100\u001a\u00020\u0011H\u0002J\u0016\u00101\u001a\u00020\u00112\f\u00102\u001a\b\u0012\u0004\u0012\u00020403H\u0002J\u0006\u00105\u001a\u00020\u0011R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u00067"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/visits/PatientVisitsFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentPatientVisitBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentPatientVisitBinding;", "patientDashboardActivity", "Lorg/openmrs/mobile/activities/patientdashboard/PatientDashboardActivity;", "viewModel", "Lorg/openmrs/mobile/activities/patientdashboard/visits/PatientDashboardVisitsViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/patientdashboard/visits/PatientDashboardVisitsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "dismissCurrentDialog", "", "fetchPatientVisits", "goToVisitDashboard", "visitID", "", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onResume", "setupAdapter", "setupObserver", "showErrorFetchingVisits", "showStartVisitProgressDialog", "showStartVisitStatus", "showVisitsList", "visits", "", "Lcom/openmrs/android_sdk/library/models/Visit;", "startVisit", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PatientVisitsFragment extends org.openmrs.mobile.activities.BaseFragment {
    private org.openmrs.mobile.databinding.FragmentPatientVisitBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private org.openmrs.mobile.activities.patientdashboard.PatientDashboardActivity patientDashboardActivity;
    public static final org.openmrs.mobile.activities.patientdashboard.visits.PatientVisitsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentPatientVisitBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.patientdashboard.visits.PatientDashboardVisitsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    private final void setupAdapter() {
    }
    
    private final void setupObserver() {
    }
    
    private final void fetchPatientVisits() {
    }
    
    public final void startVisit() {
    }
    
    private final void showVisitsList(java.util.List<com.openmrs.android_sdk.library.models.Visit> visits) {
    }
    
    private final void showErrorFetchingVisits() {
    }
    
    private final void showStartVisitStatus() {
    }
    
    private final void showStartVisitProgressDialog() {
    }
    
    private final void dismissCurrentDialog() {
    }
    
    public final void goToVisitDashboard(long visitID) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public PatientVisitsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/visits/PatientVisitsFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/patientdashboard/visits/PatientVisitsFragment;", "patientId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.patientdashboard.visits.PatientVisitsFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String patientId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}