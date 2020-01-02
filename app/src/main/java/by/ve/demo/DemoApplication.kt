package by.ve.demo

import by.ve.demo.di.DaggerAppComponent
import dagger.android.support.DaggerApplication


class DemoApplication : DaggerApplication() {

    override fun applicationInjector() = DaggerAppComponent.factory().create(this)
}