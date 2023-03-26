package com.example.lesoononesixmonth

import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import coil.load
import com.bumptech.glide.Glide
import com.example.lesoononesixmonth.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val listUrl = arrayListOf(
        "https://img1.akspic.ru/previews/1/4/7/1/7/171741/171741-melodramaticheskij-noch-nizkij_ugol_vystrel-didzhej_nial_rmx-4_sekavan_h_aki_aki_remiks-x750.jpg",
        "https://img2.akspic.ru/previews/1/4/5/1/7/171541/171541-noch-zvezda-android-atmosfera-zelenyj-x750.jpg",
        "https://img3.akspic.ru/previews/6/0/7/6/6/166706/166706-priroda-voda-oblako-atmosfera-svet-x750.jpg",
        "https://img3.akspic.ru/previews/1/0/5/6/6/166501/166501-mikael_gustafsson_malenkaya_pamyat-oblako-rastenie-atmosfera-voda-x750.jpg"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListeners()

        binding.imageView
        binding.editText
        binding.submitButton
        binding.randomButton
    }
    private fun initListeners() {
        binding.submitButton.setOnClickListener {
            if (binding.editText.text.isNullOrEmpty() && Patterns.WEB_URL.matcher(binding.editText.text.toString()).matches()){
                listUrl.add(binding.editText.text.toString())
                binding.editText.text.clear()
            }
        }
        binding.randomButton.setOnClickListener {
            binding.imageView.load(listUrl.random())
        }
    }
}