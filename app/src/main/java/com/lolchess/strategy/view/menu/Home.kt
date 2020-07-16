package com.lolchess.strategy.view.menu

import android.content.Context
import android.content.pm.ActivityInfo
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.exoplayer2.ExoPlayerFactory
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.source.ExtractorMediaSource
import com.google.android.exoplayer2.source.MediaSource
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.source.hls.HlsMediaSource
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory
import com.google.android.exoplayer2.util.Util
import com.google.android.gms.ads.MobileAds
import com.google.android.youtube.player.YouTubePlayerView
import com.lolchess.strategy.R
import com.lolchess.strategy.model.data.RecommandMetaData
import com.lolchess.strategy.view.activity.MainActivity
import com.lolchess.strategy.view.adapter.RecommendMetaAdapter
import kotlinx.android.synthetic.main.home_fragment.*

class Home:Fragment(){


    companion object {
        fun newInstance() = Home()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.home_fragment, container, false)
        //val youTubePlayerView:YouTubePlayerView = view.findViewById(R.id.you_tube_player_view)


        //activity?.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        val recommendData = RecommandMetaData().getAllMetaData()
        val recommandAdapter = RecommendMetaAdapter(recommendData, view.context)

        recommendMetaView?.layoutManager = LinearLayoutManager(view.context)
        recommendMetaView?.adapter = recommandAdapter


    }
}
