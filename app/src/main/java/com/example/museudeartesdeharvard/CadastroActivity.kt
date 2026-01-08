package com.example.museudeartesdeharvard

import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.textfield.TextInputEditText

class CadastroActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        val titleCadastro = findViewById<TextView>(R.id.textCadastro)
        val textUsername = findViewById<TextView>(R.id.cadastro_text_Username)
        val textEmail = findViewById<TextView>(R.id.cadastro_text_email)
        val textSenha = findViewById<TextView>(R.id.cadastro_text_senha)
        val textConfirmaSenha = findViewById<TextView>(R.id.cadastro_text_confirmaSenha)
        val textTelaLogin = findViewById<TextView>(R.id.cadastro_text_telaLogin)

        // Inputs
        val inputUsername =
            findViewById<AppCompatEditText>(R.id.cadastro_editText_UserName)
        val inputEmail =
            findViewById<AppCompatEditText>(R.id.cadastro_editText_email)
        val inputSenha =
            findViewById<TextInputEditText>(R.id.cadastro_editText_Senha)
        val inputConfirmaSenha =
            findViewById<TextInputEditText>(R.id.cadastro_editText_ConfirmaSenha)

        // Botão
        val buttonCadastrar =
            findViewById<Button>(R.id.cadastro_buttom_cadastrar)

        // 🔥 MESMA ANIMAÇÃO DA LOGIN
        val animation: Animation =
            AnimationUtils.loadAnimation(this, R.anim.logo_animation)

        // Aplicando animação em tudo
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
            startActivity(intent)
        }


    }
}

