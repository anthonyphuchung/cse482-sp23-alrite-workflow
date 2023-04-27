package org.openmrs.mobile.utilities;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import com.openmrs.android_sdk.library.OpenmrsAndroid;
import org.openmrs.mobile.activities.patientdashboard.details.PatientPhotoActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007\u00a8\u0006\u000e"}, d2 = {"Lorg/openmrs/mobile/utilities/ImageUtils;", "", "()V", "createUniqueImageFileName", "", "getResizedPortraitImage", "Landroid/graphics/Bitmap;", "imagePath", "showPatientPhoto", "", "context", "Landroid/content/Context;", "photo", "patientName", "app_debug"})
public final class ImageUtils {
    public static final org.openmrs.mobile.utilities.ImageUtils INSTANCE = null;
    
    public static final void showPatientPhoto(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap photo, @org.jetbrains.annotations.Nullable()
    java.lang.String patientName) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String createUniqueImageFileName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap getResizedPortraitImage(@org.jetbrains.annotations.NotNull()
    java.lang.String imagePath) {
        return null;
    }
    
    private ImageUtils() {
        super();
    }
}