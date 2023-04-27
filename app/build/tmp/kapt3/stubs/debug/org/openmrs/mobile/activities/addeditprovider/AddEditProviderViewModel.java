package org.openmrs.mobile.activities.addeditprovider;

import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.api.repository.ProviderRepository;
import com.openmrs.android_sdk.library.models.Person;
import com.openmrs.android_sdk.library.models.PersonName;
import com.openmrs.android_sdk.library.models.Provider;
import com.openmrs.android_sdk.library.models.ResultType;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u001e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0011H\u0002J\u0006\u0010\u0019\u001a\u00020\u0011J \u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\b\u0010\u001b\u001a\u00020\u0011H\u0002R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\"\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lorg/openmrs/mobile/activities/addeditprovider/AddEditProviderViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "Lcom/openmrs/android_sdk/library/models/ResultType;", "providerRepository", "Lcom/openmrs/android_sdk/library/api/repository/ProviderRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/openmrs/android_sdk/library/api/repository/ProviderRepository;Landroidx/lifecycle/SavedStateHandle;)V", "isUpdateProvider", "", "()Z", "<set-?>", "Lcom/openmrs/android_sdk/library/models/Provider;", "provider", "getProvider", "()Lcom/openmrs/android_sdk/library/models/Provider;", "createNewProvider", "", "firstName", "", "lastName", "identifier", "initializeProvider", "registerProvider", "setProviderPerson", "submitProvider", "updateCurrentProvider", "updateProvider", "app_debug"})
public final class AddEditProviderViewModel extends org.openmrs.mobile.activities.BaseViewModel<com.openmrs.android_sdk.library.models.ResultType> {
    @org.jetbrains.annotations.Nullable()
    private com.openmrs.android_sdk.library.models.Provider provider;
    private final boolean isUpdateProvider = false;
    private final com.openmrs.android_sdk.library.api.repository.ProviderRepository providerRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.openmrs.android_sdk.library.models.Provider getProvider() {
        return null;
    }
    
    public final boolean isUpdateProvider() {
        return false;
    }
    
    public final void initializeProvider(@org.jetbrains.annotations.NotNull()
    java.lang.String firstName, @org.jetbrains.annotations.NotNull()
    java.lang.String lastName, @org.jetbrains.annotations.NotNull()
    java.lang.String identifier) {
    }
    
    public final void submitProvider() {
    }
    
    private final void registerProvider() {
    }
    
    private final void updateProvider() {
    }
    
    private final void createNewProvider(java.lang.String firstName, java.lang.String lastName, java.lang.String identifier) {
    }
    
    private final void updateCurrentProvider(java.lang.String firstName, java.lang.String lastName, java.lang.String identifier) {
    }
    
    private final void setProviderPerson() {
    }
    
    @javax.inject.Inject()
    public AddEditProviderViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.ProviderRepository providerRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}