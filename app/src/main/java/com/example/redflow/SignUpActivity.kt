package com.example.redflow

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // back
        findViewById<ImageButton>(R.id.btnBack).setOnClickListener { onBackPressedDispatcher.onBackPressed() }

        // primary sign up -> home (or wherever you want)
        findViewById<Button>(R.id.btnSignUp).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            finish()
        }

        // already have account -> sign in
        findViewById<TextView>(R.id.tvGoSignIn).setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
            finish()
        }

        // optional: social buttons (no functionality required for the lab)
        findViewById<Button>(R.id.btnFacebook).setOnClickListener { /* TODO: add auth */ }
        findViewById<Button>(R.id.btnGoogle).setOnClickListener { /* TODO: add auth */ }
    }
}