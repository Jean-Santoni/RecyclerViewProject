package com.example.myapplication

import android.content.Context
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.drawable.AnimatedImageDrawable
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.graphics.toColor
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.complexe.*

open  class MainActivity : AppCompatActivity() {

    override fun getApplicationContext(): Context {
        return super.getApplicationContext()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.getApplicationContext()
        setContentView(R.layout.complexe)
        CustomLayout("ca marche ?",R.drawable.ic_brush_black,R.drawable.ic_audiotrack_black, Color.RED,Color.BLUE,Color.YELLOW,Color.BLACK)


        //val exampleList = generateDummyList(500)

       // recycler_view.adapter = Adapter(exampleList,applicationContext)

       // recycler_view.layoutManager = LinearLayoutManager(this)

      //  recycler_view.setHasFixedSize(true)
    }
    private fun CustomLayout(newText : String,newImage1 : Int,newImage2: Int,newTextColor : Int,newLeftColor : Int,newRightColor : Int, newBckColor : Int){
        txtmain.text=newText
        cplxall.setBackgroundColor(newBckColor)
        txtmain.setTextColor(newTextColor)
        imgleft.setImageResource(newImage1)
        imgleft.setColorFilter(newRightColor)
        imgright.setColorFilter(newLeftColor)
        imgright.setImageResource(newImage2)




    }
     //private fun generateDummyList(size: Int): List<example>{
        // val list = ArrayList<example>()

       //  for (i in 0 until size){
            // val drawable = when (i % 3){
             //    0 -> R.drawable.ic_android_black_
            //     1 -> R.drawable.ic_audiotrack_black
            //     else -> R.drawable.ic_brush_black
             //}
            // val item = example("Item $i","Item $i")
           //  list += item
       //  }
        // return list
     //}

}
