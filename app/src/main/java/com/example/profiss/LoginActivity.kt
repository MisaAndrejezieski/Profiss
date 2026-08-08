package com.example.profiss

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText // <--- O importante que faltava

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // 1. Botão de Voltar
        val btnBack = findViewById<ImageView>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        // 2. Pegando os campos de texto
        val etEmail = findViewById<TextInputEditText>(R.id.etEmail)
        val etPassword = findViewById<TextInputEditText>(R.id.etPassword)

        // 3. Botão de Entrar (Agora com validação!)
        val btnLoginAction = findViewById<Button>(R.id.btnLoginAction)
        btnLoginAction.setOnClickListener {
            // Pega o texto digitado e remove espaços em branco
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            // Se estiver vazio, avisa o usuário
            if (email.isEmpty()) {
                etEmail.error = "Digite seu e-mail"
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                etPassword.error = "Digite sua senha"
                return@setOnClickListener
            }

            // Se passou pelas validações, significa que o usuário digitou algo!
            Toast.makeText(this, "Login bem-sucedido! Bem-vindo, $email", Toast.LENGTH_LONG).show()
        }
    }
}