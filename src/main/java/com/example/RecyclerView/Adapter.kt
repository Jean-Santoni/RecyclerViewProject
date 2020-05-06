package com.example.RecyclerView

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

import kotlinx.android.synthetic.main.result.view.*

class Adapter (private val exampleList: List<exempleRecyclerView>, val context: Context): RecyclerView.Adapter<Adapter.ViewHolder>() {

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
        //holder.textView2.text = " valeur "+currentItem
        //  holder.textView2.text = currentItem.text2
        holder.textView1.setOnClickListener{

            //Toast.makeText(context,"Click listener "+currentItem.toString(), Toast.LENGTH_SHORT).show()
            val intent = Intent(context, Screen2:: class.java)

            intent.putExtra("valeur",currentItem.text1)

            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)

        }
    }

    override fun getItemCount() = exampleList.size



}


