package com.example.museudeartesdeharvard.view

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import com.example.museudeartesdeharvard.R
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val titleCadastro = findViewById<TextView>(R.id.textCadastro)
        val textUsername = findViewById<TextView>(R.id.cadastro_text_Username)
        val textEmail = findViewById<TextView>(R.id.cadastro_text_email)
        val textSenha = findViewById<TextView>(R.id.cadastro_text_senha)
        val textConfirmaSenha = findViewById<TextView>(R.id.cadastro_text_confirmaSenha)
        val textTelaLogin = findViewById<TextView>(R.id.cadastro_text_telaLogin)

        val inputUsername =
            findViewById<AppCompatEditText>(R.id.cadastro_editText_UserName)
        val inputEmail =
            findViewById<AppCompatEditText>(R.id.cadastro_editText_email)
        val inputSenha =
            findViewById<TextInputLayout>(R.id.cadastro_layout_editText_Senha)
        val inputConfirmaSenha =
            findViewById<TextInputLayout>(R.id.cadastro_layout_editText_ConfirmaSenha)


        val buttonCadastrar =
            findViewById<Button>(R.id.cadastro_buttom_cadastrar)

        val animation: Animation =
            AnimationUtils.loadAnimation(this, R.anim.logo_animation)

        titleCadastro.startAnimation(animation)
        textUsername.startAnimation(animation)
        inputUsername.startAnimation(animation)
        textEmail.startAnimation(animation)
        inputEmail.startAnimation(animation)
        textSenha.startAnimation(animation)
        inputSenha.startAnimation(animation)
        textConfirmaSenha.startAnimation(animation)
        inputConfirmaSenha.startAnimation(animation)
        buttonCadastrar.startAnimation(animation)
        textTelaLogin.startAnimation(animation)

        textTelaLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)

            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in_animation,
                R.anim.fade_out_animation
            )

            startActivity(intent, options.toBundle())
        }
    }
}

