package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.enemple_test.view.*

class Adapter (private val exampleList: List<example>): RecyclerView.Adapter<Adapter.ViewHolder>(){
    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.image_view
        val textView1 : TextView = itemView.text_1
        val textView2 : TextView = itemView.text2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.enemple_test,parent,false)
        return ViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val currentitem = exampleList[position]
            holder.imageView.setImageResource(currentitem.ImageRessource)
            holder.textView1.text = currentitem.text1
            holder.textView2.text = currentitem.text2


         }

    override fun getItemCount() = exampleList.size
}


