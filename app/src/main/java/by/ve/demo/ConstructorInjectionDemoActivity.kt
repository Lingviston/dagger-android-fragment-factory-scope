package by.ve.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dagger.android.AndroidInjection
import javax.inject.Inject


class ConstructorInjectionDemoActivity : AppCompatActivity() {

    @Inject
    lateinit var scopedFragmentFactory: ScopedFragmentFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        supportFragmentManager.fragmentFactory = scopedFragmentFactory
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragments_demo)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.fragment1,
                    scopedFragmentFactory.instantiate(
                        classLoader,
                        ConstructorInjectionFragment::class.java.name
                    )
                )
                .replace(
                    R.id.fragment2,
                    scopedFragmentFactory.instantiate(
                        classLoader,
                        ConstructorInjectionFragment::class.java.name
                    )
                )
                .commit()
        }
    }
}