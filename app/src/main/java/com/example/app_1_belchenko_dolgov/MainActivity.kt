package com.example.app_1_belchenko_dolgov

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)


        val label: TextView = findViewById(R.id.label)
        val button: Button = findViewById(R.id.button)


        button.setOnClickListener {

            val randomNumber = Random.nextInt(1, 7)


            label.text = randomNumber.toString()
        }
    }
}