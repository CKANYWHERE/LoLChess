package com.lolchess.strategy.view.viewholder

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.model.Arrangement_tips
import com.lolchess.strategy.view.activity.ArrangementActivity
import kotlinx.android.synthetic.main.arrangement_cardview.view.*

class ArrangementViewHolder(var view: View) : RecyclerView.ViewHolder(view){ //cardview binding 해주는 클래스
    var tipCard = view.tipCard
    var tipImg = view.tipImg
    var tipText = view.tipText

    fun initialize(item: Arrangement_tips) {
        val intent = Intent(view.context, ArrangementActivity::class.java )

        intent.putExtra("tipTxtMain", item.name)
        intent.putExtra("tipImgMain", item.imgPath1.toString())
        intent.putExtra("tipImgSub", item.imgPath2.toString())
        intent.putExtra("tipTxt1", item.context1)
        intent.putExtra("tipTxt2", item.context2)
        intent.putExtra("tipTxt3", item.context3)



        view?.context.startActivity(intent)
    }

}