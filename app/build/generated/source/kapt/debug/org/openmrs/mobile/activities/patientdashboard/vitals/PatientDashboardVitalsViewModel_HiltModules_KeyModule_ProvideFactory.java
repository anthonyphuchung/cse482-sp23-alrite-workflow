// Generated by Dagger (https://dagger.dev).
package org.openmrs.mobile.activities.patientdashboard.vitals;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PatientDashboardVitalsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static PatientDashboardVitalsViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(PatientDashboardVitalsViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final PatientDashboardVitalsViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new PatientDashboardVitalsViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
