package com.example.profiss

import android.content.Intent // Importação necessária para navegar entre telas
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnBack = findViewById<ImageView>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }

        val etEmail = findViewById<TextInputEditText>(R.id.etEmail)
        val etPassword = findViewById<TextInputEditText>(R.id.etPassword)
        val btnLoginAction = findViewById<Button>(R.id.btnLoginAction)

        btnLoginAction.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (email.isEmpty()) {
                etEmail.error = "Digite seu e-mail"
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                etPassword.error = "Digite sua senha"
                return@setOnClickListener
            }

            Toast.makeText(this, "Login bem-sucedido! Bem-vindo, $email", Toast.LENGTH_LONG).show()

            // --- AQUI É A MÁGICA ---
            // Cria a intenção de ir da LoginActivity para a DashboardActivity
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)

            // (Opcional) Fecha a tela de login para o usuário não voltar apertando "voltar"
            finish()
        }
    }
}