package com.lolchess.strategy.view.menu

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Space
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.lolchess.strategy.R
import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.model.data.ChampData
import com.lolchess.strategy.view.activity.replaceFragment
import com.lolchess.strategy.view.adapter.ChampDetailAdapter
import kotlinx.android.synthetic.main.champion_synergy.*
import kotlinx.android.synthetic.main.champion_synergy.champDetailRecyclerView1
import kotlinx.android.synthetic.main.champion_synergy.champDetailRecyclerView2
import kotlinx.android.synthetic.main.champion_synergy.champDetailRecyclerView3
import kotlinx.android.synthetic.main.champion_synergy.champDetailRecyclerView4
import kotlinx.android.synthetic.main.champion_synergy.champDetailRecyclerView5
import kotlinx.android.synthetic.main.simulator_fragment.*
import kotlinx.android.synthetic.main.simulator_fragment.searchView
import kotlinx.android.synthetic.main.synergy_arrangement.*

class SynergyArrangement: Fragment() {

    companion object {
        fun newInstance() = SynergyArrangement()
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.synergy_arrangement, container, false)

        // Get the activity and widget
        val context = activity as AppCompatActivity
        val costbtn: Button = v.findViewById(R.id.costbtn)

        // Replace fragment
        costbtn.setOnClickListener {
            context.replaceFragment(ChampionSynergy())
        }
        MobileAds.initialize(context)
        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val champData = ChampData()
        initAd()
        //계열 클래스
        val Cultist: List<Champ> =
                listOf(champData.getTwistedFate(), champData.getElise(), champData.getPyke(), champData.getKalista(), champData.getAatrox(), champData.getJhin(), champData.getZilean())


        val ElderWood: List<Champ> =
                listOf(champData.getMaokai(), champData.getLulu(), champData.getHecarim(), champData.getNunu(), champData.getVeigar(),
                        champData.getAshe(), champData.getEzreal())

        val Ninja: List<Champ> =
                listOf(champData.getZed(), champData.getAkali(), champData.getKennen(), champData.getShen())


        val MoonLight: List<Champ> =
                listOf(champData.getDiana(), champData.getLissandra(), champData.getSylas(), champData.getAphelios())


        val WarLord: List<Champ> =
                listOf(champData.getGaren(), champData.getNidalee(), champData.getVi(), champData.getJarvanIV(), champData.getXinZhao(),
                        champData.getKatarina(), champData.getAzir())


        val Tormented: List<Champ> =
                listOf(champData.getKayn())

        val Enlightened: List<Champ> =
                listOf(champData.getNami(), champData.getFiora(), champData.getJanna(), champData.getIrelia(), champData.getMorgana(), champData.getTalon())

        val Divine: List<Champ> =
                listOf(champData.getWukong(), champData.getJax(), champData.getLux(), champData.getIrelia(), champData.getWarwick(), champData.getLeeSin())

        val Spirit: List<Champ> =
                listOf(champData.getTeemo(), champData.getKindred(), champData.getYuumi(), champData.getAhri())

        val TheBoss: List<Champ> =
                listOf(champData.getSett())

        val Exile: List<Champ> =
                listOf(champData.getYasuo(), champData.getYone())

        val Fortune: List<Champ> =
                listOf(champData.getTahmKench(), champData.getAnnie(), champData.getJinx(), champData.getKatarina(), champData.getSejuani())

        val Dusk: List<Champ> =
                listOf(champData.getVayne(), champData.getThresh(), champData.getRiven(), champData.getCassiopeia(), champData.getLillia())


        //직업 시너지

        val Duelist: List<Champ> =
                listOf(champData.getYasuo(), champData.getFiora(), champData.getJax(), champData.getXinZhao(),
                        champData.getKalista(), champData.getLeeSin())

        val Keeper: List<Champ> =
                listOf(champData.getElise(), champData.getJarvanIV(), champData.getKennen(), champData.getRiven(), champData.getAzir())


        val Shade: List<Champ> =
                listOf(champData.getZed(), champData.getEvelynn(), champData.getKayn())


        val SharpShooter: List<Champ> =
                listOf(champData.getNidalee(), champData.getVayne(), champData.getTeemo(), champData.getJinx(), champData.getJhin())

        val Hunter: List<Champ> =
                listOf(champData.getAphelios(), champData.getKindred(), champData.getAshe(), champData.getWarwick())

        val Vanguard: List<Champ> =
                listOf(champData.getGaren(), champData.getWukong(), champData.getThresh(), champData.getHecarim(), champData.getSejuani(), champData.getAatrox())

