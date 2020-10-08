package com.lolchess.strategy.view.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.lolchess.strategy.R
import com.lolchess.strategy.model.Arrangement_tips
import com.lolchess.strategy.model.data.Arrangement_Tips_Data
import com.lolchess.strategy.view.adapter.ArrangementAdapter
import kotlinx.android.synthetic.main.arrangement_fragment.*


class Arrangement:Fragment(){

    companion object {
        fun newInstance() = Arrangement()
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        MobileAds.initialize(context)
        return inflater.inflate(R.layout.arrangement_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initAd()
        val tips_Data = Arrangement_Tips_Data()
        var arrangementtipsData: List<Arrangement_tips> = listOf(tips_Data.tips_basic(), tips_Data.tips_zephyr())


        val tips = arrangementtipsData.toMutableList()

        val mAdapter = ArrangementAdapter(tips)
        tipsRecycler?.adapter = mAdapter
        tipsRecycler?.layoutManager = LinearLayoutManager(view.context)
    }

    private fun initAd() {
        val adBuilder = AdRequest.Builder().build()
        adViewArrangement.loadAd(adBuilder)
    }
}
