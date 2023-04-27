package org.openmrs.mobile.utilities;

import java.util.regex.Pattern;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/openmrs/mobile/utilities/URLValidator;", "", "()V", "SLASH", "", "SPACE", "URL_PATTERN", "pattern", "Lkotlin/text/Regex;", "ensureProtocol", "url", "toLowerCase", "trimLastSlash", "trimLastSpace", "validate", "Lorg/openmrs/mobile/utilities/URLValidator$ValidationResult;", "ValidationResult", "app_debug"})
public final class URLValidator {
    private static final java.lang.String URL_PATTERN = "^((https|http)?://)([\\da-z.-]*)\\.([a-z.]*)([\\w .-]*)*(:([0-9]{2,5}))?((/(\\w*(-\\w+)?))*?)/*$";
    private static final java.lang.String SLASH = "/";
    private static final java.lang.String SPACE = " ";
    private static final kotlin.text.Regex pattern = null;
    public static final org.openmrs.mobile.utilities.URLValidator INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public static final org.openmrs.mobile.utilities.URLValidator.ValidationResult validate(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String trimLastSpace(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String toLowerCase(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String trimLastSlash(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ensureProtocol(@org.jetbrains.annotations.NotNull()
    java.lang.String url) {
        return null;
    }
    
    private URLValidator() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lorg/openmrs/mobile/utilities/URLValidator$ValidationResult;", "", "isURLValid", "", "url", "", "(ZLjava/lang/String;)V", "()Z", "getUrl", "()Ljava/lang/String;", "app_debug"})
    public static final class ValidationResult {
        private final boolean isURLValid = false;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String url = null;
        
        public final boolean isURLValid() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUrl() {
            return null;
        }
        
        public ValidationResult(boolean isURLValid, @org.jetbrains.annotations.NotNull()
        java.lang.String url) {
            super();
        }
    }
}