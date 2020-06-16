package com.lolchess.strategy.controller

import android.app.Application
import com.lolchess.strategy.util.Preferenceutil

class PreferenceApp :Application(){
    companion object { lateinit var prefs: Preferenceutil }

    override fun onCreate() {
        prefs = Preferenceutil(applicationContext)
        super.onCreate()
    }

}