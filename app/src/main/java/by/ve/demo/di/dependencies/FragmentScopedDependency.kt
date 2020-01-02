package by.ve.demo.di.dependencies

import by.ve.demo.di.scopes.FragmentScope
import javax.inject.Inject


@FragmentScope
class FragmentScopedDependency @Inject constructor() : PrintableDependency