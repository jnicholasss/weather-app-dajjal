package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val myTextView = findViewById<TextView>(R.id.textView)
            val myButton = findViewById<Button>(R.id.myButton)

            myButton.setOnClickListener {
                myTextView.text = "Button Clicked"
        }
    }}




