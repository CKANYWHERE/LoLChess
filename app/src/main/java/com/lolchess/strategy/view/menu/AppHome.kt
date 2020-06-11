package com.lolchess.strategy.view.menu


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.lolchess.strategy.R
import com.lolchess.strategy.data.ChampData
import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.view.adapter.ChampMainAdapter
import kotlinx.android.synthetic.main.home_fragment.*


class AppHome:Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        val view = inflater.inflate(R.layout.home_fragment, container, false)


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val champData = ChampData()
        val champList : List<Champ> =
            listOf(champData.getGraves(),champData.getGangplank(),champData.getAhri(),champData.getAshe(),champData.getFizz(), champData.getAnnie(),
                champData.getAurelionSol(), champData.getBard(), champData.getBlitzcrank(), champData.getCaitlyn(), champData.getCassiopeia(), champData.getDarius(),
                champData.getEkko(), champData.getEzreal(), champData.getFiora(), champData.getGnar(), champData.getIllaoi(), champData.getIrelia(),
                champData.getJanna(), champData.getJarvanIV(), champData.getJayce(), champData.getJhin(), champData.getJinx(), champData.getKarma(),
                champData.getKogMaw(), champData.getLeona(), champData.getLucian(), champData.getLulu(), champData.getMalphite(), champData.getMasterYi(),
                champData.getMordekaiser(), champData.getNautilus(), champData.getNeeko(), champData.getNocturne(), champData.getPoppy(), champData.getRakan(),
                champData.getRiven(), champData.getRumble(), champData.getShaco(), champData.getShen(), champData.getSoraka(), champData.getSyndra(),
                champData.getTeemo(), champData.getThresh(), champData.getTwistedFate(), champData.getUrgot(), champData.getVayne(), champData.getVi(),
                champData.getViktor(), champData.getWukong(), champData.getXayah(), champData.getXerath(), champData.getXinZhao(), champData.getYasuo(),
                champData.getZed(), champData.getZiggs(), champData.getZoe())

        recyclerView?.adapter = ChampMainAdapter(view.context,champList)
        recyclerView?.layoutManager = LinearLayoutManager(view.context)

    }
}
