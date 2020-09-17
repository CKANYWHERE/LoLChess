package com.lolchess.strategy.view.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.R
import com.lolchess.strategy.model.data.ChampData

import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.view.viewholder.ChampDetailViewHolder
import com.lolchess.strategy.view.viewholder.ChampDetailViewHolder3Syn
import java.lang.RuntimeException

class ChampDetailAdapter(private var items: MutableList<Champ>)// recycler view binding 해주는 클래스
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  RecyclerView.ViewHolder
    {

        val view : View?

        return when (viewType){
            Champ.TWO_TYPE_SYN ->{
                view = LayoutInflater.from(parent.context).inflate(R.layout.champ_detail, parent, false)
                ChampDetailViewHolder(view)
            }
            Champ.THREE_TYPE_SYN ->{
                view = LayoutInflater.from(parent.context).inflate(R.layout.champ_detail, parent, false)
                ChampDetailViewHolder3Syn(view)
            }
            else -> throw  RuntimeException("알수 없는 뷰타입 오류")
        }
    }
    override fun getItemCount(): Int  = items.size

    fun filter(query : String?){

        val champData = ChampData()
        val allChamp : MutableList<Champ> =  listOf(champData.getGaren(), champData.getNami(), champData.getNidalee(), champData.getDiana(), champData.getLissandra(), champData.getMaokai(),
                champData.getVayne(), champData.getYasuo(), champData.getElise(), champData.getWukong(), champData.getTahmKench(), champData.getTwistedFate(),
                champData.getFiora(), champData.getLulu(), champData.getVi(), champData.getSylas(), champData.getThresh(), champData.getAphelios(),
                champData.getAnnie(), champData.getJarvanIV(), champData.getJanna(),champData.getJax(), champData.getZed(), champData.getTeemo(),
                champData.getPyke(), champData.getHecarim(), champData.getNunu(), champData.getLux(), champData.getVeigar(), champData.getXinZhao(),
                champData.getAkali(), champData.getYuumi(), champData.getIrelia(), champData.getEvelynn(), champData.getJinx(), champData.getKatarina(),
                champData.getKalista(), champData.getKennen(), champData.getKindred(), champData.getRiven(), champData.getMorgana(), champData.getSejuani(),
                champData.getShen(), champData.getAhri(), champData.getAatrox(), champData.getAshe(), champData.getWarwick(), champData.getJhin(),
                champData.getCassiopeia(), champData.getTalon(), champData.getLeeSin(), champData.getLillia(), champData.getSett(), champData.getAzir(),
                champData.getYone(), champData.getEzreal(),  champData.getZilean(), champData.getKayn()).toMutableList()

        if(query?.isEmpty()!!){
            items.clear()
            items.addAll(allChamp)
        }else{
            items.clear()
            for(champ in allChamp){
                if(champ!!.name.contains(query))
                    items.add(champ)
            }
        }
        notifyDataSetChanged()
    }


    override fun getItemViewType(position: Int): Int = items[position].type

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val champ = items[position]
        when(champ.type){

            Champ.TWO_TYPE_SYN -> {
                (holder as ChampDetailViewHolder)
                var cost = items[position]?.cost
                when(cost){
                    1 -> { holder.imgCost.setBackgroundColor(Color.rgb(128,128,128)) }
                    2 -> { holder.imgCost.setBackgroundColor(Color.rgb(17,178,136)) }
                    3 -> { holder.imgCost.setBackgroundColor(Color.rgb(32,122,199)) }
                    4 -> { holder.imgCost.setBackgroundColor(Color.rgb(196,64,218)) }
                    5 -> { holder.imgCost.setBackgroundColor(Color.rgb(255,185,59)) }
                }
                holder.imgMain.setImageResource(items[position]?.imgPath)
                holder.txtMain.text = items[position]?.name
                holder.itemView.setOnClickListener {
                    holder.initialize(items.get(position))
                }
            }



            Champ.THREE_TYPE_SYN -> {
                (holder as ChampDetailViewHolder3Syn)
                var cost = items[position]?.cost
                when(cost){
                    1 -> { holder.imgCost.setBackgroundColor(Color.rgb(128,128,128)) }
                    2 -> { holder.imgCost.setBackgroundColor(Color.rgb(17,178,136)) }
                    3 -> { holder.imgCost.setBackgroundColor(Color.rgb(76,110,245)) }
                    4 -> { holder.imgCost.setBackgroundColor(Color.rgb(196,64,218)) }
                    5 -> { holder.imgCost.setBackgroundColor(Color.rgb(255,185,59)) }
                }
                holder.imgMain.setImageResource(items[position]?.imgPath)
                holder.txtMain.text = items[position]?.name
                holder.itemView.setOnClickListener {
                    holder.initialize2(items.get(position))

                }
            }
        }
    }
}
