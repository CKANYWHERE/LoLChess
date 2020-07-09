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

    fun filter(query : String?){

        val combinedData = Combined_Data()
        var combinedItems: MutableList<Combined_items> = listOf(combinedData.Battlecast_Plating(), combinedData.Blade_of_the_Ruined_King(), combinedData.Bloodthirster(), combinedData.Blue_Buff(),
                combinedData.Bramble_Vest(), combinedData.Celestial_Orb(), combinedData.Chalice_of_Power(), combinedData.Dark_Star_Heart(), combinedData.Deathblade(), combinedData.Dragon_Claw(),
                combinedData.Force_of_Nature(), combinedData.Frozen_Heart(), combinedData.Giant_Slayer(), combinedData.Guardian_Angel(), combinedData.Guinsoo_Rageblade(), combinedData.Hand_of_Justice(),
                combinedData.Hextech_Gunblade(), combinedData.Infiltrator_Talons(), combinedData.Infinity_Edge(), combinedData.Ionic_Spark(), combinedData.Jeweled_Gauntlet(), combinedData.Last_Whisper(),
                combinedData.Locket_of_the_Iron_Solari(), combinedData.Luden_Echo(), combinedData.Morellonomicon(), combinedData.Protector_Chestguard(), combinedData.Quicksilver(), combinedData.Rabadon_Deathcap(),
                combinedData.Rapid_Firecannon(), combinedData.Rebel_Medal(), combinedData.Red_Buff(), combinedData.Redemption(), combinedData.Runaan_Hurricane(), combinedData.Shroud_of_Stillness(),
                combinedData.Spear_of_Shojin(), combinedData.Star_Guardian_Charm(), combinedData.Statikk_Shiv(), combinedData.Sword_Breaker(), combinedData.Thief_Gloves(), combinedData.Titan_Resolve(),
                combinedData.Trap_Claw(), combinedData.Warmog_Armor(), combinedData.Zeke_Herald(), combinedData.Zephar(), combinedData.ZzRot_Portal())
                .toMutableList()

        if(query?.isEmpty()!!){
            items.clear()
            items.addAll(combinedItems)
        }else{
            items.clear()
            for(item in combinedItems){
                if(item!!.name.contains(query))
                    items.add(item)
            }
        }
        notifyDataSetChanged()
    }

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val combinedItems: Combined_items = items[position]
        (holder as ItemCombinedViewHolder)
        holder.itemImgMain.setImageResource(items[position]?.imgPath)
        holder.itemTextMain.text =  items[position]?.name
        holder.itemView.setOnClickListener {
            holder.initialize(items.get(position))
        }
    }
}
