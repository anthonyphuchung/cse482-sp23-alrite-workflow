package org.openmrs.mobile.activities.introduction;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.*;
import com.openmrs.android_sdk.utilities.ApplicationConstants;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.ACBaseActivity;
import org.openmrs.mobile.databinding.ActivitySplashBinding;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\b\u0010\r\u001a\u00020\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/openmrs/mobile/activities/introduction/SplashActivity;", "Lorg/openmrs/mobile/activities/ACBaseActivity;", "()V", "binding", "Lorg/openmrs/mobile/databinding/ActivitySplashBinding;", "mHandler", "Landroid/os/Handler;", "mRunnable", "Ljava/lang/Runnable;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "Constants", "app_debug"})
public final class SplashActivity extends org.openmrs.mobile.activities.ACBaseActivity {
    private final android.os.Handler mHandler = null;
    private java.lang.Runnable mRunnable;
    private org.openmrs.mobile.databinding.ActivitySplashBinding binding;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COUNTING_DATA = "counter_file";
    public static final org.openmrs.mobile.activities.introduction.SplashActivity.Constants Constants = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public SplashActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/openmrs/mobile/activities/introduction/SplashActivity$Constants;", "", "()V", "COUNTING_DATA", "", "app_debug"})
    public static final class Constants {
        
        private Constants() {
            super();
        }
    }
}