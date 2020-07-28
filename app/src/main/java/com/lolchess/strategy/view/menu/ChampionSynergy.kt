package com.lolchess.strategy.view.menu

import android.app.SearchManager
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.lolchess.strategy.R
import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.model.data.ChampData
import com.lolchess.strategy.view.activity.replaceFragment
import com.lolchess.strategy.view.adapter.ChampDetailAdapter
import com.lolchess.strategy.view.adapter.ChampMainAdapter
import kotlinx.android.synthetic.main.champion_synergy.*
import kotlinx.android.synthetic.main.simulator_fragment.*
import kotlinx.android.synthetic.main.simulator_fragment.searchView


class ChampionSynergy: Fragment() {

    companion object {
        fun newInstance() = ChampionSynergy()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v =  inflater.inflate(R.layout.champion_synergy, container, false)

        // Get the activity and widget
        val context = activity as AppCompatActivity
        val synergybtn: Button = v.findViewById(R.id.synergybtn)

        // Replace fragment
        synergybtn.setOnClickListener {
            context.replaceFragment(SynergyArrangement())
        }

        return v
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val champData = ChampData()
        val champList1Cost: List<Champ> =
                listOf(champData.getGraves(), champData.getNocturne(), champData.getLeona(), champData.getMalphite(), champData.getPoppy(), champData.getIllaoi(),
                        champData.getJarvanIV(), champData.getXayah(), champData.getZoe(), champData.getZiggs(), champData.getCaitlyn(), champData.getTwistedFate(),
                        champData.getFiora())

        val champList2Cost: List<Champ> =
                listOf(champData.getNautilus(), champData.getDarius(), champData.getRakan(), champData.getLucian(), champData.getMordekaiser(),
                        champData.getBlitzcrank(), champData.getShen(), champData.getXinZhao(), champData.getAhri(), champData.getAnnie(), champData.getYasuo(),
                        champData.getZed(), champData.getKogMaw())

        val champList3Cost: List<Champ> =
                listOf(champData.getNeeko(), champData.getRumble(), champData.getMasterYi(), champData.getBard(),
                        champData.getVi(), champData.getVayne(), champData.getShaco(), champData.getSyndra(), champData.getAshe(), champData.getEzreal(),
                        champData.getJayce(), champData.getKarma(), champData.getCassiopeia())

        val champList4Cost: List<Champ> =
                listOf(champData.getGnar(), champData.getRiven(), champData.getViktor(),
                        champData.getSoraka(), champData.getWukong(), champData.getIrelia(), champData.getJhin(), champData.getJinx(), champData.getTeemo(),
                        champData.getFizz())

        val champList5Cost: List<Champ> =
                listOf(champData.getGangplank(), champData.getLulu(), champData.getThresh(), champData.getAurelionSol(), champData.getEkko(),
                        champData.getUrgot(), champData.getJanna(), champData.getXerath())

        val champMutableList1 = champList1Cost.toMutableList()
        val champMutableList2 = champList2Cost.toMutableList()
        val champMutableList3 = champList3Cost.toMutableList()
        val champMutableList4 = champList4Cost.toMutableList()
        val champMutableList5 = champList5Cost.toMutableList()

        val mAdapter = ChampDetailAdapter(champMutableList1)
        champDetailRecyclerView1?.adapter = mAdapter
        champDetailRecyclerView1?.layoutManager = GridLayoutManager(view.context, 3)

        val mAdapter2 = ChampDetailAdapter(champMutableList2)
        champDetailRecyclerView2?.adapter = mAdapter2
        champDetailRecyclerView2?.layoutManager = GridLayoutManager(view.context, 3)

        val mAdapter3 = ChampDetailAdapter(champMutableList3)
        champDetailRecyclerView3?.adapter = mAdapter3
        champDetailRecyclerView3?.layoutManager = GridLayoutManager(view.context, 3)

        val mAdapter4 = ChampDetailAdapter(champMutableList4)
        champDetailRecyclerView4?.adapter = mAdapter4
        champDetailRecyclerView4?.layoutManager = GridLayoutManager(view.context, 3)

        val mAdapter5 = ChampDetailAdapter(champMutableList5)
        champDetailRecyclerView5?.adapter = mAdapter5
        champDetailRecyclerView5?.layoutManager = GridLayoutManager(view.context, 3)
    }
}


