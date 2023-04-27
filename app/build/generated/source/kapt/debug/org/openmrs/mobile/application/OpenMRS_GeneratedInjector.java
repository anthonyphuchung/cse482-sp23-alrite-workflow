package org.openmrs.mobile.application;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = OpenMRS.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface OpenMRS_GeneratedInjector {
  void injectOpenMRS(OpenMRS openMRS);
}
