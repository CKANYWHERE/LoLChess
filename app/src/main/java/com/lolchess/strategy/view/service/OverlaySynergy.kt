package com.lolchess.strategy.view.service

import android.app.Service
import android.content.Context
import android.content.Intent
import android.graphics.PixelFormat
import android.os.Build
import android.os.IBinder
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import com.lolchess.strategy.R

class OverlaySynergy : Service(){

    var LAYOUT_FLAG: Int = 0
    lateinit var floatingView: View
    lateinit var manager: WindowManager
    lateinit var params: WindowManager.LayoutParams
    val CHANNEL_ID = 1002
    val CHANNEL_NAME = "TFT_APP"


    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        LAYOUT_FLAG = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY
        } else {
            WindowManager.LayoutParams.TYPE_PHONE
        }
        val params = WindowManager.LayoutParams(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT,
            LAYOUT_FLAG,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
            PixelFormat.TRANSLUCENT
        )

        Log.e("asdf", intent?.extras?.getInt("x").toString())

        this.params = params
        //Specify the view position
        params.x = intent?.extras?.getInt("x")!!.plus(1)
        params.y = intent?.extras?.getInt("y")!!.minus(1000)

        manager = getSystemService(Context.WINDOW_SERVICE) as WindowManager
        floatingView = LayoutInflater.from(this).inflate(R.layout.overlay_synergy, null)
        manager.addView(floatingView, params)

        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        stopSelf()
        manager.removeView(floatingView)
    }
}