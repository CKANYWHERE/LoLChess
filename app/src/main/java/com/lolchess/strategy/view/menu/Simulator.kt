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
import androidx.appcompat.widget.SearchView
import androidx.lifecycle.Observer
//import androidx.lifecycle.SavedStateViewModelFactory
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.whenStarted
import androidx.recyclerview.widget.LinearLayoutManager
import com.lolchess.strategy.R
import com.lolchess.strategy.controller.database.SimulatorDB
import com.lolchess.strategy.controller.entity.SimulatorChamp
import com.lolchess.strategy.controller.entity.SimulatorSynergy
import com.lolchess.strategy.controller.viewmodel.SimualtorViewModel
import com.lolchess.strategy.model.data.ChampData
import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.view.adapter.ChampMainAdapter
import com.lolchess.strategy.view.adapter.SimulationAdapter
import com.lolchess.strategy.view.adapter.SimulationSynergyAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.android.synthetic.main.simulator_fragment.*


class Simulator : Fragment() {

    companion object {
        fun newInstance() = Simulator()
    }


    private lateinit var simulatorDB: SimulatorDB
    private lateinit var simulatorViewModel: SimualtorViewModel
    private lateinit var simulationAdapter: SimulationAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        val view = inflater.inflate(R.layout.simulator_fragment, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        simulatorDB = SimulatorDB.getInstance(view.context)!!
        simulatorViewModel =
            ViewModelProvider(this, SimualtorViewModel.Factory(activity!!.application)).get(
                SimualtorViewModel::class.java
            )
        simulationAdapter = SimulationAdapter(view.context)

        lifecycleScope.launch(Dispatchers.IO) {
            simulatorDB?.SimulatorDAO().deleteAllChamp()
            simulatorDB?.SimulatorDAO().deleteAllSynergy()
        }
        ///=> 챔프랑 시너지 삭제할때만 사용


        initChampView()
        initSimulation(view)
        initSimulationSynergy()
        initSearchBar()

    }

    private fun addChamp(champ: SimulatorChamp) {
        simulatorViewModel.insert(champ)
    }

    private fun addSynergy(synergy: SimulatorSynergy) {
        simulatorViewModel.insert(synergy)
    }

    private fun initSimulationSynergy() {
        val simAdapter = SimulationSynergyAdapter(view?.context!!)
        sinergyView?.adapter = simAdapter
        simulatorViewModel.getAllSynergy().observe(viewLifecycleOwner, Observer { synergy ->
            synergy?.let { simAdapter.setData(synergy) }
        })

    }

    private fun initSimulation(view: View) {
        simulationAdapter.setItemClickListener(object : SimulationAdapter.ItemClickListener {
            override fun onClick(view: View, position: Int, champ: SimulatorChamp) {
                simulatorViewModel?.deleteChampByName(champ?.name)
                if(champ.thirdSynergy == ""){
                    simulatorViewModel?.getSynergyByName(champ?.firstSynergy!!,champ?.secondSynergy!!,champ?.thirdSynergy!!)
                        .observe(viewLifecycleOwner, Observer {synergys ->

                        })
                }
                else{

                }
                setSimulation(view)
            }
        })
        simulationView?.adapter = simulationAdapter
        simulatorViewModel.getAllChamp().observe(viewLifecycleOwner, Observer { champs ->
            champs?.let { simulationAdapter.setData(champs) }
        })
    }

