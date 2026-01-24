package com.example.app_1_belchenko_dolgov

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app_1_belchenko_dolgov.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupButtonClickListener()
    }

    private fun setupButtonClickListener() {
        binding.button.setOnClickListener {

            val randomNumber = Random.nextInt(1, 7)


            val resultText = getString(R.string.dice_result_format, randomNumber)
            binding.label.text = resultText
        }
    }
}