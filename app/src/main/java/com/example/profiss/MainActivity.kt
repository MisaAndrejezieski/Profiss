package com.example.profiss // O nome do seu pacote pode ser diferente deste. Mantenha o seu!

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge() // Deixa a tela em modo imersivo (sem a barra preta em cima)
        setContentView(R.layout.activity_main)

        // Conectando os botões do layout ao código
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        // Exemplo de ação ao clicar (pode abrir outra tela depois)
        btnLogin.setOnClickListener {
            // Código para ir para a tela de Login
            // Ex: val intent = Intent(this, LoginActivity::class.java)
            // startActivity(intent)
        }

        btnRegister.setOnClickListener {
            // Código para ir para a tela de Cadastro
        }
    }
}