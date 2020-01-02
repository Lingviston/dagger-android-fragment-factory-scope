package by.ve.demo.di.modules

import by.ve.demo.MembersInjectionFragment
import by.ve.demo.ScopedFragmentFactory
import by.ve.demo.di.scopes.FragmentScope
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
interface FragmentBindingModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = [DependenciesBindingModule::class])
    fun contributeMembersInjectionFragment(): MembersInjectionFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [DependenciesBindingModule::class])
    fun contributeFragmentFactory(): ScopedFragmentFactory.FragmentProviders
}