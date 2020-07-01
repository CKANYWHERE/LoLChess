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
import com.lolchess.strategy.R
import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.model.data.ChampData
import com.lolchess.strategy.view.activity.replaceFragment
import com.lolchess.strategy.view.adapter.ChampDetailAdapter
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
        val v =  inflater.inflate(R.layout.synergy_arrangement, container, false)

        // Get the activity and widget
        val context = activity as AppCompatActivity
        val costbtn: Button = v.findViewById(R.id.costbtn)

        // Replace fragment
        costbtn.setOnClickListener {
            context.replaceFragment(ChampionSynergy())
        }

        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val champData = ChampData()

        //계열 클래스
        val mechPilot: List<Champ> =
                listOf(champData.getAnnie(), champData.getRumble(), champData.getFizz())


        val rebel: List<Champ> =
                listOf(champData.getMalphite(), champData.getZiggs(), champData.getYasuo(), champData.getZed(), champData.getMasterYi(),
                        champData.getJinx(), champData.getAurelionSol())

        val starGuardian: List<Champ> =
                listOf(champData.getZoe(),  champData.getPoppy(),champData.getAhri(), champData.getNeeko(), champData.getSyndra(), champData.getSoraka(),
                        champData.getJanna())


        val cybernetic: List<Champ> =
                listOf(champData.getLeona(), champData.getFiora(), champData.getLucian(), champData.getVi(), champData.getVayne(),
                        champData.getIrelia(), champData.getEkko())


        val chrono: List<Champ> =
                listOf(champData.getCaitlyn(), champData.getTwistedFate(), champData.getBlitzcrank(), champData.getShen(), champData.getEzreal(),
                        champData.getRiven(), champData.getWukong(), champData.getThresh())


        val darkStar: List<Champ> =
                listOf(champData.getJarvanIV(), champData.getMordekaiser(), champData.getShaco(), champData.getKarma(), champData.getJhin(), champData.getXerath())

        val spacePirate: List<Champ> =
                listOf(champData.getGraves(), champData.getDarius(), champData.getJayce(), champData.getGangplank())


        val astro: List<Champ> =
                listOf(champData.getNautilus(), champData.getBard(), champData.getGnar(), champData.getTeemo())

        val battleCast: List<Champ> =
                listOf(champData.getNocturne(), champData.getIllaoi(), champData.getKogMaw(), champData.getCassiopeia(), champData.getViktor(),
                        champData.getUrgot())

        val celestial: List<Champ> =
                listOf(champData.getXayah(),  champData.getRakan(), champData.getXinZhao(), champData.getAshe(), champData.getLulu())


        //직업 시너지

        val blademaster: List<Champ> =
                listOf( champData.getXayah(), champData.getFiora(), champData.getShen(), champData.getYasuo(),
                        champData.getMasterYi(), champData.getRiven(), champData.getIrelia())

        val manaReaver: List<Champ> =
                listOf(champData.getDarius(), champData.getIrelia(), champData.getThresh())


        val sorcerer: List<Champ> =
                listOf(champData.getZoe(), champData.getTwistedFate(), champData.getAhri(), champData.getAnnie(), champData.getSyndra(), champData.getViktor(), champData.getXerath())


        val vanguard: List<Champ> =
                listOf(champData.getLeona(), champData.getPoppy(), champData.getNautilus(), champData.getMordekaiser(), champData.getJayce(), champData.getWukong())

        val protector: List<Champ> =
                listOf(champData.getJarvanIV(), champData.getXinZhao(), champData.getRakan(), champData.getNeeko(), champData.getUrgot())

        val mystic: List<Champ> =
                listOf(champData.getBard(), champData.getKarma(), champData.getCassiopeia(), champData.getSoraka(), champData.getLulu())

        val brawler: List<Champ> =
                listOf(champData.getMalphite(), champData.getIllaoi(), champData.getBlitzcrank(), champData.getVi(), champData.getGnar())

        val mercenary: List<Champ> =
                listOf(champData.getGangplank())

        val starship: List<Champ> =
                listOf(champData.getAurelionSol())

        val paragon: List<Champ> =
                listOf(champData.getJanna())

        val infiltrator: List<Champ> =
                listOf(champData.getNocturne(), champData.getZed(), champData.getShaco(), champData.getFizz(), champData.getEkko())

        val sniper: List<Champ> =
                listOf(champData.getCaitlyn(), champData.getVayne(), champData.getAshe(), champData.getJhin(), champData.getTeemo())

        val blaster: List<Champ> =
                listOf(champData.getGraves(), champData.getLucian(), champData.getKogMaw(), champData.getEzreal(), champData.getJinx())

        val demolitionist: List<Champ> =
                listOf(champData.getZiggs(), champData.getRumble(), champData.getGangplank())


        //계열 시너지
        val mechPilotList = mechPilot.toMutableList()
        val rebelList = rebel.toMutableList()
        val starGuardianList = starGuardian.toMutableList()
        val cyberneticList = cybernetic.toMutableList()
        val chronoList = chrono.toMutableList()
        val darkStarList = darkStar.toMutableList()
        val spacePirateList = spacePirate.toMutableList()
        val astroList = astro.toMutableList()
        val battleCastList = battleCast.toMutableList()
        val celestialList = celestial.toMutableList()


        //직업 시너지
        val blademasterList = blademaster.toMutableList()
        val manaReaverList = manaReaver.toMutableList()
        val sorcererList = sorcerer.toMutableList()
        val vanguardList = vanguard.toMutableList()
        val protectorList = protector.toMutableList()
        val mysticList = mystic.toMutableList()
        val brawlerList = brawler.toMutableList()
        val mercenaryList = mercenary.toMutableList()
        val starshipList = starship.toMutableList()
        val paragonList = paragon.toMutableList()
        val infiltratorList = infiltrator.toMutableList()
        val sniperList = sniper.toMutableList()
        val blasterList = blaster.toMutableList()
        val demolitionisList = demolitionist.toMutableList()

        //계열 시너지 어댑터
        val mechAdapter = ChampDetailAdapter(mechPilotList)
        champDetailRecyclerView1?.adapter = mechAdapter
        champDetailRecyclerView1?.layoutManager = GridLayoutManager(view.context, 3)

        val rebelAdapter = ChampDetailAdapter(rebelList)
        champDetailRecyclerView2?.adapter = rebelAdapter
        champDetailRecyclerView2?.layoutManager = GridLayoutManager(view.context, 3)

        val starGuardianAdapter = ChampDetailAdapter(starGuardianList)
        champDetailRecyclerView3?.adapter = starGuardianAdapter
        champDetailRecyclerView3?.layoutManager = GridLayoutManager(view.context, 3)

        val cyberneticAdapter = ChampDetailAdapter(cyberneticList)
        champDetailRecyclerView4?.adapter = cyberneticAdapter
        champDetailRecyclerView4?.layoutManager = GridLayoutManager(view.context, 3)

        val chronoAdapter = ChampDetailAdapter(chronoList)
        champDetailRecyclerView5?.adapter = chronoAdapter
        champDetailRecyclerView5?.layoutManager = GridLayoutManager(view.context, 3)

        val darkStarAdapter = ChampDetailAdapter(darkStarList)
        champDetailRecyclerView6?.adapter = darkStarAdapter
        champDetailRecyclerView6?.layoutManager = GridLayoutManager(view.context, 3)

        val spacePirateAdapter = ChampDetailAdapter(spacePirateList)
        champDetailRecyclerView7?.adapter = spacePirateAdapter
        champDetailRecyclerView7?.layoutManager = GridLayoutManager(view.context, 3)

        val astroAdapter = ChampDetailAdapter(astroList)
        champDetailRecyclerView8?.adapter = astroAdapter
        champDetailRecyclerView8?.layoutManager = GridLayoutManager(view.context, 3)

        val battlecastAdapter = ChampDetailAdapter(battleCastList)
        champDetailRecyclerView9?.adapter = battlecastAdapter
        champDetailRecyclerView9?.layoutManager = GridLayoutManager(view.context, 3)

        val celestialAdapter = ChampDetailAdapter(celestialList)
        champDetailRecyclerView10?.adapter = celestialAdapter
        champDetailRecyclerView10?.layoutManager = GridLayoutManager(view.context, 3)


        //직업 시너지 어댑터

        val blademasterAdapter = ChampDetailAdapter(blademasterList)
        champDetailRecyclerView_1?.adapter = blademasterAdapter
        champDetailRecyclerView_1?.layoutManager = GridLayoutManager(view.context, 3)

        val manaReaverAdapter = ChampDetailAdapter(manaReaverList)
        champDetailRecyclerView_2?.adapter = manaReaverAdapter
        champDetailRecyclerView_2?.layoutManager = GridLayoutManager(view.context, 3)

        val sorcererAdapter = ChampDetailAdapter(sorcererList)
        champDetailRecyclerView_3?.adapter = sorcererAdapter
        champDetailRecyclerView_3?.layoutManager = GridLayoutManager(view.context, 3)

        val vanguardAdapter = ChampDetailAdapter(vanguardList)
        champDetailRecyclerView_4?.adapter = vanguardAdapter
        champDetailRecyclerView_4?.layoutManager = GridLayoutManager(view.context, 3)

        val protectorAdapter = ChampDetailAdapter(protectorList)
        champDetailRecyclerView_5?.adapter = protectorAdapter
        champDetailRecyclerView_5?.layoutManager = GridLayoutManager(view.context, 3)

        val mysticAdapter = ChampDetailAdapter(mysticList)
        champDetailRecyclerView_6?.adapter = mysticAdapter
        champDetailRecyclerView_6?.layoutManager = GridLayoutManager(view.context, 3)

        val brawlerAdapter = ChampDetailAdapter(brawlerList)
        champDetailRecyclerView_7?.adapter = brawlerAdapter
        champDetailRecyclerView_7?.layoutManager = GridLayoutManager(view.context, 3)

        val mercenaryAdapter = ChampDetailAdapter(mercenaryList)
        champDetailRecyclerView_8?.adapter = mercenaryAdapter
        champDetailRecyclerView_8?.layoutManager = GridLayoutManager(view.context, 3)

        val starshipAdapter = ChampDetailAdapter(starshipList)
        champDetailRecyclerView_9?.adapter = starshipAdapter
        champDetailRecyclerView_9?.layoutManager = GridLayoutManager(view.context, 3)

        val paragonAdapter = ChampDetailAdapter(paragonList)
        champDetailRecyclerView_10?.adapter = paragonAdapter
        champDetailRecyclerView_10?.layoutManager = GridLayoutManager(view.context, 3)

        val infiltratorAdapter = ChampDetailAdapter(infiltratorList)
        champDetailRecyclerView_11?.adapter = infiltratorAdapter
        champDetailRecyclerView_11?.layoutManager = GridLayoutManager(view.context, 3)

        val sniperAdapter = ChampDetailAdapter(sniperList)
        champDetailRecyclerView_12?.adapter = sniperAdapter
        champDetailRecyclerView_12?.layoutManager = GridLayoutManager(view.context, 3)

        val blasterAdapter = ChampDetailAdapter(blasterList)
        champDetailRecyclerView_13?.adapter = blasterAdapter
        champDetailRecyclerView_13?.layoutManager = GridLayoutManager(view.context, 3)

        val demolitionistAdapter = ChampDetailAdapter(demolitionisList)
        champDetailRecyclerView_14?.adapter = demolitionistAdapter
        champDetailRecyclerView_14?.layoutManager = GridLayoutManager(view.context, 3)

        var searchManager = activity?.getSystemService(Context.SEARCH_SERVICE) as SearchManager

        searchView!!.setSearchableInfo(searchManager.getSearchableInfo(activity?.componentName))

        searchView!!.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
                android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                (recyclerView?.adapter as ChampDetailAdapter).filter(query)
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                (recyclerView?.adapter as ChampDetailAdapter).filter(newText)
                return false
            }
        })




    }
}
