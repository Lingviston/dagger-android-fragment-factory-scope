package by.ve.demo

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity


class MembersInjectionDemoActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo_members_injection)
    }
}