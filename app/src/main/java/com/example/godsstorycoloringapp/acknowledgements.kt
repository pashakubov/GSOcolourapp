package com.example.godsstorycoloringapp

import android.R.attr
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import android.view.WindowManager
import android.os.Handler
import android.content.Intent
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import android.R.attr.bitmap
import android.graphics.*

import android.graphics.drawable.BitmapDrawable

import android.graphics.drawable.Drawable
import android.view.MotionEvent
import android.R.attr.path





class acknowledgements : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acknowledgements)
        draw()
        val backButton = findViewById<ImageButton>(R.id.imageButton1)
        backButton.setOnClickListener()
        {
            val intent = Intent(this, homescreen::class.java)
            startActivity(intent)
        }

    }
    fun draw(pt: Point){
        val options = BitmapFactory.Options()
        options.inMutable = true
        var bit = BitmapFactory.decodeResource(resources,R.drawable.testing2, options)
        var img = findViewById<ImageView>(R.id.imageView6)
        img.setImageBitmap(bit)
        var ting = javaTester(this, R.drawable.testing2)
        bit = ting.floodFill(bit,pt, Color.WHITE, Color.BLUE )
    }
    fun draw(){
        val options = BitmapFactory.Options()
        options.inMutable = true
        var bit = BitmapFactory.decodeResource(resources,R.drawable.testing2, options)
        var img = findViewById<ImageView>(R.id.imageView6)
        img.setImageBitmap(bit)
        var ting = javaTester(this, R.drawable.testing2)
    }
    override fun onTouchEvent(event: MotionEvent): Boolean {
        val pointX = event.x
        val pointY = event.y
        draw(Point(pointX.toInt(), pointY.toInt()))

        return false
    }
}