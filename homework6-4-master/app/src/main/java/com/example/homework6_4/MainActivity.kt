package com.example.homework6_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.homework6_4.buttons.ButtonsFragment
import com.example.homework6_4.counter.CounterFragment
import com.example.homework6_4.databinding.ActivityMainBinding
import com.example.homework6_4.operations.OperationsFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var adapter: com.example.homework6_4.adapter.PagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter = com.example.homework6_4.adapter.PagerAdapter(this)
        binding.viewPager.adapter = adapter
    }
}
