package com.lolchess.strategy.view.menu

import android.annotation.TargetApi
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.lolchess.strategy.R
import com.lolchess.strategy.model.data.RecommendMetaData
import com.lolchess.strategy.view.activity.PatchNoteActivity
import com.lolchess.strategy.view.adapter.RecommendMetaAdapter
import com.lolchess.strategy.view.service.Overlay
import kotlinx.android.synthetic.main.home_fragment.*
import kotlinx.android.synthetic.main.overlay_synergy.*


class Home:Fragment(){
    private val ACTION_MANAGE_OVERLAY_PERMISSION_REQUEST_CODE = 1
    private var isClicked = false
    private lateinit var mInterstitialAd: InterstitialAd
    companion object {
        fun newInstance() = Home()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.home_fragment, container, false)
        mInterstitialAd = InterstitialAd(context!!.applicationContext)
        mInterstitialAd.adUnitId = "ca-app-pub-9396361569793554/2382658247"
        mInterstitialAd.loadAd(AdRequest.Builder().build())
        //val youTubePlayerView:YouTubePlayerView = view.findViewById(R.id.you_tube_player_view)


        //activity?.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        val recommendData = RecommendMetaData().getAllMetaData()
        val recommendAdapter = RecommendMetaAdapter(recommendData, view.context)
       // createRecommandView()
        recommendMetaView?.adapter = recommendAdapter
        btnOverlay.setOnClickListener {
            createFrontAd()
            if(!isClicked){
                checkPermission()
                isClicked = true
            }

        }

        btnPatch.setOnClickListener {
            val intent = Intent(context, PatchNoteActivity::class.java)
            startActivity(intent)
        }

        recommendMetaView2
    }
    private fun createFrontAd() {

        if (mInterstitialAd.isLoaded) {
            mInterstitialAd.show()
            mInterstitialAd.adListener = object : AdListener(){
                override fun onAdClosed() {
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                }
            }
        } else {
            Log.e("TAG", "The interstitial wasn't loaded yet.")
        }
    }

    private fun checkPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {   // 마시멜로우 이상일 경우
            if (!Settings.canDrawOverlays(view?.context)) {              // 체크
                val intent = Intent(
                    Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                    Uri.parse("package:" + activity!!.packageName)
                )
                startActivityForResult(intent, ACTION_MANAGE_OVERLAY_PERMISSION_REQUEST_CODE)
            } else {
                activity!!.startService(Intent(context, Overlay::class.java))
            }
        } else {
            activity!!.startService(Intent(context, Overlay::class.java))
        }
    }

    @TargetApi(Build.VERSION_CODES.M)
    override fun onActivityResult(
        requestCode: Int,
        resultCode: Int,
        data: Intent?
    ) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == ACTION_MANAGE_OVERLAY_PERMISSION_REQUEST_CODE) {
            if (!Settings.canDrawOverlays(view?.context)) {
                // TODO 동의를 얻지 못했을 경우의 처리
            } else {
                activity!!.startService(Intent(context, Overlay::class.java))
            }
        }
    }
}
