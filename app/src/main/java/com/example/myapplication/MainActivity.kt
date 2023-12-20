package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<TestView>(R.id.testView)

        findViewById<Button>(R.id.button).setOnClickListener {
            view.setNumber(2)
        }

        findViewById<Button>(R.id.button2).setOnClickListener {
            view.setNumber(1)
        }
    }
}