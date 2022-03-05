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

class just_audio : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.just_audio)
        val backButton = findViewById<ImageButton>(R.id.imageButton1)
        backButton.setOnClickListener()
        {
            val intent = Intent(this, homescreen::class.java)
            startActivity(intent)
        }

        val langBtnOne = findViewById<Button>(R.id.button5)
        langBtnOne.setOnClickListener(){
            val intent = Intent(this, adnyam_audio_list::class.java)
            startActivity(intent)
        }

        val langBtnTwo = findViewById<Button>(R.id.button6)
        langBtnTwo.setOnClickListener(){
            val intent = Intent(this, burrara_audio_list::class.java)
            startActivity(intent)
        }

        val langBtnThree = findViewById<Button>(R.id.button7)
        langBtnThree.setOnClickListener(){
            val intent = Intent(this, murrin_audio_list::class.java)
            startActivity(intent)
        }

        val langBtnFour = findViewById<Button>(R.id.button8)
        langBtnFour.setOnClickListener(){
            val intent = Intent(this, pitjan_audio_list::class.java)
            startActivity(intent)
        }

    }
}