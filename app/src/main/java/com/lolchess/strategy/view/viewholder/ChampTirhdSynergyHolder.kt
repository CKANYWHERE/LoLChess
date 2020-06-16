package com.lolchess.strategy.view.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.data.ChampData
import kotlinx.android.synthetic.main.champ_home_item_three.view.*

class ChampTirhdSynergyHolder (view: View) : RecyclerView.ViewHolder(view){
    var imgMain = view.imgMain
    var txtMain = view.txtMain
    var firstImgSyn = view.imgFirstSyn
    var secondImgSyn = view.imgSecondSyn
    var thirdImgSyn = view.imgThirdSyn
    var txtFirstSyn = view.txtFirstSyn
    var txtSecondSyn = view.txtSecondSyn
    var txtThirdSyn = view.txtThirdSyn
    var imgCost = view.imgCost
}