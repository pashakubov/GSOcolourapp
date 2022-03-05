package com.example.godsstorycoloringapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

var language:String = ""
class chooseLanguage : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.choose_language)
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        button1.setOnClickListener()
        {
            language = "Adnyamathanha"
            val intent = Intent(this, homescreen::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener()
        {
            language = "Burarra"
            val intent = Intent(this, homescreen::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener()
        {
            language = "Murrinhpatha"
            val intent = Intent(this, homescreen::class.java)
            startActivity(intent)
        }
        button4.setOnClickListener()
        {
            language = "Pitjantjatjara"
            val intent = Intent(this, homescreen::class.java)
            startActivity(intent)
        }

    }
}