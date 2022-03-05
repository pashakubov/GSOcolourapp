package com.example.godsstorycoloringapp

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class adnyam_audio_list : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    private lateinit var mPlay: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adnyam_audio_list)

        setContentView(R.layout.activity_adnyam_audio_list)
        mediaPlayer = MediaPlayer.create(this, R.raw.forgive)

        mPlay = findViewById(R.id.audio1)
        mPlay.setOnClickListener({
                mediaPlayer.start()
        });

    }
}