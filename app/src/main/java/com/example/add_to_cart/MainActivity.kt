package com.example.add_to_cart

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var list:ListView
    private lateinit var image:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = findViewById(R.id.listview)
        image = findViewById(R.id.imageView)
        var imagel = listOf(R.drawable.pizza,R.drawable.pasta,R.drawable.burger)
        var adapter = imageAdapter(this,imagel)
        list.adapter = adapter

        image.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}