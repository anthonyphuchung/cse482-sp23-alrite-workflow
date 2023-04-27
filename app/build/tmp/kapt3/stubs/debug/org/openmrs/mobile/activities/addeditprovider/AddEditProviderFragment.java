package org.openmrs.mobile.activities.addeditprovider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.openmrs.android_sdk.library.models.Provider;
import com.openmrs.android_sdk.library.models.Result;
import com.openmrs.android_sdk.utilities.ToastUtil;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.activities.providermanagerdashboard.ProviderManagerDashboardViewModel;
import org.openmrs.mobile.databinding.FragmentAddProviderBinding;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0014H\u0002J\b\u0010 \u001a\u00020\u0014H\u0002J\u0016\u0010!\u001a\u00020\u00142\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\b\u0010%\u001a\u00020\u0014H\u0002J\b\u0010&\u001a\u00020\'H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006)"}, d2 = {"Lorg/openmrs/mobile/activities/addeditprovider/AddEditProviderFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentAddProviderBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentAddProviderBinding;", "matchingProvidersViewModel", "Lorg/openmrs/mobile/activities/providermanagerdashboard/ProviderManagerDashboardViewModel;", "getMatchingProvidersViewModel", "()Lorg/openmrs/mobile/activities/providermanagerdashboard/ProviderManagerDashboardViewModel;", "matchingProvidersViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "Lorg/openmrs/mobile/activities/addeditprovider/AddEditProviderViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/addeditprovider/AddEditProviderViewModel;", "viewModel$delegate", "fetchMatchingProviders", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "restoreState", "setupListeners", "setupObserver", "showMatchingProvidersDialog", "matchingProviders", "", "Lcom/openmrs/android_sdk/library/models/Provider;", "submitProvider", "validateFields", "", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class AddEditProviderFragment extends org.openmrs.mobile.activities.BaseFragment {
    private org.openmrs.mobile.databinding.FragmentAddProviderBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private final kotlin.Lazy matchingProvidersViewModel$delegate = null;
    public static final org.openmrs.mobile.activities.addeditprovider.AddEditProviderFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentAddProviderBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.addeditprovider.AddEditProviderViewModel getViewModel() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.providermanagerdashboard.ProviderManagerDashboardViewModel getMatchingProvidersViewModel() {
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
    
    private final void restoreState() {
    }
    
    private final void setupObserver() {
    }
    
    private final void setupListeners() {
    }
    
    private final void fetchMatchingProviders() {
    }
    
    private final void submitProvider() {
    }
    
    private final boolean validateFields() {
        return false;
    }
    
    private final void showMatchingProvidersDialog(java.util.List<com.openmrs.android_sdk.library.models.Provider> matchingProviders) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public AddEditProviderFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/openmrs/mobile/activities/addeditprovider/AddEditProviderFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/addeditprovider/AddEditProviderFragment;", "providerToEdit", "Lcom/openmrs/android_sdk/library/models/Provider;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.addeditprovider.AddEditProviderFragment newInstance(@org.jetbrains.annotations.Nullable()
        com.openmrs.android_sdk.library.models.Provider providerToEdit) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}