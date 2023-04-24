package org.openmrs.mobile.listeners.watcher;

import android.graphics.Color;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemSelectedListener;
import com.openmrs.android_sdk.library.OpenmrsAndroid;
import org.openmrs.mobile.activities.login.LocationArrayAdapter;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016J.\u0010\u001f\u001a\u00020\u00152\n\u0010 \u001a\u0006\u0012\u0002\b\u00030!2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0016J\u0016\u0010\'\u001a\u00020\u00152\f\u0010(\u001a\b\u0012\u0002\b\u0003\u0018\u00010!H\u0016J(\u0010)\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016J\u0010\u0010*\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010+\u001a\u00020\rH\u0002J\u0010\u0010,\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u0004H\u0002R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000e\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006."}, d2 = {"Lorg/openmrs/mobile/listeners/watcher/LoginValidatorWatcher;", "Landroid/text/TextWatcher;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "mUrl", "Landroid/widget/EditText;", "mUsername", "mPassword", "mLocation", "Landroid/widget/Spinner;", "mLoginButton", "Landroid/widget/Button;", "(Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/EditText;Landroid/widget/Spinner;Landroid/widget/Button;)V", "isAllDataValid", "", "()Z", "isLocationErrorOccurred", "setLocationErrorOccurred", "(Z)V", "isUrlChanged", "setUrlChanged", "afterTextChanged", "", "editable", "Landroid/text/Editable;", "beforeTextChanged", "charSequence", "", "i", "", "i1", "i2", "onItemSelected", "parent", "Landroid/widget/AdapterView;", "view", "Landroid/view/View;", "position", "id", "", "onNothingSelected", "adapterView", "onTextChanged", "urlChanged", "validateLocation", "validateNotEmpty", "editText", "app_debug"})
public final class LoginValidatorWatcher implements android.text.TextWatcher, android.widget.AdapterView.OnItemSelectedListener {
    private boolean isUrlChanged = false;
    private boolean isLocationErrorOccurred = false;
    private final android.widget.EditText mUrl = null;
    private final android.widget.EditText mUsername = null;
    private final android.widget.EditText mPassword = null;
    private final android.widget.Spinner mLocation = null;
    private final android.widget.Button mLoginButton = null;
    
    public final boolean isUrlChanged() {
        return false;
    }
    
    public final void setUrlChanged(boolean p0) {
    }
    
    public final boolean isLocationErrorOccurred() {
        return false;
    }
    
    public final void setLocationErrorOccurred(boolean p0) {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence charSequence, int i, int i1, int i2) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence charSequence, int i, int i1, int i2) {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.NotNull()
    android.text.Editable editable) {
    }
    
    private final void urlChanged(android.text.Editable editable) {
    }
    
    @java.lang.Override()
    public void onItemSelected(@org.jetbrains.annotations.NotNull()
    android.widget.AdapterView<?> parent, @org.jetbrains.annotations.Nullable()
    android.view.View view, int position, long id) {
    }
    
    @java.lang.Override()
    public void onNothingSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> adapterView) {
    }
    
    private final boolean isAllDataValid() {
        return false;
    }
    
    private final boolean validateNotEmpty(android.widget.EditText editText) {
        return false;
    }
    
    /**
     * Get length of mLocation and check whatever it's empty or not.
     *
     * @return True if a location is selected or no location needed for the OpenMRS instance used.
     */
    private final boolean validateLocation() {
        return false;
    }
    
    public LoginValidatorWatcher(@org.jetbrains.annotations.NotNull()
    android.widget.EditText mUrl, @org.jetbrains.annotations.NotNull()
    android.widget.EditText mUsername, @org.jetbrains.annotations.NotNull()
    android.widget.EditText mPassword, @org.jetbrains.annotations.NotNull()
    android.widget.Spinner mLocation, @org.jetbrains.annotations.NotNull()
    android.widget.Button mLoginButton) {
        super();
    }
}