package com.example.homework6_4.counter.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
var count = 0
var plus = ""
    val _counter = MutableLiveData<String>()

    val _operations = MutableLiveData<String>()


    fun increment() {
        count++
        _counter.value = count.toString()
        plus = "\n +$plus"
        _operations.value = plus    }

    fun decrement() {
        count--
        _counter.value = count.toString()
        plus = "\n - $plus "
        _operations.value = plus
    }
}
