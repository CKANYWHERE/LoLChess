package com.lolchess.strategy.view.service

import android.R
import android.app.Service
import android.content.Context
import android.content.Intent
import android.graphics.PixelFormat
import android.os.IBinder
import android.view.*
import com.lolchess.strategy.R.layout
import android.widget.ImageButton
import android.widget.TextView


class Overlay : Service() {
    private lateinit var windowManager: WindowManager
    private lateinit var mView: View

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        val inflate =
            getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        windowManager = getSystemService(Context.WINDOW_SERVICE) as WindowManager

        val params =
            WindowManager.LayoutParams( /*ViewGroup.LayoutParams.MATCH_PARENT*/
                300,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.TYPE_SYSTEM_ALERT,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE
                        or WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL
                        or WindowManager.LayoutParams.FLAG_WATCH_OUTSIDE_TOUCH,
                PixelFormat.TRANSLUCENT
            )

        params.gravity = Gravity.LEFT or Gravity.TOP
        mView = inflate.inflate(layout.overlay,null)


        windowManager.addView(mView, params)
    }



}