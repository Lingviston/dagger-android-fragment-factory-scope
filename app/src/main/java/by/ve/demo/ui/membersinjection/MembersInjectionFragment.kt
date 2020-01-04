package by.ve.demo.ui.membersinjection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import by.ve.demo.R
import by.ve.demo.di.dependencies.PrintableDependency
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.fragment_dependencies.dependenciesView
import kotlinx.android.synthetic.main.fragment_dependencies.fragmentName
import javax.inject.Inject


class MembersInjectionFragment : DaggerFragment() {

    @Inject
    lateinit var dependencies: Set<@JvmSuppressWildcards PrintableDependency>

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