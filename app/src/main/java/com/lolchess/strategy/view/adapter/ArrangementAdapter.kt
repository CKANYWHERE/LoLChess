package com.lolchess.strategy.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.R
import com.lolchess.strategy.model.Arrangement_tips
import com.lolchess.strategy.view.viewholder.ArrangementViewHolder


class ArrangementAdapter(private var items: MutableList<Arrangement_tips>)// recycler view binding 해주는 클래스
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  RecyclerView.ViewHolder{
        val view: View?

        view = LayoutInflater.from(parent.context).inflate(R.layout.arrangement_cardview, parent, false)
        return ArrangementViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ArrangementViewHolder)
        holder.tipImg.setImageResource(items[position]?.imgPath1)
        holder.tipCard.text =  items[position]?.name
        holder.tipText.text = items[position]?.subText
        holder.itemView.setOnClickListener {
            holder.initialize(items.get(position))
        }
    }
}
