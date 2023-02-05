package com.app.random

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.app.random.databinding.ActivityCustomRandomBinding


class CustomRandom : AppCompatActivity() {

    private lateinit var binding : ActivityCustomRandomBinding
    private lateinit var list : ArrayList<Data>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomRandomBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        list = ArrayList()
        binding.recyclerView.adapter=ListAdapter(list)
        binding.recyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
        binding.addBtn.setOnClickListener {
            list.add(Data(binding.editText.text.toString()))
            Toast.makeText(this,"Added "+list[list.size-1].item,Toast.LENGTH_SHORT).show()
            binding.recyclerView.adapter=ListAdapter(list)
        }


        binding.getBtn.setOnClickListener {
            binding.show.text = list[(0 until list.size).random()].item
        }

    }
}