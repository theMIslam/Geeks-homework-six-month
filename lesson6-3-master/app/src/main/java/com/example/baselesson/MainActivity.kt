package com.example.baselesson

import android.view.LayoutInflater
import com.example.baselesson.databinding.ActivityMainBinding
import java.util.zip.Inflater


class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun inflateViewBinding(inflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initView() {
        super.initView
    }
}