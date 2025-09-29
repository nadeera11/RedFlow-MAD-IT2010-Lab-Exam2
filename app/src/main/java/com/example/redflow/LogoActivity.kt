package com.example.redflow

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class LogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logo)

        // Short hold then go to onboarding / sign in (change target if you want)
        window.decorView.postDelayed({
            startActivity(Intent(this, Onboard1Activity::class.java))
            finish()
        }, 1200)
    }
}
