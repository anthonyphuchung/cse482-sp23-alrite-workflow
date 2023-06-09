// Generated by Dagger (https://dagger.dev).
package org.openmrs.mobile.activities.addeditallergy;

import androidx.lifecycle.SavedStateHandle;
import com.openmrs.android_sdk.library.api.repository.AllergyRepository;
import com.openmrs.android_sdk.library.api.repository.ConceptRepository;
import com.openmrs.android_sdk.library.dao.PatientDAO;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddEditAllergyViewModel_Factory implements Factory<AddEditAllergyViewModel> {
  private final Provider<PatientDAO> patientDAOProvider;

  private final Provider<ConceptRepository> conceptRepositoryProvider;

  private final Provider<AllergyRepository> allergyRepositoryProvider;

  private final Provider<SavedStateHandle> savedStateHandleProvider;

  public AddEditAllergyViewModel_Factory(Provider<PatientDAO> patientDAOProvider,
      Provider<ConceptRepository> conceptRepositoryProvider,
      Provider<AllergyRepository> allergyRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    this.patientDAOProvider = patientDAOProvider;
    this.conceptRepositoryProvider = conceptRepositoryProvider;
    this.allergyRepositoryProvider = allergyRepositoryProvider;
    this.savedStateHandleProvider = savedStateHandleProvider;
  }

  @Override
  public AddEditAllergyViewModel get() {
    return newInstance(patientDAOProvider.get(), conceptRepositoryProvider.get(), allergyRepositoryProvider.get(), savedStateHandleProvider.get());
  }

  public static AddEditAllergyViewModel_Factory create(Provider<PatientDAO> patientDAOProvider,
      Provider<ConceptRepository> conceptRepositoryProvider,
      Provider<AllergyRepository> allergyRepositoryProvider,
      Provider<SavedStateHandle> savedStateHandleProvider) {
    return new AddEditAllergyViewModel_Factory(patientDAOProvider, conceptRepositoryProvider, allergyRepositoryProvider, savedStateHandleProvider);
  }

  public static AddEditAllergyViewModel newInstance(PatientDAO patientDAO,
      ConceptRepository conceptRepository, AllergyRepository allergyRepository,
      SavedStateHandle savedStateHandle) {
    return new AddEditAllergyViewModel(patientDAO, conceptRepository, allergyRepository, savedStateHandle);
  }
}
