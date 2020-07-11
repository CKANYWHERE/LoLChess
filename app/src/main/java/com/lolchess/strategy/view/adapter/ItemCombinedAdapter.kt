package com.lolchess.strategy.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.R
import com.lolchess.strategy.model.Combined_items
import com.lolchess.strategy.model.data.Combined_Data

import com.lolchess.strategy.view.viewholder.ItemCombinedViewHolder


class ItemCombinedAdapter(private var items: MutableList<Combined_items>)// recycler view binding 해주는 클래스
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  RecyclerView.ViewHolder{
        val view: View?

        view = LayoutInflater.from(parent.context).inflate(R.layout.item_combined_detail, parent, false)
        return ItemCombinedViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ItemCombinedViewHolder)
        holder.itemImgMain.setImageResource(items[position]?.imgPath)
        holder.itemTextMain.text =  items[position]?.name
        holder.itemView.setOnClickListener {
            holder.initialize(items.get(position))
        }
    }
}
