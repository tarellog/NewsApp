package com.example.newsapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.databinding.ItemNewsBinding

class ViewHolder(private val binding: ItemNewsBinding) : RecyclerView.ViewHolder(binding.root) {

    constructor(parent: ViewGroup) : this(
        ItemNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    fun populate(item: String, param: (NewsModel) -> Unit){
        binding.title.text = item
        binding.description.text = item

    }

}