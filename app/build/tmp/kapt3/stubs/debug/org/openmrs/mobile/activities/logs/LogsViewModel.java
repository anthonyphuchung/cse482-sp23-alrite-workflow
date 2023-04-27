package org.openmrs.mobile.activities.logs;

import com.openmrs.android_sdk.library.OpenMRSLogger;
import com.openmrs.android_sdk.library.OpenmrsAndroid;
import dagger.hilt.android.lifecycle.HiltViewModel;
import org.openmrs.mobile.activities.BaseViewModel;
import javax.inject.Inject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\n\u001a\u00020\u0007H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/openmrs/mobile/activities/logs/LogsViewModel;", "Lorg/openmrs/mobile/activities/BaseViewModel;", "", "openMRSLogger", "Lcom/openmrs/android_sdk/library/OpenMRSLogger;", "(Lcom/openmrs/android_sdk/library/OpenMRSLogger;)V", "logs", "", "getLogs", "()Ljava/lang/String;", "readLogsFromFile", "app_debug"})
public final class LogsViewModel extends org.openmrs.mobile.activities.BaseViewModel<kotlin.Unit> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String logs = null;
    private final com.openmrs.android_sdk.library.OpenMRSLogger openMRSLogger = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLogs() {
        return null;
    }
    
    private final java.lang.String readLogsFromFile() {
        return null;
    }
    
    @javax.inject.Inject()
    public LogsViewModel(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.OpenMRSLogger openMRSLogger) {
        super();
    }
}