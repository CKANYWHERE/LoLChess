package com.lolchess.strategy.view.service

import android.annotation.SuppressLint
import android.app.Service
import android.content.Context
import android.content.Intent
import android.graphics.PixelFormat
import android.os.Build
import android.os.Bundle
import android.os.IBinder
import android.util.Log
import android.view.*
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.lolchess.strategy.R


class Overlay : Service() {

    var wm: WindowManager? = null
    var mView: View? = null

    final lateinit var btnOverlay: ImageButton

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {
        super.onCreate()
        val inflate =
            getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        wm = getSystemService(Context.WINDOW_SERVICE) as WindowManager
        var mParams : WindowManager.LayoutParams
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) {
            mParams = WindowManager.LayoutParams(
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.TYPE_SYSTEM_ALERT,
                WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
                PixelFormat.TRANSLUCENT)
        } else {
            mParams = WindowManager.LayoutParams(
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY,
                WindowManager.LayoutParams.FLAG_NOT_TOUCH_MODAL,
                PixelFormat.TRANSLUCENT)
        }


        mParams.gravity = Gravity.LEFT or Gravity.TOP
        mView = inflate.inflate(R.layout.overlay, null,false)

        btnOverlay = mView!!.findViewById(R.id.btnService)
        btnOverlay.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.e("ssss","asdf")
            }
        })

        wm!!.addView(mView, mParams)
    }

    override fun onDestroy() {
        super.onDestroy()
        if (wm != null) {
            if (mView != null) {
                wm!!.removeView(mView)
                mView = null
            }
            wm = null
        }
    }


}