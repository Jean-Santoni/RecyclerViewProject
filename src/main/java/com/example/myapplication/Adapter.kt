package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.content.Intent
import android.view.Display
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.enemple_test.view.*
import kotlinx.android.synthetic.main.result.view.*
import java.security.AccessController.getContext
import kotlin.coroutines.coroutineContext
class Adapter (private val exampleList: List<example>,val context: Context,val ClikListener : (example)-> Unit): RecyclerView.Adapter<Adapter.ViewHolder>() {

   inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

            //val imageView : ImageView = itemView.image_view
            val textView1 : TextView = itemView.textbutton
            //  val textView2 : TextView = itemView.text2
       

    }

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.result,parent,false)
        return ViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = exampleList[position]


        //holder.imageView.setImageResource(currentItem.ImageRessource)
        holder.textView1.text = currentItem.text1

        //  holder.textView2.text = currentItem.text2
        holder.textView1.setOnClickListener{
            Toast.makeText(context,"Click listener", Toast.LENGTH_SHORT).show()


        }
    }

    override fun getItemCount() = exampleList.size


}


