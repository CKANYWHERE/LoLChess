package com.lolchess.strategy.view.menu

import android.media.Image
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.drawable.toBitmap
import androidx.core.view.size
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.lolchess.strategy.R
import com.lolchess.strategy.model.Based_items
import com.lolchess.strategy.model.Combined_items
import com.lolchess.strategy.model.data.Based_Data
import com.lolchess.strategy.model.data.Combined_Data
import com.lolchess.strategy.view.activity.replaceFragment
import kotlinx.android.synthetic.main.items_fragment.*
import kotlinx.android.synthetic.main.items_fragment.adView
import kotlinx.android.synthetic.main.simulator_fragment.*
import kotlinx.android.synthetic.main.simulator_item.view.*

class Items : Fragment() {

    companion object {
        fun newInstance() = Items()
    }

    private lateinit var combinedItems: MutableList<Combined_items>
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater.inflate(R.layout.items_fragment, container, false)
        val item1: ImageButton = v.findViewById(R.id.item1)
        val item2: ImageButton = v.findViewById(R.id.item2)
        val item3: ImageButton = v.findViewById(R.id.item3)
        val item4: ImageButton = v.findViewById(R.id.item4)
        val item5: ImageButton = v.findViewById(R.id.item5)
        val item6: ImageButton = v.findViewById(R.id.item6)
        val item7: ImageButton = v.findViewById(R.id.item7)
        val item8: ImageButton = v.findViewById(R.id.item8)
        val item9: ImageButton = v.findViewById(R.id.item9)
        val based_item1: ImageButton = v.findViewById(R.id.based_item1)
        val based_item2: ImageButton = v.findViewById(R.id.based_item2)
        var isFull = false
        MobileAds.initialize(context)

        val baseItemData = Based_Data()
        var basedItems: List<Based_items> = listOf(baseItemData.B_F_Sword(), baseItemData.Recurve_Bow(), baseItemData.Chain_Vest(), baseItemData.Negatron_Cloak()
                , baseItemData.Needlessly_Large_Rod(), baseItemData.Tear_of_the_Goddess(), baseItemData.Giant_Belt(), baseItemData.Spatula(), baseItemData.Sparring_Gloves())
        val combinedData = Combined_Data()
        combinedItems = listOf(combinedData.Mantle_of_Dusk(), combinedData.Sword_Of_the_Divine(), combinedData.Bloodthirster(), combinedData.Blue_Buff(),
                combinedData.Bramble_Vest(), combinedData.Elderwood_Heirloom(), combinedData.Chalice_of_Power(), combinedData.Youmuus_Ghostblade(), combinedData.Deathblade(), combinedData.Dragon_Claw(),
                combinedData.Force_of_Nature(), combinedData.Frozen_Heart(), combinedData.Giant_Slayer(), combinedData.Guardian_Angel(), combinedData.Guinsoo_Rageblade(), combinedData.Hand_of_Justice(),
                combinedData.Hextech_Gunblade(), combinedData.Duelists_Zeal(), combinedData.Infinity_Edge(), combinedData.Ionic_Spark(), combinedData.Jeweled_Gauntlet(), combinedData.Last_Whisper(),
                combinedData.Locket_of_the_Iron_Solari(), combinedData.Luden_Echo(), combinedData.Morellonomicon(), combinedData.Warlords_Banner(), combinedData.Quicksilver(), combinedData.Rabadon_Deathcap(),
                combinedData.Rapid_Firecannon(), combinedData.Vanguards_Cuirass(), combinedData.Sunfire_Cape(), combinedData.Redemption(), combinedData.Runaan_Hurricane(), combinedData.Shroud_of_Stillness(),
                combinedData.Spear_of_Shojin(), combinedData.Mages_Cap(), combinedData.Statikk_Shiv(), combinedData.Gargoyle(), combinedData.Thief_gloves(), combinedData.Titan_Resolve(),
                combinedData.Trap_Claw(), combinedData.Warmog_Armor(), combinedData.Zeke_Herald(), combinedData.Zephar(), combinedData.ZzRot_Portal()).toMutableList()

