package com.lolchess.strategy.view.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.lolchess.strategy.R
import com.lolchess.strategy.model.Combined_items
import com.lolchess.strategy.model.data.Combined_Data
import com.lolchess.strategy.view.activity.replaceFragment
import com.lolchess.strategy.view.adapter.ItemCombinedAdapter
import kotlinx.android.synthetic.main.champion_synergy.*
import kotlinx.android.synthetic.main.combined_fragment.*

class Items_combined() : Fragment() {

    companion object {
        fun newInstance() = Items_combined()
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.combined_fragment, container, false)

        // Get the activity and widget
        val context = activity as AppCompatActivity
        val basedbtn: Button = v.findViewById(R.id.basedbtn)

        // Replace fragment
        basedbtn.setOnClickListener {
            context.replaceFragment(Items())
        }
        MobileAds.initialize(context)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAd()
        val combinedData = Combined_Data()
        var combinedItems: List<Combined_items> = listOf( combinedData.Bloodthirster(), combinedData.Blue_Buff(), combinedData.Bramble_Vest(),  combinedData.Chalice_of_Power(), combinedData.Deathblade(),
                combinedData.Dragon_Claw(), combinedData.Force_of_Nature(), combinedData.Frozen_Heart(), combinedData.Giant_Slayer(), combinedData.Guardian_Angel(),
                combinedData.Guinsoo_Rageblade(), combinedData.Hand_of_Justice(), combinedData.Hextech_Gunblade(), combinedData.Duelists_Zeal(), combinedData.Infinity_Edge(),
                combinedData.Ionic_Spark(), combinedData.Jeweled_Gauntlet(), combinedData.Last_Whisper(), combinedData.Locket_of_the_Iron_Solari(), combinedData.Luden_Echo(),
                combinedData.Morellonomicon(), combinedData.Quicksilver(), combinedData.Rabadon_Deathcap(), combinedData.Rapid_Firecannon(), combinedData.Sunfire_Cape(),
                combinedData.Redemption(), combinedData.Runaan_Hurricane(), combinedData.Shroud_of_Stillness(), combinedData.Spear_of_Shojin(),  combinedData.Statikk_Shiv(),
                combinedData.Gargoyle(), combinedData.Thief_gloves(), combinedData.Titan_Resolve(), combinedData.Trap_Claw(), combinedData.Warmog_Armor(),
                combinedData.Zeke_Herald(), combinedData.Zephar(), combinedData.ZzRot_Portal(), combinedData.Mantle_of_Dusk(), combinedData.Sword_Of_the_Divine(),
                combinedData.Elderwood_Heirloom(),combinedData.Mages_Cap(),combinedData.Vanguards_Cuirass(), combinedData.Warlords_Banner(), combinedData.Youmuus_Ghostblade())


        val combined = combinedItems.toMutableList()

        val mAdapter = ItemCombinedAdapter(combined)
        combinedRecycler?.adapter = mAdapter
        combinedRecycler?.layoutManager = GridLayoutManager(view.context, 3)
    }
    private fun initAd() {
        val adBuilder = AdRequest.Builder().build()
        adViewCominedItem.loadAd(adBuilder)
    }
}