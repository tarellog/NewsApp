package com.example.newsapp

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ResponseRepository(private val callback:(NewsModel)->Unit) : ResponseFun {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.currentsapi.services/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val api: NewsService = retrofit.create(NewsService::class.java)

    private val responCallback = object : Callback<NewsModel> {
        override fun onResponse(call: Call<NewsModel>?, response: Response<NewsModel>?) {
//            Log.d("lox", response?.body().toString())
//            response?.body().toString()
            callback(response?.body().toString())
        }

        override fun onFailure(call: Call<NewsModel>?, t: Throwable?) {
            Log.e("lox", t.toString())
        }

    }

    override fun ApiModel() {
        api.getApi().enqueue(responCallback)
    }

}