        var curItem : MutableList<Int> = emptyList<Int>().toMutableList()

        item1.setOnClickListener {

            if (!isFull) {
                based_item1.setImageResource(basedItems[0].imgPath)

                isFull = true
            } else {
                based_item2.setImageResource(basedItems[0].imgPath)
            }

            if(curItem.size < 2){
                curItem.add(basedItems[0].imgPath)
            }else{
                curItem[1] = basedItems[0].imgPath
            }
            Log.e("size",curItem.size.toString())
            Log.e("item",curItem.toString())
            setItem(curItem)
        }
        item2.setOnClickListener {

            if (!isFull) {
                based_item1.setImageResource(basedItems[1].imgPath)
                isFull = true
            } else {
                based_item2.setImageResource(basedItems[1].imgPath)
            }

            if(curItem.size < 2){
                curItem.add(basedItems[1].imgPath)
            }else{
                curItem[1] = basedItems[1].imgPath
            }
            Log.e("size",curItem.size.toString())
            Log.e("item",curItem.toString())
            setItem(curItem)
        }
        item3.setOnClickListener {

            if (!isFull) {
                based_item1.setImageResource(basedItems[2].imgPath)
                isFull = true
            } else {
                based_item2.setImageResource(basedItems[2].imgPath)
            }
            if(curItem.size < 2){
                curItem.add(basedItems[2].imgPath)
            }else{
                curItem[1] = basedItems[2].imgPath
            }
            Log.e("size",curItem.size.toString())
            Log.e("item",curItem.toString())
            setItem(curItem)
        }
        item4.setOnClickListener {

            if (!isFull) {
                based_item1.setImageResource(basedItems[3].imgPath)
                isFull = true
            } else {
                based_item2.setImageResource(basedItems[3].imgPath)
            }
            if(curItem.size < 2){
                curItem.add(basedItems[3].imgPath)
            }else{
                curItem[1] = basedItems[3].imgPath
            }
            Log.e("size",curItem.size.toString())
            Log.e("item",curItem.toString())
            setItem(curItem)
        }
        item5.setOnClickListener {
            if (!isFull) {
                based_item1.setImageResource(basedItems[4].imgPath)
                isFull = true
            } else {
                based_item2.setImageResource(basedItems[4].imgPath)
            }
            if(curItem.size < 2){
                curItem.add(basedItems[4].imgPath)
            }else{
                curItem[1] = basedItems[4].imgPath
            }
            Log.e("size",curItem.size.toString())
            Log.e("item",curItem.toString())
            setItem(curItem)
        }
        item6.setOnClickListener {
            if (!isFull) {
                based_item1.setImageResource(basedItems[5].imgPath)
                isFull = true
            } else {
                based_item2.setImageResource(basedItems[5].imgPath)
            }
            if(curItem.size < 2){
                curItem.add(basedItems[5].imgPath)
            }else{
                curItem[1] = basedItems[5].imgPath
            }
            Log.e("size",curItem.size.toString())
            Log.e("item",curItem.toString())
            setItem(curItem)
        }
        item7.setOnClickListener {
            if (!isFull) {
                based_item1.setImageResource(basedItems[6].imgPath)
                isFull = true
            } else {
                based_item2.setImageResource(basedItems[6].imgPath)
            }
            if(curItem.size < 2){
                curItem.add(basedItems[6].imgPath)
            }else{
                curItem[1] = basedItems[6].imgPath
            }
            Log.e("size",curItem.size.toString())
            Log.e("item",curItem.toString())
            setItem(curItem)
        }
        item8.setOnClickListener {
            if (!isFull) {
                based_item1.setImageResource(basedItems[7].imgPath)
                isFull = true
            } else {
                based_item2.setImageResource(basedItems[7].imgPath)
            }
            if(curItem.size < 2){
                curItem.add(basedItems[7].imgPath)
            }else{
                curItem[1] = basedItems[7].imgPath
            }
            Log.e("size",curItem.size.toString())
            Log.e("item",curItem.toString())
            setItem(curItem)
        }
        item9.setOnClickListener {
            if (!isFull) {
                based_item1.setImageResource(basedItems[8].imgPath)
                isFull = true
            } else {
                based_item2.setImageResource(basedItems[8].imgPath)
            }
            if(curItem.size < 2){
                curItem.add(basedItems[8].imgPath)
            }else{
                curItem[1] = basedItems[8].imgPath
            }
            Log.e("size",curItem.size.toString())
            Log.e("item",curItem.toString())
            setItem(curItem)
        }

