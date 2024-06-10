package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val minTemps = arrayOf(10, 12, 15, 17, 11, 9, 10)
    private val maxTemps = arrayOf(16, 25, 29, 28, 17, 14, 18)
    private val weatherConditions = arrayOf("Cold", "Sunny", "Sunny", "Sunny", "Raining", "Raining", "Raining")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val averagetemp: TextView = findViewById(R.id.averageTempTextView)
        val viewdetail: Button = findViewById(R.id.viewDetailsButton)
        val clear: Button = findViewById(R.id.clearDataButton)
        val exitAppButton: Button = findViewById(R.id.exitAppButton)

        val averageTemp = calculateAverageTemperature()
        averagetemp.text = "Average Temperature: $averageTemp°C"

        viewdetail.setOnClickListener {
            val intent = Intent(this, DetailedView::class.java)
            startActivity(intent)
        }

        clear.setOnClickListener {
            averagetemp.text = "Average Temperature: "
        }

        exitAppButton.setOnClickListener {
            finish()
        }
    }
    private fun calculateAverageTemperature(): Double {
        val totalmin = minTemps.sum()
        val totalmax = maxTemps.sum()
        return (totalmin + totalmax / (minTemps.size + maxTemps.size).toDouble())
    }
}

