package by.ve.demo.di.dependencies

import by.ve.demo.di.scopes.ActivityScope
import javax.inject.Inject


@ActivityScope
class ActivityScopedDependency @Inject constructor() : PrintableDependency