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

    fun validatePassword(password: String): String? {

        if (password.isBlank()) {
            return "É necessário fornecer uma senha"
        }

        if (password.length < 8) {
            return "A senha deve conter pelo menos 8 caracteres"
        }

        if (!password.any { it.isUpperCase() }) {
            return "A senha deve conter uma letra maiúscula"
        }

        if(!password.any {it.isLowerCase()}){
            return "A senha precisa conter uma letra minúscula"
        }

        if(!password.any{!it.isLetterOrDigit()}){
            return "A senha deve conter um caractere especial"
        }

        return null
    }
}