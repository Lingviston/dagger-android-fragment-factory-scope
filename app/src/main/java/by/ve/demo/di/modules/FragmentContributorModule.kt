package by.ve.demo.di.modules

import by.ve.demo.di.ScopedFragmentFactory
import by.ve.demo.di.scopes.FragmentScope
import by.ve.demo.ui.membersinjection.MembersInjectionFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


/**
 * This module most be included into the method, which [ContributesAndroidInjector] into an activity,
 * which will show the fragments.
 */
@Module
interface FragmentContributorModule {

    /**
     * This method will force Dagger to generate a [dagger.Subcomponent] for the activity's [dagger.Subcomponent],
     * which lets us inject [by.ve.demo.di.scopes.ActivityScope] and [FragmentScope] dependencies
     * into [MembersInjectionFragment].
     */
    @FragmentScope
    @ContributesAndroidInjector(modules = [DependenciesBindingModule::class])
    fun contributeMembersInjectionFragment(): MembersInjectionFragment

    /**
     * This method will force Dagger to generate a [dagger.Subcomponent] for the activity's [dagger.Subcomponent],
     * which lets us inject [by.ve.demo.di.scopes.ActivityScope] and [FragmentScope] dependencies
     * into [ScopedFragmentFactory.FragmentProviders]. That allows [ScopedFragmentFactory] to inject
     * scoped dependencies into the produced fragments.
     */
    @FragmentScope
    @ContributesAndroidInjector(modules = [DependenciesBindingModule::class, FragmentsBindingModule::class])
    fun contributeFragmentFactory(): ScopedFragmentFactory.FragmentProviders
}