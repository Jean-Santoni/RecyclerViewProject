package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Main2Activity  (private val exampleList: List<example>): AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
}
