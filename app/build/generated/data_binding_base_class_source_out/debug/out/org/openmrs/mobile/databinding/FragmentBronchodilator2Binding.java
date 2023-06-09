// Generated by view binder compiler. Do not edit!
package org.openmrs.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
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

public final class FragmentBronchodilator2Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button back;

  @NonNull
  public final RelativeLayout buttons;

  @NonNull
  public final CheckBox enough;

  @NonNull
  public final CheckBox need;

  @NonNull
  public final Button next;

  @NonNull
  public final CheckBox other;

  @NonNull
  public final EditText otherText;

  @NonNull
  public final CheckBox refuse;

  @NonNull
  public final CheckBox stock;

  private FragmentBronchodilator2Binding(@NonNull LinearLayout rootView, @NonNull Button back,
      @NonNull RelativeLayout buttons, @NonNull CheckBox enough, @NonNull CheckBox need,
      @NonNull Button next, @NonNull CheckBox other, @NonNull EditText otherText,
      @NonNull CheckBox refuse, @NonNull CheckBox stock) {
    this.rootView = rootView;
    this.back = back;
    this.buttons = buttons;
    this.enough = enough;
    this.need = need;
    this.next = next;
    this.other = other;
    this.otherText = otherText;
    this.refuse = refuse;
    this.stock = stock;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBronchodilator2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBronchodilator2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_bronchodilator_2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBronchodilator2Binding bind(@NonNull View rootView) {
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

      id = R.id.enough;
      CheckBox enough = rootView.findViewById(id);
      if (enough == null) {
        break missingId;
      }

      id = R.id.need;
      CheckBox need = rootView.findViewById(id);
      if (need == null) {
        break missingId;
      }

      id = R.id.next;
      Button next = rootView.findViewById(id);
      if (next == null) {
        break missingId;
      }

      id = R.id.other;
      CheckBox other = rootView.findViewById(id);
      if (other == null) {
        break missingId;
      }

      id = R.id.otherText;
      EditText otherText = rootView.findViewById(id);
      if (otherText == null) {
        break missingId;
      }

      id = R.id.refuse;
      CheckBox refuse = rootView.findViewById(id);
      if (refuse == null) {
        break missingId;
      }

      id = R.id.stock;
      CheckBox stock = rootView.findViewById(id);
      if (stock == null) {
        break missingId;
      }

      return new FragmentBronchodilator2Binding((LinearLayout) rootView, back, buttons, enough,
          need, next, other, otherText, refuse, stock);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
