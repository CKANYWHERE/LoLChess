package com.lolchess.strategy.view.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.simulator_synergy.view.*

class SimulationSynergyViewHoler(view: View) : RecyclerView.ViewHolder(view)  {
    var imgView = view.imageView
    var txtSynergy = view.txtSynergy
    var txtSynergyNum = view.txtSynergyNum
}