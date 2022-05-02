package com.katerina.notesapp.utilities

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.katerina.notesapp.MainActivity
import com.katerina.notesapp.database.DatabaseRepository

lateinit var APP_ACTIVITY: MainActivity
lateinit var REPOSITORY: DatabaseRepository
lateinit var EMAIL: String
lateinit var PASSWORD: String
lateinit var AUTH: FirebaseAuth
lateinit var CURRENT_ID: String
lateinit var REF_DATABASE: DatabaseReference

const val TYPE_DATABASE = "type_database"
const val TYPE_ROOM = "type_room"
const val TYPE_FIREBASE = "type_firebase"
const val ID_FIREBASE = "id_firebase"
const val NAME = "name"
const val TEXT = "text"