package com.lolchess.strategy.view.adapter

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.R
import com.lolchess.strategy.controller.entity.SimulatorSynergy
import com.lolchess.strategy.controller.viewmodel.SimualtorViewModel
import com.lolchess.strategy.model.data.SynergyData
import com.lolchess.strategy.view.viewholder.SimulationSynergyViewHoler

class SimulationSynergyAdapter(private var context : Context)// recycler view binding 해주는 클래스
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items = emptyList<SimulatorSynergy>()
    private lateinit var simulatorViewModel: SimualtorViewModel

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view : View?
        view = LayoutInflater.from(parent.context).inflate(R.layout.simulator_synergy, parent, false)
        return SimulationSynergyViewHoler(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val synergy = items[position]
        val synergymain: SynergyData = SynergyData()

        (holder as SimulationSynergyViewHoler)
        holder.imgView.setImageResource(synergy?.imgPath!!)
        holder.txtSynergy.text = synergy?.name
        holder.txtSynergyNum.text = synergy?.count.toString()

        /*
         시너지 색깔
        동 holder.imgView.setBackgroundColor(Color.rgb(206, 143, 125))
        은 holder.imgView.setBackgroundColor(Color.rgb(150, 182, 193))
        금 holder.imgView.setBackgroundColor(Color.rgb(232, 181, 64))
        */

        if (((synergy.count == 2 || synergy.count == 3) && synergy.imgPath == synergymain.getDivine().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getDusk().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getEnlightened().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getSharpShooter().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getBrawler().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getMystic().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getVanguard().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getDuelist().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getSpirit().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getKeeper().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getDazzler().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getAssassin().imgPath)
                || ((synergy.count == 2 )  && synergy.imgPath == synergymain.getSpirit().imgPath)
                || ((synergy.count == 2 )  && synergy.imgPath == synergymain.getDazzler().imgPath)
                || ((synergy.count == 2 )  && synergy.imgPath == synergymain.getAdept().imgPath)
                || ((synergy.count == 2 )  && synergy.imgPath == synergymain.getShade().imgPath)
                || ((synergy.count == 2 )  && synergy.imgPath == synergymain.getHunter().imgPath)
                || ((synergy.count == 3 || synergy.count == 4 || synergy.count == 5)  && synergy.imgPath == synergymain.getCultist().imgPath)
                || ((synergy.count == 3 || synergy.count == 4 || synergy.count == 5)  && synergy.imgPath == synergymain.getElderwood().imgPath)
                || ((synergy.count == 3 || synergy.count == 4 || synergy.count == 5)  && synergy.imgPath == synergymain.getWarlord().imgPath)
                || ((synergy.count == 3 || synergy.count == 4 || synergy.count == 5)  && synergy.imgPath == synergymain.getMage().imgPath)
                || ((synergy.count == 1)  && synergy.imgPath == synergymain.getNinja().imgPath)
                || ((synergy.count == 1)  && synergy.imgPath == synergymain.getExile().imgPath)){

            holder.imgView.setBackgroundColor(Color.rgb(206, 143, 125)) //동

        }else holder.imgView.setBackgroundColor(0)

        if ((synergy.count == 6 || synergy.count == 7 || synergy.count == 8) && synergy.imgPath == synergymain.getCultist().imgPath
                || ((synergy.count == 6 || synergy.count == 7 || synergy.count == 8) && synergy.imgPath == synergymain.getElderwood().imgPath)
                || ((synergy.count == 6 || synergy.count == 7 || synergy.count == 8) && synergy.imgPath == synergymain.getWarlord().imgPath)
                || ((synergy.count == 6 || synergy.count == 7 || synergy.count == 8) && synergy.imgPath == synergymain.getMage().imgPath)
                || ((synergy.count == 6 || synergy.count == 7) && synergy.imgPath == synergymain.getBrawler().imgPath)
                || (synergy.count == 6 && synergy.imgPath == synergymain.getDivine().imgPath)
                || (synergy.count == 6 && synergy.imgPath == synergymain.getVanguard().imgPath)
                || (synergy.count == 6 && synergy.imgPath == synergymain.getDuelist().imgPath)
                || ((synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getDusk().imgPath)
                || ((synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getKeeper().imgPath)
                || ((synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getSharpShooter().imgPath)
                || ((synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getMystic().imgPath)
                || ((synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getAssassin().imgPath)
                || ((synergy.count == 3 || synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getFortune().imgPath)
                || ((synergy.count == 3 || synergy.count == 4) && synergy.imgPath == synergymain.getMoonlight().imgPath)
                || (synergy.count == 4 && synergy.imgPath == synergymain.getNinja().imgPath)
                || (synergy.count == 4 && synergy.imgPath == synergymain.getDazzler().imgPath)
                || (synergy.count == 4 && synergy.imgPath == synergymain.getSpirit().imgPath)
                || (synergy.count == 4 && synergy.imgPath == synergymain.getHunter().imgPath)
                || (synergy.count == 4 && synergy.imgPath == synergymain.getAdept().imgPath)
                || (synergy.count == 3 && synergy.imgPath == synergymain.getShade().imgPath)
                || (synergy.count == 2 && synergy.imgPath == synergymain.getExile().imgPath)){
            holder.imgView.setBackgroundColor(Color.rgb(232, 181, 64)) //금

        }

        if (((synergy.count == 3) && synergy.imgPath == synergymain.getHunter().imgPath)
                ||((synergy.count == 4 || synergy.count == 5)&& synergy.imgPath == synergymain.getBrawler().imgPath)
                ||((synergy.count == 4 || synergy.count == 5)&& synergy.imgPath == synergymain.getEnlightened().imgPath)
                ||((synergy.count == 4 || synergy.count == 5)&& synergy.imgPath == synergymain.getVanguard().imgPath)
                ||((synergy.count == 4 || synergy.count == 5)&& synergy.imgPath == synergymain.getDuelist().imgPath)
                ||((synergy.count == 4 || synergy.count == 5)&& synergy.imgPath == synergymain.getDivine().imgPath)) {
            holder.imgView.setBackgroundColor(Color.rgb(150, 182, 193)) //은
        }

        if (synergy.count == 1 && synergy.imgPath == synergymain.getTormented().imgPath
                || synergy.imgPath == synergymain.gettheboss().imgPath
                || synergy.imgPath == synergymain.getEmperor().imgPath){
            holder.imgView.setBackgroundColor(Color.rgb(232, 181, 64)) //금
        }


    }
    fun setData(synergy: List<SimulatorSynergy>){
        this.items = synergy
        notifyDataSetChanged()

    }
}