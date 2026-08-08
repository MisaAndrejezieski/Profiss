package com.example.profiss

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // 1. Botão de Voltar
        val btnBack = findViewById<ImageView>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        // 2. Botão de Entrar (Agora com o Toast funcionando!)
        val btnLoginAction = findViewById<Button>(R.id.btnLoginAction)
        btnLoginAction.setOnClickListener {
            // Exibe a mensagem na tela do celular
            Toast.makeText(this, "Botão Entrar funcionou!", Toast.LENGTH_SHORT).show()
        }
    }
}