package com.app.random

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.app.random.databinding.ActivityRandomNumberBinding

class RandomNumber : AppCompatActivity() {

    private lateinit var binding : ActivityRandomNumberBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRandomNumberBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.get.setOnClickListener {
            try {
                binding.showNumber.text =
                    (Integer.parseInt(binding.min.text.toString())..Integer.parseInt(binding.max.text.toString())).random()
                        .toString()
            }
            catch(e : NumberFormatException){
                 Toast.makeText(this,"Enter valid numbers!",Toast.LENGTH_SHORT).show()
            }
            catch(e : Exception){
                Toast.makeText(this,"Values too large!",Toast.LENGTH_SHORT).show()
            }
        }
    }
}