        based_item1?.setOnClickListener {
            if(curItem.size == 1){
                curItem.removeAt(0)
                based_item1.setImageDrawable(null)
                isFull = false
                Log.e("sizetest",curItem.size.toString())
            }
            if(curItem.size == 2){
                curItem.removeAt(0)
                based_item1.setImageResource(curItem[0])
                based_item2.setImageDrawable(null)
                Log.e("sizetest",curItem.size.toString())
            }


            Log.e("size",curItem.size.toString())
            Log.e("item",curItem.toString())

        }


        based_item2?.setOnClickListener {
            if(curItem.size >= 1) {
                if (isFull) {
                    curItem.removeAt(1)
                    based_item2.setImageDrawable(null)
                    isFull = false
                } else {
                    curItem.removeAt(0)
                    based_item1.setImageDrawable(null)
                }
            }
            Log.e("size",curItem.size.toString())
            Log.e("item",curItem.toString())
        }


        // 완성아이템 가는 버튼
        val context = activity as AppCompatActivity
        val combinedbtn: Button = v.findViewById(R.id.combinedbtn)

        // Replace fragment
        combinedbtn.setOnClickListener {
            context.replaceFragment(Items_combined())
        }

        return v
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val baseItemData = Based_Data()
        var basedItems: List<Based_items> = listOf(baseItemData.B_F_Sword(), baseItemData.Recurve_Bow(), baseItemData.Chain_Vest(), baseItemData.Negatron_Cloak()
                , baseItemData.Needlessly_Large_Rod(), baseItemData.Tear_of_the_Goddess(), baseItemData.Giant_Belt(), baseItemData.Spatula(), baseItemData.Sparring_Gloves())


        item1.setImageResource(basedItems[0].imgPath)
        item2.setImageResource(basedItems[1].imgPath)
        item3.setImageResource(basedItems[2].imgPath)
        item4.setImageResource(basedItems[3].imgPath)
        item5.setImageResource(basedItems[4].imgPath)
        item6.setImageResource(basedItems[5].imgPath)
        item7.setImageResource(basedItems[6].imgPath)
        item8.setImageResource(basedItems[7].imgPath)
        item9.setImageResource(basedItems[8].imgPath)
        initAd()
    }

    private fun setItem(curItem :MutableList<Int>) {
        if(curItem.size == 2){
            var tmpList : MutableList<Combined_items> = emptyList<Combined_items>().toMutableList()

            if(curItem[0] == curItem[1]){
                for(items in combinedItems){
                    if(items.based_item1 == curItem[0] && items.based_item2 == curItem[1]){
                        combined_item.setImageResource(items.imgPath)
                    }
                }
            }else{
                for(items in combinedItems){
                    if ((items.based_item1 == curItem[0] || items.based_item1 == curItem[1])){
                        tmpList.add(items)
                    }
                }

                Log.e("tmpList",tmpList.toString())

                for(items in tmpList){
                    if(items.based_item2 == curItem[0] || items.based_item2 == curItem[1]){
                        if(items.based_item1 != items.based_item2){
                            Log.e("item",items.toString())
                            combined_item.setImageResource(items.imgPath)
                        }
                    }
                }
            }


        }else{
            return
        }
    }
    private fun initAd() {
        val adBuilder = AdRequest.Builder().build()
        adView.loadAd(adBuilder)
    }
}
