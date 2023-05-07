package com.example.datetime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.DateFormat
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var calendar = Calendar.getInstance().time
        val dateFormat =DateFormat.getDateInstance(DateFormat.FULL).format(calendar)
        val timeFormat = DateFormat.getTimeInstance().format(calendar)

        val dateTextView = findViewById<TextView>(R.id.datetv)
        val timeTextView = findViewById<TextView>(R.id.timetv)
        dateTextView.text =dateFormat
        timeTextView.text = timeFormat


    }
}