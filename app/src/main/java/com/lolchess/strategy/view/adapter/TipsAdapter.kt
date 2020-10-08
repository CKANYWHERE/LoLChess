package com.lolchess.strategy.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.R
import com.lolchess.strategy.model.Simple_Tips
import com.lolchess.strategy.view.viewholder.TipsViewHolder

class TipsAdapter (private var items: MutableList<Simple_Tips>)// recycler view binding 해주는 클래스
    : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):  RecyclerView.ViewHolder{
        val view: View?

        view = LayoutInflater.from(parent.context).inflate(R.layout.tips_detail, parent, false)
        return TipsViewHolder(view)
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as TipsViewHolder)
        holder.tipText.text = items[position]?.tip
        holder.itemView.setOnClickListener {
        }
    }
}