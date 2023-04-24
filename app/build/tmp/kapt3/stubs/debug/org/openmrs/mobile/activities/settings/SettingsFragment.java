package org.openmrs.mobile.activities.settings;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.Snackbar.SnackbarLayout;
import com.openmrs.android_sdk.utilities.ApplicationConstants;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.activities.community.contact.ContactUsActivity;
import org.openmrs.mobile.activities.logs.LogsActivity;
import org.openmrs.mobile.databinding.FragmentSettingsBinding;
import org.openmrs.mobile.services.ConceptDownloadService;
import org.openmrs.mobile.utilities.ThemeUtils;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0013\u001a\u00020\u0011H\u0002J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\b\u0010\u001d\u001a\u00020\u0011H\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0016J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\b\u0010 \u001a\u00020\u0011H\u0002J\b\u0010!\u001a\u00020\u0011H\u0002J\b\u0010\"\u001a\u00020\u0011H\u0002J\b\u0010#\u001a\u00020\u0011H\u0002J\b\u0010$\u001a\u00020\u0011H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r\u00a8\u0006&"}, d2 = {"Lorg/openmrs/mobile/activities/settings/SettingsFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentSettingsBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentSettingsBinding;", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "viewModel", "Lorg/openmrs/mobile/activities/settings/SettingsViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/settings/SettingsViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addBuildVersionInfo", "", "addLogsInfo", "addPrivacyPolicyInfo", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onPause", "onResume", "rateUs", "setupConceptsView", "setupContactUsButton", "setupDarkMode", "setupLanguageSpinner", "updateConceptsInDbText", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SettingsFragment extends org.openmrs.mobile.activities.BaseFragment {
    private android.content.BroadcastReceiver broadcastReceiver;
    private org.openmrs.mobile.databinding.FragmentSettingsBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    public static final org.openmrs.mobile.activities.settings.SettingsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentSettingsBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.settings.SettingsViewModel getViewModel() {
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
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    private final void updateConceptsInDbText() {
    }
    
    private final void addLogsInfo() {
    }
    
    private final void setupConceptsView() {
    }
    
    private final void addBuildVersionInfo() {
    }
    
    private final void addPrivacyPolicyInfo() {
    }
    
    private final void rateUs() {
    }
    
    private final void setupContactUsButton() {
    }
    
    private final void setupDarkMode() {
    }
    
    private final void setupLanguageSpinner() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public SettingsFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/openmrs/mobile/activities/settings/SettingsFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/settings/SettingsFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.settings.SettingsFragment newInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}