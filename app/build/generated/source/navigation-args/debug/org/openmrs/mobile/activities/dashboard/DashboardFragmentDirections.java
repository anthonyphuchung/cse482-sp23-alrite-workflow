package org.openmrs.mobile.activities.dashboard;

import androidx.annotation.NonNull;
import androidx.navigation.ActionOnlyNavDirections;
import androidx.navigation.NavDirections;
import org.openmrs.mobile.R;

public class DashboardFragmentDirections {
  private DashboardFragmentDirections() {
  }

  @NonNull
  public static NavDirections actionDashboardFragmentToAddEditPatientActivity() {
    return new ActionOnlyNavDirections(R.id.action_dashboardFragment_to_addEditPatientActivity);
  }

  @NonNull
  public static NavDirections actionDashboardFragmentToSyncedPatientsActivity() {
    return new ActionOnlyNavDirections(R.id.action_dashboardFragment_to_syncedPatientsActivity);
  }

  @NonNull
  public static NavDirections actionDashboardFragmentToActiveVisitsActivity() {
    return new ActionOnlyNavDirections(R.id.action_dashboardFragment_to_activeVisitsActivity);
  }

  @NonNull
  public static NavDirections actionDashboardFragmentToProviderManagerDashboardActivity() {
    return new ActionOnlyNavDirections(R.id.action_dashboardFragment_to_providerManagerDashboardActivity);
  }

  @NonNull
  public static NavDirections actionDashboardFragmentToFormEntryPatientListActivity() {
    return new ActionOnlyNavDirections(R.id.action_dashboardFragment_to_formEntryPatientListActivity);
  }
}
