package org.openmrs.mobile.application;

import androidx.hilt.work.HiltWrapper_WorkerFactoryModule;
import com.openmrs.android_sdk.library.api.workers.UpdatePatientWorker_HiltModule;
import com.openmrs.android_sdk.library.api.workers.allergy.DeleteAllergyWorker_HiltModule;
import com.openmrs.android_sdk.library.api.workers.provider.AddProviderWorker_HiltModule;
import com.openmrs.android_sdk.library.api.workers.provider.DeleteProviderWorker_HiltModule;
import com.openmrs.android_sdk.library.api.workers.provider.UpdateProviderWorker_HiltModule;
import com.openmrs.android_sdk.library.di.entrypoints.RepositoryEntryPoint;
import com.openmrs.android_sdk.library.di.modules.AppDatabaseModule;
import com.openmrs.android_sdk.library.di.modules.ApplicationContextModule;
import com.openmrs.android_sdk.library.di.modules.OpenMRSLoggerModule;
import com.openmrs.android_sdk.library.di.modules.RestServiceModule;
import com.openmrs.android_sdk.library.di.modules.WorkManagerModule;
import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Subcomponent;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.components.FragmentComponent;
import dagger.hilt.android.components.ServiceComponent;
import dagger.hilt.android.components.ViewComponent;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.components.ViewWithFragmentComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_DefaultViewModelFactories_ActivityModule;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint;
import dagger.hilt.android.internal.lifecycle.HiltWrapper_HiltViewModelFactory_ViewModelModule;
import dagger.hilt.android.internal.managers.ActivityComponentManager;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint;
import dagger.hilt.android.internal.managers.HiltWrapper_ActivityRetainedComponentManager_LifecycleModule;
import dagger.hilt.android.internal.managers.ServiceComponentManager;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.android.internal.modules.HiltWrapper_ActivityModule;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import dagger.hilt.android.scopes.ActivityScoped;
import dagger.hilt.android.scopes.FragmentScoped;
import dagger.hilt.android.scopes.ServiceScoped;
import dagger.hilt.android.scopes.ViewModelScoped;
import dagger.hilt.android.scopes.ViewScoped;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedComponent;
import dagger.hilt.migration.DisableInstallInCheck;
import javax.inject.Singleton;
import org.openmrs.mobile.activities.ACBaseActivity_GeneratedInjector;
import org.openmrs.mobile.activities.activevisits.ActiveVisitsActivity_GeneratedInjector;
import org.openmrs.mobile.activities.activevisits.ActiveVisitsFragment_GeneratedInjector;
import org.openmrs.mobile.activities.activevisits.ActiveVisitsViewModel_HiltModules;
import org.openmrs.mobile.activities.addeditallergy.AddEditAllergyActivity_GeneratedInjector;
import org.openmrs.mobile.activities.addeditallergy.AddEditAllergyFragment_GeneratedInjector;
import org.openmrs.mobile.activities.addeditallergy.AddEditAllergyViewModel_HiltModules;
import org.openmrs.mobile.activities.addeditpatient.AddEditPatientActivity_GeneratedInjector;
import org.openmrs.mobile.activities.addeditpatient.AddEditPatientFragment_GeneratedInjector;
import org.openmrs.mobile.activities.addeditpatient.AddEditPatientViewModel_HiltModules;
import org.openmrs.mobile.activities.addeditprovider.AddEditProviderActivity_GeneratedInjector;
import org.openmrs.mobile.activities.addeditprovider.AddEditProviderFragment_GeneratedInjector;
import org.openmrs.mobile.activities.addeditprovider.AddEditProviderViewModel_HiltModules;
import org.openmrs.mobile.activities.community.contact.AboutActivity_GeneratedInjector;
import org.openmrs.mobile.activities.community.contact.ContactUsActivity_GeneratedInjector;
import org.openmrs.mobile.activities.community.contact.ContactUsViewModel_HiltModules;
import org.openmrs.mobile.activities.dashboard.DashboardActivity_GeneratedInjector;
import org.openmrs.mobile.activities.dashboard.DashboardFragment_GeneratedInjector;
import org.openmrs.mobile.activities.dashboard.DashboardViewModel_HiltModules;
import org.openmrs.mobile.activities.formadmission.FormAdmissionActivity_GeneratedInjector;
import org.openmrs.mobile.activities.formadmission.FormAdmissionFragment_GeneratedInjector;
import org.openmrs.mobile.activities.formadmission.FormAdmissionViewModel_HiltModules;
import org.openmrs.mobile.activities.formdisplay.FormDisplayActivity_GeneratedInjector;
import org.openmrs.mobile.activities.formdisplay.FormDisplayMainViewModel_HiltModules;
import org.openmrs.mobile.activities.formdisplay.FormDisplayPageFragment_GeneratedInjector;
import org.openmrs.mobile.activities.formdisplay.FormDisplayPageViewModel_HiltModules;
import org.openmrs.mobile.activities.formentrypatientlist.FormEntryPatientListActivity_GeneratedInjector;
import org.openmrs.mobile.activities.formentrypatientlist.FormEntryPatientListFragment_GeneratedInjector;
import org.openmrs.mobile.activities.formentrypatientlist.FormEntryPatientListViewModel_HiltModules;
import org.openmrs.mobile.activities.formlist.FormListActivity_GeneratedInjector;
import org.openmrs.mobile.activities.formlist.FormListFragment_GeneratedInjector;
import org.openmrs.mobile.activities.formlist.FormListViewModel_HiltModules;
import org.openmrs.mobile.activities.lastviewedpatients.LastViewedPatientsActivity_GeneratedInjector;
import org.openmrs.mobile.activities.lastviewedpatients.LastViewedPatientsFragment_GeneratedInjector;
import org.openmrs.mobile.activities.lastviewedpatients.LastViewedPatientsViewModel_HiltModules;
import org.openmrs.mobile.activities.login.LoginActivity_GeneratedInjector;
import org.openmrs.mobile.activities.login.LoginFragment_GeneratedInjector;
import org.openmrs.mobile.activities.login.LoginViewModel_HiltModules;
import org.openmrs.mobile.activities.logs.LogsActivity_GeneratedInjector;
import org.openmrs.mobile.activities.logs.LogsFragment_GeneratedInjector;
import org.openmrs.mobile.activities.logs.LogsViewModel_HiltModules;
import org.openmrs.mobile.activities.matchingpatients.MatchingPatientsActivity_GeneratedInjector;
import org.openmrs.mobile.activities.matchingpatients.MatchingPatientsFragment_GeneratedInjector;
import org.openmrs.mobile.activities.matchingpatients.MatchingPatientsViewModel_HiltModules;
import org.openmrs.mobile.activities.patientdashboard.PatientDashboardActivity_GeneratedInjector;
import org.openmrs.mobile.activities.patientdashboard.PatientDashboardMainViewModel_HiltModules;
import org.openmrs.mobile.activities.patientdashboard.allergy.PatientAllergyFragment_GeneratedInjector;
import org.openmrs.mobile.activities.patientdashboard.allergy.PatientDashboardAllergyViewModel_HiltModules;
import org.openmrs.mobile.activities.patientdashboard.charts.PatientChartsFragment_GeneratedInjector;
import org.openmrs.mobile.activities.patientdashboard.charts.PatientDashboardChartsViewModel_HiltModules;
import org.openmrs.mobile.activities.patientdashboard.details.PatientDashboardDetailsViewModel_HiltModules;
import org.openmrs.mobile.activities.patientdashboard.details.PatientDetailsFragment_GeneratedInjector;
import org.openmrs.mobile.activities.patientdashboard.diagnosis.PatientDashboardDiagnosisViewModel_HiltModules;
import org.openmrs.mobile.activities.patientdashboard.diagnosis.PatientDiagnosisFragment_GeneratedInjector;
import org.openmrs.mobile.activities.patientdashboard.visits.PatientDashboardVisitsViewModel_HiltModules;
import org.openmrs.mobile.activities.patientdashboard.visits.PatientVisitsFragment_GeneratedInjector;
import org.openmrs.mobile.activities.patientdashboard.vitals.PatientDashboardVitalsViewModel_HiltModules;
import org.openmrs.mobile.activities.patientdashboard.vitals.PatientVitalsFragment_GeneratedInjector;
import org.openmrs.mobile.activities.providerdashboard.ProviderDashboardActivity_GeneratedInjector;
import org.openmrs.mobile.activities.providerdashboard.ProviderDashboardViewModel_HiltModules;
import org.openmrs.mobile.activities.providerdashboard.patientrelationship.PatientRelationshipFragment_GeneratedInjector;
import org.openmrs.mobile.activities.providerdashboard.providerrelationship.ProviderRelationshipFragment_GeneratedInjector;
import org.openmrs.mobile.activities.providermanagerdashboard.ProviderManagerDashboardActivity_GeneratedInjector;
import org.openmrs.mobile.activities.providermanagerdashboard.ProviderManagerDashboardFragment_GeneratedInjector;
import org.openmrs.mobile.activities.providermanagerdashboard.ProviderManagerDashboardViewModel_HiltModules;
import org.openmrs.mobile.activities.settings.SettingsActivity_GeneratedInjector;
import org.openmrs.mobile.activities.settings.SettingsFragment_GeneratedInjector;
import org.openmrs.mobile.activities.settings.SettingsViewModel_HiltModules;
import org.openmrs.mobile.activities.syncedpatients.SyncedPatientsActivity_GeneratedInjector;
import org.openmrs.mobile.activities.syncedpatients.SyncedPatientsFragment_GeneratedInjector;
import org.openmrs.mobile.activities.syncedpatients.SyncedPatientsViewModel_HiltModules;
import org.openmrs.mobile.activities.visitdashboard.VisitDashboardActivity_GeneratedInjector;
import org.openmrs.mobile.activities.visitdashboard.VisitDashboardFragment_GeneratedInjector;
import org.openmrs.mobile.activities.visitdashboard.VisitDashboardViewModel_HiltModules;
import org.openmrs.mobile.services.ConceptDownloadService_GeneratedInjector;
import org.openmrs.mobile.services.EncounterService_GeneratedInjector;
import org.openmrs.mobile.services.FormListService_GeneratedInjector;
import org.openmrs.mobile.services.PatientService_GeneratedInjector;

