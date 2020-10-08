package com.lolchess.strategy.view.viewholder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.tips_detail.view.*

class TipsViewHolder(var view: View) : RecyclerView.ViewHolder(view){ //cardview binding 해주는 클래스
    var tipText = view.tip_text

}