package org.openmrs.mobile.activities.syncedpatients;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.openmrs.android_sdk.library.models.Patient;
import com.openmrs.android_sdk.library.models.Result;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.databinding.FragmentSyncedPatientsBinding;
import java.util.ArrayList;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u000fH\u0002J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u000fH\u0002J\b\u0010!\u001a\u00020\u000fH\u0002J\b\u0010\"\u001a\u00020\u000fH\u0002J\u0016\u0010#\u001a\u00020\u000f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00110%H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\'"}, d2 = {"Lorg/openmrs/mobile/activities/syncedpatients/SyncedPatientsFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentSyncedPatientsBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentSyncedPatientsBinding;", "viewModel", "Lorg/openmrs/mobile/activities/syncedpatients/SyncedPatientsViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/syncedpatients/SyncedPatientsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "deletePatient", "", "patient", "Lcom/openmrs/android_sdk/library/models/Patient;", "fetchSyncedPatients", "query", "", "hideEmptyListText", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "setupObserver", "showEmptyListText", "showError", "showLoading", "showPatientsList", "patients", "", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SyncedPatientsFragment extends org.openmrs.mobile.activities.BaseFragment {
    private org.openmrs.mobile.databinding.FragmentSyncedPatientsBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    public static final org.openmrs.mobile.activities.syncedpatients.SyncedPatientsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentSyncedPatientsBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.syncedpatients.SyncedPatientsViewModel getViewModel() {
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
    
    public final void fetchSyncedPatients() {
    }
    
    public final void fetchSyncedPatients(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void deletePatient(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.models.Patient patient) {
    }
    
    private final void showLoading() {
    }
    
    private final void showPatientsList(java.util.List<? extends com.openmrs.android_sdk.library.models.Patient> patients) {
    }
    
    private final void showError() {
    }
    
    private final void showEmptyListText() {
    }
    
    private final void hideEmptyListText() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public SyncedPatientsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/openmrs/mobile/activities/syncedpatients/SyncedPatientsFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/syncedpatients/SyncedPatientsFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.syncedpatients.SyncedPatientsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}