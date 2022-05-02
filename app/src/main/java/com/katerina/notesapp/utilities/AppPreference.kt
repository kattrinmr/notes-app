package com.katerina.notesapp.utilities

import android.content.Context
import android.content.SharedPreferences

object AppPreference {

    private const val INIT_USER = "initUser"
    private const val TYPE_DATABASE = "typeDB"
    private const val NAME_PREF = "preference"

    private lateinit var mPreferences: SharedPreferences

    fun getPreference(context: Context): SharedPreferences {
        mPreferences = context.getSharedPreferences(NAME_PREF, Context.MODE_PRIVATE)
        return mPreferences
    }

    fun setInitUser(init: Boolean) {
        mPreferences.edit()
            .putBoolean(INIT_USER, init)
            .apply()
    }

    fun setTypeDB(type: String) {
        mPreferences.edit()
            .putString(TYPE_DATABASE, type)
            .apply()
    }

    fun getInitUser(): Boolean = mPreferences.getBoolean(INIT_USER, false)

    fun getTypeDB(): String = mPreferences.getString(TYPE_DATABASE, TYPE_ROOM).toString()

}