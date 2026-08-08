package com.example.profiss

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // TESTE: Vai aparecer assim que a tela de login abrir
        Toast.makeText(this, "A TELA DE LOGIN ABRIU COM SUCESSO!", Toast.LENGTH_LONG).show()
    }
}