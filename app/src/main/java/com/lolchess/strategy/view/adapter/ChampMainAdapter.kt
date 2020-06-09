package com.lolchess.strategy.view.adapter

import android.content.Context
import android.graphics.Color
import android.graphics.ColorSpace
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.R
import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.view.viewholder.ChampMainViewHolder

class ChampMainAdapter(private val context : Context, private val items: List<Champ>)// recycler view binding 해주는 클래스
    : RecyclerView.Adapter<ChampMainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChampMainViewHolder
    {
        val view = LayoutInflater.from(context).inflate(R.layout.champ_home_item, parent, false)
        Log.e("CreateChampViewHolder","onCreate")
        return ChampMainViewHolder(view)

    }

    override fun getItemCount(): Int  = items.size


    override fun onBindViewHolder(holder: ChampMainViewHolder, position: Int) {
        Log.e("BindViewHolder","BindView")

        var synergySize = items[position]?.synergy.size
        var cost = items[position]?.cost

        when(cost){
            1 -> { holder.imgCost.setBackgroundColor(Color.rgb(173,181,189)) }
            2 -> { holder.imgCost.setBackgroundColor(Color.rgb(81,207,102)) }
            3 -> { holder.imgCost.setBackgroundColor(Color.rgb(76,110,245)) }
            4 -> { holder.imgCost.setBackgroundColor(Color.rgb(204,93,232)) }
            5 -> { holder.imgCost.setBackgroundColor(Color.rgb(255,255,0)) }
        }

        holder.imgMain.setImageResource(items[position]?.imgPath)
        holder.txtMain.text = items[position]?.name
        if(synergySize == 2) { //시너지가 2개일 경우
            holder.firstImgSyn.setImageResource(items[position]?.synergy[0]?.imgPath)
            holder.secondImgSyn.setImageResource(items[position]?.synergy[1]?.imgPath)
            holder.txtFirstSyn.text = items[position]?.synergy[0].name
            holder.txtSecondSyn.text = items[position]?.synergy[1].name
        }
        else{ // 시너지가 3개일 경우
            holder.firstImgSyn.setImageResource(items[position]?.synergy[0]?.imgPath)
            holder.secondImgSyn.setImageResource(items[position]?.synergy[1]?.imgPath)
            holder.thirdImgSyn.setImageResource(items[position]?.synergy[2]?.imgPath)
            holder.txtFirstSyn.text = items[position]?.synergy[0].name
            holder.txtSecondSyn.text = items[position]?.synergy[1].name
            holder.txtThirdSyn.text = items[position]?.synergy[2].name
        }


    }


}