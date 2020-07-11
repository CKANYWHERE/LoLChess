package com.lolchess.strategy.view.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recommend_meta_item.view.*

class RecommendMetaViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var name = view.txtMetaName
    var lytChamp = view.lytChamp
    var lytSyn = view.lytSyn
}