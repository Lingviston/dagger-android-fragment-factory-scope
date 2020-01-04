package by.ve.demo.ui.constructorinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.ve.demo.R
import by.ve.demo.di.ScopedFragmentFactory
import by.ve.demo.di.dependencies.ActivityScopedDependency
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_fragments_demo.activityDependency
import kotlinx.android.synthetic.main.activity_fragments_demo.reinflate
import javax.inject.Inject


class ConstructorInjectionDemoActivity : AppCompatActivity() {

    @Inject
    lateinit var scopedFragmentFactory: ScopedFragmentFactory

    @Inject
    lateinit var activityScopedDependency: ActivityScopedDependency

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        supportFragmentManager.fragmentFactory = scopedFragmentFactory
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
            .replace(
                R.id.fragment1,
                scopedFragmentFactory.instantiate(
                    classLoader,
                    ConstructorInjectionFragment1::class.java.name
                )
            )
            .replace(
                R.id.fragment2,
                scopedFragmentFactory.instantiate(
                    classLoader,
                    ConstructorInjectionFragment2::class.java.name
                )
            )
            .commit()
    }
}