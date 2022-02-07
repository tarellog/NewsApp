package com.example.newsapp

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NewsAdapter(private val param:(NewsModel)->Unit):RecyclerView.Adapter<ViewHolder>() {

    lateinit var list: List<String>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.populate(list[position], param)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setLists(getList: List<String>){
        list = getList
        notifyDataSetChanged()
    }

}