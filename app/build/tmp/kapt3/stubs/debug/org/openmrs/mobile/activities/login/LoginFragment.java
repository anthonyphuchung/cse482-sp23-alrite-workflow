package org.openmrs.mobile.activities.login;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.Observer;
import com.google.android.material.snackbar.Snackbar;
import com.openmrs.android_sdk.library.databases.entities.LocationEntity;
import com.openmrs.android_sdk.library.models.OperationType;
import com.openmrs.android_sdk.library.models.Result;
import com.openmrs.android_sdk.library.models.ResultType;
import com.openmrs.android_sdk.utilities.ApplicationConstants;
import com.openmrs.android_sdk.utilities.ToastUtil;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.activities.community.contact.ContactUsActivity;
import org.openmrs.mobile.activities.dashboard.DashboardActivity;
import org.openmrs.mobile.activities.dialog.CustomFragmentDialog;
import org.openmrs.mobile.application.OpenMRS;
import org.openmrs.mobile.bundle.CustomDialogBundle;
import org.openmrs.mobile.databinding.FragmentLoginBinding;
import org.openmrs.mobile.listeners.watcher.LoginValidatorWatcher;
import org.openmrs.mobile.services.FormListService;
import org.openmrs.mobile.utilities.URLValidator;
import java.util.ArrayList;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001AB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001aH\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\u0006\u0010\u001f\u001a\u00020\u0018J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0018H\u0002J\u001e\u0010\"\u001a\u00020\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001a2\u0006\u0010$\u001a\u00020\u0016H\u0002J\b\u0010%\u001a\u00020\u0018H\u0002J\u0010\u0010&\u001a\u00020\u00182\b\b\u0002\u0010\'\u001a\u00020\tJ$\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020\u0018H\u0016J\b\u00101\u001a\u00020\u0018H\u0016J\b\u00102\u001a\u00020\u0018H\u0002J\b\u00103\u001a\u00020\u0018H\u0002J\u0010\u00104\u001a\u00020\u00182\u0006\u00105\u001a\u00020\tH\u0002J\u0010\u00106\u001a\u00020\u00182\u0006\u00107\u001a\u00020\tH\u0002J\u0010\u00108\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u0016H\u0002J\u0006\u0010:\u001a\u00020\u0018J\b\u0010;\u001a\u00020\u0018H\u0002J\b\u0010<\u001a\u00020\u0018H\u0002J\b\u0010=\u001a\u00020\u0018H\u0002J\u0010\u0010>\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010?\u001a\u00020\u0018H\u0002J\b\u0010@\u001a\u00020\u0018H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006B"}, d2 = {"Lorg/openmrs/mobile/activities/login/LoginFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentLoginBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentLoginBinding;", "isActivityNotNull", "", "()Z", "loginValidatorWatcher", "Lorg/openmrs/mobile/listeners/watcher/LoginValidatorWatcher;", "viewModel", "Lorg/openmrs/mobile/activities/login/LoginViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/login/LoginViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "createSnackbar", "Lcom/google/android/material/snackbar/Snackbar;", "message", "", "finishLoginActivity", "", "getLocationStringList", "", "locationList", "Lcom/openmrs/android_sdk/library/databases/entities/LocationEntity;", "hideLoadingAnimation", "hideSoftKeys", "hideURLDialog", "hideUrlLoadingAnimation", "initListeners", "initLoginForm", "locationsList", "serverURL", "initViewFields", "login", "wipeDatabase", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "onUserAuthenticated", "openAboutPage", "setLocationErrorOccurred", "errorOccurred", "setSyncButtonState", "syncEnabled", "setUrl", "url", "setupObserver", "showInvalidLoginOrPasswordSnackbar", "showLoadingAnimation", "showLocationLoadingAnimation", "showURLErrorSnackbar", "showWarningDialog", "startFormListService", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class LoginFragment extends org.openmrs.mobile.activities.BaseFragment {
    private org.openmrs.mobile.databinding.FragmentLoginBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private org.openmrs.mobile.listeners.watcher.LoginValidatorWatcher loginValidatorWatcher;
    public static final org.openmrs.mobile.activities.login.LoginFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentLoginBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.login.LoginViewModel getViewModel() {
        return null;
    }
    
    private final boolean isActivityNotNull() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void setupObserver() {
    }
    
    public final void login(boolean wipeDatabase) {
    }
    
    private final void initViewFields() {
    }
    
    private final void initListeners() {
    }
    
    private final void setSyncButtonState(boolean syncEnabled) {
    }
    
    private final void showWarningDialog() {
    }
    
    private final void showLoadingAnimation() {
    }
    
    private final void hideLoadingAnimation() {
    }
    
    private final void showLocationLoadingAnimation() {
    }
    
    private final void hideUrlLoadingAnimation() {
    }
    
    private final void initLoginForm(java.util.List<com.openmrs.android_sdk.library.databases.entities.LocationEntity> locationsList, java.lang.String serverURL) {
    }
    
    private final void onUserAuthenticated() {
    }
    
    private final void startFormListService() {
    }
    
    private final void showURLErrorSnackbar(java.lang.String message) {
    }
    
    private final void showInvalidLoginOrPasswordSnackbar() {
    }
    
    private final com.google.android.material.snackbar.Snackbar createSnackbar(java.lang.String message) {
        return null;
    }
    
    private final void setLocationErrorOccurred(boolean errorOccurred) {
    }
    
    private final java.util.List<java.lang.String> getLocationStringList(java.util.List<com.openmrs.android_sdk.library.databases.entities.LocationEntity> locationList) {
        return null;
    }
    
    private final void setUrl(java.lang.String url) {
    }
    
    public final void hideURLDialog() {
    }
    
    private final void hideSoftKeys() {
    }
    
    private final void openAboutPage() {
    }
    
    private final void finishLoginActivity() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public LoginFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/openmrs/mobile/activities/login/LoginFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/login/LoginFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.login.LoginFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}