package com.example.newsapp

import com.google.gson.annotations.SerializedName

data class NewsContent(
    @SerializedName("author")
    val author: String,
    @SerializedName("category")
    val category: List<String>,
    @SerializedName("description")
    val description: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("language")
    val language: String,
    @SerializedName("published")
    val published: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String
)
