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
        var combinedItems: List<Combined_items> = listOf(combinedData.Locket_of_the_Iron_Solari(), combinedData.Titan_Resolve(), combinedData.Giant_Slayer(), combinedData.Rapid_Firecannon(), combinedData.Guinsoo_Rageblade(),
                combinedData.Redemption(), combinedData.Bramble_Vest(),  combinedData.Trap_Claw(), combinedData.Thief_Gloves(), combinedData.Force_of_Nature(), combinedData.Rabadon_Deathcap(),  combinedData.Runaan_Hurricane(),
                combinedData.Luden_Echo(), combinedData.Hextech_Gunblade(), combinedData.Morellonomicon(), combinedData.Blade_of_the_Ruined_King(), combinedData.Infinity_Edge(), combinedData.Rebel_Medal(),
                combinedData.Star_Guardian_Charm(), combinedData.Jeweled_Gauntlet(), combinedData.Red_Buff(), combinedData.Zephar(),  combinedData.Spear_of_Shojin(), combinedData.Quicksilver(),
                combinedData.Protector_Chestguard(), combinedData.Guardian_Angel(), combinedData.Statikk_Shiv(), combinedData.Dark_Star_Heart(), combinedData.Frozen_Heart(), combinedData.Dragon_Claw(), combinedData.Warmog_Armor(),
                combinedData.Ionic_Spark(), combinedData.Infiltrator_Talons(), combinedData.Battlecast_Plating(), combinedData.Hand_of_Justice(), combinedData.Deathblade(), combinedData.ZzRot_Portal(), combinedData.Zeke_Herald(),
                combinedData.Celestial_Orb(), combinedData.Last_Whisper(), combinedData.Shroud_of_Stillness(),  combinedData.Sword_Breaker(), combinedData.Bloodthirster(), combinedData.Blue_Buff(), combinedData.Chalice_of_Power())


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