// Generated by Dagger (https://dagger.dev).
package org.openmrs.mobile.activities.formadmission;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FormAdmissionViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static FormAdmissionViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(FormAdmissionViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final FormAdmissionViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new FormAdmissionViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}