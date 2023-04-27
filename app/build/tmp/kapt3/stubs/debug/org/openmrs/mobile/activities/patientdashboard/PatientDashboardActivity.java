package org.openmrs.mobile.activities.patientdashboard;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.openmrs.android_sdk.library.models.Result;
import com.openmrs.android_sdk.utilities.NetworkUtils;
import com.openmrs.android_sdk.utilities.ToastUtil;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.ACBaseActivity;
import org.openmrs.mobile.activities.addeditallergy.AddEditAllergyActivity;
import org.openmrs.mobile.activities.addeditpatient.AddEditPatientActivity;
import org.openmrs.mobile.databinding.ActivityPatientDashboardBinding;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\tH\u0002J\u0006\u0010\u0019\u001a\u00020\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0016J\u0012\u0010\u001c\u001a\u00020\u00162\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0010\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0016H\u0014J\u0010\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0016H\u0002J\b\u0010\'\u001a\u00020\u0016H\u0002J\b\u0010(\u001a\u00020\u0016H\u0002J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020\u0016H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006,"}, d2 = {"Lorg/openmrs/mobile/activities/patientdashboard/PatientDashboardActivity;", "Lorg/openmrs/mobile/activities/ACBaseActivity;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/ActivityPatientDashboardBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/ActivityPatientDashboardBinding;", "isActionFABOpen", "", "()Z", "setActionFABOpen", "(Z)V", "patientId", "", "viewModel", "Lorg/openmrs/mobile/activities/patientdashboard/PatientDashboardMainViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/patientdashboard/PatientDashboardMainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "animateMainFABIcon", "", "closeFABs", "animate", "deletePatient", "initViewPager", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "openFABs", "setupActionFABs", "setupObserver", "startPatientUpdateActivity", "", "syncPatient", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class PatientDashboardActivity extends org.openmrs.mobile.activities.ACBaseActivity {
    private org.openmrs.mobile.databinding.ActivityPatientDashboardBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.lang.String patientId;
    private boolean isActionFABOpen = false;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.ActivityPatientDashboardBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.patientdashboard.PatientDashboardMainViewModel getViewModel() {
        return null;
    }
    
    public final boolean isActionFABOpen() {
        return false;
    }
    
    public final void setActionFABOpen(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setupObserver() {
    }
    
    private final void syncPatient() {
    }
    
    public final void deletePatient() {
    }
    
    private final void initViewPager() {
    }
    
    private final void setupActionFABs() {
    }
    
    private final void openFABs() {
    }
    
    private final void closeFABs(boolean animate) {
    }
    
    private final void animateMainFABIcon() {
    }
    
    private final void startPatientUpdateActivity(long patientId) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public PatientDashboardActivity() {
        super();
    }
}