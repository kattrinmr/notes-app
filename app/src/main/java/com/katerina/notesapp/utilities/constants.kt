package com.katerina.notesapp.utilities

import com.katerina.notesapp.MainActivity
import com.katerina.notesapp.database.DatabaseRepository

lateinit var APP_ACTIVITY: MainActivity
lateinit var REPOSITORY: DatabaseRepository

const val TYPE_DATABASE = "type_database"
const val TYPE_ROOM = "type_room"