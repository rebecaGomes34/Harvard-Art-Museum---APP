package com.example.museudeartesdeharvard

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class RedefinirSenha_Activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recuperar_senha)

        val textTema = findViewById<TextView>(R.id.redefinirSenha_text_redefinirSenha)
        val textDescricao = findViewById<TextView>(R.id.redefinirSenha_text_descricao)
        val textEmail = findViewById<TextView>(R.id.redefinirSenha_text_email)
        val textLembrouSenha = findViewById<TextView>(R.id.recuperarSenha_text_lembrouSenha)
        val textCancelar = findViewById<TextView>(R.id.redefinirSenha_text_cancelar)

        val inputEmail = findViewById<EditText>(R.id.redefinirSenha_editText_email)

        val buttomEnviar = findViewById<Button>(R.id.redefinirSenha_buttom_enviar)

        val animation: Animation =
            AnimationUtils.loadAnimation(this,R.anim.logo_animation)

        textTema.startAnimation(animation)
        textDescricao.startAnimation(animation)
        textEmail.startAnimation(animation)
        textLembrouSenha.startAnimation(animation)
        textCancelar.startAnimation(animation)
        inputEmail.startAnimation(animation)
        buttomEnviar.startAnimation(animation)

        textCancelar.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)

            val options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.fade_in_animation,
                R.anim.fade_out_animation
            )

            startActivity(intent, options.toBundle())
        }


    }}