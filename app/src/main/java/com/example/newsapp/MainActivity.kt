package com.example.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.newsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //    Create binding
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding ?: throw NullPointerException("Binding is not initialized")

    //
    private val dsgds: ResponseFun = ResponseRepository(this::repositoryCallback)
    val adapter: NewsAdapter = NewsAdapter(this::adapterCallback)

    //    callback viewHolder
    fun adapterCallback(param: NewsContent) {
        val intent = Intent(baseContext, SecondActivity::class.java)
        intent.putExtra("key", param)
        startActivity(intent)
    }

    //    callback Repository
    fun repositoryCallback(model: NewsModel) {
        adapter.setLists(model.news)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.adapter = adapter
        dsgds.apiModel()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}

