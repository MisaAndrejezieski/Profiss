package com.example.profiss

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val btnLogout = findViewById<Button>(R.id.btnLogout)
        btnLogout.setOnClickListener {
            finish()
        }

        // 1. Criar uma lista de profissionais falsa
        val profissionais = listOf(
            Profissional("Dra. Ana Silva", "Dermatologista", "⭐ 4.9"),
            Profissional("Dr. João Souza", "Ortopedista", "⭐ 4.8"),
            Profissional("Dra. Maria Oliveira", "Pediatra", "⭐ 5.0"),
            Profissional("Dr. Carlos Santos", "Cardiologista", "⭐ 4.7"),
            Profissional("Dra. Juliana Costa", "Oftalmologista", "⭐ 4.9")
        )

        // 2. Configurar o RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewProfissionais)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ProfissionalAdapter(profissionais)
    }
}