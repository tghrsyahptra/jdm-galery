package com.tghrsyahptra.jdmcar

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Menghilangkan ActionBar hanya di About Activity
        supportActionBar?.hide()
        setContentView(R.layout.activity_about)  // Mengaitkan layout activity_about.xml
    }
}