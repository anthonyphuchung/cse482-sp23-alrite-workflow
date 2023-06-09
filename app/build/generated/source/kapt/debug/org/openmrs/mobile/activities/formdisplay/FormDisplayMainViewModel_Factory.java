// Generated by Dagger (https://dagger.dev).
package org.openmrs.mobile.activities.formdisplay;

import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.api.repository.EncounterRepository;
import com.openmrs.android_sdk.library.api.repository.FormRepository;
import com.openmrs.android_sdk.library.dao.PatientDAO;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FormDisplayMainViewModel_Factory implements Factory<FormDisplayMainViewModel> {
  private final Provider<PatientDAO> patientDAOProvider;

  private final Provider<FormRepository> formRepositoryProvider;

  private final Provider<EncounterRepository> encounterRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public FormDisplayMainViewModel_Factory(Provider<PatientDAO> patientDAOProvider,
      Provider<FormRepository> formRepositoryProvider,
      Provider<EncounterRepository> encounterRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.patientDAOProvider = patientDAOProvider;
    this.formRepositoryProvider = formRepositoryProvider;
    this.encounterRepositoryProvider = encounterRepositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public FormDisplayMainViewModel get() {
    return newInstance(patientDAOProvider.get(), formRepositoryProvider.get(), encounterRepositoryProvider.get(), savedStateHandleProvider.get());
  }

  public static FormDisplayMainViewModel_Factory create(Provider<PatientDAO> patientDAOProvider,
      Provider<FormRepository> formRepositoryProvider,
      Provider<EncounterRepository> encounterRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new FormDisplayMainViewModel_Factory(patientDAOProvider, formRepositoryProvider, encounterRepositoryProvider, savedStateHandleProvider);
  }

  public static FormDisplayMainViewModel newInstance(PatientDAO patientDAO,
      FormRepository formRepository, EncounterRepository encounterRepository,
      SavedStateHandle savedStateHandle) {
    return new FormDisplayMainViewModel(patientDAO, formRepository, encounterRepository, savedStateHandle);
  }
}
