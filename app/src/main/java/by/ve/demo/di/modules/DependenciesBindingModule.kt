package by.ve.demo.di.modules

import by.ve.demo.di.dependencies.ActivityScopedDependency
import by.ve.demo.di.dependencies.FragmentScopedDependency
import by.ve.demo.di.dependencies.FragmentScopedDependencyConsumer1
import by.ve.demo.di.dependencies.FragmentScopedDependencyConsumer2
import by.ve.demo.di.dependencies.PrintableDependency
import by.ve.demo.di.dependencies.UnscopedDependency
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet


@Module
interface DependenciesBindingModule {

    @Binds
    @IntoSet
    fun toPrintable1(dependency: UnscopedDependency): PrintableDependency

    @Binds
    @IntoSet
    fun toPrintable2(dependency: ActivityScopedDependency): PrintableDependency

    @Binds
    @IntoSet
    fun toPrintable3(dependency: FragmentScopedDependency): PrintableDependency

    @Binds
    @IntoSet
    fun toPrintable4(dependency: FragmentScopedDependencyConsumer1): PrintableDependency

    @Binds
    @IntoSet
    fun toPrintable5(dependency: FragmentScopedDependencyConsumer2): PrintableDependency
}