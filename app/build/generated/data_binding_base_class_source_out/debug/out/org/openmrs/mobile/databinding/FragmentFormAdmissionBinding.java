// Generated by view binder compiler. Do not edit!
package org.openmrs.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openmrs.mobile.R;

public final class FragmentFormAdmissionBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView admissionDate;

  @NonNull
  public final TextView admissionDateHeader;

  @NonNull
  public final TextView admittedByHeader;

  @NonNull
  public final Spinner admittedBySpinner;

  @NonNull
  public final TextView admittedToHeader;

  @NonNull
  public final Spinner admittedToSpinner;

  @NonNull
  public final TextView cancelButton;

  @NonNull
  public final TextView encounterRoleHeader;

  @NonNull
  public final Spinner encounterRoleSpinner;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final TextView submitButton;

  @NonNull
  public final View transparentScreen;

  private FragmentFormAdmissionBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView admissionDate, @NonNull TextView admissionDateHeader,
      @NonNull TextView admittedByHeader, @NonNull Spinner admittedBySpinner,
      @NonNull TextView admittedToHeader, @NonNull Spinner admittedToSpinner,
      @NonNull TextView cancelButton, @NonNull TextView encounterRoleHeader,
      @NonNull Spinner encounterRoleSpinner, @NonNull ProgressBar progressBar,
      @NonNull TextView submitButton, @NonNull View transparentScreen) {
    this.rootView = rootView;
    this.admissionDate = admissionDate;
    this.admissionDateHeader = admissionDateHeader;
    this.admittedByHeader = admittedByHeader;
    this.admittedBySpinner = admittedBySpinner;
    this.admittedToHeader = admittedToHeader;
    this.admittedToSpinner = admittedToSpinner;
    this.cancelButton = cancelButton;
    this.encounterRoleHeader = encounterRoleHeader;
    this.encounterRoleSpinner = encounterRoleSpinner;
    this.progressBar = progressBar;
    this.submitButton = submitButton;
    this.transparentScreen = transparentScreen;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFormAdmissionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFormAdmissionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_form_admission, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFormAdmissionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.admission_date;
      TextView admissionDate = rootView.findViewById(id);
      if (admissionDate == null) {
        break missingId;
      }

      id = R.id.admission_date_header;
      TextView admissionDateHeader = rootView.findViewById(id);
      if (admissionDateHeader == null) {
        break missingId;
      }

      id = R.id.admitted_by_header;
      TextView admittedByHeader = rootView.findViewById(id);
      if (admittedByHeader == null) {
        break missingId;
      }

      id = R.id.admitted_by_spinner;
      Spinner admittedBySpinner = rootView.findViewById(id);
      if (admittedBySpinner == null) {
        break missingId;
      }

      id = R.id.admitted_to_header;
      TextView admittedToHeader = rootView.findViewById(id);
      if (admittedToHeader == null) {
        break missingId;
      }

      id = R.id.admitted_to_spinner;
      Spinner admittedToSpinner = rootView.findViewById(id);
      if (admittedToSpinner == null) {
        break missingId;
      }

      id = R.id.cancel_button;
      TextView cancelButton = rootView.findViewById(id);
      if (cancelButton == null) {
        break missingId;
      }

      id = R.id.encounter_role_header;
      TextView encounterRoleHeader = rootView.findViewById(id);
      if (encounterRoleHeader == null) {
        break missingId;
      }

      id = R.id.encounter_role_spinner;
      Spinner encounterRoleSpinner = rootView.findViewById(id);
      if (encounterRoleSpinner == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = rootView.findViewById(id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.submit_button;
      TextView submitButton = rootView.findViewById(id);
      if (submitButton == null) {
        break missingId;
      }

      id = R.id.transparent_screen;
      View transparentScreen = rootView.findViewById(id);
      if (transparentScreen == null) {
        break missingId;
      }

      return new FragmentFormAdmissionBinding((ConstraintLayout) rootView, admissionDate,
          admissionDateHeader, admittedByHeader, admittedBySpinner, admittedToHeader,
          admittedToSpinner, cancelButton, encounterRoleHeader, encounterRoleSpinner, progressBar,
          submitButton, transparentScreen);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}