package com.example.add_to_cart

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ChartActivity : AppCompatActivity() {

    private lateinit var list: ListView
    private lateinit var imageAdapter: imageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart)

        list = findViewById(R.id.list)

        // Assuming you have a list of image resources or URLs


        // Set click listener to a button or any view to display selected images
        val showSelectedButton: Button = findViewById(R.id.showSelectedButton)
        showSelectedButton.setOnClickListener {
            // Get selected images from the adapter
            val selectedImages = imageAdapter.getSelectedImages()

            // Create an adapter for the selected images ListView
            val selectedImagesAdapter = ArrayAdapter<Int>(this, android.R.layout.simple_list_item_1, selectedImages)

            // Set the adapter to the ListView
            list.adapter = selectedImagesAdapter
        }
    }
}
