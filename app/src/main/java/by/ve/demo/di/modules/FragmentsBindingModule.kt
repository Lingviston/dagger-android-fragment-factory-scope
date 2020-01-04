package by.ve.demo.di.modules

import androidx.fragment.app.Fragment
import by.ve.demo.ui.constructorinjection.ConstructorInjectionFragment1
import by.ve.demo.ui.constructorinjection.ConstructorInjectionFragment2
import by.ve.demo.di.key.FragmentKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface FragmentsBindingModule {

    @Binds
    @IntoMap
    @FragmentKey(ConstructorInjectionFragment1::class)
    fun bindConstructorInjectionFragment1(fragment: ConstructorInjectionFragment1): Fragment

    @Binds
    @IntoMap
    @FragmentKey(ConstructorInjectionFragment2::class)
    fun bindConstructorInjectionFragment2(fragment: ConstructorInjectionFragment2): Fragment
}