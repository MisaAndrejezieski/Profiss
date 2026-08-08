package com.example.profiss

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Botão de Voltar
        val btnBack = findViewById<ImageView>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        // Botão de Entrar (Agora a ação é apenas fechar a tela para testar)
        val btnLoginAction = findViewById<Button>(R.id.btnLoginAction)
        btnLoginAction.setOnClickListener {
            // Fecha a tela e volta para o início
            finish()
        }
    }
}