package com.example.museudeartesdeharvard

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

        // Inputs
        val inputEmail = findViewById<androidx.appcompat.widget.AppCompatEditText>(R.id.editText_Email)
        val inputSenha = findViewById<com.google.android.material.textfield.TextInputEditText>(R.id.editTextSenha)

        // Button
        val buttonLogin = findViewById<Button>(R.id.buttom_fazerLogin)

        // Animação (mesma da introduction)
        val animation: Animation =
            AnimationUtils.loadAnimation(this, R.anim.logo_animation)

        // Aplicando animação em todos
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
            startActivity(intent)
        }

    }
}