    private fun initChampView() {
        val champData = ChampData()
        val champList: List<Champ> =
            listOf(
                champData.getGraves(),
                champData.getNocturne(),
                champData.getLeona(),
                champData.getMalphite(),
                champData.getPoppy(),
                champData.getIllaoi(),
                champData.getJarvanIV(),
                champData.getXayah(),
                champData.getZoe(),
                champData.getZiggs(),
                champData.getCaitlyn(),
                champData.getTwistedFate(),
                champData.getFiora(),
                champData.getNautilus(),
                champData.getDarius(),
                champData.getRakan(),
                champData.getLucian(),
                champData.getMordekaiser(),
                champData.getBlitzcrank(),
                champData.getShen(),
                champData.getXinZhao(),
                champData.getAhri(),
                champData.getAnnie(),
                champData.getYasuo(),
                champData.getZed(),
                champData.getKogMaw(),
                champData.getNeeko(),
                champData.getRumble(),
                champData.getMasterYi(),
                champData.getBard(),
                champData.getVi(),
                champData.getVayne(),
                champData.getShaco(),
                champData.getSyndra(),
                champData.getAshe(),
                champData.getEzreal(),
                champData.getJayce(),
                champData.getKarma(),
                champData.getCassiopeia(),
                champData.getGnar(),
                champData.getRiven(),
                champData.getViktor(),
                champData.getSoraka(),
                champData.getWukong(),
                champData.getIrelia(),
                champData.getJhin(),
                champData.getJinx(),
                champData.getTeemo(),
                champData.getFizz(),
                champData.getGangplank(),
                champData.getLulu(),
                champData.getThresh(),
                champData.getAurelionSol(),
                champData.getEkko(),
                champData.getUrgot(),
                champData.getJanna(),
                champData.getXerath()
            )

        val champMutableList = champList.toMutableList()
        val mAdapter = ChampMainAdapter(view!!.context, champMutableList)

        mAdapter.setItemClickListener(object : ChampMainAdapter.ItemClickListener {
            override fun onClick(view: View, position: Int, champ: Champ) {
                var flag = false
                simulatorViewModel.getAllChamp().observe(viewLifecycleOwner, Observer { champs ->
                    for (chkChamp in champs) {
                        if (chkChamp.name == champ.name) {
                            flag = true
                        }
                    }
                })
                if (flag) {
                    return
                } else {
                    if (simulationAdapter.itemCount < 10) {
                        if (champ?.synergy?.size == 2) {
                            val simChamp = SimulatorChamp(
                                champ?.name,
                                champ?.imgPath,
                                champ?.cost,
                                champ?.synergy[0]?.name,
                                champ?.synergy[1].name,
                                ""
                            )

                            var fisrtSyn =
                                SimulatorSynergy(
                                    champ?.synergy[0]?.name,
                                    champ?.synergy[0]?.imgPath,
                                    1
                                )
                            var secondSyn =
                                SimulatorSynergy(
                                    champ?.synergy[1]?.name,
                                    champ?.synergy[1]?.imgPath,
                                    1
                                )

                            simulatorViewModel.getAllSynergy()
                                .observe(viewLifecycleOwner, Observer { synergy ->
                                    synergy?.let { synergy ->
                                        for (syn in synergy) {

                                            if (fisrtSyn.name.equals(syn.name)) {
                                                fisrtSyn.count = syn.count?.plus(1)
                                            }

                                            if (secondSyn.name.equals(syn.name)) {
                                                secondSyn.count = syn.count?.plus(1)
                                            }

                                        }
                                    }
                                })

                            addChamp(simChamp)
                            addSynergy(fisrtSyn)
                            addSynergy(secondSyn)

                        }

                        if (champ?.synergy?.size == 3) {
                            val simChamp = SimulatorChamp(
                                champ?.name,
                                champ?.imgPath,
                                champ?.cost,
                                champ?.synergy[0]?.name,
                                champ?.synergy[1]?.name,
                                champ?.synergy[2]?.name
                            )
                            val fisrtSyn =
                                SimulatorSynergy(
                                    champ?.synergy[0]?.name,
                                    champ?.synergy[0]?.imgPath,
                                    1
                                )
                            val secondSyn =
                                SimulatorSynergy(
                                    champ?.synergy[1]?.name,
                                    champ?.synergy[1]?.imgPath,
                                    1
                                )
                            val thirdSyn =
                                SimulatorSynergy(
                                    champ?.synergy[2]?.name,
                                    champ?.synergy[2]?.imgPath,
                                    1
                                )
                            simulatorViewModel.getAllSynergy()
                                .observe(viewLifecycleOwner, Observer { synergy ->
                                    synergy?.let { synergy ->
                                        for (syn in synergy) {

                                            if (fisrtSyn.name.equals(syn.name)) {
                                                fisrtSyn.count = syn.count?.plus(1)
                                            }

                                            if (secondSyn.name.equals(syn.name)) {
                                                secondSyn.count = syn.count?.plus(1)
                                            }

                                        }
                                    }
                                })
                            addChamp(simChamp)
                            addSynergy(fisrtSyn)
                            addSynergy(secondSyn)
                            addSynergy(thirdSyn)

                        }
                    }
                }

            }

        })

        recyclerView?.layoutManager = LinearLayoutManager(view!!.context)
        recyclerView?.adapter = mAdapter
    }

    private fun initSearchBar() {
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
    }


    private fun setSimulation(view: View) {
        simulationView?.adapter = simulationAdapter
        simulatorViewModel.getAllChamp().observe(viewLifecycleOwner, Observer { champs ->
            champs?.let { simulationAdapter.setData(champs) }
        })
    }
}


