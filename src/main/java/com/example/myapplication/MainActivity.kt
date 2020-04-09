package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler_view.adapter = Adapter(exampleList )

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }
     private fun generateDummylist(size: Int): List<example>{
         val list = ArrayList<example>()

         for (i in 0 until size){
             val drawable = when (i % 3){
                 0 -> R.drawable.ic_android_black_
                 1 -> R.drawable.ic_audiotrack_black
                 else -> R.drawable.ic_brush_black
             }
             val item = example(drawable,"Item $i","Line 2")
             list += item
         }
         return list
     }
}
