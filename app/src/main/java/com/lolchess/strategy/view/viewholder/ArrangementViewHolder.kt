package com.lolchess.strategy.view.viewholder

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.model.Combined_items
import com.lolchess.strategy.model.Tips
import com.lolchess.strategy.model.data.Combined_Data
import com.lolchess.strategy.view.activity.ArrangementActivity
import com.lolchess.strategy.view.activity.ItemCombinedActivity
import com.lolchess.strategy.view.menu.Arrangement
import kotlinx.android.synthetic.main.activity_item_combined.view.itemImgMain
import kotlinx.android.synthetic.main.arrangement_cardview.view.*
import kotlinx.android.synthetic.main.item_combined_detail.view.*

class ArrangementViewHolder(var view: View) : RecyclerView.ViewHolder(view){ //cardview binding 해주는 클래스
    var tipCard = view.tipCard
    var tipImg = view.tipImg

    fun initialize(item: Tips) {
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