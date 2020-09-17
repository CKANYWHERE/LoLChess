package com.lolchess.strategy.view.adapter

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.R
import com.lolchess.strategy.controller.database.SimulatorDB
import com.lolchess.strategy.controller.entity.SimulatorChamp
import com.lolchess.strategy.controller.entity.SimulatorSynergy
import com.lolchess.strategy.model.data.ChampData

import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.view.viewholder.ChampMainViewHolder
import com.lolchess.strategy.view.viewholder.ChampTirhdSynergyHolder
import java.lang.RuntimeException

class ChampMainAdapter(private var context : Context, private var items: MutableList<Champ>)// recycler view binding 해주는 클래스
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    interface ItemClickListener{
        fun onClick(view: View, position:Int, champ: Champ)
    }

    private var champCnt = 1
    private lateinit var itemClickListener: ItemClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  RecyclerView.ViewHolder
    {

        val view : View?


        return when (viewType){
            Champ.TWO_TYPE_SYN ->{
                view = LayoutInflater.from(parent.context).inflate(R.layout.champ_home_item, parent, false)
                ChampMainViewHolder(view)
            }
            Champ.THREE_TYPE_SYN ->{
                view = LayoutInflater.from(parent.context).inflate(R.layout.champ_home_item_three, parent, false)
                ChampTirhdSynergyHolder(view)
            }
            else -> throw  RuntimeException("알수 없는 뷰타입 오류")
        }

        Log.e("CreateChampViewHolder","onCreate")

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
            Log.e("filterChamp",allChamp.toString())
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
                (holder as ChampMainViewHolder)
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
                    itemClickListener.onClick(it,position,items[position])
                }
            }


            Champ.THREE_TYPE_SYN -> {
                (holder as ChampTirhdSynergyHolder)
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
                    itemClickListener.onClick(it,position,items[position])
                }
            }
        }
    }

    fun setItemClickListener(itemClickListener: ItemClickListener){
        this.itemClickListener = itemClickListener
    }


}
