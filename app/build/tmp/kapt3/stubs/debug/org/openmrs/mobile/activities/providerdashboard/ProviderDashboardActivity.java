package org.openmrs.mobile.activities.providerdashboard;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Observer;
import com.openmrs.android_sdk.library.models.ResultType;
import com.openmrs.android_sdk.utilities.ToastUtil;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.ACBaseActivity;
import org.openmrs.mobile.activities.addeditprovider.AddEditProviderActivity;
import org.openmrs.mobile.activities.providerdashboard.patientrelationship.PatientRelationshipFragment;
import org.openmrs.mobile.activities.providerdashboard.providerrelationship.ProviderRelationshipFragment;
import org.openmrs.mobile.databinding.ActivityProviderDashboardBinding;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0006H\u0007J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\u0010\u0010\u001d\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001eH\u0002J\b\u0010 \u001a\u00020\u0013H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006!"}, d2 = {"Lorg/openmrs/mobile/activities/providerdashboard/ProviderDashboardActivity;", "Lorg/openmrs/mobile/activities/ACBaseActivity;", "()V", "binding", "Lorg/openmrs/mobile/databinding/ActivityProviderDashboardBinding;", "isActionFABOpen", "", "()Z", "setActionFABOpen", "(Z)V", "viewModel", "Lorg/openmrs/mobile/activities/providerdashboard/ProviderDashboardViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/providerdashboard/ProviderDashboardViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "animateFAB", "isFABClosed", "closeFABMenu", "", "deleteProvider", "hideFABs", "hide", "initViewPager", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupUpdateDeleteActionFAB", "showFABMenu", "Landroid/view/ViewPropertyAnimator;", "kotlin.jvm.PlatformType", "startProviderUpdateActivity", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ProviderDashboardActivity extends org.openmrs.mobile.activities.ACBaseActivity {
    private org.openmrs.mobile.databinding.ActivityProviderDashboardBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private boolean isActionFABOpen = false;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.activities.providerdashboard.ProviderDashboardViewModel getViewModel() {
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
    
    public final void deleteProvider() {
    }
    
    private final void initViewPager() {
    }
    
    private final void setupUpdateDeleteActionFAB() {
    }
    
    private final android.view.ViewPropertyAnimator showFABMenu() {
        return null;
    }
    
    private final void closeFABMenu() {
    }
    
    private final void startProviderUpdateActivity() {
    }
    
    /**
     * This method is called from other Fragments only when they are visible to the user
     * @param hide To hide the FAB menu depending on the Fragment visible
     */
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    public final void hideFABs(boolean hide) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final boolean animateFAB(boolean isFABClosed) {
        return false;
    }
    
    public ProviderDashboardActivity() {
        super();
    }
}