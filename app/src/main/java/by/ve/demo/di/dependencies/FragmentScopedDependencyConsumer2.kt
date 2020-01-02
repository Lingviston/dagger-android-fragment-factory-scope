package by.ve.demo.di.dependencies

import javax.inject.Inject


class FragmentScopedDependencyConsumer2 @Inject constructor(
    private val dependency: FragmentScopedDependency
) : PrintableDependency {

    override fun describe() = "${super.describe()}\n    ${dependency.describe()}"
}