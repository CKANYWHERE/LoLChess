package com.lolchess.strategy.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.R
import com.lolchess.strategy.controller.entity.SimulatorChamp
import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.view.viewholder.ChampMainViewHolder
import com.lolchess.strategy.view.viewholder.SimulationViewHolder
import kotlinx.android.synthetic.main.simulator_item.view.*

class SimulationAdapter(private var context : Context)// recycler view binding 해주는 클래스
    : RecyclerView.Adapter<RecyclerView.ViewHolder>()  {

    interface ItemClickListener{
        fun onClick(view: View, position:Int, champ: SimulatorChamp)
    }

    private var items = emptyList<SimulatorChamp>()
    private lateinit var itemClickListener: ItemClickListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view : View?
        view = LayoutInflater.from(parent.context).inflate(R.layout.simulator_item, parent, false)
        return SimulationViewHolder(view)
    }

    override fun getItemCount():Int = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val champ = items[position]
        (holder as SimulationViewHolder)

        holder.imgView.setImageResource(champ?.imgPath!!)
        holder.txtCost.text = champ?.cost.toString() + "cost"
        holder.txtName.text = champ?.name
        holder.itemView.setOnClickListener {
            itemClickListener.onClick(it,position,champ)
        }
    }

    fun setData(champ: List<SimulatorChamp>){
        this.items = champ
        notifyDataSetChanged()
    }

    fun setItemClickListener(itemClickListener: ItemClickListener){
        this.itemClickListener = itemClickListener
    }
}