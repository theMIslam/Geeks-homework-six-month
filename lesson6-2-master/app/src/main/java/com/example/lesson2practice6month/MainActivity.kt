package com.example.lesson2practice6month

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.lesson2practice6month.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val data = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAdd.setOnClickListener { addData() }
        binding.printButton.setOnClickListener { printData() }
    }

    private fun addData() {
        val input = binding.etText.text.toString()
        if (input.isNotBlank()) {
            data.add(input)
            binding.etText.text.clear()
            Toast.makeText(this, "Added: $input", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please enter some text", Toast.LENGTH_SHORT).show()
        }
    }

    private fun printData() {
        binding.tvPrint.text = data.joinToString("\n")
    }
}
