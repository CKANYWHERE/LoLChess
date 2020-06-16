package com.lolchess.strategy.view.viewholder

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.data.ChampData
import kotlinx.android.synthetic.main.champ_home_item.view.*

class ChampMainViewHolder(view: View) : RecyclerView.ViewHolder(view){ //cardview binding 해주는 클래스
    var imgMain = view.imgMain
    var txtMain = view.txtMain
    var firstImgSyn = view.imgFirstSyn
    var secondImgSyn = view.imgSecondSyn
    var txtFirstSyn = view.txtFirstSyn
    var txtSecondSyn = view.txtSecondSyn
    var imgCost = view.imgCost

}