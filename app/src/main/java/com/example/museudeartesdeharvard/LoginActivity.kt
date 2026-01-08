package com.example.museudeartesdeharvard

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val titleLogin = findViewById<TextView>(R.id.textLogin)
        val textEmail = findViewById<TextView>(R.id.textEmail)
        val textSenha = findViewById<TextView>(R.id.textSenha)
        val textForgotPassword = findViewById<TextView>(R.id.textForgotPassword)
        val textGoToRegister = findViewById<TextView>(R.id.textGoToRegister)

        val inputEmail = findViewById<androidx.appcompat.widget.AppCompatEditText>(R.id.editText_Email)
        val inputSenha = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.layout_editText_Senha)

        val buttonLogin = findViewById<Button>(R.id.buttom_fazerLogin)

        val animation: Animation =
            AnimationUtils.loadAnimation(this, R.anim.logo_animation)

        titleLogin.startAnimation(animation)
        textEmail.startAnimation(animation)
        inputEmail.startAnimation(animation)
        textSenha.startAnimation(animation)
        inputSenha.startAnimation(animation)
        textForgotPassword.startAnimation(animation)
        textGoToRegister.startAnimation(animation)
        buttonLogin.startAnimation(animation)

        textGoToRegister.setOnClickListener {
            val intent = Intent(this, CadastroActivity::class.java)

            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in_animation,
                R.anim.fade_out_animation
            )

            startActivity(intent, options.toBundle())
        }

        textForgotPassword.setOnClickListener{
            val intent = Intent(this, RedefinirSenha_Activity::class.java)

            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in_animation,
                R.anim.fade_out_animation
            )
            startActivity(intent, options.toBundle())
        }
    }
}