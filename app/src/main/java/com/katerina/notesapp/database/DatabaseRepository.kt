package com.katerina.notesapp.database

import androidx.lifecycle.LiveData
import com.katerina.notesapp.models.AppNote

interface DatabaseRepository {

    val allNotes: LiveData<List<AppNote>>

    suspend fun insert(note: AppNote, onSuccess: () -> Unit)
    suspend fun delete(note: AppNote, onSuccess: () -> Unit)
}