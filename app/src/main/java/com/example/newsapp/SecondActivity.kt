package com.example.newsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.newsapp.databinding.ActivitySecondBinding
import com.squareup.picasso.Picasso
import java.io.Serializable

class SecondActivity : AppCompatActivity() {

    private var _binding: ActivitySecondBinding? = null
    private val binding get() = _binding ?: throw NullPointerException("Not initialized")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        val newsContent = intent.getSerializableExtra("key") as NewsContent
        binding.viewTitle.text = newsContent.title
        Picasso.get()
            .load(newsContent.image)
            .into(binding.viewImg)
        binding.viewDescription.text = newsContent.description
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}