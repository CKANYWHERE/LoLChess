package com.lolchess.strategy.view.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lolchess.strategy.view.service.Overlay
import com.lolchess.strategy.view.service.OverlaySynergy

class CloseSystemActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        stopService(Intent(applicationContext,Overlay::class.java))
        stopService(Intent(applicationContext,OverlaySynergy::class.java))
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        finish()
    }
}