package org.openmrs.mobile.activities.formdisplay;

import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.openmrs.android_sdk.library.models.Page;
import com.openmrs.android_sdk.library.models.Question;
import com.openmrs.android_sdk.library.models.Section;
import com.openmrs.android_sdk.utilities.InputField;
import com.openmrs.android_sdk.utilities.RangeEditText;
import com.openmrs.android_sdk.utilities.SelectOneField;
import com.openmrs.android_sdk.utilities.ToastUtil;
import dagger.hilt.android.AndroidEntryPoint;
import org.adw.library.widgets.discreteseekbar.DiscreteSeekBar;
import org.openmrs.mobile.R;
import org.openmrs.mobile.activities.BaseFragment;
import org.openmrs.mobile.bundle.FormFieldsWrapper;
import org.openmrs.mobile.databinding.FragmentFormDisplayBinding;
import java.util.ArrayList;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 D2\u00020\u0001:\u0001DB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0018J\u0018\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u000fH\u0002J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u001fH\u0002J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u001fH\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0013H\u0002J\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)J\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0)J$\u0010-\u001a\u00020#2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u00104\u001a\u00020\u000fH\u0016J\u0018\u00105\u001a\u00020\u000f2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020,H\u0002J\u0018\u00109\u001a\u00020\u000f2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020,H\u0002J\u0018\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020*H\u0002J\u0018\u0010A\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020C2\u0006\u0010@\u001a\u00020*H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006E"}, d2 = {"Lorg/openmrs/mobile/activities/formdisplay/FormDisplayPageFragment;", "Lorg/openmrs/mobile/activities/BaseFragment;", "()V", "_binding", "Lorg/openmrs/mobile/databinding/FragmentFormDisplayBinding;", "binding", "getBinding", "()Lorg/openmrs/mobile/databinding/FragmentFormDisplayBinding;", "viewModel", "Lorg/openmrs/mobile/activities/formdisplay/FormDisplayPageViewModel;", "getViewModel", "()Lorg/openmrs/mobile/activities/formdisplay/FormDisplayPageViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addQuestion", "", "question", "Lcom/openmrs/android_sdk/library/models/Question;", "sectionContainer", "Landroid/widget/LinearLayout;", "addSection", "section", "Lcom/openmrs/android_sdk/library/models/Section;", "checkInputFields", "", "createAndAttachNumericQuestionEditText", "createAndAttachSelectQuestionDropdown", "createAndAttachSelectQuestionRadioButton", "createFormViews", "createQuestionGroupLayout", "questionLabel", "", "createSectionLayout", "sectionLabel", "generateTextView", "Landroid/view/View;", "text", "getAndAdjustLinearLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "linearLayout", "getInputFields", "", "Lcom/openmrs/android_sdk/utilities/InputField;", "getSelectOneFields", "Lcom/openmrs/android_sdk/utilities/SelectOneField;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "setOnCheckedChangeListener", "radioGroup", "Landroid/widget/RadioGroup;", "radioGroupField", "setOnItemSelectedListener", "spinner", "Landroid/widget/Spinner;", "spinnerField", "setOnProgressChangeListener", "dsb", "Lorg/adw/library/widgets/discreteseekbar/DiscreteSeekBar;", "inputField", "setOnTextChangedListener", "et", "Landroid/widget/EditText;", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FormDisplayPageFragment extends org.openmrs.mobile.activities.BaseFragment {
    private org.openmrs.mobile.databinding.FragmentFormDisplayBinding _binding;
    private final kotlin.Lazy viewModel$delegate = null;
    public static final org.openmrs.mobile.activities.formdisplay.FormDisplayPageFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final org.openmrs.mobile.databinding.FragmentFormDisplayBinding getBinding() {
        return null;
    }
    
    private final org.openmrs.mobile.activities.formdisplay.FormDisplayPageViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void createFormViews() {
    }
    
    private final void addSection(com.openmrs.android_sdk.library.models.Section section) {
    }
    
    private final android.widget.LinearLayout createSectionLayout(java.lang.String sectionLabel) {
        return null;
    }
    
    private final void addQuestion(com.openmrs.android_sdk.library.models.Question question, android.widget.LinearLayout sectionContainer) {
    }
    
    private final android.widget.LinearLayout createQuestionGroupLayout(java.lang.String questionLabel) {
        return null;
    }
    
    private final void createAndAttachNumericQuestionEditText(com.openmrs.android_sdk.library.models.Question question, android.widget.LinearLayout sectionContainer) {
    }
    
    private final void createAndAttachSelectQuestionDropdown(com.openmrs.android_sdk.library.models.Question question, android.widget.LinearLayout sectionContainer) {
    }
    
    private final void createAndAttachSelectQuestionRadioButton(com.openmrs.android_sdk.library.models.Question question, android.widget.LinearLayout sectionContainer) {
    }
    
    private final void setOnProgressChangeListener(org.adw.library.widgets.discreteseekbar.DiscreteSeekBar dsb, com.openmrs.android_sdk.utilities.InputField inputField) {
    }
    
    private final void setOnTextChangedListener(android.widget.EditText et, com.openmrs.android_sdk.utilities.InputField inputField) {
    }
    
    private final void setOnItemSelectedListener(android.widget.Spinner spinner, com.openmrs.android_sdk.utilities.SelectOneField spinnerField) {
    }
    
    private final void setOnCheckedChangeListener(android.widget.RadioGroup radioGroup, com.openmrs.android_sdk.utilities.SelectOneField radioGroupField) {
    }
    
    private final android.widget.LinearLayout.LayoutParams getAndAdjustLinearLayoutParams(android.widget.LinearLayout linearLayout) {
        return null;
    }
    
    private final android.view.View generateTextView(java.lang.String text) {
        return null;
    }
    
    public final boolean checkInputFields() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.openmrs.android_sdk.utilities.InputField> getInputFields() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.openmrs.android_sdk.utilities.SelectOneField> getSelectOneFields() {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public FormDisplayPageFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a8\u0006\t"}, d2 = {"Lorg/openmrs/mobile/activities/formdisplay/FormDisplayPageFragment$Companion;", "", "()V", "newInstance", "Lorg/openmrs/mobile/activities/formdisplay/FormDisplayPageFragment;", "page", "Lcom/openmrs/android_sdk/library/models/Page;", "formFieldsWrapper", "Lorg/openmrs/mobile/bundle/FormFieldsWrapper;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final org.openmrs.mobile.activities.formdisplay.FormDisplayPageFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.openmrs.android_sdk.library.models.Page page, @org.jetbrains.annotations.Nullable()
        org.openmrs.mobile.bundle.FormFieldsWrapper formFieldsWrapper) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}