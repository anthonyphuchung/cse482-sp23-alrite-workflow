// Generated by view binder compiler. Do not edit!
package org.openmrs.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openmrs.mobile.R;

public final class FragmentFormEntryPatientListBinding implements ViewBinding {
  @NonNull
  private final SwipeRefreshLayout rootView;

  @NonNull
  public final TextView emptyPatientList;

  @NonNull
  public final ProgressBar formEntryListInitialProgressBar;

  @NonNull
  public final RecyclerView patientRecyclerView;

  @NonNull
  public final SwipeRefreshLayout swipeLayout;

  private FragmentFormEntryPatientListBinding(@NonNull SwipeRefreshLayout rootView,
      @NonNull TextView emptyPatientList, @NonNull ProgressBar formEntryListInitialProgressBar,
      @NonNull RecyclerView patientRecyclerView, @NonNull SwipeRefreshLayout swipeLayout) {
    this.rootView = rootView;
    this.emptyPatientList = emptyPatientList;
    this.formEntryListInitialProgressBar = formEntryListInitialProgressBar;
    this.patientRecyclerView = patientRecyclerView;
    this.swipeLayout = swipeLayout;
  }

  @Override
  @NonNull
  public SwipeRefreshLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFormEntryPatientListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFormEntryPatientListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_form_entry_patient_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFormEntryPatientListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.emptyPatientList;
      TextView emptyPatientList = rootView.findViewById(id);
      if (emptyPatientList == null) {
        break missingId;
      }

      id = R.id.formEntryListInitialProgressBar;
      ProgressBar formEntryListInitialProgressBar = rootView.findViewById(id);
      if (formEntryListInitialProgressBar == null) {
        break missingId;
      }

      id = R.id.patientRecyclerView;
      RecyclerView patientRecyclerView = rootView.findViewById(id);
      if (patientRecyclerView == null) {
        break missingId;
      }

      SwipeRefreshLayout swipeLayout = (SwipeRefreshLayout) rootView;

      return new FragmentFormEntryPatientListBinding((SwipeRefreshLayout) rootView,
          emptyPatientList, formEntryListInitialProgressBar, patientRecyclerView, swipeLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}