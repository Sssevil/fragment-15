package com.example.homework15

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

abstract class BaseClass:AppCompatActivity() {
    protected fun setupUrls(){
        Toast.makeText(this,"Вы открыли браузер", Toast.LENGTH_LONG).show()
    }

    protected fun setupNumber(){
        Toast.makeText(this,"Вы открыли набор номера", Toast.LENGTH_LONG).show()
    }















}