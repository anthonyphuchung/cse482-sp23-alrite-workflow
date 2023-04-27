package org.openmrs.mobile.activities.addeditpatient;

import android.Manifest;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.activity.result.contract.ActivityResultContracts.GetContent;
import androidx.activity.result.contract.ActivityResultContracts.TakePicture;
import androidx.annotation.StringDef;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.Observer;
import com.google.android.gms.common.api.ApiException;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.material.snackbar.Snackbar;
import com.openmrs.android_sdk.library.models.ConceptAnswers;
import com.openmrs.android_sdk.library.models.Patient;
import com.openmrs.android_sdk.library.models.PersonAddress;
import com.openmrs.android_sdk.library.models.PersonName;
import com.openmrs.android_sdk.library.models.Result;
import com.openmrs.android_sdk.library.models.ResultType;
import com.openmrs.android_sdk.utilities.ApplicationConstants;
import com.openmrs.android_sdk.utilities.DateUtils;
import com.openmrs.android_sdk.utilities.ToastUtil;
import com.yalantis.ucrop.UCrop;
import dagger.hilt.android.AndroidEntryPoint;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.activities.dialog.CustomDialogModel;
import org.openmrs.mobile.activities.dialog.CustomFragmentDialog;
import org.openmrs.mobile.activities.dialog.CustomPickerDialog;
import org.openmrs.mobile.activities.dialog.CustomPickerDialog.onInputSelected;
import org.openmrs.mobile.activities.patientdashboard.PatientDashboardActivity;
import org.openmrs.mobile.bundle.CustomDialogBundle;
import org.openmrs.mobile.databinding.FragmentPatientInfoBinding;
import org.openmrs.mobile.listeners.watcher.PatientBirthdateValidatorWatcher;
import org.openmrs.mobile.utilities.ImageUtils;
import permissions.dispatcher.PermissionRequest;
import permissions.dispatcher.ktx.PermissionsRequester;
import java.io.File;
import java.util.Calendar;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ^2\u00020\u00012\u00020\u0002:\u0002^_B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010\u0011\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\b\u0010%\u001a\u00020\u001fH\u0002J\u0006\u0010&\u001a\u00020\'J\u0006\u0010(\u001a\u00020\'J\"\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0018\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0016J$\u00104\u001a\u0002052\u0006\u00102\u001a\u0002062\b\u00107\u001a\u0004\u0018\u0001082\b\u00109\u001a\u0004\u0018\u00010:H\u0016J\b\u0010;\u001a\u00020\u001fH\u0016J\u0010\u0010<\u001a\u00020\'2\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020\u001f2\u0006\u0010@\u001a\u00020+H\u0016J\b\u0010\u0015\u001a\u00020\u001fH\u0002J\u0006\u0010A\u001a\u00020\u001fJ\b\u0010B\u001a\u00020\u001fH\u0002J\b\u0010C\u001a\u00020\u001fH\u0002J\b\u0010D\u001a\u00020\u001fH\u0002J\b\u0010E\u001a\u00020\u001fH\u0002J\b\u0010F\u001a\u00020\u001fH\u0002J\u0010\u0010G\u001a\u00020\u001f2\u0006\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020\u001fH\u0002J\b\u0010K\u001a\u00020\u001fH\u0002J\b\u0010L\u001a\u00020\u001fH\u0002J\u001e\u0010M\u001a\u00020\u001f2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020P0O2\u0006\u0010Q\u001a\u00020PH\u0002J\u0010\u0010R\u001a\u00020\u001f2\u0006\u0010S\u001a\u00020+H\u0002J\u0018\u0010T\u001a\u00020\u001f2\u0006\u0010U\u001a\u00020\u00132\u0006\u0010V\u001a\u00020\u0013H\u0002J\b\u0010W\u001a\u00020\u001fH\u0002J\b\u0010X\u001a\u00020\u001fH\u0002J\u0010\u0010Y\u001a\u00020\u001f2\u0006\u0010Z\u001a\u00020[H\u0002J\b\u0010\\\u001a\u00020\u001fH\u0002J\b\u0010]\u001a\u00020\u001fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0015\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00160\u00160\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006`"}, d2 = {"Lorg/openmrs/mobile/activities/addeditpatient/AddEditPatientFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "Lorg/openmrs/mobile/activities/dialog/CustomPickerDialog$onInputSelected;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentPatientInfoBinding;", "alertDialog", "Landroidx/appcompat/app/AlertDialog;", "getAlertDialog", "()Landroidx/appcompat/app/AlertDialog;", "setAlertDialog", "(Landroidx/appcompat/app/AlertDialog;)V", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentPatientInfoBinding;", "cameraAndStoragePermissions", "Lpermissions/dispatcher/ktx/PermissionsRequester;", "capturePhoto", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "pickPhoto", "", "storageWritePermission", "viewModel", "Lorg/openmrs/mobile/activities/addeditpatient/AddEditPatientViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/addeditpatient/AddEditPatientViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addSuggestionsToCities", "", "fillFormFields", "findSimilarPatients", "finishActivity", "hideLoading", "hideSoftKeys", "initPlaces", "isAnyFieldNotEmpty", "", "isLoading", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "performFunction", "position", "registerPatient", "resetAction", "scrollToTop", "setupObservers", "setupPermissionsHandler", "setupViewsListeners", "showCameraPermissionRationale", "request", "Lpermissions/dispatcher/PermissionRequest;", "showCannotMarkDeceased", "showCauseOfDeathOptions", "showLoading", "showSimilarPatientsDialog", "patients", "", "Lcom/openmrs/android_sdk/library/models/Patient;", "patient", "showSnackbarLong", "stringId", "startCropActivity", "sourceUri", "destinationUri", "startPatientDashboardActivity", "submitAction", "updateCauseOfDeathSpinner", "concept", "Lcom/openmrs/android_sdk/library/models/ConceptAnswers;", "updatePatient", "validateFormInputsAndUpdateViewModel", "Companion", "StringValue", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddEditPatientFragment extends org.openmrs.mobile.activities.BaseFragment implements org.openmrs.mobile.activities.dialog.CustomPickerDialog.onInputSelected {
    @org.jetbrains.annotations.Nullable()
    private androidx.appcompat.app.AlertDialog alertDialog;
    private org.openmrs.mobile.databinding.FragmentPatientInfoBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private permissions.dispatcher.ktx.PermissionsRequester cameraAndStoragePermissions;
    private permissions.dispatcher.ktx.PermissionsRequester storageWritePermission;
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> pickPhoto = null;
    private final androidx.activity.result.ActivityResultLauncher<android.net.Uri> capturePhoto = null;
    public static final org.openmrs.mobile.activities.addeditpatient.AddEditPatientFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.appcompat.app.AlertDialog getAlertDialog() {
        return null;
    }
    
    public final void setAlertDialog(@org.jetbrains.annotations.Nullable()
    androidx.appcompat.app.AlertDialog p0) {
    }
    
    private final org.openmrs.mobile.databinding.FragmentPatientInfoBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.addeditpatient.AddEditPatientViewModel getViewModel() {
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
    
    private final void setupPermissionsHandler() {
    }
    
    private final void setupObservers() {
    }
    
    private final void findSimilarPatients() {
    }
    
    public final void registerPatient() {
    }
    
    private final void updatePatient() {
    }
    
    private final void fillFormFields() {
    }
    
    private final void validateFormInputsAndUpdateViewModel() {
    }
    
    private final void showSimilarPatientsDialog(java.util.List<? extends com.openmrs.android_sdk.library.models.Patient> patients, com.openmrs.android_sdk.library.models.Patient patient) {
    }
    
    private final void setupViewsListeners() {
    }
    
    private final void showCauseOfDeathOptions() {
    }
    
    private final void showCannotMarkDeceased() {
    }
    
    private final void updateCauseOfDeathSpinner(com.openmrs.android_sdk.library.models.ConceptAnswers concept) {
    }
    
    private final void initPlaces() {
    }
    
    private final void addSuggestionsToCities() {
    }
    
    @java.lang.Override()
    public void performFunction(int position) {
    }
    
    private final void capturePhoto() {
    }
    
    private final void pickPhoto() {
    }
    
    private final void showCameraPermissionRationale(permissions.dispatcher.PermissionRequest request) {
    }
    
    private final void showLoading() {
    }
    
    private final void hideLoading() {
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    private final void showSnackbarLong(int stringId) {
    }
    
    private final void submitAction() {
    }
    
    private final void resetAction() {
    }
    
    private final void scrollToTop() {
    }
    
    private final void hideSoftKeys() {
    }
    
    public final boolean isAnyFieldNotEmpty() {
        return false;
    }
    
    private final void startCropActivity(android.net.Uri sourceUri, android.net.Uri destinationUri) {
    }
    
    private final void startPatientDashboardActivity() {
    }
    
    private final void finishActivity() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public AddEditPatientFragment() {
        super();
    }
    
    @androidx.annotation.StringDef(value = {"M", "F"})
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000\u00a8\u0006\u0003"}, d2 = {"Lorg/openmrs/mobile/activities/addeditpatient/AddEditPatientFragment$StringValue;", "", "Companion", "app_debug"})
    @java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.SOURCE)
    public static abstract @interface StringValue {
        public static final org.openmrs.mobile.activities.addeditpatient.AddEditPatientFragment.StringValue.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String FEMALE = "F";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MALE = "M";
        
        @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/openmrs/mobile/activities/addeditpatient/AddEditPatientFragment$StringValue$Companion;", "", "()V", "FEMALE", "", "MALE", "app_debug"})
        public static final class Companion {
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String FEMALE = "F";
            @org.jetbrains.annotations.NotNull()
            public static final java.lang.String MALE = "M";
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u00a8\u0006\t"}, d2 = {"Lorg/openmrs/mobile/activities/addeditpatient/AddEditPatientFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/addeditpatient/AddEditPatientFragment;", "patientID", "", "countries", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.addeditpatient.AddEditPatientFragment newInstance(@org.jetbrains.annotations.Nullable()
        java.lang.String patientID, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> countries) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}