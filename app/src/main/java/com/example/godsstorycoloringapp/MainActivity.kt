package com.example.godsstorycoloringapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import android.content.Intent
import android.media.MediaPlayer
import android.media.SoundPool

import android.os.Handler
import android.view.WindowManager
import com.example.godsstorycoloringapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        var test:javaTester = javaTester(this)
//        setContentView(test)
        setContentView(R.layout.splash_screen)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        Handler().postDelayed({
            val intent = Intent(this, chooseLanguage::class.java)
            startActivity(intent)
            finish()
        }, 5000)


    }

}