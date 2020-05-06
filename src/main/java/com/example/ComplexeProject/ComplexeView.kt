package com.example.ComplexeProject

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.myapplication.R
import kotlinx.android.synthetic.main.complexe.*
import kotlinx.android.synthetic.main.complexe.view.*
import kotlinx.android.synthetic.main.exemple_test.view.*
import kotlinx.android.synthetic.main.result.view.*

open class ComplexeView(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : RelativeLayout(context, attrs, defStyleAttr) {

        private val LayoutID = R.layout.complexe

        constructor(context: Context?,attrs: AttributeSet?):this(context,attrs,0)
        constructor(context: Context?):this(context,null)
    init {
           LayoutInflater.from(context).inflate(LayoutID,this,true)

        }
        fun toasttest(){
            Toast.makeText(context,"ca marchd ,",Toast.LENGTH_SHORT).show()
        }
        fun ChangText(text : String?){
            txtmain.setText(text ?:"")


        }




    fun CustomLayout(newText : String,newImage1 : Int,newImage2: Int,newTextColor : Int,newLeftColor : Int,newRightColor : Int, newBckColor : Int){
        /* Function who can change every element of the view and delete it*/
        
        txtmain.text=newText
        txtmain.setTextColor(newTextColor)
        imgleft.setImageResource(newImage1)
        imgleft.setColorFilter(newRightColor)
        imgright.setColorFilter(newLeftColor)
        imgright.setImageResource(newImage2)
        txtmain.setOnClickListener {
            Toast.makeText(context,"Texte cliqué", Toast.LENGTH_SHORT).show()

        }
        imgleft.setOnClickListener {
            Toast.makeText(context,"gauche cliqué", Toast.LENGTH_SHORT).show()
            cplxall.removeView(imgleft)

        }
        imgright.setOnClickListener {
            Toast.makeText(context,"droite cliqué", Toast.LENGTH_SHORT).show()
            cplxall.removeAllViews()

        }
        cardview.setOnClickListener {
            Toast.makeText(context,"carte cliqué", Toast.LENGTH_SHORT).show()

        }}


    }
