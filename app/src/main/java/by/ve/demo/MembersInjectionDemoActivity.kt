package by.ve.demo

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity


class MembersInjectionDemoActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragments_demo)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment1, MembersInjectionFragment())
                .replace(R.id.fragment2, MembersInjectionFragment())
                .commit()
        }
    }
}