package org.openmrs.mobile.activities.addeditpatient;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import com.openmrs.android_sdk.utilities.ApplicationConstants;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.ACBaseActivity;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0010H\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, d2 = {"Lorg/openmrs/mobile/activities/addeditpatient/AddEditPatientActivity;", "Lorg/openmrs/mobile/activities/ACBaseActivity;", "()V", "addEditPatientFragment", "Lorg/openmrs/mobile/activities/addeditpatient/AddEditPatientFragment;", "getAddEditPatientFragment", "()Lorg/openmrs/mobile/activities/addeditpatient/AddEditPatientFragment;", "setAddEditPatientFragment", "(Lorg/openmrs/mobile/activities/addeditpatient/AddEditPatientFragment;)V", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "getAlertDialog", "()Landroidx/appcompat/app/AlertDialog;", "setAlertDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "onBackPressed", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "showInfoLostDialog", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddEditPatientActivity extends org.openmrs.mobile.activities.ACBaseActivity {
    @org.jetbrains.annotations.Nullable()
    private org.openmrs.mobile.activities.addeditpatient.AddEditPatientFragment addEditPatientFragment;
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog alertDialog;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final org.openmrs.mobile.activities.addeditpatient.AddEditPatientFragment getAddEditPatientFragment() {
        return null;
    }
    
    public final void setAddEditPatientFragment(@org.jetbrains.annotations.Nullable()
    org.openmrs.mobile.activities.addeditpatient.AddEditPatientFragment p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog getAlertDialog() {
        return null;
    }
    
    public final void setAlertDialog(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    /**
     * The method creates a warning dialog when the user presses back button while registering a patient
     */
    private final void showInfoLostDialog() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    public AddEditPatientActivity() {
        super();
    }
}