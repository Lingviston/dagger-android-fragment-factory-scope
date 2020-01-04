package by.ve.demo.di

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject
import javax.inject.Provider

class ScopedFragmentFactory @Inject constructor(
    private val androidInjector: DispatchingAndroidInjector<Any>
) : FragmentFactory() {

    private val providers = FragmentProviders()

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        androidInjector.inject(providers)

        val clazz = loadFragmentClass(classLoader, className)
        return providers[clazz]?.get() ?: super.instantiate(classLoader, className)
    }

    class FragmentProviders {

        @Inject
        lateinit var fragmentProviders: MutableMap<Class<out Fragment>, Provider<Fragment>>

        operator fun get(clazz: Class<out Fragment>) = fragmentProviders[clazz]
    }
}