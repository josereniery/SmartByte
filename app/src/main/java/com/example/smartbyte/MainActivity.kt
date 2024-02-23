package com.example.smartbyte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.ImageButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonClick = findViewById<ImageButton>(R.id.category_button)
        buttonClick.setOnClickListener {
            val intent = Intent(this, Category::class.java)
            startActivity(intent)
            val buttonClick = findViewById<ImageButton>(R.id.random_button)
            buttonClick.setOnClickListener {
                val intent = Intent(this, Random::class.java)
                startActivity(intent)
            }
        }
    }
}

