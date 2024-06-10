package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val main = findViewById<Button>(R.id.main)
        val exit = findViewById<Button>(R.id.exit)
        main.setOnClickListener {
            val intents = Intent(this,MainActivity::class.java)
            startActivity(intents)
        }
        exit.setOnClickListener {
            finish()
        }


    }
}