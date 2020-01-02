package by.ve.demo.di.key

import androidx.fragment.app.Fragment
import dagger.MapKey
import kotlin.reflect.KClass


@MapKey
annotation class FragmentKey(val value: KClass<out Fragment>)