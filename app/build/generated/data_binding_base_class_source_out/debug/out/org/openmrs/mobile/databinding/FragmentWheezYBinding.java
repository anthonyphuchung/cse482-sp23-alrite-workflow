// Generated by view binder compiler. Do not edit!
package org.openmrs.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openmrs.mobile.R;

public final class FragmentWheezYBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button back;

  @NonNull
  public final RelativeLayout buttons;

  @NonNull
  public final EditText days;

  @NonNull
  public final Button next;

  private FragmentWheezYBinding(@NonNull LinearLayout rootView, @NonNull Button back,
      @NonNull RelativeLayout buttons, @NonNull EditText days, @NonNull Button next) {
    this.rootView = rootView;
    this.back = back;
    this.buttons = buttons;
    this.days = days;
    this.next = next;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWheezYBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWheezYBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_wheez_y, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWheezYBinding bind(@NonNull View rootView) {
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

      id = R.id.days;
      EditText days = rootView.findViewById(id);
      if (days == null) {
        break missingId;
      }

      id = R.id.next;
      Button next = rootView.findViewById(id);
      if (next == null) {
        break missingId;
      }

      return new FragmentWheezYBinding((LinearLayout) rootView, back, buttons, days, next);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