public final class OpenMRS_HiltComponents {
  private OpenMRS_HiltComponents() {
  }

  @Module(
      subcomponents = ServiceC.class
  )
  @DisableInstallInCheck
  abstract interface ServiceCBuilderModule {
    @Binds
    ServiceComponentBuilder bind(ServiceC.Builder builder);
  }

  @Module(
      subcomponents = ActivityRetainedC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityRetainedCBuilderModule {
    @Binds
    ActivityRetainedComponentBuilder bind(ActivityRetainedC.Builder builder);
  }

  @Module(
      subcomponents = ActivityC.class
  )
  @DisableInstallInCheck
  abstract interface ActivityCBuilderModule {
    @Binds
    ActivityComponentBuilder bind(ActivityC.Builder builder);
  }

  @Module(
      subcomponents = ViewModelC.class
  )
  @DisableInstallInCheck
  abstract interface ViewModelCBuilderModule {
    @Binds
    ViewModelComponentBuilder bind(ViewModelC.Builder builder);
  }

  @Module(
      subcomponents = ViewC.class
  )
  @DisableInstallInCheck
  abstract interface ViewCBuilderModule {
    @Binds
    ViewComponentBuilder bind(ViewC.Builder builder);
  }

  @Module(
      subcomponents = FragmentC.class
  )
  @DisableInstallInCheck
  abstract interface FragmentCBuilderModule {
    @Binds
    FragmentComponentBuilder bind(FragmentC.Builder builder);
  }

  @Module(
      subcomponents = ViewWithFragmentC.class
  )
  @DisableInstallInCheck
  abstract interface ViewWithFragmentCBuilderModule {
    @Binds
    ViewWithFragmentComponentBuilder bind(ViewWithFragmentC.Builder builder);
  }

  @Component(
      modules = {
          AddProviderWorker_HiltModule.class,
          AppDatabaseModule.class,
          ApplicationContextModule.class,
          dagger.hilt.android.internal.modules.ApplicationContextModule.class,
          DeleteAllergyWorker_HiltModule.class,
          DeleteProviderWorker_HiltModule.class,
          HiltWrapper_WorkerFactoryModule.class,
          OpenMRSLoggerModule.class,
          ActivityRetainedCBuilderModule.class,
          ServiceCBuilderModule.class,
          RestServiceModule.class,
          UpdatePatientWorker_HiltModule.class,
          UpdateProviderWorker_HiltModule.class,
          WorkManagerModule.class
      }
  )
  @Singleton
  public abstract static class SingletonC implements RepositoryEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedComponentBuilderEntryPoint,
      ServiceComponentManager.ServiceComponentBuilderEntryPoint,
      SingletonComponent,
      GeneratedComponent,
      OpenMRS_GeneratedInjector {
  }

  @Subcomponent
  @ServiceScoped
  public abstract static class ServiceC implements ServiceComponent,
      GeneratedComponent,
      ConceptDownloadService_GeneratedInjector,
      EncounterService_GeneratedInjector,
      FormListService_GeneratedInjector,
      PatientService_GeneratedInjector {
    @Subcomponent.Builder
    abstract interface Builder extends ServiceComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          ActiveVisitsViewModel_HiltModules.KeyModule.class,
          AddEditAllergyViewModel_HiltModules.KeyModule.class,
          AddEditPatientViewModel_HiltModules.KeyModule.class,
          AddEditProviderViewModel_HiltModules.KeyModule.class,
          ContactUsViewModel_HiltModules.KeyModule.class,
          DashboardViewModel_HiltModules.KeyModule.class,
          FormAdmissionViewModel_HiltModules.KeyModule.class,
          FormDisplayMainViewModel_HiltModules.KeyModule.class,
          FormDisplayPageViewModel_HiltModules.KeyModule.class,
          FormEntryPatientListViewModel_HiltModules.KeyModule.class,
          FormListViewModel_HiltModules.KeyModule.class,
          HiltWrapper_ActivityRetainedComponentManager_LifecycleModule.class,
          LastViewedPatientsViewModel_HiltModules.KeyModule.class,
          LoginViewModel_HiltModules.KeyModule.class,
          LogsViewModel_HiltModules.KeyModule.class,
          MatchingPatientsViewModel_HiltModules.KeyModule.class,
          ActivityCBuilderModule.class,
          ViewModelCBuilderModule.class,
          PatientDashboardAllergyViewModel_HiltModules.KeyModule.class,
          PatientDashboardChartsViewModel_HiltModules.KeyModule.class,
          PatientDashboardDetailsViewModel_HiltModules.KeyModule.class,
          PatientDashboardDiagnosisViewModel_HiltModules.KeyModule.class,
          PatientDashboardMainViewModel_HiltModules.KeyModule.class,
          PatientDashboardVisitsViewModel_HiltModules.KeyModule.class,
          PatientDashboardVitalsViewModel_HiltModules.KeyModule.class,
          ProviderDashboardViewModel_HiltModules.KeyModule.class,
          ProviderManagerDashboardViewModel_HiltModules.KeyModule.class,
          SettingsViewModel_HiltModules.KeyModule.class,
          SyncedPatientsViewModel_HiltModules.KeyModule.class,
          VisitDashboardViewModel_HiltModules.KeyModule.class
      }
  )
  @ActivityRetainedScoped
  public abstract static class ActivityRetainedC implements ActivityRetainedComponent,
      ActivityComponentManager.ActivityComponentBuilderEntryPoint,
      HiltWrapper_ActivityRetainedComponentManager_ActivityRetainedLifecycleEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityRetainedComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          HiltWrapper_ActivityModule.class,
          HiltWrapper_DefaultViewModelFactories_ActivityModule.class,
          FragmentCBuilderModule.class,
          ViewCBuilderModule.class
      }
  )
  @ActivityScoped
  public abstract static class ActivityC implements ActivityComponent,
      DefaultViewModelFactories.ActivityEntryPoint,
      HiltWrapper_HiltViewModelFactory_ActivityCreatorEntryPoint,
      FragmentComponentManager.FragmentComponentBuilderEntryPoint,
      ViewComponentManager.ViewComponentBuilderEntryPoint,
      GeneratedComponent,
      ACBaseActivity_GeneratedInjector,
      ActiveVisitsActivity_GeneratedInjector,
      AddEditAllergyActivity_GeneratedInjector,
      AddEditPatientActivity_GeneratedInjector,
      AddEditProviderActivity_GeneratedInjector,
      AboutActivity_GeneratedInjector,
      ContactUsActivity_GeneratedInjector,
      DashboardActivity_GeneratedInjector,
      FormAdmissionActivity_GeneratedInjector,
      FormDisplayActivity_GeneratedInjector,
      FormEntryPatientListActivity_GeneratedInjector,
      FormListActivity_GeneratedInjector,
      LastViewedPatientsActivity_GeneratedInjector,
      LoginActivity_GeneratedInjector,
      LogsActivity_GeneratedInjector,
      MatchingPatientsActivity_GeneratedInjector,
      PatientDashboardActivity_GeneratedInjector,
      ProviderDashboardActivity_GeneratedInjector,
      ProviderManagerDashboardActivity_GeneratedInjector,
      SettingsActivity_GeneratedInjector,
      SyncedPatientsActivity_GeneratedInjector,
      VisitDashboardActivity_GeneratedInjector {
    @Subcomponent.Builder
    abstract interface Builder extends ActivityComponentBuilder {
    }
  }

  @Subcomponent(
      modules = {
          ActiveVisitsViewModel_HiltModules.BindsModule.class,
          AddEditAllergyViewModel_HiltModules.BindsModule.class,
          AddEditPatientViewModel_HiltModules.BindsModule.class,
          AddEditProviderViewModel_HiltModules.BindsModule.class,
          ContactUsViewModel_HiltModules.BindsModule.class,
          DashboardViewModel_HiltModules.BindsModule.class,
          FormAdmissionViewModel_HiltModules.BindsModule.class,
          FormDisplayMainViewModel_HiltModules.BindsModule.class,
          FormDisplayPageViewModel_HiltModules.BindsModule.class,
          FormEntryPatientListViewModel_HiltModules.BindsModule.class,
          FormListViewModel_HiltModules.BindsModule.class,
          HiltWrapper_HiltViewModelFactory_ViewModelModule.class,
          LastViewedPatientsViewModel_HiltModules.BindsModule.class,
          LoginViewModel_HiltModules.BindsModule.class,
          LogsViewModel_HiltModules.BindsModule.class,
          MatchingPatientsViewModel_HiltModules.BindsModule.class,
          PatientDashboardAllergyViewModel_HiltModules.BindsModule.class,
          PatientDashboardChartsViewModel_HiltModules.BindsModule.class,
          PatientDashboardDetailsViewModel_HiltModules.BindsModule.class,
          PatientDashboardDiagnosisViewModel_HiltModules.BindsModule.class,
          PatientDashboardMainViewModel_HiltModules.BindsModule.class,
          PatientDashboardVisitsViewModel_HiltModules.BindsModule.class,
          PatientDashboardVitalsViewModel_HiltModules.BindsModule.class,
          ProviderDashboardViewModel_HiltModules.BindsModule.class,
          ProviderManagerDashboardViewModel_HiltModules.BindsModule.class,
          SettingsViewModel_HiltModules.BindsModule.class,
          SyncedPatientsViewModel_HiltModules.BindsModule.class,
          VisitDashboardViewModel_HiltModules.BindsModule.class
      }
  )
  @ViewModelScoped
  public abstract static class ViewModelC implements ViewModelComponent,
      HiltViewModelFactory.ViewModelFactoriesEntryPoint,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewModelComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewC implements ViewComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewComponentBuilder {
    }
  }

  @Subcomponent(
      modules = ViewWithFragmentCBuilderModule.class
  )
  @FragmentScoped
  public abstract static class FragmentC implements FragmentComponent,
      DefaultViewModelFactories.FragmentEntryPoint,
      ViewComponentManager.ViewWithFragmentComponentBuilderEntryPoint,
      GeneratedComponent,
      ActiveVisitsFragment_GeneratedInjector,
      AddEditAllergyFragment_GeneratedInjector,
      AddEditPatientFragment_GeneratedInjector,
      AddEditProviderFragment_GeneratedInjector,
      DashboardFragment_GeneratedInjector,
      FormAdmissionFragment_GeneratedInjector,
      FormDisplayPageFragment_GeneratedInjector,
      FormEntryPatientListFragment_GeneratedInjector,
      FormListFragment_GeneratedInjector,
      LastViewedPatientsFragment_GeneratedInjector,
      LoginFragment_GeneratedInjector,
      LogsFragment_GeneratedInjector,
      MatchingPatientsFragment_GeneratedInjector,
      PatientAllergyFragment_GeneratedInjector,
      PatientChartsFragment_GeneratedInjector,
      PatientDetailsFragment_GeneratedInjector,
      PatientDiagnosisFragment_GeneratedInjector,
      PatientVisitsFragment_GeneratedInjector,
      PatientVitalsFragment_GeneratedInjector,
      PatientRelationshipFragment_GeneratedInjector,
      ProviderRelationshipFragment_GeneratedInjector,
      ProviderManagerDashboardFragment_GeneratedInjector,
      SettingsFragment_GeneratedInjector,
      SyncedPatientsFragment_GeneratedInjector,
      VisitDashboardFragment_GeneratedInjector {
    @Subcomponent.Builder
    abstract interface Builder extends FragmentComponentBuilder {
    }
  }

  @Subcomponent
  @ViewScoped
  public abstract static class ViewWithFragmentC implements ViewWithFragmentComponent,
      GeneratedComponent {
    @Subcomponent.Builder
    abstract interface Builder extends ViewWithFragmentComponentBuilder {
    }
  }
}