        val Mystic: List<Champ> =
                listOf(champData.getJanna(), champData.getYuumi(), champData.getShen(), champData.getCassiopeia(), champData.getZilean())

        val Brawler: List<Champ> =
                listOf(champData.getTahmKench(), champData.getMaokai(), champData.getVi(), champData.getSylas(), champData.getNunu(), champData.getWarwick(), champData.getSett())

        val Assassin: List<Champ> =
                listOf(champData.getDiana(), champData.getPyke(), champData.getAkali(), champData.getKatarina(), champData.getTalon())

        val Mage: List<Champ> =
                listOf(champData.getTwistedFate(), champData.getNami(), champData.getLulu(), champData.getAnnie(), champData.getVeigar(), champData.getAhri(), champData.getLillia())

        val Adept: List<Champ> =
                listOf(champData.getIrelia(), champData.getShen(), champData.getYone())

        val Dazzler: List<Champ> =
                listOf(champData.getLissandra(), champData.getLux(), champData.getMorgana(), champData.getEzreal())

        val Emperor: List<Champ> =
                listOf(champData.getAzir())


        //계열 시너지
        val CultistList = Cultist.toMutableList()
        val ElderWoodList = ElderWood.toMutableList()
        val NinjaList = Ninja.toMutableList()
        val MoonLightList = MoonLight.toMutableList()
        val WarLordList = WarLord.toMutableList()
        val TormentedList = Tormented.toMutableList()
        val EnlightenedList = Enlightened.toMutableList()
        val DivineList = Divine.toMutableList()
        val SpiritList = Spirit.toMutableList()
        val TheBossList = TheBoss.toMutableList()
        val ExileList = Exile.toMutableList()
        val FortuneList = Fortune.toMutableList()
        val DuskList = Dusk.toMutableList()


        //직업 시너지
        val DuelistList = Duelist.toMutableList()
        val KeeperList = Keeper.toMutableList()
        val ShadeList = Shade.toMutableList()
        val SharpShooterList = SharpShooter.toMutableList()
        val HunterList = Hunter.toMutableList()
        val VanguardList = Vanguard.toMutableList()
        val MysticList = Mystic.toMutableList()
        val BrawlerList = Brawler.toMutableList()
        val AssassinList = Assassin.toMutableList()
        val MageList = Mage.toMutableList()
        val AdeptList = Adept.toMutableList()
        val DazzlerList = Dazzler.toMutableList()
        val EmperorList = Emperor.toMutableList()

        //계열 시너지 어댑터
        val mechAdapter = ChampDetailAdapter(CultistList)
        champDetailRecyclerView1?.adapter = mechAdapter
        champDetailRecyclerView1?.layoutManager = GridLayoutManager(view.context, 3)

        val ElderWoodAdapter = ChampDetailAdapter(ElderWoodList)
        champDetailRecyclerView2?.adapter = ElderWoodAdapter
        champDetailRecyclerView2?.layoutManager = GridLayoutManager(view.context, 3)

        val NinjaAdapter = ChampDetailAdapter(NinjaList)
        champDetailRecyclerView3?.adapter = NinjaAdapter
        champDetailRecyclerView3?.layoutManager = GridLayoutManager(view.context, 3)

        val MoonLightAdapter = ChampDetailAdapter(MoonLightList)
        champDetailRecyclerView4?.adapter = MoonLightAdapter
        champDetailRecyclerView4?.layoutManager = GridLayoutManager(view.context, 3)

        val WarLordAdapter = ChampDetailAdapter(WarLordList)
        champDetailRecyclerView5?.adapter = WarLordAdapter
        champDetailRecyclerView5?.layoutManager = GridLayoutManager(view.context, 3)

        val TormentedAdapter = ChampDetailAdapter(TormentedList)
        champDetailRecyclerView6?.adapter = TormentedAdapter
        champDetailRecyclerView6?.layoutManager = GridLayoutManager(view.context, 3)

        val EnlightenedAdapter = ChampDetailAdapter(EnlightenedList)
        champDetailRecyclerView7?.adapter = EnlightenedAdapter
        champDetailRecyclerView7?.layoutManager = GridLayoutManager(view.context, 3)

        val DivineAdapter = ChampDetailAdapter(DivineList)
        champDetailRecyclerView8?.adapter = DivineAdapter
        champDetailRecyclerView8?.layoutManager = GridLayoutManager(view.context, 3)

