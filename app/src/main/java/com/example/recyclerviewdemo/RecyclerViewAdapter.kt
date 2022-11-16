package com.example.recyclerviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class RecyclerViewAdapter(private val context: Context, private val list: ArrayList<DataItem>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private val allList : ArrayList<DataItem> = ArrayList()

    init {
        allList.addAll(list)
        this.notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.view_item, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = allList[position]

        holder.textView.text = currentItem.title
        Glide.with(context).load(currentItem.url).into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return allList.size
    }
}