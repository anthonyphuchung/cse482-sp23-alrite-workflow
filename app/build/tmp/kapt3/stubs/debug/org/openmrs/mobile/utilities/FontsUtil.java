package org.openmrs.mobile.utilities;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.openmrs.mobile.application.OpenMRS;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\u0007H\u0003J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\bH\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0012\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0003R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R2\u0010\u0005\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0006j\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u0001`\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/openmrs/mobile/utilities/FontsUtil;", "", "()V", "OPEN_FONTS_PATH", "", "typefacesForFonts", "Ljava/util/HashMap;", "Lorg/openmrs/mobile/utilities/FontsUtil$OpenFonts;", "Landroid/graphics/Typeface;", "Lkotlin/collections/HashMap;", "getOpenTypeface", "openFont", "setFont", "", "view", "Landroid/view/View;", "openTypeFace", "group", "Landroid/view/ViewGroup;", "setTypeface", "textView", "Landroid/widget/TextView;", "OpenFonts", "app_debug"})
public final class FontsUtil {
    private static final java.lang.String OPEN_FONTS_PATH = "fonts/OpenSans/";
    private static java.util.HashMap<org.openmrs.mobile.utilities.FontsUtil.OpenFonts, android.graphics.Typeface> typefacesForFonts;
    public static final org.openmrs.mobile.utilities.FontsUtil INSTANCE = null;
    
    public static final void setFont(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    org.openmrs.mobile.utilities.FontsUtil.OpenFonts openFont) {
    }
    
    public static final void setFont(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup group) {
    }
    
    private static final android.graphics.Typeface getOpenTypeface(org.openmrs.mobile.utilities.FontsUtil.OpenFonts openFont) {
        return null;
    }
    
    private static final void setFont(android.view.View view, android.graphics.Typeface openTypeFace) {
    }
    
    private static final void setTypeface(android.widget.TextView textView) {
    }
    
    private FontsUtil() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010\u00a8\u0006\u0011"}, d2 = {"Lorg/openmrs/mobile/utilities/FontsUtil$OpenFonts;", "", "fontName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getFontName", "()Ljava/lang/String;", "OPEN_SANS_BOLD", "OPEN_SANS_BOLD_ITALIC", "OPEN_SANS_EXTRA_BOLD", "OPEN_SANS_EXTRA_BOLD_ITALIC", "OPEN_SANS_ITALIC", "OPEN_SANS_LIGHT", "OPEN_SANS_LIGHT_ITALIC", "OPEN_SANS_REGULAR", "OPEN_SANS_SEMIBOLD", "OPEN_SANS_SEMIBOLD_ITALIC", "app_debug"})
    public static enum OpenFonts {
        /*public static final*/ OPEN_SANS_BOLD /* = new OPEN_SANS_BOLD(null) */,
        /*public static final*/ OPEN_SANS_BOLD_ITALIC /* = new OPEN_SANS_BOLD_ITALIC(null) */,
        /*public static final*/ OPEN_SANS_EXTRA_BOLD /* = new OPEN_SANS_EXTRA_BOLD(null) */,
        /*public static final*/ OPEN_SANS_EXTRA_BOLD_ITALIC /* = new OPEN_SANS_EXTRA_BOLD_ITALIC(null) */,
        /*public static final*/ OPEN_SANS_ITALIC /* = new OPEN_SANS_ITALIC(null) */,
        /*public static final*/ OPEN_SANS_LIGHT /* = new OPEN_SANS_LIGHT(null) */,
        /*public static final*/ OPEN_SANS_LIGHT_ITALIC /* = new OPEN_SANS_LIGHT_ITALIC(null) */,
        /*public static final*/ OPEN_SANS_REGULAR /* = new OPEN_SANS_REGULAR(null) */,
        /*public static final*/ OPEN_SANS_SEMIBOLD /* = new OPEN_SANS_SEMIBOLD(null) */,
        /*public static final*/ OPEN_SANS_SEMIBOLD_ITALIC /* = new OPEN_SANS_SEMIBOLD_ITALIC(null) */;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String fontName = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getFontName() {
            return null;
        }
        
        OpenFonts(java.lang.String fontName) {
        }
    }
}