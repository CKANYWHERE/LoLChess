package com.lolchess.strategy.view.adapter

import android.content.Context
import android.graphics.Color
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        if (((synergy.count == 2 || synergy.count == 3) && synergy.imgPath == synergymain.getBattlecast().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getChrono().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getSorcerer().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getBrawler().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getMystic().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getVanguard().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getInfiltrator().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getDarkStar().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getCelestial().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getSpacePirate().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getProtector().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getSniper().imgPath)
                || ((synergy.count == 2 || synergy.count == 3)  && synergy.imgPath == synergymain.getBlaster().imgPath)){
            synergy.color = 3

            holder.imgView.setBackgroundColor(Color.rgb(206, 143, 125))

        }else holder.imgView.setBackgroundColor(0)

        if ((synergy.count == 2 && synergy.imgPath == synergymain.getManaReaver().imgPath)
                || (synergy.count == 2 && synergy.imgPath == synergymain.getDemolitionist().imgPath)){
            synergy.color = 1
            holder.imgView.setBackgroundColor(Color.rgb(232, 181, 64))

        }
        if ((synergy.count == 3 && synergy.imgPath == synergymain.getMechPilot().imgPath)
                || (synergy.count == 3 && synergy.imgPath == synergymain.getAstro().imgPath)){
            synergy.color = 1
            holder.imgView.setBackgroundColor(Color.rgb(232, 181, 64))
        }
        Log.e("synergycount", synergy.count.toString())

        if ( ((synergy.count == 3 || synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getCybernetic().imgPath)
                || ((synergy.count == 3 || synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getBladmaster().imgPath)
                || ((synergy.count == 3 || synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getRebel().imgPath)
                || ((synergy.count == 3 || synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getStarGuardian().imgPath)){
            synergy.color = 3
            holder.imgView.setBackgroundColor(Color.rgb(206, 143, 125))
        }

        if ((synergy.count == 4 && synergy.imgPath == synergymain.getBrawler().imgPath)
                || (synergy.count == 4 && synergy.imgPath == synergymain.getMystic().imgPath)
                || (synergy.count == 4 && synergy.imgPath == synergymain.getSpacePirate().imgPath)
                || (synergy.count == 4 && synergy.imgPath == synergymain.getSniper().imgPath)
                || (synergy.count == 4 && synergy.imgPath == synergymain.getBlaster().imgPath)
                || (synergy.count == 4 && synergy.imgPath == synergymain.getInfiltrator().imgPath)
                || (synergy.count == 4 && synergy.imgPath == synergymain.getProtector().imgPath)) {
            synergy.color = 1
            
            holder.imgView.setBackgroundColor(Color.rgb(232, 181, 64))
        }
        if (synergy.count == 6 && synergy.imgPath == synergymain.getStarGuardian().imgPath
                || (synergy.count == 6 && synergy.imgPath == synergymain.getChrono().imgPath)
                || (synergy.count == 6 && synergy.imgPath == synergymain.getCybernetic().imgPath)
                || (synergy.count == 6 && synergy.imgPath == synergymain.getDarkStar().imgPath)
                || (synergy.count == 6 && synergy.imgPath == synergymain.getRebel().imgPath)
                || (synergy.count == 6 && synergy.imgPath == synergymain.getBattlecast().imgPath)
                || (synergy.count == 6 && synergy.imgPath == synergymain.getCelestial().imgPath)
                || (synergy.count == 6 && synergy.imgPath == synergymain.getBladmaster().imgPath)
                || (synergy.count == 6 && synergy.imgPath == synergymain.getSorcerer().imgPath)
                || (synergy.count == 6 && synergy.imgPath == synergymain.getVanguard().imgPath)){
            synergy.color = 1
            holder.imgView.setBackgroundColor(Color.rgb(232, 181, 64))

        }

        if (((synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getBattlecast().imgPath)
                ||((synergy.count == 4 || synergy.count == 5)&& synergy.imgPath == synergymain.getSorcerer().imgPath)
                ||((synergy.count == 4 || synergy.count == 5)&& synergy.imgPath == synergymain.getVanguard().imgPath)
                ||((synergy.count == 4 || synergy.count == 5)&& synergy.imgPath == synergymain.getDarkStar().imgPath)
                ||((synergy.count == 4 || synergy.count == 5)&& synergy.imgPath == synergymain.getCelestial().imgPath)
                ||((synergy.count == 4 || synergy.count == 5)&& synergy.imgPath == synergymain.getChrono().imgPath)) {
            synergy.color = 2
            holder.imgView.setBackgroundColor(Color.rgb(150, 182, 193))
        }


        if (synergy.count == 1){
            holder.imgView.setBackgroundColor(0)
        }


        if (synergy.count == 1 && synergy.imgPath == synergymain.getMercenary().imgPath
                || synergy.imgPath == synergymain.getParagon().imgPath
                || synergy.imgPath == synergymain.getStarship().imgPath){
            synergy.color = 1

            holder.imgView.setBackgroundColor(Color.rgb(232, 181, 64))
        }


    }
    fun setData(synergy: List<SimulatorSynergy>){
        this.items = synergy
        notifyDataSetChanged()

    }
}