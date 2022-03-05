package com.example.godsstorycoloringapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import android.view.WindowManager
import android.os.Handler
import android.content.Intent
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class homescreen : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)
        val bibleButton = findViewById<ImageButton>(R.id.imageButton1)
        bibleButton.setOnClickListener()
        {
            val intent = Intent(this, just_audio::class.java)
            startActivity(intent)
        }
        val writerButton = findViewById<ImageButton>(R.id.imageButton2)
        writerButton.setOnClickListener()
        {
            val intent = Intent(this, acknowledgements::class.java)
            startActivity(intent)
        }
        val colorButton = findViewById<Button>(R.id.button)
        colorButton.setOnClickListener()
        {
            val intent = Intent(this, thumbnail::class.java)
            startActivity(intent)
        }
    }
}