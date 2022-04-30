package com.katerina.notesapp.screens.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.katerina.notesapp.utilities.REPOSITORY

class MainFragmentViewModel(application: Application): AndroidViewModel(application) {
    val allNotes = REPOSITORY.allNotes
}