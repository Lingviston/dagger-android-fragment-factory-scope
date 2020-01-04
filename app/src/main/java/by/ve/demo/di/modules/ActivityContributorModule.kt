package by.ve.demo.di.modules

import by.ve.demo.ui.constructorinjection.ConstructorInjectionDemoActivity
import by.ve.demo.ui.membersinjection.MembersInjectionDemoActivity
import by.ve.demo.di.scopes.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
interface ActivityContributorModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [FragmentContributorModule::class])
    fun contributeMembersInjectionDemoActivity(): MembersInjectionDemoActivity

    @ActivityScope
    @ContributesAndroidInjector(modules = [FragmentContributorModule::class])
    fun contributeConstructorInjectionDemoActivity(): ConstructorInjectionDemoActivity
}