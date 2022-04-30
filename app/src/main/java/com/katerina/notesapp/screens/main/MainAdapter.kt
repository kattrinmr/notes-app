package com.katerina.notesapp.screens.main

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.katerina.notesapp.databinding.NoteItemBinding
import com.katerina.notesapp.models.AppNote

class MainAdapter: RecyclerView.Adapter<MainAdapter.MainHolder>() {

    private var mListNotes = emptyList<AppNote>()

    class MainHolder(val binding: NoteItemBinding): RecyclerView.ViewHolder(binding.root) {
        val nameNote: TextView = binding.itemNoteName
        val textNote: TextView = binding.itemNoteText
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainHolder {
        val binding = NoteItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MainHolder(binding)
    }

    override fun onViewAttachedToWindow(holder: MainHolder) {
        holder.itemView.setOnClickListener {
            MainFragment.click(mListNotes[holder.adapterPosition])
        }
    }

    override fun onViewDetachedFromWindow(holder: MainHolder) {
        holder.itemView.setOnClickListener(null)
        super.onViewDetachedFromWindow(holder)
    }

    override fun onBindViewHolder(holder: MainHolder, position: Int) {
        with(holder) {
            with(mListNotes[position]) {
                binding.itemNoteName.text = this.name
                binding.itemNoteText.text = this.text
            }
        }
    }

    override fun getItemCount(): Int = mListNotes.size

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<AppNote>) {
        mListNotes = list
        notifyDataSetChanged()
    }


}