package com.example.museudeartesdeharvard

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Cadastro_Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val logo = findViewById<ImageView>(R.id.image_logo)

        val pulseAnimation: Animation =
            AnimationUtils.loadAnimation(this, R.anim.logo_animation)

        logo.startAnimation(pulseAnimation)
    }
}