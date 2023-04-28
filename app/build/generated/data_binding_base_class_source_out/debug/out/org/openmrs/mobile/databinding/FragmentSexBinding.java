// Generated by view binder compiler. Do not edit!
package org.openmrs.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openmrs.mobile.R;

public final class FragmentSexBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button back;

  @NonNull
  public final RelativeLayout buttons;

  @NonNull
  public final EditText kg1;

  @NonNull
  public final LinearLayout linearMUAC;

  @NonNull
  public final EditText months;

  @NonNull
  public final EditText muac;

  @NonNull
  public final Button next;

  @NonNull
  public final RadioButton no;

  @NonNull
  public final RadioGroup radioGroup;

  @NonNull
  public final EditText years;

  @NonNull
  public final RadioButton yes;

  private FragmentSexBinding(@NonNull LinearLayout rootView, @NonNull Button back,
      @NonNull RelativeLayout buttons, @NonNull EditText kg1, @NonNull LinearLayout linearMUAC,
      @NonNull EditText months, @NonNull EditText muac, @NonNull Button next,
      @NonNull RadioButton no, @NonNull RadioGroup radioGroup, @NonNull EditText years,
      @NonNull RadioButton yes) {
    this.rootView = rootView;
    this.back = back;
    this.buttons = buttons;
    this.kg1 = kg1;
    this.linearMUAC = linearMUAC;
    this.months = months;
    this.muac = muac;
    this.next = next;
    this.no = no;
    this.radioGroup = radioGroup;
    this.years = years;
    this.yes = yes;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSexBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSexBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_sex, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSexBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      Button back = rootView.findViewById(id);
      if (back == null) {
        break missingId;
      }

      id = R.id.buttons;
      RelativeLayout buttons = rootView.findViewById(id);
      if (buttons == null) {
        break missingId;
      }

      id = R.id.kg1;
      EditText kg1 = rootView.findViewById(id);
      if (kg1 == null) {
        break missingId;
      }

      id = R.id.linearMUAC;
      LinearLayout linearMUAC = rootView.findViewById(id);
      if (linearMUAC == null) {
        break missingId;
      }

      id = R.id.months;
      EditText months = rootView.findViewById(id);
      if (months == null) {
        break missingId;
      }

      id = R.id.muac;
      EditText muac = rootView.findViewById(id);
      if (muac == null) {
        break missingId;
      }

      id = R.id.next;
      Button next = rootView.findViewById(id);
      if (next == null) {
        break missingId;
      }

      id = R.id.no;
      RadioButton no = rootView.findViewById(id);
      if (no == null) {
        break missingId;
      }

      id = R.id.radioGroup;
      RadioGroup radioGroup = rootView.findViewById(id);
      if (radioGroup == null) {
        break missingId;
      }

      id = R.id.years;
      EditText years = rootView.findViewById(id);
      if (years == null) {
        break missingId;
      }

      id = R.id.yes;
      RadioButton yes = rootView.findViewById(id);
      if (yes == null) {
        break missingId;
      }

      return new FragmentSexBinding((LinearLayout) rootView, back, buttons, kg1, linearMUAC, months,
          muac, next, no, radioGroup, years, yes);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}