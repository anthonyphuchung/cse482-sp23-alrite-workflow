package org.openmrs.mobile.utilities;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import com.openmrs.android_sdk.library.OpenMRSLogger;
import com.openmrs.android_sdk.library.OpenmrsAndroid;
import javax.inject.Inject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lorg/openmrs/mobile/utilities/ForceClose;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mOpenMRSLogger", "Lcom/openmrs/android_sdk/library/OpenMRSLogger;", "getMOpenMRSLogger", "()Lcom/openmrs/android_sdk/library/OpenMRSLogger;", "setMOpenMRSLogger", "(Lcom/openmrs/android_sdk/library/OpenMRSLogger;)V", "getLogs", "", "uncaughtException", "", "thread", "Ljava/lang/Thread;", "exception", "", "Companion", "app_debug"})
public final class ForceClose implements java.lang.Thread.UncaughtExceptionHandler {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.openmrs.android_sdk.library.OpenMRSLogger mOpenMRSLogger;
    private final android.content.Context context = null;
    private static final java.lang.String LINE_SEPARATOR = "\n";
    public static final org.openmrs.mobile.utilities.ForceClose.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.openmrs.android_sdk.library.OpenMRSLogger getMOpenMRSLogger() {
        return null;
    }
    
    public final void setMOpenMRSLogger(@org.jetbrains.annotations.NotNull()
    com.openmrs.android_sdk.library.OpenMRSLogger p0) {
    }
    
    @java.lang.Override()
    public void uncaughtException(@org.jetbrains.annotations.NotNull()
    java.lang.Thread thread, @org.jetbrains.annotations.NotNull()
    java.lang.Throwable exception) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLogs() {
        return null;
    }
    
    @javax.inject.Inject()
    public ForceClose(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/openmrs/mobile/utilities/ForceClose$Companion;", "", "()V", "LINE_SEPARATOR", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}