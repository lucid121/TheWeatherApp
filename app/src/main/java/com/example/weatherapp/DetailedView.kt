package com.example.weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class DetailedView  : AppCompatActivity() {

    private val days = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    private val minTemps = arrayOf(10, 12, 15, 17, 11, 9, 10)
    private val maxTemps = arrayOf(16, 25, 29, 28, 17, 14, 18)
    private val weatherConditions = arrayOf("Cold", "Sunny", "Sunny", "Sunny", "Raining", "Raining", "Raining")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        val detailListView: ListView = findViewById(R.id.detailListView)
        val backButton: Button = findViewById(R.id.backButton)

        val details = Array(days.size) { i ->
            "${days[i]}: Min ${minTemps[i]}°C, Max ${maxTemps[i]}°C, ${weatherConditions[i]}"
        }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, details)
        detailListView.adapter = adapter

        backButton.setOnClickListener {
            finish()
        }
    }
}