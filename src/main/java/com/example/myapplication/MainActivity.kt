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
import android.util.AttributeSet
import android.view.View
import android.widget.PopupWindow
import android.widget.RemoteViews
import android.widget.Toast
import androidx.core.graphics.toColor
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ComplexeProject.ComplexeView
import com.example.RecyclerView.Adapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.complexe.*
import java.security.KeyStore
import java.util.jar.Attributes


open  class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.getApplicationContext()

        setContentView(R.layout.complexe)
        val test = ComplexeView(this)
      // test.CustomLayout("ca marche ?",R.drawable.ic_brush_black,R.drawable.ic_audiotrack_black, Color.RED,Color.BLUE,Color.YELLOW,Color.WHITE)
        test.toasttest()
        test.ChangText("allllllez")




        //val exampleList = generateDummyList(500)

       // recycler_view.adapter = Adapter(exampleList,applicationContext)

       // recycler_view.layoutManager = LinearLayoutManager(this)

      //  recycler_view.setHasFixedSize(true)
    }







}
