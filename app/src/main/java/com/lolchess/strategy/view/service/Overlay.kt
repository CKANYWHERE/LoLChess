package com.lolchess.strategy.view.service

import android.annotation.SuppressLint
import android.app.*
import android.content.Context
import android.content.Intent
import android.graphics.PixelFormat
import android.graphics.Point
import android.os.Build
import android.os.IBinder
import android.util.Log
import android.view.*
import android.widget.ImageButton
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import com.lolchess.strategy.R
import com.lolchess.strategy.view.activity.CloseSystemActivity
import com.lolchess.strategy.view.activity.MainActivity

import kotlin.math.roundToInt

class Overlay : Service() {

    var LAYOUT_FLAG: Int = 0

    lateinit var floatingView: View
    lateinit var manager: WindowManager
    lateinit var params: WindowManager.LayoutParams
    val CHANNEL_ID = 1001
    val CHANNEL_NAME = "TFT_APP"

    // 클릭으로 볼 최대시간
    val MAX_CLICK_DURATION = 1000
    var pressStartTime: Long = 0

    override fun onBind(intent: Intent?): IBinder? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        createForground()

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

        this.params = params
        //Specify the view position
        params.gravity =
            Gravity.TOP or Gravity.LEFT //Initially view will be added to top-left corner
        params.x = 0
        params.y = 100

        manager = getSystemService(Context.WINDOW_SERVICE) as WindowManager
        floatingView = LayoutInflater.from(this).inflate(R.layout.overlay, null)
        manager.addView(floatingView, params)

        floatingView.findViewById<View>(R.id.btnService)?.setOnTouchListener(object :
            View.OnTouchListener {

            var initialX: Int? = null
            var initialY: Int? = null
            var initialTouchX: Float? = null
            var initialTouchY: Float? = null

            @SuppressLint("ClickableViewAccessibility")
            override fun onTouch(view: View?, motionEvent: MotionEvent?): Boolean {
                when (motionEvent!!.action) {
                    MotionEvent.ACTION_DOWN -> {
                        pressStartTime = System.currentTimeMillis()

                        //remember the initial position.
                        initialX = params.x
                        initialY = params.y

                        //get the touch location
                        initialTouchX = motionEvent!!.rawX
                        initialTouchY = motionEvent!!.rawY
                        return false
                    }
                    MotionEvent.ACTION_UP -> {
                        val pressDuration = System.currentTimeMillis() - pressStartTime;

                        if (pressDuration < MAX_CLICK_DURATION) {
                            createSynergyView()
                        }

                        val Xdiff = (motionEvent.getRawX() - initialTouchX!!)
                        val Ydiff = (motionEvent.rawY - initialTouchY!!)
                        return false
                    }
                    MotionEvent.ACTION_MOVE -> {
                        params.x =
                            initialX!!.plus((motionEvent.getRawX() - initialTouchX!!)).roundToInt()
                        params.y =
                            initialY!!.plus((motionEvent.getRawY() - initialTouchY!!).roundToInt())
                        manager.updateViewLayout(floatingView, params)
                        return false

                    }

                }
                return false
            }
        })
        return START_NOT_STICKY
    }

    private fun createSynergyView(){
        val inflater :LayoutInflater = baseContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        inflater.inflate(R.layout.overlay_synergy,null)
        Log.e("onClick", "asdf")
    }

    private fun createNotificationChannel(context: Context, importance: Int, showBadge: Boolean,
                                          name: String, description: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channelId = "${context.packageName}-$name"
            val channel = NotificationChannel(channelId, name, importance)
            channel.description = description
            channel.setShowBadge(showBadge)

            val notificationManager = context.getSystemService(NotificationManager::class.java)
            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun createForground() {
        createNotificationChannel(this, NotificationManagerCompat.IMPORTANCE_DEFAULT,
            false, getString(R.string.app_name), "App notification channel")

        val channelId = "$packageName-${getString(R.string.app_name)}"
        val title = "TFT 공략"
        val content = "클릭 해주시면 오버레이가 해제 됩니다 :)"

        val intent = Intent(baseContext, CloseSystemActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK


        val pendingIntent = PendingIntent.getActivity(baseContext, 0,
            intent, PendingIntent.FLAG_UPDATE_CURRENT)

        val builder = NotificationCompat.Builder(this, channelId)
        builder.setSmallIcon(R.drawable.overlay)
        builder.setContentTitle(title)
        builder.setContentText(content)
        builder.priority = NotificationCompat.PRIORITY_DEFAULT
        builder.setAutoCancel(true)
        builder.setContentIntent(pendingIntent)


        val notificationManager = NotificationManagerCompat.from(this)
        notificationManager.notify(CHANNEL_ID, builder.build())
    }


    override fun onDestroy() {
        super.onDestroy()
        stopSelf()
        manager.removeView(floatingView)
    }
}