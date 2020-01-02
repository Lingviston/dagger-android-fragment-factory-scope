package by.ve.demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.startDemoButton


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startDemoButton.setOnClickListener {
            val intent = Intent(this, MembersInjectionDemoActivity::class.java)
            startActivity(intent)
        }
    }
}