package com.lolchess.strategy.view.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.simulator_item.view.*

class SimulationViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var imgView = view.imageView
    var txtName = view.txtName
    var txtCost = view.txtCost
}