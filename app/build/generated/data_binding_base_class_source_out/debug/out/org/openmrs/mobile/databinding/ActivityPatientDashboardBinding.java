// Generated by view binder compiler. Do not edit!
package org.openmrs.mobile.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.openmrs.mobile.R;

public final class ActivityPatientDashboardBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final CustomExpandableFabBinding actionsFab;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final ViewPager pager;

  @NonNull
  public final FrameLayout patientDashboardContentFrame;

  @NonNull
  public final TabLayout tabhost;

  private ActivityPatientDashboardBinding(@NonNull CoordinatorLayout rootView,
      @NonNull CustomExpandableFabBinding actionsFab, @NonNull AppBarLayout appbar,
      @NonNull ViewPager pager, @NonNull FrameLayout patientDashboardContentFrame,
      @NonNull TabLayout tabhost) {
    this.rootView = rootView;
    this.actionsFab = actionsFab;
    this.appbar = appbar;
    this.pager = pager;
    this.patientDashboardContentFrame = patientDashboardContentFrame;
    this.tabhost = tabhost;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPatientDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPatientDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_patient_dashboard, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPatientDashboardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.actionsFab;
      View actionsFab = rootView.findViewById(id);
      if (actionsFab == null) {
        break missingId;
      }
      CustomExpandableFabBinding binding_actionsFab = CustomExpandableFabBinding.bind(actionsFab);

      id = R.id.appbar;
      AppBarLayout appbar = rootView.findViewById(id);
      if (appbar == null) {
        break missingId;
      }

      id = R.id.pager;
      ViewPager pager = rootView.findViewById(id);
      if (pager == null) {
        break missingId;
      }

      id = R.id.patientDashboardContentFrame;
      FrameLayout patientDashboardContentFrame = rootView.findViewById(id);
      if (patientDashboardContentFrame == null) {
        break missingId;
      }

      id = R.id.tabhost;
      TabLayout tabhost = rootView.findViewById(id);
      if (tabhost == null) {
        break missingId;
      }

      return new ActivityPatientDashboardBinding((CoordinatorLayout) rootView, binding_actionsFab,
          appbar, pager, patientDashboardContentFrame, tabhost);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}