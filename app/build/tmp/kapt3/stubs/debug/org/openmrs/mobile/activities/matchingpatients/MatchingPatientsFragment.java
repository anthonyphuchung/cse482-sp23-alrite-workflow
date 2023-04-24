package org.openmrs.mobile.activities.matchingpatients;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.openmrs.android_sdk.library.models.Patient;
import com.openmrs.android_sdk.library.models.Result.Success;
import com.openmrs.android_sdk.library.models.Result.Error;
import com.openmrs.android_sdk.utilities.ApplicationConstants;
import com.openmrs.android_sdk.utilities.PatientAndMatchingPatients;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.databinding.FragmentMatchingPatientsBinding;
import java.util.Queue;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u0000 12\u00020\u0001:\u00011B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0002J$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u001dH\u0016J\b\u0010\'\u001a\u00020\u001dH\u0002J\u001e\u0010(\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0,H\u0002J\u0010\u0010-\u001a\u00020\u001d2\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010.\u001a\u00020\u001dH\u0002J\b\u0010/\u001a\u00020\u001dH\u0002J\b\u00100\u001a\u00020\u001dH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019\u00a8\u00062"}, d2 = {"Lorg/openmrs/mobile/activities/matchingpatients/MatchingPatientsFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentMatchingPatientsBinding;", "allPatientsAndMatches", "Ljava/util/Queue;", "Lcom/openmrs/android_sdk/utilities/PatientAndMatchingPatients;", "getAllPatientsAndMatches", "()Ljava/util/Queue;", "setAllPatientsAndMatches", "(Ljava/util/Queue;)V", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentMatchingPatientsBinding;", "currentPatientAndMatches", "getCurrentPatientAndMatches", "()Lcom/openmrs/android_sdk/utilities/PatientAndMatchingPatients;", "setCurrentPatientAndMatches", "(Lcom/openmrs/android_sdk/utilities/PatientAndMatchingPatients;)V", "matchesAdapter", "Lorg/openmrs/mobile/activities/matchingpatients/MergePatientsRecycleViewAdapter;", "viewModel", "Lorg/openmrs/mobile/activities/matchingpatients/MatchingPatientsViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/matchingpatients/MatchingPatientsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "finishActivity", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "setListeners", "setMatchingPatients", "patient", "Lcom/openmrs/android_sdk/library/models/Patient;", "matchingPatients", "", "setPatientInfo", "setupAdapter", "setupObserver", "showNextPatientsDataOrFinish", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MatchingPatientsFragment extends org.openmrs.mobile.activities.BaseFragment {
    private org.openmrs.mobile.databinding.FragmentMatchingPatientsBinding _binding;
    private org.openmrs.mobile.activities.matchingpatients.MergePatientsRecycleViewAdapter matchesAdapter;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public java.util.Queue<com.openmrs.android_sdk.utilities.PatientAndMatchingPatients> allPatientsAndMatches;
    @org.jetbrains.annotations.NotNull()
    public com.openmrs.android_sdk.utilities.PatientAndMatchingPatients currentPatientAndMatches;
    public static final org.openmrs.mobile.activities.matchingpatients.MatchingPatientsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentMatchingPatientsBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.matchingpatients.MatchingPatientsViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Queue<com.openmrs.android_sdk.utilities.PatientAndMatchingPatients> getAllPatientsAndMatches() {
        return null;
    }
    
    public final void setAllPatientsAndMatches(@org.jetbrains.annotations.NotNull()
    java.util.Queue<com.openmrs.android_sdk.utilities.PatientAndMatchingPatients> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.openmrs.android_sdk.utilities.PatientAndMatchingPatients getCurrentPatientAndMatches() {
        return null;
    }
    
    public final void setCurrentPatientAndMatches(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.utilities.PatientAndMatchingPatients p0) {
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
    
    private final void showNextPatientsDataOrFinish() {
    }
    
    private final void setListeners() {
    }
    
    private final void setupObserver() {
    }
    
    private final void setMatchingPatients(com.openmrs.android_sdk.library.models.Patient patient, java.util.List<? extends com.openmrs.android_sdk.library.models.Patient> matchingPatients) {
    }
    
    private final void setPatientInfo(com.openmrs.android_sdk.library.models.Patient patient) {
    }
    
    private final void finishActivity() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public MatchingPatientsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a8\u0006\b"}, d2 = {"Lorg/openmrs/mobile/activities/matchingpatients/MatchingPatientsFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/matchingpatients/MatchingPatientsFragment;", "matchingPatientsList", "Ljava/util/Queue;", "Lcom/openmrs/android_sdk/utilities/PatientAndMatchingPatients;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.matchingpatients.MatchingPatientsFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.util.Queue<com.openmrs.android_sdk.utilities.PatientAndMatchingPatients> matchingPatientsList) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}