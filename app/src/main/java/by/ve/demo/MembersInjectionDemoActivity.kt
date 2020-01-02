package by.ve.demo

import android.os.Bundle
import by.ve.demo.di.dependencies.ActivityScopedDependency
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_fragments_demo.activityDependency
import javax.inject.Inject


class MembersInjectionDemoActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var activityScopedDependency: ActivityScopedDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragments_demo)

        activityDependency.text = activityScopedDependency.describe()

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment1, MembersInjectionFragment())
                .replace(R.id.fragment2, MembersInjectionFragment())
                .commit()
        }
    }
}