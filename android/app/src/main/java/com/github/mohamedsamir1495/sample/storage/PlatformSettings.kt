package com.github.mohamedsamir1495.sample.storage

import android.content.*
import android.preference.*
import com.github.mohamedsamir1495.Kotlin_Crossplatform_App.storage.Settings

class PlatformSettings constructor(context: Context) : Settings {

    private val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)

    override fun putBoolean(key: String, value: Boolean) {
        sharedPreferences.edit().putBoolean(key, value).apply()
    }

    override fun getBoolean(key: String, defaultValue: Boolean): Boolean =
        sharedPreferences.getBoolean(key, defaultValue)

    override fun putString(key: String, value: String) {
        sharedPreferences.edit().putString(key, value).apply()
    }

    override fun getString(key: String, defaultValue: String): String =
        sharedPreferences.getString(key, defaultValue)
}