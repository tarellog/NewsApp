package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newsapp.databinding.ActivityMainBinding
import com.example.newsapp.databinding.ItemNewsBinding

class MainActivity : AppCompatActivity() {

//    Create binding
    private var _binding:ActivityMainBinding? = null
    private val binding
    get() = _binding?:throw NullPointerException("Binding is not initialized")
//
    private val dsgds: ResponseFun = ResponseRepository(this::repositoryCallback)
    val adapter: NewsAdapter = NewsAdapter(this::adapterCallback)

//    callback
    fun adapterCallback(param: NewsModel){

    }

//    callback Repository
    fun repositoryCallback(callback: NewsModel){

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.adapter = adapter
        dsgds.ApiModel()
    }

    override fun onStart() {
        super.onStart()


    }
}

