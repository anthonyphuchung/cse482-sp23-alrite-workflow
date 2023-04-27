package org.openmrs.mobile.activities.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.openmrs.android_sdk.library.OpenmrsAndroid;
import com.openmrs.android_sdk.library.api.RestServiceBuilder;
import com.openmrs.android_sdk.library.api.repository.LocationRepository;
import com.openmrs.android_sdk.library.api.repository.LoginRepository;
import com.openmrs.android_sdk.library.api.repository.VisitRepository;
import com.openmrs.android_sdk.library.dao.LocationDAO;
import com.openmrs.android_sdk.library.databases.entities.LocationEntity;
import com.openmrs.android_sdk.library.models.OperationType;
import com.openmrs.android_sdk.library.models.ResultType;
import com.openmrs.android_sdk.utilities.ApplicationConstants;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.mindrot.jbcrypt.BCrypt;
import org.openmrs.mobile.activities.BaseViewModel;
import org.openmrs.mobile.application.OpenMRS;
import org.openmrs.mobile.net.AuthorizationManager;
import org.openmrs.mobile.services.UserService;
import rx.android.schedulers.AndroidSchedulers;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u000e\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0012J&\u0010\'\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0010J\u001c\u0010+\u001a\u00020%2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010-\u001a\u00020\u0012J(\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u0012H\u0002J\u0018\u00100\u001a\u00020%2\u0006\u00101\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u0012H\u0002J&\u00103\u001a\u00020%2\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0010J \u00104\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00122\u0006\u0010)\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0012H\u0002R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100!8F\u00a2\u0006\u0006\u001a\u0004\b\"\u0010#\u00a8\u00065"}, d2 = {"Lorg/openmrs/mobile/activities/login/LoginViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "Lcom/openmrs/android_sdk/library/models/ResultType;", "loginRepository", "Lcom/openmrs/android_sdk/library/api/repository/LoginRepository;", "visitRepository", "Lcom/openmrs/android_sdk/library/api/repository/VisitRepository;", "locationRepository", "Lcom/openmrs/android_sdk/library/api/repository/LocationRepository;", "locationDAO", "Lcom/openmrs/android_sdk/library/dao/LocationDAO;", "userService", "Lorg/openmrs/mobile/services/UserService;", "(Lcom/openmrs/android_sdk/library/api/repository/LoginRepository;Lcom/openmrs/android_sdk/library/api/repository/VisitRepository;Lcom/openmrs/android_sdk/library/api/repository/LocationRepository;Lcom/openmrs/android_sdk/library/dao/LocationDAO;Lorg/openmrs/mobile/services/UserService;)V", "_warningDialogLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "initialUrl", "", "kotlin.jvm.PlatformType", "lastCorrectUrl", "getLastCorrectUrl", "()Ljava/lang/String;", "setLastCorrectUrl", "(Ljava/lang/String;)V", "locations", "", "Lcom/openmrs/android_sdk/library/databases/entities/LocationEntity;", "getLocations", "()Ljava/util/List;", "setLocations", "(Ljava/util/List;)V", "warningDialogLiveData", "Landroidx/lifecycle/LiveData;", "getWarningDialogLiveData", "()Landroidx/lifecycle/LiveData;", "fetchLocations", "", "url", "login", "username", "password", "wipeDatabase", "saveLocationsToDatabase", "locationList", "selectedLocation", "setData", "sessionToken", "setLogin", "isLogin", "serverUrl", "showWarningOrLogin", "validateLoginInputs", "app_debug"})
public final class LoginViewModel extends org.openmrs.mobile.activities.BaseViewModel<com.openmrs.android_sdk.library.models.ResultType> {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _warningDialogLiveData = null;
    private final java.lang.String initialUrl = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lastCorrectUrl;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.openmrs.android_sdk.library.databases.entities.LocationEntity> locations;
    private final com.openmrs.android_sdk.library.api.repository.LoginRepository loginRepository = null;
    private final com.openmrs.android_sdk.library.api.repository.VisitRepository visitRepository = null;
    private final com.openmrs.android_sdk.library.api.repository.LocationRepository locationRepository = null;
    private final com.openmrs.android_sdk.library.dao.LocationDAO locationDAO = null;
    private final org.openmrs.mobile.services.UserService userService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getWarningDialogLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastCorrectUrl() {
        return null;
    }
    
    public final void setLastCorrectUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.openmrs.android_sdk.library.databases.entities.LocationEntity> getLocations() {
        return null;
    }
    
    public final void setLocations(@org.jetbrains.annotations.NotNull()
    java.util.List<com.openmrs.android_sdk.library.databases.entities.LocationEntity> p0) {
    }
    
    public final void showWarningOrLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String url, boolean wipeDatabase) {
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String url, boolean wipeDatabase) {
    }
    
    public final void saveLocationsToDatabase(@org.jetbrains.annotations.NotNull()
    java.util.List<com.openmrs.android_sdk.library.databases.entities.LocationEntity> locationList, @org.jetbrains.annotations.NotNull()
    java.lang.String selectedLocation) {
    }
    
    public final void fetchLocations(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    private final boolean validateLoginInputs(java.lang.String username, java.lang.String password, java.lang.String url) {
        return false;
    }
    
    private final void setData(java.lang.String sessionToken, java.lang.String url, java.lang.String username, java.lang.String password) {
    }
    
    private final void setLogin(boolean isLogin, java.lang.String serverUrl) {
    }
    
    @javax.inject.Inject()
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.LoginRepository loginRepository, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.VisitRepository visitRepository, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.LocationRepository locationRepository, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.dao.LocationDAO locationDAO, @org.jetbrains.annotations.NotNull()
    org.openmrs.mobile.services.UserService userService) {
        super();
    }
}