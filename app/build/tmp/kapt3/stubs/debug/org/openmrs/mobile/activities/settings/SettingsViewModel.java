package org.openmrs.mobile.activities.settings;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.openmrs.android_sdk.library.OpenMRSLogger;
import com.openmrs.android_sdk.library.OpenmrsAndroid;
import com.openmrs.android_sdk.library.api.repository.ConceptRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseViewModel;
import org.openmrs.mobile.utilities.LanguageUtils;
import javax.inject.Inject;
import java.io.File;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u001cJ\b\u0010#\u001a\u00020\u0002H\u0002R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\u001c\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lorg/openmrs/mobile/activities/settings/SettingsViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "conceptRepository", "Lcom/openmrs/android_sdk/library/api/repository/ConceptRepository;", "openMRSLogger", "Lcom/openmrs/android_sdk/library/OpenMRSLogger;", "(Lcom/openmrs/android_sdk/library/api/repository/ConceptRepository;Lcom/openmrs/android_sdk/library/OpenMRSLogger;)V", "appLinkUri", "Landroid/net/Uri;", "getAppLinkUri", "()Landroid/net/Uri;", "appMarketUri", "getAppMarketUri", "position", "", "languageListPosition", "getLanguageListPosition", "()I", "setLanguageListPosition", "(I)V", "logSize", "", "getLogSize", "()J", "setLogSize", "(J)V", "logsFileName", "", "getLogsFileName", "()Ljava/lang/String;", "getBuildVersionInfo", "context", "Landroid/content/Context;", "getConceptsCount", "getLogsFileInfo", "Companion", "app_debug"})
public final class SettingsViewModel extends org.openmrs.mobile.activities.BaseViewModel<kotlin.Unit> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String logsFileName = null;
    private long logSize = 0L;
    @org.jetbrains.annotations.NotNull()
    private final android.net.Uri appMarketUri = null;
    @org.jetbrains.annotations.NotNull()
    private final android.net.Uri appLinkUri = null;
    private int languageListPosition = 0;
    private final com.openmrs.android_sdk.library.api.repository.ConceptRepository conceptRepository = null;
    private final com.openmrs.android_sdk.library.OpenMRSLogger openMRSLogger = null;
    private static final int ONE_KB = 1024;
    public static final org.openmrs.mobile.activities.settings.SettingsViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLogsFileName() {
        return null;
    }
    
    public final long getLogSize() {
        return 0L;
    }
    
    public final void setLogSize(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getAppMarketUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getAppLinkUri() {
        return null;
    }
    
    public final int getLanguageListPosition() {
        return 0;
    }
    
    public final void setLanguageListPosition(int position) {
    }
    
    private final void getLogsFileInfo() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBuildVersionInfo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getConceptsCount() {
        return null;
    }
    
    @javax.inject.Inject()
    public SettingsViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.api.repository.ConceptRepository conceptRepository, @org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.OpenMRSLogger openMRSLogger) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/openmrs/mobile/activities/settings/SettingsViewModel$Companion;", "", "()V", "ONE_KB", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}