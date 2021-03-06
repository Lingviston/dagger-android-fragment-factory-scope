package by.ve.demo.ui.constructorinjection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import by.ve.demo.R
import by.ve.demo.di.dependencies.PrintableDependency
import kotlinx.android.synthetic.main.fragment_dependencies.dependenciesView
import kotlinx.android.synthetic.main.fragment_dependencies.fragmentName
import javax.inject.Inject


class ConstructorInjectionFragment1 @Inject constructor(
    private val dependencies: Set<@JvmSuppressWildcards PrintableDependency>
) : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_dependencies, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentName.text = javaClass.simpleName
        dependenciesView.text = dependencies.map { it.describe() }.sorted().joinToString(
            separator = "\n"
        )
    }
}