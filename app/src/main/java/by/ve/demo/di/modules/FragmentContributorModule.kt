package by.ve.demo.di.modules

import by.ve.demo.ui.membersinjection.MembersInjectionFragment
import by.ve.demo.di.ScopedFragmentFactory
import by.ve.demo.di.scopes.FragmentScope
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
interface FragmentContributorModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = [DependenciesBindingModule::class])
    fun contributeMembersInjectionFragment(): MembersInjectionFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [DependenciesBindingModule::class, FragmentsBindingModule::class])
    fun contributeFragmentFactory(): ScopedFragmentFactory.FragmentProviders
}