package org.openmrs.mobile.utilities;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.openmrs.android_sdk.library.OpenmrsAndroid;
import org.openmrs.mobile.application.OpenMRS;
import java.lang.reflect.InvocationTargetException;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/openmrs/mobile/utilities/TabUtil;", "", "()V", "MIN_SCREEN_WIDTH_FOR_FINDPATIENTSACTIVITY", "", "MIN_SCREEN_WIDTH_FOR_PATIENTDASHBOARDACTIVITY", "mLogger", "Lcom/openmrs/android_sdk/library/OpenMRSLogger;", "kotlin.jvm.PlatformType", "setHasEmbeddedTabs", "", "inActionBar", "windowManager", "Landroid/view/WindowManager;", "minScreenWidth", "app_debug"})
public final class TabUtil {
    public static final int MIN_SCREEN_WIDTH_FOR_FINDPATIENTSACTIVITY = 480;
    public static final int MIN_SCREEN_WIDTH_FOR_PATIENTDASHBOARDACTIVITY = 960;
    private static final com.openmrs.android_sdk.library.OpenMRSLogger mLogger = null;
    public static final org.openmrs.mobile.utilities.TabUtil INSTANCE = null;
    
    public static final void setHasEmbeddedTabs(@org.jetbrains.annotations.NotNull()
    java.lang.Object inActionBar, @org.jetbrains.annotations.NotNull()
    android.view.WindowManager windowManager, int minScreenWidth) {
    }
    
    private TabUtil() {
        super();
    }
}