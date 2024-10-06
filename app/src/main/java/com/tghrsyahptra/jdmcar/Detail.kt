package com.tghrsyahptra.jdmcar

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class Detail : AppCompatActivity() {

    companion object {
        const val EXTRA_HERO = "EXTRA_HERO"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Menerima data Hero dari Intent
        val hero = intent.getParcelableExtra<Hero>(EXTRA_HERO)

        // Menampilkan data Hero
        hero?.let {
            // Mengambil referensi ke elemen UI
            val imgHero: ImageView = findViewById(R.id.hero_image)
            val tvHeroName: TextView = findViewById(R.id.hero_name)
            val tvHeroDescription: TextView = findViewById(R.id.data_description)

            // Mengatur data ke elemen UI
            // Mengatur data ke elemen UI dengan Glide untuk menampilkan foto
            Glide.with(this)
                .load(it.photo) // Menampilkan foto menggunakan Glide
                .into(imgHero)
            tvHeroName.text = it.name // Menampilkan nama
            tvHeroDescription.text = it.description // Menampilkan deskripsi
        }
    }
}