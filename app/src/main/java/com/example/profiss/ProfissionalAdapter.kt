package com.example.profiss

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ProfissionalAdapter(private val listaProfissionais: List<Profissional>) :
    RecyclerView.Adapter<ProfissionalAdapter.ProfissionalViewHolder>() {

    class ProfissionalViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNome: TextView = view.findViewById(R.id.tvNome)
        val tvEspecialidade: TextView = view.findViewById(R.id.tvEspecialidade)
        val tvAvaliacao: TextView = view.findViewById(R.id.tvAvaliacao)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfissionalViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_profissional, parent, false)
        return ProfissionalViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProfissionalViewHolder, position: Int) {
        val profissional = listaProfissionais[position]
        holder.tvNome.text = profissional.nome
        holder.tvEspecialidade.text = profissional.especialidade
        holder.tvAvaliacao.text = profissional.avaliacao
    }

    override fun getItemCount(): Int = listaProfissionais.size
}