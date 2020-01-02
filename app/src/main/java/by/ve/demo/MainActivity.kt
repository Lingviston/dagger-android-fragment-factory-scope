package by.ve.demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.startConstructorInjectionDemoButton
import kotlinx.android.synthetic.main.activity_main.startMembersInjectionDemoButton


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startMembersInjectionDemoButton.setOnClickListener {
            val intent = Intent(this, MembersInjectionDemoActivity::class.java)
            startActivity(intent)
        }

        startConstructorInjectionDemoButton.setOnClickListener {
            val intent = Intent(this, ConstructorInjectionDemoActivity::class.java)
            startActivity(intent)
        }
    }
}