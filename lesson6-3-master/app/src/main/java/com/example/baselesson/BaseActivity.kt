package com.example.baselesson

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.example.baselesson.databinding.ActivityMainBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    private lateinit var binding: VB
    abstract fun inflateViewBinding(): VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflateViewBinding()
        setContentView(binding.root)

        isConnection()
        initViewModel()
        initView()
        initListener()
    }
    abstract fun initViewModel()

    abstract fun isConnection()

    abstract fun initView()

    abstract fun initListener()
}