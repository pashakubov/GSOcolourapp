package com.example.godsstorycoloringapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import android.view.WindowManager
import android.os.Handler
import android.content.Intent
import android.util.Log
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

var testament = "new"
class thumbnail : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thumbnail)
        val backButton = findViewById<ImageButton>(R.id.imageButton1)
        backButton.setOnClickListener()
        {
            val intent = Intent(this, homescreen::class.java)
            startActivity(intent)
        }
        val OTButton = findViewById<Button>(R.id.button1)
        OTButton.setOnClickListener()
        {
            testament = "old"
        }
        val NTButton = findViewById<Button>(R.id.button2)
        NTButton.setOnClickListener()
        {
            testament = "new"
        }
    }
}