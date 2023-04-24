package org.openmrs.mobile.activities.visitdashboard;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.google.android.material.snackbar.Snackbar;
import com.openmrs.android_sdk.library.models.Encounter;
import com.openmrs.android_sdk.library.models.Result;
import com.openmrs.android_sdk.utilities.ApplicationConstants;
import com.openmrs.android_sdk.utilities.NetworkUtils;
import com.openmrs.android_sdk.utilities.ToastUtil;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.activities.dialog.CustomFragmentDialog;
import org.openmrs.mobile.activities.formlist.FormListActivity;
import org.openmrs.mobile.bundle.CustomDialogBundle;
import org.openmrs.mobile.databinding.FragmentVisitDashboardBinding;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u000fH\u0016J\b\u0010$\u001a\u00020\u000fH\u0002J\u0010\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\u000fH\u0002J\b\u0010)\u001a\u00020\u000fH\u0002J\b\u0010*\u001a\u00020\u000fH\u0002J\b\u0010+\u001a\u00020\u000fH\u0002J\b\u0010,\u001a\u00020\u000fH\u0002J\u0016\u0010-\u001a\u00020\u000f2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u00062"}, d2 = {"Lorg/openmrs/mobile/activities/visitdashboard/VisitDashboardFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentVisitDashboardBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentVisitDashboardBinding;", "viewModel", "Lorg/openmrs/mobile/activities/visitdashboard/VisitDashboardViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/visitdashboard/VisitDashboardViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "endVisit", "", "fetchCurrentVisit", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "menuInflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onResume", "recreateOptionsMenu", "setActionBarTitle", "name", "", "setupAdapter", "setupObserver", "showEmptyEncountersSnackBar", "startEncounter", "startFormListActivity", "updateEncountersList", "visitEncounters", "", "Lcom/openmrs/android_sdk/library/models/Encounter;", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class VisitDashboardFragment extends org.openmrs.mobile.activities.BaseFragment {
    private org.openmrs.mobile.databinding.FragmentVisitDashboardBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    public static final org.openmrs.mobile.activities.visitdashboard.VisitDashboardFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentVisitDashboardBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.visitdashboard.VisitDashboardViewModel getViewModel() {
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
    
    private final void fetchCurrentVisit() {
    }
    
    private final void setupAdapter() {
    }
    
    private final void setupObserver() {
    }
    
    private final void updateEncountersList(java.util.List<com.openmrs.android_sdk.library.models.Encounter> visitEncounters) {
    }
    
    public final void endVisit() {
    }
    
    private final void showEmptyEncountersSnackBar() {
    }
    
    private final void setActionBarTitle(java.lang.String name) {
    }
    
    private final void startEncounter() {
    }
    
    private final void startFormListActivity() {
    }
    
    private final void recreateOptionsMenu() {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater menuInflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public VisitDashboardFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/openmrs/mobile/activities/visitdashboard/VisitDashboardFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/visitdashboard/VisitDashboardFragment;", "visitId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.visitdashboard.VisitDashboardFragment newInstance(long visitId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}