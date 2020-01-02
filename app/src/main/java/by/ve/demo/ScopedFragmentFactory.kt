package by.ve.demo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject
import javax.inject.Provider


class ScopedFragmentFactory @Inject constructor(
    private val androidInjector: DispatchingAndroidInjector<Any>
) : FragmentFactory() {

    private val providers = FragmentProviders()

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment =
        when (loadFragmentClass(classLoader, className)) {
            ConstructorInjectionFragment::class.java -> {
                androidInjector.inject(providers)
                providers.fragmentProvider.get()
            }
            else -> super.instantiate(classLoader, className)
        }

    class FragmentProviders {

        @Inject
        lateinit var fragmentProvider: Provider<ConstructorInjectionFragment>
    }
}