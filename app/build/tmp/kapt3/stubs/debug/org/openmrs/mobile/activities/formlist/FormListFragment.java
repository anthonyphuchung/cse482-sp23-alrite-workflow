package org.openmrs.mobile.activities.formlist;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.Snackbar.SnackbarLayout;
import com.openmrs.android_sdk.library.models.EncounterType;
import com.openmrs.android_sdk.library.models.Result;
import com.openmrs.android_sdk.utilities.ApplicationConstants;
import com.openmrs.android_sdk.utilities.ToastUtil;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.activities.formadmission.FormAdmissionActivity;
import org.openmrs.mobile.activities.formdisplay.FormDisplayActivity;
import org.openmrs.mobile.databinding.FragmentFormListBinding;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0017H\u0002J\u001b\u0010\u001a\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002\u00a2\u0006\u0002\u0010\u001eJ \u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001dH\u0002J(\u0010$\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u001dH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\'"}, d2 = {"Lorg/openmrs/mobile/activities/formlist/FormListFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentFormListBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentFormListBinding;", "viewModel", "Lorg/openmrs/mobile/activities/formlist/FormListViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/formlist/FormListViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "setupFormClickListener", "setupObserver", "showFormList", "forms", "", "", "([Ljava/lang/String;)V", "startAdmissionFormActivity", "formName", "patientId", "", "encounterType", "startFormDisplayActivity", "valueRefString", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FormListFragment extends org.openmrs.mobile.activities.BaseFragment {
    private org.openmrs.mobile.databinding.FragmentFormListBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    public static final org.openmrs.mobile.activities.formlist.FormListFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentFormListBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.formlist.FormListViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setupFormClickListener() {
    }
    
    private final void setupObserver() {
    }
    
    private final void showFormList(java.lang.String[] forms) {
    }
    
    private final void startFormDisplayActivity(java.lang.String formName, long patientId, java.lang.String valueRefString, java.lang.String encounterType) {
    }
    
    private final void startAdmissionFormActivity(java.lang.String formName, long patientId, java.lang.String encounterType) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public FormListFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/openmrs/mobile/activities/formlist/FormListFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/formlist/FormListFragment;", "patientId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.formlist.FormListFragment newInstance(long patientId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}