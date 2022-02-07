package com.example.newsapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface NewsService {

    companion object {
        private const val API_KEY = "0Uly7kxXcOzyC0ANdX0UahhiFYy9vxtz5ixq0-pJ3j_ivNrb"
    }

    @Headers("Authorization:$API_KEY")
    @GET("latest-news?")

    fun getApi(): Call<NewsModel>

}