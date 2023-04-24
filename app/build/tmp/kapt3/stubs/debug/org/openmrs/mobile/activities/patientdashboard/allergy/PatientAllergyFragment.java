package org.openmrs.mobile.activities.patientdashboard.allergy;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.openmrs.android_sdk.library.models.Allergy;
import com.openmrs.android_sdk.library.models.Result;
import com.openmrs.android_sdk.utilities.ToastUtil;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.activities.addeditallergy.AddEditAllergyActivity;
import org.openmrs.mobile.activities.dialog.CustomDialogModel;
import org.openmrs.mobile.activities.dialog.CustomPickerDialog;
import org.openmrs.mobile.activities.dialog.CustomPickerDialog.onInputSelected;
import org.openmrs.mobile.activities.patientdashboard.allergy.PatientAllergyRecyclerViewAdapter.OnLongPressListener;
import org.openmrs.mobile.databinding.FragmentPatientAllergyBinding;
import java.util.ArrayList;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001)B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0013H\u0002J\b\u0010#\u001a\u00020\u0013H\u0002J\u0016\u0010$\u001a\u00020\u00132\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0&H\u0002J\u0010\u0010\'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u000bH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006*"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/allergy/PatientAllergyFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "Lorg/openmrs/mobile/activities/patientdashboard/allergy/PatientAllergyRecyclerViewAdapter$OnLongPressListener;", "Lorg/openmrs/mobile/activities/dialog/CustomPickerDialog$onInputSelected;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentPatientAllergyBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentPatientAllergyBinding;", "selectedAllergy", "Lcom/openmrs/android_sdk/library/models/Allergy;", "viewModel", "Lorg/openmrs/mobile/activities/patientdashboard/allergy/PatientDashboardAllergyViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/patientdashboard/allergy/PatientDashboardAllergyViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "deleteAllergy", "", "fetchPatientAllergies", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "performFunction", "position", "", "setupAdapter", "setupObserver", "showAllergyList", "allergies", "", "showDialogueBox", "allergy", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PatientAllergyFragment extends org.openmrs.mobile.activities.BaseFragment implements org.openmrs.mobile.activities.patientdashboard.allergy.PatientAllergyRecyclerViewAdapter.OnLongPressListener, org.openmrs.mobile.activities.dialog.CustomPickerDialog.onInputSelected {
    private org.openmrs.mobile.databinding.FragmentPatientAllergyBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.openmrs.android_sdk.library.models.Allergy selectedAllergy;
    public static final org.openmrs.mobile.activities.patientdashboard.allergy.PatientAllergyFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentPatientAllergyBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.patientdashboard.allergy.PatientDashboardAllergyViewModel getViewModel() {
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
    
    private final void setupAdapter() {
    }
    
    private final void setupObserver() {
    }
    
    private final void fetchPatientAllergies() {
    }
    
    private final void deleteAllergy() {
    }
    
    private final void showAllergyList(java.util.List<com.openmrs.android_sdk.library.models.Allergy> allergies) {
    }
    
    @java.lang.Override()
    public void showDialogueBox(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.models.Allergy allergy) {
    }
    
    @java.lang.Override()
    public void performFunction(int position) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public PatientAllergyFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/allergy/PatientAllergyFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/patientdashboard/allergy/PatientAllergyFragment;", "patientId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.patientdashboard.allergy.PatientAllergyFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String patientId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}