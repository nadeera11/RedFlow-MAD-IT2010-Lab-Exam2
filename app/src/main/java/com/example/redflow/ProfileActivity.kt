package com.example.redflow

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import com.google.android.material.bottomnavigation.BottomNavigationView

class ProfileActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)

        val signOutButton = findViewById<Button>(R.id.signOutButton)

// Setup bottom navigation for ProfileActivity
        setupBottomNav()

        signOutButton.setOnClickListener {
            // Handle sign out
            val intent = Intent(this, LogoActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun setupBottomNav() {
        val nav = findViewById<BottomNavigationView>(R.id.bottomNav)
        nav.selectedItemId = R.id.nav_profile // Highlight the profile item

        nav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> {
                    // Navigate to HomeActivity
                    val intent = Intent(this, HomeActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_notification -> {
                    // Navigate to HomeActivity
                    val intent = Intent(this, NotificationActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_inbox -> {
                    // Navigate to HomeActivity
                    val intent = Intent(this, InboxActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.nav_profile -> {
                    // Already on profile page, do nothing
                    true
                }
                else -> false
            }
        }
    }
}