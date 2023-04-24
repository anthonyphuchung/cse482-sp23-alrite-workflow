package org.openmrs.mobile.activities.formdisplay;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.openmrs.android_sdk.library.models.Page;
import com.openmrs.android_sdk.library.models.ResultType;
import com.openmrs.android_sdk.utilities.InputField;
import com.openmrs.android_sdk.utilities.SelectOneField;
import com.openmrs.android_sdk.utilities.ToastUtil;
import dagger.hilt.android.AndroidEntryPoint;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.ACBaseActivity;
import org.openmrs.mobile.bundle.FormFieldsWrapper;
import org.openmrs.mobile.databinding.ActivityFormDisplayBinding;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082.\u00a2\u0006\u0004\n\u0002\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lorg/openmrs/mobile/activities/formdisplay/FormDisplayActivity;", "Lorg/openmrs/mobile/activities/ACBaseActivity;", "()V", "binding", "Lorg/openmrs/mobile/databinding/ActivityFormDisplayBinding;", "mDots", "", "Landroid/widget/ImageView;", "[Landroid/widget/ImageView;", "viewModel", "Lorg/openmrs/mobile/activities/formdisplay/FormDisplayMainViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/formdisplay/FormDisplayMainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "enableSubmitButton", "", "enabled", "", "initViewComponents", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "submitForm", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FormDisplayActivity extends org.openmrs.mobile.activities.ACBaseActivity {
    private org.openmrs.mobile.databinding.ActivityFormDisplayBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private android.widget.ImageView[] mDots;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.activities.formdisplay.FormDisplayMainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViewComponents() {
    }
    
    private final void submitForm() {
    }
    
    private final void enableSubmitButton(boolean enabled) {
    }
    
    public FormDisplayActivity() {
        super();
    }
}