package com.example.museudeartesdeharvard

import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Introduction_Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduction)

        val logo = findViewById<ImageView>(R.id.logoMuseum_introduction1)
        val text = findViewById<TextView>(R.id.temaMuseum_introduction1)
        val buttom = findViewById<Button>(R.id.bottom_entrar)

        val pulseAnimation: Animation =
            AnimationUtils.loadAnimation(this, R.anim.logo_animation)


        text.startAnimation(pulseAnimation)
        logo.startAnimation(pulseAnimation)
        buttom.startAnimation(pulseAnimation)

        buttom.setOnClickListener{

            val intent = Intent(
                this@Introduction_Activity,
                LoginActivity::class.java
            )
            startActivity(intent)
        }
    }
}