package com.katerina.notesapp.screens.start

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.katerina.notesapp.database.firebase.AppFirebaseRepository
import com.katerina.notesapp.database.room.AppRoomDatabase
import com.katerina.notesapp.database.room.AppRoomRepository
import com.katerina.notesapp.utilities.REPOSITORY
import com.katerina.notesapp.utilities.TYPE_FIREBASE
import com.katerina.notesapp.utilities.TYPE_ROOM
import com.katerina.notesapp.utilities.showToast

class StartFragmentViewModel(application: Application) : AndroidViewModel(application) {

    private val mContext = application

    fun initDatabase(type: String, onSuccess: () -> Unit) {
        when (type) {
            TYPE_ROOM -> {
                val dao = AppRoomDatabase.getInstance(mContext).getAppRoomDao()
                REPOSITORY = AppRoomRepository(dao)
                onSuccess()
            }
            TYPE_FIREBASE -> {
                REPOSITORY = AppFirebaseRepository()
                REPOSITORY.connectToDatabase({ onSuccess() }, { showToast(it) })
            }
        }

    }
}