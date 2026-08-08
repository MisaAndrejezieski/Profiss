package com.example.profiss

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Isso liga o código ao seu layout XML
        setContentView(R.layout.activity_login)

        // 1. Botão de Voltar (a seta no topo esquerdo)
        val btnBack = findViewById<ImageView>(R.id.btnBack)
        btnBack.setOnClickListener {
            // finish() simplesmente fecha essa tela e volta para a anterior
            finish()
        }

        // 2. Botão de Entrar
        val btnLoginAction = findViewById<Button>(R.id.btnLoginAction)
        btnLoginAction.setOnClickListener {
            // Aqui você vai colocar a lógica de login depois
        }
    }
}