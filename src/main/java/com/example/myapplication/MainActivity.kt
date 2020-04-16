package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

open  class MainActivity : AppCompatActivity() {

    override fun getApplicationContext(): Context {
        return super.getApplicationContext()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.getApplicationContext()
        setContentView(R.layout.activity_main)


        val exampleList = generateDummyList(500)

        recycler_view.adapter = Adapter(exampleList,applicationContext)

        recycler_view.layoutManager = LinearLayoutManager(this)

        recycler_view.setHasFixedSize(true)
    }
     private fun generateDummyList(size: Int): List<example>{
         val list = ArrayList<example>()

         for (i in 0 until size){
            // val drawable = when (i % 3){
             //    0 -> R.drawable.ic_android_black_
            //     1 -> R.drawable.ic_audiotrack_black
            //     else -> R.drawable.ic_brush_black
             //}
             val item = example("Item $i")
             list += item
         }
         return list
     }

}
