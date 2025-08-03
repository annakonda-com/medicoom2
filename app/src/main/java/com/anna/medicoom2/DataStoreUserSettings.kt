package com.anna.medicoom2

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore

val Context.userSettingsDS: DataStore<Preferences> by preferencesDataStore(name = "settings")
val EMERGENCY_NUMBER = stringPreferencesKey("EMERGENCY_NUMBER")

class DataStoreUserSettings (context: Context){
    private val dataStore = context.userSettingsDS


}


