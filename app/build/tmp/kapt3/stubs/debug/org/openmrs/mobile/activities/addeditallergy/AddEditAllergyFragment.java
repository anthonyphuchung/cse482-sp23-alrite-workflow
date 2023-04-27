package org.openmrs.mobile.activities.addeditallergy;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.Observer;
import com.google.android.material.chip.Chip;
import com.openmrs.android_sdk.library.models.AllergyUuid;
import com.openmrs.android_sdk.library.models.Result;
import com.openmrs.android_sdk.utilities.ToastUtil;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.databinding.FragmentAllergyInfoBinding;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\f\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u000fH\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0002J\u0010\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010#\u001a\u00020\u000fH\u0002J\u001e\u0010$\u001a\u00020\u000f2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00110&2\u0006\u0010\'\u001a\u00020\u0011H\u0002J\b\u0010(\u001a\u00020\u000fH\u0002J\u0016\u0010)\u001a\u00020\u000f2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00110&H\u0002J\b\u0010+\u001a\u00020\u000fH\u0002J\u0010\u0010,\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u0013H\u0002J\b\u0010.\u001a\u00020\u000fH\u0002J\u0010\u0010/\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u00100\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u00062"}, d2 = {"Lorg/openmrs/mobile/activities/addeditallergy/AddEditAllergyFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentAllergyInfoBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentAllergyInfoBinding;", "viewModel", "Lorg/openmrs/mobile/activities/addeditallergy/AddEditAllergyViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/addeditallergy/AddEditAllergyViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addReactionChip", "", "reaction", "", "closeCommentBox", "", "initListeners", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "restoreState", "selectChip", "textView", "Landroid/widget/TextView;", "selectSeverity", "setActionBarTitle", "setupAllergenSpinner", "allergens", "", "allergenType", "setupObservers", "setupReactionSpinner", "reactions", "showDialogToSubmit", "showLoading", "loading", "submitAllergy", "unSelectChip", "unSelectSeverity", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddEditAllergyFragment extends org.openmrs.mobile.activities.BaseFragment {
    private org.openmrs.mobile.databinding.FragmentAllergyInfoBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    public static final org.openmrs.mobile.activities.addeditallergy.AddEditAllergyFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentAllergyInfoBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.addeditallergy.AddEditAllergyViewModel getViewModel() {
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
    
    private final boolean closeCommentBox() {
        return false;
    }
    
    private final void setActionBarTitle() {
    }
    
    private final void setupObservers() {
    }
    
    private final void restoreState() {
    }
    
    private final void initListeners() {
    }
    
    private final void setupAllergenSpinner(java.util.List<java.lang.String> allergens, java.lang.String allergenType) {
    }
    
    private final void setupReactionSpinner(java.util.List<java.lang.String> reactions) {
    }
    
    private final void showDialogToSubmit() {
    }
    
    private final void submitAllergy() {
    }
    
    private final void showLoading(boolean loading) {
    }
    
    private final void addReactionChip(java.lang.String reaction) {
    }
    
    private final void unSelectChip(android.widget.TextView textView) {
    }
    
    private final void selectChip(android.widget.TextView textView) {
    }
    
    private final void unSelectSeverity(android.widget.TextView textView) {
    }
    
    private final void selectSeverity(android.widget.TextView textView) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public AddEditAllergyFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\b"}, d2 = {"Lorg/openmrs/mobile/activities/addeditallergy/AddEditAllergyFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/addeditallergy/AddEditAllergyFragment;", "patientId", "", "allergyUuid", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.addeditallergy.AddEditAllergyFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String patientId, @org.jetbrains.annotations.Nullable()
        java.lang.String allergyUuid) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}