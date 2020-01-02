package by.ve.demo.di.modules

import by.ve.demo.ConstructorInjectionDemoActivity
import by.ve.demo.MembersInjectionDemoActivity
import by.ve.demo.di.scopes.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
interface ActivityBindingModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [FragmentBindingModule::class])
    fun contributeMembersInjectionDemoActivity(): MembersInjectionDemoActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [FragmentBindingModule::class])
    fun contributeConstructorInjectionDemoActivity(): ConstructorInjectionDemoActivity
}