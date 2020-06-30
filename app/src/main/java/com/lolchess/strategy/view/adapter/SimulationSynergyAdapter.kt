package com.lolchess.strategy.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.R
import com.lolchess.strategy.controller.entity.SimulatorChamp
import com.lolchess.strategy.controller.entity.SimulatorSynergy
import com.lolchess.strategy.view.viewholder.SimulationSynergyViewHoler
import com.lolchess.strategy.view.viewholder.SimulationViewHolder

class SimulationSynergyAdapter(private var context : Context)// recycler view binding 해주는 클래스
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items = emptyList<SimulatorSynergy>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view : View?
        view = LayoutInflater.from(parent.context).inflate(R.layout.simulator_synergy, parent, false)
        return SimulationSynergyViewHoler(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val synergy = items[position]
        (holder as SimulationSynergyViewHoler)
        holder.imgView.setImageResource(synergy?.imgPath!!)
        holder.txtSynergy.text = synergy?.name
        holder.txtSynergyNum.text = synergy?.count.toString()
    }

    fun setData(synergy: List<SimulatorSynergy>){
        this.items = synergy
        notifyDataSetChanged()
    }
}