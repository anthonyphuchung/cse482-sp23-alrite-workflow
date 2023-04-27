package org.openmrs.mobile.activities.lastviewedpatients;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.openmrs.android_sdk.library.models.Patient;
import com.openmrs.android_sdk.library.models.Result;
import com.openmrs.android_sdk.utilities.ApplicationConstants;
import com.openmrs.android_sdk.utilities.ToastUtil;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.android.synthetic.main.fragment_last_viewed_patients.view.*;
import kotlinx.android.synthetic.main.snackbar.view.*;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.activities.patientdashboard.PatientDashboardActivity;
import org.openmrs.mobile.databinding.FragmentLastViewedPatientsBinding;
import java.util.ArrayList;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010#\u001a\u00020\u0013H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0016J\b\u0010(\u001a\u00020\u0013H\u0016J\u0010\u0010)\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020\u0013H\u0002J\b\u0010-\u001a\u00020\u0013H\u0002J\b\u0010.\u001a\u00020\u0013H\u0002J\b\u0010/\u001a\u00020\u0013H\u0002J\b\u00100\u001a\u00020\u0013H\u0002J\b\u00101\u001a\u00020\u0013H\u0002J\b\u00102\u001a\u00020\u0013H\u0002J\u0016\u00103\u001a\u00020\u00132\f\u00104\u001a\b\u0012\u0004\u0012\u00020605H\u0002J\u000e\u00107\u001a\u00020\u00132\u0006\u0010*\u001a\u00020+J\b\u00108\u001a\u00020\u0013H\u0002J\u0016\u00109\u001a\u00020\u00132\f\u0010:\u001a\b\u0012\u0004\u0012\u00020605H\u0002J\b\u0010;\u001a\u00020\u0013H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006="}, d2 = {"Lorg/openmrs/mobile/activities/lastviewedpatients/LastViewedPatientsFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentLastViewedPatientsBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentLastViewedPatientsBinding;", "mAdapter", "Lorg/openmrs/mobile/activities/lastviewedpatients/LastViewedPatientRecyclerViewAdapter;", "scrollListener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "viewModel", "Lorg/openmrs/mobile/activities/lastviewedpatients/LastViewedPatientsViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/lastviewedpatients/LastViewedPatientsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "fetchPatients", "", "query", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onResume", "openPatientDashboardActivity", "patientId", "", "resetLastViewedPatients", "setupAdapter", "setupObserver", "setupSwipeRefresh", "setupViewsForLastViewedPatients", "showErrorFetchingPatients", "showLoadingPatients", "showMorePatients", "patients", "", "Lcom/openmrs/android_sdk/library/models/Patient;", "showOpenPatientSnackbar", "showPatientSearchError", "showPatientSearchResult", "patientList", "showSearchingForPatient", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LastViewedPatientsFragment extends org.openmrs.mobile.activities.BaseFragment {
    private org.openmrs.mobile.databinding.FragmentLastViewedPatientsBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private org.openmrs.mobile.activities.lastviewedpatients.LastViewedPatientRecyclerViewAdapter mAdapter;
    private final androidx.recyclerview.widget.RecyclerView.OnScrollListener scrollListener = null;
    public static final org.openmrs.mobile.activities.lastviewedpatients.LastViewedPatientsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentLastViewedPatientsBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.lastviewedpatients.LastViewedPatientsViewModel getViewModel() {
        return null;
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
    
    private final void resetLastViewedPatients() {
    }
    
    private final void setupObserver() {
    }
    
    private final void fetchPatients(java.lang.String query) {
    }
    
    private final void setupSwipeRefresh() {
    }
    
    private final void setupViewsForLastViewedPatients() {
    }
    
    private final void showLoadingPatients() {
    }
    
    private final void showMorePatients(java.util.List<? extends com.openmrs.android_sdk.library.models.Patient> patients) {
    }
    
    private final void showErrorFetchingPatients() {
    }
    
    private final void showSearchingForPatient() {
    }
    
    private final void showPatientSearchResult(java.util.List<? extends com.openmrs.android_sdk.library.models.Patient> patientList) {
    }
    
    private final void showPatientSearchError() {
    }
    
    public final void showOpenPatientSnackbar(long patientId) {
    }
    
    private final void openPatientDashboardActivity(long patientId) {
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
    
    public LastViewedPatientsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/openmrs/mobile/activities/lastviewedpatients/LastViewedPatientsFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/lastviewedpatients/LastViewedPatientsFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.lastviewedpatients.LastViewedPatientsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}