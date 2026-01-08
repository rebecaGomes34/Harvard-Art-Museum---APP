package com.example.museudeartesdeharvard.view

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.museudeartesdeharvard.R
import com.example.museudeartesdeharvard.service.ValidationService
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val titleLogin = findViewById<TextView>(R.id.textLogin)
        val textEmail = findViewById<TextView>(R.id.textEmail)
        val textSenha = findViewById<TextView>(R.id.textSenha)
        val textForgotPassword = findViewById<TextView>(R.id.textForgotPassword)
        val textGoToRegister = findViewById<TextView>(R.id.textGoToRegister)

        val layoutEmail = findViewById<TextInputLayout>(R.id.layout_editText_Email)
        val layoutSenha = findViewById<TextInputLayout>(R.id.layout_editText_Senha)

        val buttonLogin = findViewById<Button>(R.id.buttom_fazerLogin)

        val animation: Animation =
            AnimationUtils.loadAnimation(this, R.anim.logo_animation)

        titleLogin.startAnimation(animation)
        textEmail.startAnimation(animation)
        layoutEmail.startAnimation(animation)
        textSenha.startAnimation(animation)
        layoutSenha.startAnimation(animation)
        textForgotPassword.startAnimation(animation)
        textGoToRegister.startAnimation(animation)
        buttonLogin.startAnimation(animation)

        textGoToRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in_animation,
                R.anim.fade_out_animation
            )
            startActivity(intent, options.toBundle())
        }

        textForgotPassword.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in_animation,
                R.anim.fade_out_animation
            )
            startActivity(intent, options.toBundle())
        }

        buttonLogin.setOnClickListener {

            val email = layoutEmail.editText?.text.toString().trim()
            val password = layoutSenha.editText?.text.toString()

            val emailError = ValidationService.validateEmail(email)
            val passwordError = ValidationService.validatePassword(password)

            layoutEmail.error = emailError
            layoutSenha.error = passwordError

            if (emailError == null && passwordError == null) {
            }
        }
    }
}
