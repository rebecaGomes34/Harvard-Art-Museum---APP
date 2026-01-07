package com.example.museudeartesdeharvard

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val textTema= findViewById<TextView>(R.id.tema)
        val imageLogo= findViewById<ImageView>(R.id.logo)

        val topAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        val bottomAnimation:Animation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        bottomAnimation.startOffset = 800
        textTema.startAnimation(bottomAnimation)
        imageLogo.startAnimation(bottomAnimation)

        Handler(Looper.getMainLooper()).postDelayed({

            val intent = Intent(this, Introduction_Activity::class.java)

            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in_animation,
                R.anim.fade_out_animation
            )

            startActivity(intent, options.toBundle())
            finish()

            }, 3300)

    }
}