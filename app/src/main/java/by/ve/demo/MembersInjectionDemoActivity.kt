package by.ve.demo

import android.os.Bundle
import by.ve.demo.di.dependencies.ActivityScopedDependency
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_fragments_demo.activityDependency
import kotlinx.android.synthetic.main.activity_fragments_demo.reinflate
import javax.inject.Inject


class MembersInjectionDemoActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var activityScopedDependency: ActivityScopedDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragments_demo)

        activityDependency.text = activityScopedDependency.describe()

        reinflate.setOnClickListener {
            inflateFragments()
        }

        if (savedInstanceState == null) {
            inflateFragments()
        }
    }

    private fun inflateFragments() {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment1, MembersInjectionFragment())
            .replace(R.id.fragment2, MembersInjectionFragment())
            .commit()
    }
}