package org.openmrs.mobile.activities.providermanagerdashboard;

import com.openmrs.android_sdk.library.api.repository.ProviderRepository;
import com.openmrs.android_sdk.library.models.Provider;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import org.openmrs.mobile.utilities.FilterUtil;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/openmrs/mobile/activities/providermanagerdashboard/ProviderManagerDashboardViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "Lcom/openmrs/android_sdk/library/models/Provider;", "providerRepository", "Lcom/openmrs/android_sdk/library/api/repository/ProviderRepository;", "(Lcom/openmrs/android_sdk/library/api/repository/ProviderRepository;)V", "fetchProviders", "", "query", "", "app_debug"})
public final class ProviderManagerDashboardViewModel extends org.openmrs.mobile.activities.BaseViewModel<java.util.List<? extends com.openmrs.android_sdk.library.models.Provider>> {
    private final com.openmrs.android_sdk.library.api.repository.ProviderRepository providerRepository = null;
    
    public final void fetchProviders(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    @javax.inject.Inject()
    public ProviderManagerDashboardViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.ProviderRepository providerRepository) {
        super();
    }
}