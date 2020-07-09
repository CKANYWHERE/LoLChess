package com.lolchess.strategy.view.viewholder

import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.model.Combined_items
import com.lolchess.strategy.model.data.Combined_Data
import com.lolchess.strategy.view.activity.ItemCombinedActivity
import kotlinx.android.synthetic.main.activity_item_combined.view.itemImgMain
import kotlinx.android.synthetic.main.item_combined_detail.view.*

class ItemCombinedViewHolder(var view: View) : RecyclerView.ViewHolder(view){ //cardview binding 해주는 클래스
    var itemImgMain = view.itemImgMain
    var itemTextMain = view.itemTextMainRe


    fun initialize(item: Combined_items) {
        val intent = Intent(view.context, ItemCombinedActivity::class.java )

        intent.putExtra("itemImgMain", item.imgPath.toString())
        intent.putExtra("itemTextMain", item.name)
        intent.putExtra("itemDescription", item.effect)
        intent.putExtra("itemImgBased1", item.based_item1.toString())
        intent.putExtra("itemImgBased2", item.based_item2.toString())


        view?.context.startActivity(intent)
    }

}