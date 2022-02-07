package com.example.newsapp

import com.google.gson.annotations.SerializedName

data class NewsModel(
    @SerializedName("page")
    val page: Int,
    @SerializedName("status")
    val status: String,
    @SerializedName("news")
    val news: List<NewsContent>
)
