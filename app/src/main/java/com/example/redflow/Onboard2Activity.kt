package com.example.redflow

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Onboard2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard2)

        findViewById<ImageButton>(R.id.btnNext).setOnClickListener {
            startActivity(Intent(this, Onboard3Activity::class.java))
        }
        findViewById<TextView>(R.id.tvSkip).setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        }
    }
}
