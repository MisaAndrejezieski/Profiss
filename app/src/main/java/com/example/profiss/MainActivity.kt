package com.example.profiss

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ligando os botões do layout ao código
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        // Exemplo de ação ao clicar (vamos usar isso no futuro)
        btnLogin.setOnClickListener {
            // Aqui vai o código para abrir a tela de Login
        }

        btnRegister.setOnClickListener {
            // Aqui vai o código para abrir a tela de Cadastro
        }
    }
}