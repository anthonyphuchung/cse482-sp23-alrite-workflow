// Generated by Dagger (https://dagger.dev).
package org.openmrs.mobile.activities.patientdashboard.vitals;

import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.dao.EncounterDAO;
import com.openmrs.android_sdk.library.dao.PatientDAO;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PatientDashboardVitalsViewModel_Factory implements Factory<PatientDashboardVitalsViewModel> {
  private final Provider<PatientDAO> patientDAOProvider;

  private final Provider<EncounterDAO> encounterDAOProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public PatientDashboardVitalsViewModel_Factory(Provider<PatientDAO> patientDAOProvider,
      Provider<EncounterDAO> encounterDAOProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.patientDAOProvider = patientDAOProvider;
    this.encounterDAOProvider = encounterDAOProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public PatientDashboardVitalsViewModel get() {
    return newInstance(patientDAOProvider.get(), encounterDAOProvider.get(), savedStateHandleProvider.get());
  }

  public static PatientDashboardVitalsViewModel_Factory create(
      Provider<PatientDAO> patientDAOProvider, Provider<EncounterDAO> encounterDAOProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new PatientDashboardVitalsViewModel_Factory(patientDAOProvider, encounterDAOProvider, savedStateHandleProvider);
  }

  public static PatientDashboardVitalsViewModel newInstance(PatientDAO patientDAO,
      EncounterDAO encounterDAO, SavedStateHandle savedStateHandle) {
    return new PatientDashboardVitalsViewModel(patientDAO, encounterDAO, savedStateHandle);
  }
}
