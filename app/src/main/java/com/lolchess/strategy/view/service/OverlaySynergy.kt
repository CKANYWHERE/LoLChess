package com.lolchess.strategy.view.service

import android.app.Service
import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.graphics.PixelFormat
import android.os.Build
import android.os.IBinder
import android.util.Log
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.LinearLayout
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.R
import com.lolchess.strategy.model.data.RecommandMetaData
import com.lolchess.strategy.view.adapter.RecommendMetaAdapter
import kotlinx.android.synthetic.main.home_fragment.*

class OverlaySynergy : Service(){

    var LAYOUT_FLAG: Int = 0
    lateinit var floatingView: View
    lateinit var manager: WindowManager
    lateinit var params: WindowManager.LayoutParams
    lateinit var synergyLinearLayout:LinearLayout
    lateinit var synergyView : ListView
    val CHANNEL_ID = 1002
    val CHANNEL_NAME = "TFT_APP"


    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            this.params.x = 0
            this.manager.updateViewLayout(this.floatingView,params)
            Log.e("세로","세로")

        }else{
            this.params.x = -450
            this.manager.updateViewLayout(this.floatingView,params)
            Log.e("가로","가로")
        }

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



        //Specify the view position

        this.params = params

        if(resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
            params.x = intent?.extras?.getInt("x")!!.minus(0)
        }
        else{
            params.x = intent?.extras?.getInt("x")!!.minus(450)
        }

        params.y = intent?.extras?.getInt("y")!!.minus(1000)

        manager = getSystemService(Context.WINDOW_SERVICE) as WindowManager

        floatingView = LayoutInflater.from(this).inflate(R.layout.overlay_synergy, null)

        val recommendData = RecommandMetaData().getAllMetaData()
        val recommandAdapter = RecommendMetaAdapter(recommendData, baseContext)


        this.synergyView = floatingView.findViewById<ListView>(R.id.recommendMetaView2)
        //synergyView?.layoutParams = LinearLayoutManager(baseContext)
        this.synergyView?.adapter = recommandAdapter
        //synergyLinearLayout = floatingView.findViewById<LinearLayout>(R.id.container)


        manager.addView(floatingView, params)

        return START_NOT_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        stopSelf()
        manager.removeView(floatingView)
    }
}