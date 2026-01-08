package com.example.museudeartesdeharvard.service

import android.util.Patterns

object ValidationService {

    fun validateEmail(email: String): String? {
        if (email.isBlank()){
            return "É necessário fornecer um e-mail"
        }

        if(!email.contains("@")){
            return "O e-mail deve conter @"
        }

        if(!email.contains(".")){
            return "O e-mail deve conter um ponto (.)"
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            return "Formato de e-mail inválido"
        }

        return null

    }
}