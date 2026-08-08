package com.example.profiss

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast // <--- Importante: Importei a biblioteca do Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // 1. Botão de Voltar (a seta no topo esquerdo)
        val btnBack = findViewById<ImageView>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        // 2. Botão de Entrar (AGORA COM AÇÃO!)
        val btnLoginAction = findViewById<Button>(R.id.btnLoginAction)
        btnLoginAction.setOnClickListener {
            // Isso aqui vai aparecer flutuando na tela do seu celular
            Toast.makeText(this, "Login clicado! Em breve...", Toast.LENGTH_SHORT).show()
        }
    }
}