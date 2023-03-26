package com.example.lesson4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private var counter = 0
    val mCounter = MutableLiveData<Int>()

    fun  onIncrementClick() {
        counter++
        mCounter.value = counter
    }
}