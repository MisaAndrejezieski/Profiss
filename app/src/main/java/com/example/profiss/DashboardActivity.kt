package com.example.profiss

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Agora o Android Studio vai achar o btnLogout, porque o XML foi corrigido
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        btnLogout.setOnClickListener {
            Toast.makeText(this, "Saindo do app...", Toast.LENGTH_SHORT).show()
            finish() // Fecha a tela e volta para o celular
        }
    }
}