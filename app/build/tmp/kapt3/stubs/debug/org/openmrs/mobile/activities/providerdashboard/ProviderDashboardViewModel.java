package org.openmrs.mobile.activities.providerdashboard;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.api.repository.ProviderRepository;
import com.openmrs.android_sdk.library.models.Provider;
import com.openmrs.android_sdk.library.models.ResultType;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\f\u001a\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lorg/openmrs/mobile/activities/providerdashboard/ProviderDashboardViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "providerRepository", "Lcom/openmrs/android_sdk/library/api/repository/ProviderRepository;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Lcom/openmrs/android_sdk/library/api/repository/ProviderRepository;Landroidx/lifecycle/SavedStateHandle;)V", "provider", "Lcom/openmrs/android_sdk/library/models/Provider;", "getProvider", "()Lcom/openmrs/android_sdk/library/models/Provider;", "screenTitle", "", "getScreenTitle", "()Ljava/lang/String;", "deleteProvider", "Landroidx/lifecycle/LiveData;", "Lcom/openmrs/android_sdk/library/models/ResultType;", "app_debug"})
public final class ProviderDashboardViewModel extends org.openmrs.mobile.activities.BaseViewModel<kotlin.Unit> {
    @org.jetbrains.annotations.NotNull()
    private final com.openmrs.android_sdk.library.models.Provider provider = null;
    private final com.openmrs.android_sdk.library.api.repository.ProviderRepository providerRepository = null;
    private final androidx.lifecycle.SavedStateHandle savedStateHandle = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.openmrs.android_sdk.library.models.Provider getProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getScreenTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.openmrs.android_sdk.library.models.ResultType> deleteProvider() {
        return null;
    }
    
    @javax.inject.Inject()
    public ProviderDashboardViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.ProviderRepository providerRepository, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        super();
    }
}