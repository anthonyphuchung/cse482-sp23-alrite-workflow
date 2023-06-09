// Generated by view binder compiler. Do not edit!
package org.openmrs.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openmrs.mobile.R;

public final class RowSimilarPatientBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView address;

  @NonNull
  public final TextView birthdate;

  @NonNull
  public final RelativeLayout bottomRow;

  @NonNull
  public final TextView gender;

  @NonNull
  public final LinearLayout leftColumn;

  @NonNull
  public final TextView patientAddres;

  @NonNull
  public final TextView patientBirthDate;

  @NonNull
  public final TextView patientCity;

  @NonNull
  public final TextView patientCountry;

  @NonNull
  public final TextView patientFamilyName;

  @NonNull
  public final TextView patientGender;

  @NonNull
  public final TextView patientGivenName;

  @NonNull
  public final TextView patientMiddleName;

  @NonNull
  public final TextView patientPostalCode;

  @NonNull
  public final CardView patientsCardView;

  @NonNull
  public final LinearLayout topRow;

  private RowSimilarPatientBinding(@NonNull LinearLayout rootView, @NonNull TextView address,
      @NonNull TextView birthdate, @NonNull RelativeLayout bottomRow, @NonNull TextView gender,
      @NonNull LinearLayout leftColumn, @NonNull TextView patientAddres,
      @NonNull TextView patientBirthDate, @NonNull TextView patientCity,
      @NonNull TextView patientCountry, @NonNull TextView patientFamilyName,
      @NonNull TextView patientGender, @NonNull TextView patientGivenName,
      @NonNull TextView patientMiddleName, @NonNull TextView patientPostalCode,
      @NonNull CardView patientsCardView, @NonNull LinearLayout topRow) {
    this.rootView = rootView;
    this.address = address;
    this.birthdate = birthdate;
    this.bottomRow = bottomRow;
    this.gender = gender;
    this.leftColumn = leftColumn;
    this.patientAddres = patientAddres;
    this.patientBirthDate = patientBirthDate;
    this.patientCity = patientCity;
    this.patientCountry = patientCountry;
    this.patientFamilyName = patientFamilyName;
    this.patientGender = patientGender;
    this.patientGivenName = patientGivenName;
    this.patientMiddleName = patientMiddleName;
    this.patientPostalCode = patientPostalCode;
    this.patientsCardView = patientsCardView;
    this.topRow = topRow;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowSimilarPatientBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowSimilarPatientBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_similar_patient, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowSimilarPatientBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.address;
      TextView address = rootView.findViewById(id);
      if (address == null) {
        break missingId;
      }

      id = R.id.birthdate;
      TextView birthdate = rootView.findViewById(id);
      if (birthdate == null) {
        break missingId;
      }

      id = R.id.bottomRow;
      RelativeLayout bottomRow = rootView.findViewById(id);
      if (bottomRow == null) {
        break missingId;
      }

      id = R.id.gender;
      TextView gender = rootView.findViewById(id);
      if (gender == null) {
        break missingId;
      }

      id = R.id.leftColumn;
      LinearLayout leftColumn = rootView.findViewById(id);
      if (leftColumn == null) {
        break missingId;
      }

      id = R.id.patientAddres;
      TextView patientAddres = rootView.findViewById(id);
      if (patientAddres == null) {
        break missingId;
      }

      id = R.id.patientBirthDate;
      TextView patientBirthDate = rootView.findViewById(id);
      if (patientBirthDate == null) {
        break missingId;
      }

      id = R.id.patientCity;
      TextView patientCity = rootView.findViewById(id);
      if (patientCity == null) {
        break missingId;
      }

      id = R.id.patientCountry;
      TextView patientCountry = rootView.findViewById(id);
      if (patientCountry == null) {
        break missingId;
      }

      id = R.id.patientFamilyName;
      TextView patientFamilyName = rootView.findViewById(id);
      if (patientFamilyName == null) {
        break missingId;
      }

      id = R.id.patientGender;
      TextView patientGender = rootView.findViewById(id);
      if (patientGender == null) {
        break missingId;
      }

      id = R.id.patientGivenName;
      TextView patientGivenName = rootView.findViewById(id);
      if (patientGivenName == null) {
        break missingId;
      }

      id = R.id.patientMiddleName;
      TextView patientMiddleName = rootView.findViewById(id);
      if (patientMiddleName == null) {
        break missingId;
      }

      id = R.id.patientPostalCode;
      TextView patientPostalCode = rootView.findViewById(id);
      if (patientPostalCode == null) {
        break missingId;
      }

      id = R.id.patientsCardView;
      CardView patientsCardView = rootView.findViewById(id);
      if (patientsCardView == null) {
        break missingId;
      }

      id = R.id.topRow;
      LinearLayout topRow = rootView.findViewById(id);
      if (topRow == null) {
        break missingId;
      }

      return new RowSimilarPatientBinding((LinearLayout) rootView, address, birthdate, bottomRow,
          gender, leftColumn, patientAddres, patientBirthDate, patientCity, patientCountry,
          patientFamilyName, patientGender, patientGivenName, patientMiddleName, patientPostalCode,
          patientsCardView, topRow);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
