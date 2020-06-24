package com.lolchess.strategy.view.adapter

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.R
import com.lolchess.strategy.controller.database.SimulatorDB
import com.lolchess.strategy.controller.entity.SimulatorChamp
import com.lolchess.strategy.controller.entity.SimulatorSynergy
import com.lolchess.strategy.model.data.ChampData

import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.view.viewholder.ChampDetailViewHolder
import com.lolchess.strategy.view.viewholder.ChampDetailViewHolder3Syn
import com.lolchess.strategy.view.viewholder.ChampMainViewHolder
import com.lolchess.strategy.view.viewholder.ChampTirhdSynergyHolder
import java.lang.RuntimeException
import kotlin.concurrent.thread

class ChampDetailAdapter(private val context : Context, private var items: MutableList<Champ>)// recycler view binding 해주는 클래스
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  RecyclerView.ViewHolder
    {

        val view : View?

        return when (viewType){
            Champ.TWO_TYPE_SYN ->{
                view = LayoutInflater.from(parent.context).inflate(R.layout.champ_home_item, parent, false)
                ChampDetailViewHolder(view)
            }
            Champ.THREE_TYPE_SYN ->{
                view = LayoutInflater.from(parent.context).inflate(R.layout.champ_home_item_three, parent, false)
                ChampDetailViewHolder3Syn(view)
            }
            else -> throw  RuntimeException("알수 없는 뷰타입 오류")
        }
    }
    override fun getItemCount(): Int  = items.size

    fun filter(query : String?){

        val champData = ChampData()
        val allChamp : MutableList<Champ> =  listOf(champData.getGraves(), champData.getNocturne(), champData.getLeona(), champData.getMalphite(), champData.getPoppy(), champData.getIllaoi(),
                champData.getJarvanIV(), champData.getXayah(), champData.getZoe(), champData.getZiggs(), champData.getCaitlyn(), champData.getTwistedFate(),
                champData.getFiora(), champData.getNautilus(), champData.getDarius(), champData.getRakan(), champData.getLucian(), champData.getMordekaiser(),
                champData.getBlitzcrank(), champData.getShen(), champData.getXinZhao(),champData.getAhri(), champData.getAnnie(), champData.getYasuo(),
                champData.getZed(), champData.getKogMaw(), champData.getNeeko(), champData.getRumble(), champData.getMasterYi(), champData.getBard(),
                champData.getVi(), champData.getVayne(), champData.getShaco(), champData.getSyndra(), champData.getAshe(), champData.getEzreal(),
                champData.getJayce(), champData.getKarma(), champData.getCassiopeia(), champData.getGnar(), champData.getRiven(), champData.getViktor(),
                champData.getSoraka(), champData.getWukong(), champData.getIrelia(), champData.getJhin(), champData.getJinx(), champData.getTeemo(),
                champData.getFizz(), champData.getGangplank(), champData.getLulu(), champData.getThresh(), champData.getAurelionSol(), champData.getEkko(),
                champData.getUrgot(), champData.getJanna(),  champData.getXerath()).toMutableList()

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
                    1 -> { holder.imgCost.setBackgroundColor(Color.rgb(173,181,189)) }
                    2 -> { holder.imgCost.setBackgroundColor(Color.rgb(81,207,102)) }
                    3 -> { holder.imgCost.setBackgroundColor(Color.rgb(76,110,245)) }
                    4 -> { holder.imgCost.setBackgroundColor(Color.rgb(204,93,232)) }
                    5 -> { holder.imgCost.setBackgroundColor(Color.rgb(255,255,0)) }
                }
                holder.imgMain.setImageResource(items[position]?.imgPath)
                holder.txtMain.text = items[position]?.name
                holder.firstImgSyn.setImageResource(items[position]?.synergy[0]?.imgPath)
                holder.secondImgSyn.setImageResource(items[position]?.synergy[1]?.imgPath)
                holder.txtFirstSyn.text = items[position]?.synergy[0].name
                holder.txtSecondSyn.text = items[position]?.synergy[1].name
                holder.itemView.setOnClickListener {
                    holder.initialize(items.get(position))
                }
            }



            Champ.THREE_TYPE_SYN -> {
                (holder as ChampDetailViewHolder3Syn)
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
                holder.firstImgSyn.setImageResource(items[position]?.synergy[0]?.imgPath)
                holder.secondImgSyn.setImageResource(items[position]?.synergy[1]?.imgPath)
                holder.thirdImgSyn.setImageResource(items[position]?.synergy[2]?.imgPath)
                holder.txtFirstSyn.text = items[position]?.synergy[0].name
                holder.txtSecondSyn.text = items[position]?.synergy[1].name
                holder.txtThirdSyn.text = items[position]?.synergy[2].name
                holder.itemView.setOnClickListener {
                    holder.initialize_2(items.get(position))

                }
            }
        }
    }
}
