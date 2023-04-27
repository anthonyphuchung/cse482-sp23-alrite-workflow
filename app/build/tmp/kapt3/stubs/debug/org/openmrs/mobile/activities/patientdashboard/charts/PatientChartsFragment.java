package org.openmrs.mobile.activities.patientdashboard.charts;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.common.collect.Lists;
import com.openmrs.android_sdk.library.models.Result;
import com.openmrs.android_sdk.utilities.ToastUtil;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.android.synthetic.main.fragment_patient_charts.*;
import org.json.JSONException;
import org.json.JSONObject;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.databinding.FragmentPatientChartsBinding;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0002J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002J\u0010\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\"\u001a\u00020\u00122\u0006\u0010#\u001a\u00020$H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006&"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/charts/PatientChartsFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "Lorg/openmrs/mobile/activities/patientdashboard/charts/PatientChartsRecyclerViewAdapter$OnClickListener;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentPatientChartsBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentPatientChartsBinding;", "observationList", "Lorg/json/JSONObject;", "viewModel", "Lorg/openmrs/mobile/activities/patientdashboard/charts/PatientDashboardChartsViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/patientdashboard/charts/PatientDashboardChartsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "fetchChartsData", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "setupAdapter", "setupObserver", "showChartActivity", "vitalName", "", "showChartsList", "showEmptyList", "visibility", "", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PatientChartsFragment extends org.openmrs.mobile.activities.BaseFragment implements org.openmrs.mobile.activities.patientdashboard.charts.PatientChartsRecyclerViewAdapter.OnClickListener {
    private org.openmrs.mobile.databinding.FragmentPatientChartsBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private org.json.JSONObject observationList;
    public static final org.openmrs.mobile.activities.patientdashboard.charts.PatientChartsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentPatientChartsBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.patientdashboard.charts.PatientDashboardChartsViewModel getViewModel() {
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
    
    private final void setupAdapter() {
    }
    
    private final void setupObserver() {
    }
    
    private final void fetchChartsData() {
    }
    
    private final void showChartsList(org.json.JSONObject observationList) {
    }
    
    private final void showEmptyList(boolean visibility) {
    }
    
    @java.lang.Override()
    public void showChartActivity(@org.jetbrains.annotations.NotNull()
    java.lang.String vitalName) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public PatientChartsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/charts/PatientChartsFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/patientdashboard/charts/PatientChartsFragment;", "patientId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.patientdashboard.charts.PatientChartsFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String patientId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}