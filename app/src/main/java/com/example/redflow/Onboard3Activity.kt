package com.example.redflow

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Onboard3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard3)

        findViewById<ImageButton>(R.id.btnNext).setOnClickListener {
            startActivity(Intent(this, WelcomeActivity::class.java))
            finish()
        }
        findViewById<TextView>(R.id.tvSkip).setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        }
    }
}
