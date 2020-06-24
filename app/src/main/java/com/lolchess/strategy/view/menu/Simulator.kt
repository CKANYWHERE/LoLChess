package com.lolchess.strategy.view.menu


import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.lolchess.strategy.R
import com.lolchess.strategy.controller.database.SimulatorDB
import com.lolchess.strategy.controller.entity.SimulatorChamp
import com.lolchess.strategy.controller.entity.SimulatorSynergy
import com.lolchess.strategy.model.data.ChampData
import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.view.adapter.ChampMainAdapter

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.android.synthetic.main.simulator_fragment.*
import kotlin.math.log


class Simulator:Fragment(){

    companion object{
        fun newInstance() = Simulator()
    }


    private lateinit var simulatorDB:SimulatorDB
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        val view = inflater.inflate(R.layout.simulator_fragment, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val champData = ChampData()
        val champList : List<Champ> =
            listOf(champData.getGraves(), champData.getNocturne(), champData.getLeona(), champData.getMalphite(), champData.getPoppy(), champData.getIllaoi(),
                champData.getJarvanIV(), champData.getXayah(), champData.getZoe(), champData.getZiggs(), champData.getCaitlyn(), champData.getTwistedFate(),
                champData.getFiora(), champData.getNautilus(), champData.getDarius(), champData.getRakan(), champData.getLucian(), champData.getMordekaiser(),
                champData.getBlitzcrank(), champData.getShen(), champData.getXinZhao(),champData.getAhri(), champData.getAnnie(), champData.getYasuo(),
                champData.getZed(), champData.getKogMaw(), champData.getNeeko(), champData.getRumble(), champData.getMasterYi(), champData.getBard(),
                champData.getVi(), champData.getVayne(), champData.getShaco(), champData.getSyndra(), champData.getAshe(), champData.getEzreal(),
                champData.getJayce(), champData.getKarma(), champData.getCassiopeia(), champData.getGnar(), champData.getRiven(), champData.getViktor(),
                champData.getSoraka(), champData.getWukong(), champData.getIrelia(), champData.getJhin(), champData.getJinx(), champData.getTeemo(),
                champData.getFizz(), champData.getGangplank(), champData.getLulu(), champData.getThresh(), champData.getAurelionSol(), champData.getEkko(),
                champData.getUrgot(), champData.getJanna(),  champData.getXerath())

        val champMutableList = champList.toMutableList()
        val mAdapter = ChampMainAdapter(view.context,champMutableList)
        simulatorDB = SimulatorDB.getInstance(view.context)!!

        /*lifecycleScope.launch(Dispatchers.IO){
            simulatorDB?.SimulatorDAO().deleteAllChamp()
            simulatorDB?.SimulatorDAO().deleteAllSynergy()
        }*/
        ///=> 챔프랑 시너지 삭제할때만 사용

        mAdapter.setItemClickListener(object : ChampMainAdapter.ItemClickListener{
            override fun onClick(view: View, position: Int, champ: Champ) {
                lifecycleScope.launch(Dispatchers.IO) {
                   val count = simulatorDB?.SimulatorDAO()?.getChampCount()
                    Log.e("count",count.toString())
                    if(count < 10){
                        if(champ?.synergy?.size == 2){
                            val simChamp = SimulatorChamp(champ?.name,champ?.imgPath,champ?.synergy[0]?.name,champ?.synergy[1].name,"")
                            val fisrtSyn = SimulatorSynergy(champ?.synergy[0]?.name, champ?.synergy[0]?.imgPath)
                            val secondSyn = SimulatorSynergy(champ?.synergy[1]?.name, champ?.synergy[1]?.imgPath)

                            addChamp(simChamp)
                            addSynergy(fisrtSyn)
                            addSynergy(secondSyn)
                            initSimulation(view)
                        }

                        if(champ?.synergy?.size == 3){
                            val simChamp = SimulatorChamp(champ?.name,champ?.imgPath,champ?.synergy[0]?.name,champ?.synergy[1].name,champ?.synergy[2].name)
                            val fisrtSyn = SimulatorSynergy(champ?.synergy[0]?.name, champ?.synergy[0]?.imgPath)
                            val secondSyn = SimulatorSynergy(champ?.synergy[1]?.name, champ?.synergy[1]?.imgPath)
                            val thirdSyn = SimulatorSynergy(champ?.synergy[2]?.name, champ?.synergy[2]?.imgPath)

                            addChamp(simChamp)
                            addSynergy(fisrtSyn)
                            addSynergy(secondSyn)
                            addSynergy(thirdSyn)
                            initSimulation(view)
                        }
                    }


                }
            }

        })

        recyclerView?.layoutManager = LinearLayoutManager(view.context)
        recyclerView?.adapter = mAdapter


        var searchManager = activity?.getSystemService(Context.SEARCH_SERVICE) as SearchManager
        searchView!!.setSearchableInfo(searchManager.getSearchableInfo(activity?.componentName))
        searchView!!.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            android.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                (recyclerView?.adapter as ChampMainAdapter).filter(query)
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                (recyclerView?.adapter as ChampMainAdapter).filter(newText)
                return false
            }
        })

        initSimulation(view)


    }

    private fun addChamp(champ: SimulatorChamp){
        lifecycleScope.launch(Dispatchers.IO){
            simulatorDB?.SimulatorDAO()?.insert(champ)
        }
    }

    private fun addSynergy(synergy: SimulatorSynergy){
        lifecycleScope.launch(Dispatchers.IO){
            simulatorDB?.SimulatorDAO()?.insert(synergy)
        }
    }

    private fun initSimulation(view:View){
        var list = listOf<SimulatorChamp>()
        lifecycleScope.launch(Dispatchers.IO) {
            list = simulatorDB?.SimulatorDAO()?.getAllChamp()!!
            val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.MATCH_PARENT,1f)

            for(i in 0..list.size - 1){
                if(i < 5){
                    list[i]?.imgPath?.let {
                        val imgView = ImageView(view?.context)
                        imgView.setImageResource(it)
                        imgView.layoutParams = layoutParams
                        layoutTop.addView(imgView)
                    }
                }else{
                    list[i]?.imgPath?.let {
                        val imgView = ImageView(view?.context)
                        imgView.setImageResource(it)
                        imgView.layoutParams = layoutParams
                        layoutBottom.addView(imgView)
                    }
                }
            }
        }
    }
}


