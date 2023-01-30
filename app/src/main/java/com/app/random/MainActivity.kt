package com.app.random

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.random.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.number.setOnClickListener {
                val intent = Intent(this,RandomNumber::class.java)
                startActivity(intent)
        }

        binding.custom.setOnClickListener {
            val intent = Intent(this,CustomRandom::class.java)
            startActivity(intent)
        }
    }
}