        val SpiritAdapter = ChampDetailAdapter(SpiritList)
        champDetailRecyclerView9?.adapter = SpiritAdapter
        champDetailRecyclerView9?.layoutManager = GridLayoutManager(view.context, 3)

        val TheBossAdapter = ChampDetailAdapter(TheBossList)
        champDetailRecyclerView10?.adapter = TheBossAdapter
        champDetailRecyclerView10?.layoutManager = GridLayoutManager(view.context, 3)

        val ExileAdapter = ChampDetailAdapter(ExileList)
        champDetailRecyclerView10_1?.adapter = ExileAdapter
        champDetailRecyclerView10_1?.layoutManager = GridLayoutManager(view.context, 3)

        val FortuneAdapter = ChampDetailAdapter(FortuneList)
        champDetailRecyclerView10_2?.adapter = FortuneAdapter
        champDetailRecyclerView10_2?.layoutManager = GridLayoutManager(view.context, 3)

        val DuskAdapter = ChampDetailAdapter(DuskList)
        champDetailRecyclerView10_3?.adapter = DuskAdapter
        champDetailRecyclerView10_3?.layoutManager = GridLayoutManager(view.context, 3)

        //직업 시너지 어댑터

        val DuelistAdapter = ChampDetailAdapter(DuelistList)
        champDetailRecyclerView_1?.adapter = DuelistAdapter
        champDetailRecyclerView_1?.layoutManager = GridLayoutManager(view.context, 3)

        val KeeperAdapter = ChampDetailAdapter(KeeperList)
        champDetailRecyclerView_2?.adapter = KeeperAdapter
        champDetailRecyclerView_2?.layoutManager = GridLayoutManager(view.context, 3)

        val ShadeAdapter = ChampDetailAdapter(ShadeList)
        champDetailRecyclerView_3?.adapter = ShadeAdapter
        champDetailRecyclerView_3?.layoutManager = GridLayoutManager(view.context, 3)

        val SharpShooterAdapter = ChampDetailAdapter(SharpShooterList)
        champDetailRecyclerView_4?.adapter = SharpShooterAdapter
        champDetailRecyclerView_4?.layoutManager = GridLayoutManager(view.context, 3)

        val HunterAdapter = ChampDetailAdapter(HunterList)
        champDetailRecyclerView_5?.adapter = HunterAdapter
        champDetailRecyclerView_5?.layoutManager = GridLayoutManager(view.context, 3)

        val VanguardAdapter = ChampDetailAdapter(VanguardList)
        champDetailRecyclerView_6?.adapter = VanguardAdapter
        champDetailRecyclerView_6?.layoutManager = GridLayoutManager(view.context, 3)

        val MysticAdapter = ChampDetailAdapter(MysticList)
        champDetailRecyclerView_7?.adapter = MysticAdapter
        champDetailRecyclerView_7?.layoutManager = GridLayoutManager(view.context, 3)

        val BrawlerAdapter = ChampDetailAdapter(BrawlerList)
        champDetailRecyclerView_8?.adapter = BrawlerAdapter
        champDetailRecyclerView_8?.layoutManager = GridLayoutManager(view.context, 3)

        val AssassinAdapter = ChampDetailAdapter(AssassinList)
        champDetailRecyclerView_9?.adapter = AssassinAdapter
        champDetailRecyclerView_9?.layoutManager = GridLayoutManager(view.context, 3)

        val MageAdapter = ChampDetailAdapter(MageList)
        champDetailRecyclerView_10?.adapter = MageAdapter
        champDetailRecyclerView_10?.layoutManager = GridLayoutManager(view.context, 3)

        val AdeptAdapter = ChampDetailAdapter(AdeptList)
        champDetailRecyclerView_11?.adapter = AdeptAdapter
        champDetailRecyclerView_11?.layoutManager = GridLayoutManager(view.context, 3)

        val DazzlerAdapter = ChampDetailAdapter(DazzlerList)
        champDetailRecyclerView_12?.adapter = DazzlerAdapter
        champDetailRecyclerView_12?.layoutManager = GridLayoutManager(view.context, 3)

        val EmperorAdapter = ChampDetailAdapter(EmperorList)
        champDetailRecyclerView_13?.adapter = EmperorAdapter
        champDetailRecyclerView_13?.layoutManager = GridLayoutManager(view.context, 3)

    }
    private fun initAd() {
        val adBuilder = AdRequest.Builder().build()
        adViewSynergyArrangement.loadAd(adBuilder)
    }

}