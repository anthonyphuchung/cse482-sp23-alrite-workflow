// Generated by Dagger (https://dagger.dev).
package org.openmrs.mobile.activities.community.contact;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ContactUsViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static ContactUsViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(ContactUsViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final ContactUsViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new ContactUsViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}