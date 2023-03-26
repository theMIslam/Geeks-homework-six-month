package com.example.lesson4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.lesson4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding
    // private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.btnCounter.setOnClickListener {
            viewModel.onIncrementClick()
            // counter++
                // binding.tvCounter.text = counter.toString()
        }

        viewModel.mCounter.observe(this) {
            binding.tvCounter.text = it.toString()
        }
    }
}