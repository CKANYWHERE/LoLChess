package com.lolchess.strategy.view.menu


import android.app.SearchManager
import android.content.Context
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
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import com.lolchess.strategy.R
import com.lolchess.strategy.controller.database.SimulatorDB
import com.lolchess.strategy.controller.entity.SimulatorChamp
import com.lolchess.strategy.controller.entity.SimulatorSynergy
import com.lolchess.strategy.controller.viewmodel.SimualtorViewModel
import com.lolchess.strategy.model.data.ChampData
import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.model.data.SynergyData
import com.lolchess.strategy.view.adapter.ChampMainAdapter
import com.lolchess.strategy.view.adapter.SimulationAdapter
import com.lolchess.strategy.view.adapter.SimulationSynergyAdapter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.android.synthetic.main.simulator_fragment.*
import kotlinx.coroutines.GlobalScope


class Simulator : Fragment() {

    companion object {
        fun newInstance() = Simulator()
    }


    private lateinit var simulatorDB: SimulatorDB
    private lateinit var simulatorViewModel: SimualtorViewModel
    private lateinit var simulationAdapter: SimulationAdapter
    private lateinit var simAdapter: SimulationSynergyAdapter
   // private lateinit var mInterstitialAd: InterstitialAd

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        val view = inflater.inflate(R.layout.simulator_fragment, container, false)
        MobileAds.initialize(context)
        //createFrontAd()
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
        simAdapter = SimulationSynergyAdapter(view?.context!!)

        /*lifecycleScope.launch(Dispatchers.IO) {
            simulatorDB?.SimulatorDAO().deleteAllChamp()
            simulatorDB?.SimulatorDAO().deleteAllSynergy()
        }
        */

        ///=> 챔프랑 시너지 삭제할때만 사용
        initAd()
        initChampView()
        initSimulation()
        initSimulationSynergy()
        initSearchBar()

    }

    override fun onDestroy() {
        //createFrontAd()
        super.onDestroy()
    }



   /* private fun createFrontAd() {

        mInterstitialAd = InterstitialAd(context)
        mInterstitialAd.adUnitId = "ca-app-pub-3940256099942544/1033173712"
        mInterstitialAd.loadAd(AdRequest.Builder().build())

        if (mInterstitialAd.isLoaded) {
            mInterstitialAd.show()
        } else {
            Log.e("TAG", "The interstitial wasn't loaded yet.")
        }

    }*/

    private fun addChamp(champ: SimulatorChamp) {
        simulatorViewModel.insert(champ)
    }

    private fun addSynergy(synergy: SimulatorSynergy) {
        simulatorViewModel.insert(synergy)
    }

    private fun initAd() {
        val adBuilder = AdRequest.Builder().build()
        adView.loadAd(adBuilder)
    }

    private fun initSimulationSynergy() {

        sinergyView?.adapter = simAdapter
        simulatorViewModel.getAllSynergy().observe(viewLifecycleOwner, Observer { synergy ->
            synergy?.let { simAdapter.setData(synergy) }
            for(syn in synergy)
                Log.e("Synergy",syn.name + " " + syn.synPower.toString() )
        })

    }

    private fun initSimulation() {
        simulationAdapter.setItemClickListener(object : SimulationAdapter.ItemClickListener {
            override fun onClick(view: View, position: Int, champ: SimulatorChamp) {
                simulatorViewModel?.deleteChampByName(champ?.name)
                var synArr: Array<String>?

                if (champ?.thirdSynergy == "") {
                    synArr =
                        arrayOf(champ?.firstSynergy!!, champ?.secondSynergy!!)
                } else {
                    synArr =
                        arrayOf(
                            champ?.firstSynergy!!,
                            champ?.secondSynergy!!,
                            champ?.thirdSynergy!!
                        )
                }
                GlobalScope.launch(Dispatchers.Default) {
                    var simulatorSyn = simulatorViewModel?.getSynergyByName(synArr)
                    val synergymain: SynergyData = SynergyData()


                    for (syn in simulatorSyn) {
                        if (syn.count!! < 2) {
                            Log.e("syn1", syn.name + " " + syn.count.toString())
                            simulatorViewModel?.deleteSynergyByName(syn?.name)
                        } else {
                            Log.e("syn2", syn.name + " " + syn.count.toString())
                            syn.count = syn?.count!!.minus(1)
                            if ((syn.name.equals(synergymain.getHunter().name) && syn.count == 3)
                                    ||(syn.name.equals(synergymain.getBrawler().name) && (syn.count!! >= 4 && syn.count!!< 6))
                                    ||(syn.name.equals(synergymain.getEnlightened().name) && (syn.count!! >= 4 && syn.count!!< 6))
                                    ||(syn.name.equals(synergymain.getDuelist().name) && (syn.count!! >= 4 && syn.count!!< 6))
                                    ||(syn.name.equals(synergymain.getDivine().name) && (syn.count!! >= 4 && syn.count!!< 6))
                                    ||(syn.name.equals(synergymain.getVanguard().name) && (syn.count!! >= 4 && syn.count!!< 6))){
                                syn.synPower = 2 //은
                            }



                            if ((syn.name.equals(synergymain.getDivine().name) && (syn.count!! >= 2 && syn.count!!< 4))
                                    ||(syn.name.equals(synergymain.getDusk().name) && (syn.count!! >= 2 && syn.count!!< 4))
                                    ||(syn.name.equals(synergymain.getEnlightened().name) && (syn.count!! >= 2 && syn.count!!< 4))
                                    ||(syn.name.equals(synergymain.getSharpShooter().name) && (syn.count!! >= 2 && syn.count!!< 4))
                                    ||(syn.name.equals(synergymain.getBrawler().name) && (syn.count!! >= 2 && syn.count!!< 4))
                                    ||(syn.name.equals(synergymain.getMystic().name) && (syn.count!! >= 2 && syn.count!!< 4))
                                    ||(syn.name.equals(synergymain.getVanguard().name) && (syn.count!! >= 2 && syn.count!!< 4))
                                    ||(syn.name.equals(synergymain.getDuelist().name) && (syn.count!! >= 2 && syn.count!!< 4))
                                    ||(syn.name.equals(synergymain.getSpirit().name) && (syn.count!! >= 2 && syn.count!!< 4))
                                    ||(syn.name.equals(synergymain.getKeeper().name) && (syn.count!! >= 2 && syn.count!!< 4))
                                    ||(syn.name.equals(synergymain.getDazzler().name) && (syn.count!! >= 2 && syn.count!!< 4))
                                    ||(syn.name.equals(synergymain.getAssassin().name) && (syn.count!! >= 2 && syn.count!!< 4))
                                    ||(syn.name.equals(synergymain.getSpirit().name) && (syn.count!! == 2))
                                    ||(syn.name.equals(synergymain.getDazzler().name) && (syn.count!! == 2))
                                    ||(syn.name.equals(synergymain.getAdept().name) && (syn.count!! == 2))
                                    ||(syn.name.equals(synergymain.getShade().name) && (syn.count!! == 2))
                                    ||(syn.name.equals(synergymain.getHunter().name) && (syn.count!! == 2))
                                    ||(syn.name.equals(synergymain.getCultist().name) && (syn.count!! >= 3 && syn.count!!< 6))
                                    ||(syn.name.equals(synergymain.getElderwood().name) && (syn.count!! >= 3 && syn.count!!< 6))
                                    ||(syn.name.equals(synergymain.getWarlord().name) && (syn.count!! >= 3 && syn.count!!< 6))
                                    ||(syn.name.equals(synergymain.getMage().name) && (syn.count!! >= 3 && syn.count!!< 6))
                                    ||(syn.name.equals(synergymain.getNinja().name) && (syn.count!! < 2))
                                    ||(syn.name.equals(synergymain.getExile().name) && (syn.count!! < 2))){
                                syn.synPower = 1 //동
                            }
                            if ((syn.name.equals(synergymain.getCultist().name) && (syn.count!!< 3))
                                    ||(syn.name.equals(synergymain.getElderwood().name) && (syn.count!!< 3))
                                    ||(syn.name.equals(synergymain.getWarlord().name) && (syn.count!! < 3))
                                    ||(syn.name.equals(synergymain.getMage().name) && (syn.count!! < 3))
                                    ||(syn.name.equals(synergymain.getDivine().name) && (syn.count!! <2))
                                    ||(syn.name.equals(synergymain.getDusk().name) && (syn.count!! <2))
                                    ||(syn.name.equals(synergymain.getEnlightened().name) && (syn.count!! <2))
                                    ||(syn.name.equals(synergymain.getSharpShooter().name) && (syn.count!! <2))
                                    ||(syn.name.equals(synergymain.getBrawler().name) && (syn.count!! < 2))
                                    ||(syn.name.equals(synergymain.getMystic().name) && (syn.count!! < 2))
                                    ||(syn.name.equals(synergymain.getVanguard().name) && (syn.count!!< 2))
                                    ||(syn.name.equals(synergymain.getDuelist().name) && (syn.count!! <2))
                                    ||(syn.name.equals(synergymain.getSpirit().name) && (syn.count!! < 2))
                                    ||(syn.name.equals(synergymain.getKeeper().name) && (syn.count!!<2))
                                    ||(syn.name.equals(synergymain.getAssassin().name) && (syn.count!! <2))
                                    ||(syn.name.equals(synergymain.getNinja().name) && (syn.count!! >1 && syn.count!! <4))
                                    ||(syn.name.equals(synergymain.getDazzler().name) && (syn.count!! <2))
                                    ||(syn.name.equals(synergymain.getAdept().name) && (syn.count!! <2))
                                    ||(syn.name.equals(synergymain.getShade().name) && (syn.count!! <2))
                                    ||(syn.name.equals(synergymain.getHunter().name) && (syn.count!! <2))){
                                syn.synPower = 0 //없애기
                            }


                            simulatorViewModel?.insert(syn)
                        }
                    }
                }
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
                    champData.getGaren(), champData.getNami(), champData.getNidalee(), champData.getDiana(), champData.getLissandra(), champData.getMaokai(),
                    champData.getVayne(), champData.getYasuo(), champData.getElise(), champData.getWukong(), champData.getTahmKench(), champData.getTwistedFate(),
                    champData.getFiora(), champData.getLulu(), champData.getVi(), champData.getSylas(), champData.getThresh(), champData.getAphelios(),
                    champData.getAnnie(), champData.getJarvanIV(), champData.getJanna(),champData.getJax(), champData.getZed(), champData.getTeemo(),
                    champData.getPyke(), champData.getHecarim(), champData.getNunu(), champData.getLux(), champData.getVeigar(), champData.getXinZhao(),
                    champData.getAkali(), champData.getYuumi(), champData.getIrelia(), champData.getEvelynn(), champData.getJinx(), champData.getKatarina(),
                    champData.getKalista(), champData.getKennen(), champData.getKindred(), champData.getRiven(), champData.getMorgana(), champData.getSejuani(),
                    champData.getShen(), champData.getAhri(), champData.getAatrox(), champData.getAshe(), champData.getWarwick(), champData.getJhin(),
                    champData.getCassiopeia(), champData.getTalon(), champData.getLeeSin(), champData.getLillia(), champData.getSett(), champData.getAzir(),
                    champData.getYone(), champData.getEzreal(),  champData.getZilean(), champData.getKayn()
            )

        val champMutableList = champList.toMutableList()
        val mAdapter = ChampMainAdapter(view!!.context, champMutableList)

        mAdapter.setItemClickListener(object : ChampMainAdapter.ItemClickListener {
            override fun onClick(view: View, position: Int, champ: Champ) {
                var flag = false
                val synergymain: SynergyData = SynergyData()

                simulatorViewModel.getAllChamp().observe(viewLifecycleOwner, Observer { champs ->

                    if (champs.count() > 10) {
                        flag = true
                    }

                    for (chkChamp in champs) {
                        if (chkChamp.name == champ.name) {
                            flag = true
                        }
                    }
                })
                if (flag) {
                    return
                } else {

                    if (champ?.synergy?.size == 2) {
                        val simChamp = SimulatorChamp(
                            champ?.name,
                            champ?.imgPath,
                            champ?.cost,
                            champ?.synergy[0]?.name,
                            champ?.synergy[1].name,
                            ""
                        )

                        var firstSyn =
                            SimulatorSynergy(
                                champ?.synergy[0]?.name,
                                champ?.synergy[0]?.imgPath,
                                1
                            ,0
                            )
                        var secondSyn =
                            SimulatorSynergy(
                                champ?.synergy[1]?.name,
                                champ?.synergy[1]?.imgPath,
                                1
                            ,0

                            )


                        simulatorViewModel.getAllSynergy()
                            .observe(viewLifecycleOwner, Observer { synergy ->
                                synergy?.let { synergy ->
                                    for (syn in synergy) {
                                        if (firstSyn.name.equals(syn.name)) {
                                            //var power = getSynPower(syn)
                                            //syn.synPower = power
                                           // firstSyn.synPower = syn.synPower
                                            firstSyn.count = syn.count?.plus(1)

                                            Log.e("power1",  firstSyn.synPower.toString())
                                        }

                                        if (secondSyn.name.equals(syn.name)) {
                                            //var power = getSynPower(syn)
                                            secondSyn.count = syn.count?.plus(1)
                                           // secondSyn.synPower = power


                                            Log.e("power2",  secondSyn.synPower.toString())
                                        }
                                    }
                                }
                            })

                        ///첫번째 시너지
                        if ((firstSyn.name.equals(synergymain.getDivine().name) && (firstSyn.count == 2 || firstSyn.count == 3))
                                ||(firstSyn.name.equals(synergymain.getCultist().name) && (firstSyn.count == 3 || firstSyn.count == 4 || firstSyn.count == 5))
                                ||(firstSyn.name.equals(synergymain.getElderwood().name) && (firstSyn.count == 3 || firstSyn.count == 4 || firstSyn.count == 5))
                                ||(firstSyn.name.equals(synergymain.getWarlord().name) && (firstSyn.count == 3 || firstSyn.count == 4 || firstSyn.count == 5))
                                ||(firstSyn.name.equals(synergymain.getEnlightened().name) && (firstSyn.count == 2 || firstSyn.count == 3))
                                ||(firstSyn.name.equals(synergymain.getSpirit().name) && (firstSyn.count == 2 || firstSyn.count == 3))
                                ||(firstSyn.name.equals(synergymain.getExile().name) && (firstSyn.count == 1))
                                ||(firstSyn.name.equals(synergymain.getNinja().name) && (firstSyn.count == 1))
                                ||(firstSyn.name.equals(synergymain.getDusk().name) && (firstSyn.count == 2 || firstSyn.count == 3))) firstSyn.synPower = 1

                        if ((firstSyn.name.equals(synergymain.getDivine().name) && (firstSyn.count == 4 || firstSyn.count == 5))
                                ||(firstSyn.name.equals(synergymain.getEnlightened().name) && (firstSyn.count == 4 || firstSyn.count == 5))) firstSyn.synPower = 2


                        if ((firstSyn.name.equals(synergymain.getCultist().name) && (firstSyn.count == 6 || firstSyn.count == 7 || firstSyn.count == 8))
                                ||(firstSyn.name.equals(synergymain.getEnlightened().name) && (firstSyn.count == 6))
                                ||(firstSyn.name.equals(synergymain.getDivine().name) && (firstSyn.count == 6))
                                ||(firstSyn.name.equals(synergymain.getElderwood().name) && (firstSyn.count == 6 || firstSyn.count == 7))
                                ||(firstSyn.name.equals(synergymain.getWarlord().name) && (firstSyn.count == 6 || firstSyn.count == 7))
                                ||(firstSyn.name.equals(synergymain.getNinja().name) && firstSyn.count == 4)
                                ||(firstSyn.name.equals(synergymain.getSpirit().name) && firstSyn.count == 4)
                                ||(firstSyn.name.equals(synergymain.getExile().name) && firstSyn.count == 2)
                                ||(firstSyn.name.equals(synergymain.getTormented().name) && firstSyn.count == 1)
                                ||(firstSyn.name.equals(synergymain.gettheboss().name) && firstSyn.count == 1)
                                ||(firstSyn.name.equals(synergymain.getMoonlight().name) && (firstSyn.count == 3|| firstSyn.count == 4))
                                ||(firstSyn.name.equals(synergymain.getFortune().name) && (firstSyn.count == 3 || firstSyn.count == 4 || firstSyn.count == 5))
                                ||(firstSyn.name.equals(synergymain.getDusk().name) && (firstSyn.count == 4 || firstSyn.count == 5))) firstSyn.synPower = 3


                        if (firstSyn.name.equals(synergymain.gettheboss().name) || firstSyn.name.equals(synergymain.getTormented().name)){
                            firstSyn.synPower = 3
                        }

                        ///두번째 시너지
                        if((secondSyn.name.equals(synergymain.getDuelist().name) &&(secondSyn.count == 2 || secondSyn.count == 3))
                                ||(secondSyn.name.equals(synergymain.getBrawler().name) &&(secondSyn.count == 2 || secondSyn.count == 3))
                                ||(secondSyn.name.equals(synergymain.getKeeper().name) &&(secondSyn.count == 2 || secondSyn.count == 3))
                                ||(secondSyn.name.equals(synergymain.getShade().name) &&(secondSyn.count == 2))
                                ||(secondSyn.name.equals(synergymain.getHunter().name) &&(secondSyn.count == 2))
                                ||(secondSyn.name.equals(synergymain.getVanguard().name) &&(secondSyn.count == 2 || secondSyn.count == 3))
                                ||(secondSyn.name.equals(synergymain.getSharpShooter().name) &&(secondSyn.count == 2 || secondSyn.count == 3))
                                ||(secondSyn.name.equals(synergymain.getMystic().name) &&(secondSyn.count == 2 || secondSyn.count == 3))
                                ||(secondSyn.name.equals(synergymain.getAssassin().name) &&(secondSyn.count == 2 || secondSyn.count == 3))
                                ||(secondSyn.name.equals(synergymain.getDazzler().name) &&(secondSyn.count == 2 || secondSyn.count == 3))
                                ||(secondSyn.name.equals(synergymain.getAdept().name) &&(secondSyn.count == 2))
                                ||(secondSyn.name.equals(synergymain.getMage().name) &&(secondSyn.count == 3 || secondSyn.count == 4 || secondSyn.count == 5))) secondSyn.synPower = 1

                        if((secondSyn.name.equals(synergymain.getVanguard().name) &&(secondSyn.count == 4 || secondSyn.count == 5))
                                ||(secondSyn.name.equals(synergymain.getDuelist().name) &&(secondSyn.count == 4 || secondSyn.count == 5))
                                ||(secondSyn.name.equals(synergymain.getBrawler().name) &&(secondSyn.count == 4 || secondSyn.count == 5))
                                ||(secondSyn.name.equals(synergymain.getHunter().name) &&(secondSyn.count == 3))
                        ) secondSyn.synPower = 2

                        if((secondSyn.name.equals(synergymain.getDuelist().name) &&(secondSyn.count == 6))
                                ||(secondSyn.name.equals(synergymain.getBrawler().name) &&(secondSyn.count == 6 || secondSyn.count == 7))
                                ||(secondSyn.name.equals(synergymain.getMage().name) &&(secondSyn.count == 6 || secondSyn.count == 7))
                                ||(secondSyn.name.equals(synergymain.getKeeper().name) &&(secondSyn.count == 4 || secondSyn.count == 5))
                                ||(secondSyn.name.equals(synergymain.getAssassin().name) &&(secondSyn.count == 4 || secondSyn.count == 5))
                                ||(secondSyn.name.equals(synergymain.getSharpShooter().name) &&(secondSyn.count == 4 || secondSyn.count == 5))
                                ||(secondSyn.name.equals(synergymain.getMystic().name) &&(secondSyn.count == 4 || secondSyn.count == 5))
                                ||(secondSyn.name.equals(synergymain.getShade().name) &&(secondSyn.count == 3))
                                ||(secondSyn.name.equals(synergymain.getAdept().name) &&(secondSyn.count == 3))
                                ||(secondSyn.name.equals(synergymain.getHunter().name) &&(secondSyn.count == 4))
                                ||(secondSyn.name.equals(synergymain.getDazzler().name) &&(secondSyn.count == 4))
                                ||(secondSyn.name.equals(synergymain.getVanguard().name) &&(secondSyn.count == 6))) secondSyn.synPower = 3

                        if (secondSyn.name.equals(synergymain.getEmperor().name)){
                            secondSyn.synPower = 3
                        }

                        addChamp(simChamp)
                        addSynergy(firstSyn)
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
                        val firstSyn =
                            SimulatorSynergy(
                                champ?.synergy[0]?.name,
                                champ?.synergy[0]?.imgPath,
                                1,
                                0
                            )
                        val secondSyn =
                            SimulatorSynergy(
                                champ?.synergy[1]?.name,
                                champ?.synergy[1]?.imgPath,
                                1
                            ,0
                            )
                        val thirdSyn =
                            SimulatorSynergy(
                                champ?.synergy[2]?.name,
                                champ?.synergy[2]?.imgPath,

                                1
                            ,0

                            )

                        simulatorViewModel.getAllSynergy()
                            .observe(viewLifecycleOwner, Observer { synergy ->
                                synergy?.let { synergy ->
                                    for (syn in synergy) {

                                        if (firstSyn.name.equals(syn.name)) {
                                           // var power = getSynPower(syn)
                                            firstSyn.count = syn.count?.plus(1)
                                          //  firstSyn.synPower = power
                                            Log.e("power",  firstSyn.synPower.toString())
                                        }

                                        if (secondSyn.name.equals(syn.name)) {
                                          //  var power = getSynPower(syn)
                                            secondSyn.count = syn.count?.plus(1)
                                          //  secondSyn.synPower = power
                                            Log.e("power",  secondSyn.synPower.toString())
                                        }

                                        if (thirdSyn.name.equals(syn.name)) {
                                        //    var power = getSynPower(syn)
                                            thirdSyn.count = syn.count?.plus(1)
                                          //  thirdSyn.synPower = power
                                        }

                                    }
                                }
                            })
                        //첫번째 시너지
                        if ((firstSyn.name.equals(synergymain.getWarlord().name) && (firstSyn.count == 3 || firstSyn.count == 4 || firstSyn.count == 5))
                                ||(firstSyn.name.equals(synergymain.getEnlightened().name) && (firstSyn.count == 2 || firstSyn.count == 3 ))
                                ||(firstSyn.name.equals(synergymain.getNinja().name) && (firstSyn.count == 1))
                                ||(firstSyn.name.equals(synergymain.getDivine().name) &&(firstSyn.count == 2 || firstSyn.count == 3))) firstSyn.synPower = 1

                        if ((firstSyn.name.equals(synergymain.getEnlightened().name) && (firstSyn.count == 4 || firstSyn.count == 5))
                                ||(firstSyn.name.equals(synergymain.getDivine().name) &&(firstSyn.count == 4 || firstSyn.count == 5))) firstSyn.synPower = 2

                        if ((firstSyn.name.equals(synergymain.getEnlightened().name) && (firstSyn.count == 6))
                                ||(firstSyn.name.equals(synergymain.getWarlord().name) && (firstSyn.count == 6))
                                ||(firstSyn.name.equals(synergymain.getNinja().name) && (firstSyn.count == 4))
                                ||(firstSyn.name.equals(synergymain.getDivine().name) &&(firstSyn.count == 6))) firstSyn.synPower = 3

                        //두번째 시너지
                        if((secondSyn.name.equals(synergymain.getDivine().name) &&(secondSyn.count == 2 || secondSyn.count == 3))
                                ||(secondSyn.name.equals(synergymain.getAdept().name) &&(secondSyn.count == 2))
                                ||(secondSyn.name.equals(synergymain.getBrawler().name) &&(secondSyn.count == 2 || secondSyn.count == 3))
                                ||(secondSyn.name.equals(synergymain.getKeeper().name) &&(secondSyn.count == 2 || secondSyn.count == 3)))
                            secondSyn.synPower = 1

                        if ((secondSyn.name.equals(synergymain.getDivine().name) && (secondSyn.count == 4 || secondSyn.count == 5))
                                || (secondSyn.name.equals(synergymain.getAdept().name) &&(secondSyn.count == 3))
                                || (secondSyn.name.equals(synergymain.getBrawler().name) && (secondSyn.count == 4 || secondSyn.count == 5)))secondSyn.synPower = 2

                        if((secondSyn.name.equals(synergymain.getDivine().name) && (secondSyn.count == 6))
                                ||(secondSyn.name.equals(synergymain.getFortune().name) &&(secondSyn.count == 3 || secondSyn.count == 4 || secondSyn.count == 5))
                                ||(secondSyn.name.equals(synergymain.getAdept().name) &&(secondSyn.count == 4))
                                ||(secondSyn.name.equals(synergymain.getBrawler().name) && (secondSyn.count == 6 || secondSyn.count == 7))
                                ||(secondSyn.name.equals(synergymain.getKeeper().name) &&(secondSyn.count == 4 || secondSyn.count == 5))) secondSyn.synPower = 3


                        //세번째 시너지
                        if((thirdSyn.name.equals(synergymain.getAdept().name) &&(thirdSyn.count == 2))
                                ||(thirdSyn.name.equals(synergymain.getAssassin().name) &&(thirdSyn.count == 2 || thirdSyn.count == 3))
                                ||(thirdSyn.name.equals(synergymain.getMystic().name) &&(thirdSyn.count == 2 || thirdSyn.count == 3))
                                ||(thirdSyn.name.equals(synergymain.getHunter().name) &&(thirdSyn.count == 2))) thirdSyn.synPower = 1

                        if((thirdSyn.name.equals(synergymain.getAdept().name) &&(thirdSyn.count == 3))
                                ||(thirdSyn.name.equals(synergymain.getHunter().name) &&(thirdSyn.count == 3))) thirdSyn.synPower = 2

                        if ((thirdSyn.name.equals(synergymain.getAdept().name) &&(thirdSyn.count == 4))
                                ||(thirdSyn.name.equals(synergymain.getAssassin().name) &&(thirdSyn.count == 4 || thirdSyn.count == 5))
                                ||(thirdSyn.name.equals(synergymain.getMystic().name) &&(thirdSyn.count == 4 || thirdSyn.count == 5))
                                ||(thirdSyn.name.equals(synergymain.getHunter().name) &&(thirdSyn.count == 4))
                                ||(thirdSyn.name.equals(synergymain.getEmperor().name))) thirdSyn.synPower = 3

                        addChamp(simChamp)
                        addSynergy(firstSyn)
                        addSynergy(secondSyn)
                        addSynergy(thirdSyn)

                    }

                }

            }

        })

        recyclerView?.layoutManager = LinearLayoutManager(view!!.context)
        recyclerView?.adapter = mAdapter
    }

   /* private fun getSynPower(synergy: SimulatorSynergy) : Int{
        val synergymain: SynergyData = SynergyData()
        var power : Int = 0
        if (((synergy.count == 1 || synergy.count == 2) && synergy.imgPath == synergymain.getBattlecast().imgPath)
            || ((synergy.count == 1 || synergy.count == 2)  && synergy.imgPath == synergymain.getChrono().imgPath)
            || ((synergy.count == 1 || synergy.count == 2)  && synergy.imgPath == synergymain.getSorcerer().imgPath)
            || ((synergy.count == 1 || synergy.count == 2)  && synergy.imgPath == synergymain.getBrawler().imgPath)
            || ((synergy.count == 1 || synergy.count == 2)  && synergy.imgPath == synergymain.getMystic().imgPath)
            || ((synergy.count == 1 || synergy.count == 2)  && synergy.imgPath == synergymain.getVanguard().imgPath)
            || ((synergy.count == 1 || synergy.count == 2)  && synergy.imgPath == synergymain.getInfiltrator().imgPath)
            || ((synergy.count == 1 || synergy.count == 2)  && synergy.imgPath == synergymain.getDarkStar().imgPath)
            || ((synergy.count == 1 || synergy.count == 2)  && synergy.imgPath == synergymain.getCelestial().imgPath)
            || ((synergy.count == 1 || synergy.count == 2)  && synergy.imgPath == synergymain.getSpacePirate().imgPath)
            || ((synergy.count == 1 || synergy.count == 2)  && synergy.imgPath == synergymain.getProtector().imgPath)
            || ((synergy.count == 1 || synergy.count == 2)  && synergy.imgPath == synergymain.getSniper().imgPath)
            || ((synergy.count == 1 || synergy.count == 2)  && synergy.imgPath == synergymain.getBlaster().imgPath))
                power = 1


        if ( ((synergy.count == 2 || synergy.count == 3 || synergy.count == 4) && synergy.imgPath == synergymain.getCybernetic().imgPath)
            || ((synergy.count == 2 || synergy.count == 3 || synergy.count == 4) && synergy.imgPath == synergymain.getBlademaster().imgPath)
            || ((synergy.count == 2 || synergy.count == 3 || synergy.count == 4) && synergy.imgPath == synergymain.getRebel().imgPath)
            || ((synergy.count == 2 || synergy.count == 3 || synergy.count == 4) && synergy.imgPath == synergymain.getStarGuardian().imgPath))
                power = 1

        if (((synergy.count == 3 || synergy.count == 4) && synergy.imgPath == synergymain.getBattlecast().imgPath)
            ||((synergy.count == 3 || synergy.count == 4)&& synergy.imgPath == synergymain.getSorcerer().imgPath)
            ||((synergy.count == 3 || synergy.count == 4)&& synergy.imgPath == synergymain.getVanguard().imgPath)
            ||((synergy.count == 3 || synergy.count == 4)&& synergy.imgPath == synergymain.getDarkStar().imgPath)
            ||((synergy.count == 3 || synergy.count == 4)&& synergy.imgPath == synergymain.getCelestial().imgPath)
            ||((synergy.count == 3 || synergy.count == 4)&& synergy.imgPath == synergymain.getChrono().imgPath))
                power = 2
        if ((synergy.count == 1 && synergy.imgPath == synergymain.getManaReaver().imgPath)
            || (synergy.count == 1 && synergy.imgPath == synergymain.getDemolitionist().imgPath))
                power = 3

        if ((synergy.count == 2 && synergy.imgPath == synergymain.getMechPilot().imgPath)
            || (synergy.count == 2 && synergy.imgPath == synergymain.getAstro().imgPath))
                power = 3


        if (((synergy.count == 3 || synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getBrawler().imgPath)
            || ((synergy.count == 3 || synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getMystic().imgPath)
            || ((synergy.count == 3 || synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getSpacePirate().imgPath)
            || ((synergy.count == 3 || synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getSniper().imgPath)
            || ((synergy.count == 3 || synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getBlaster().imgPath)
            || ((synergy.count == 3 || synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getInfiltrator().imgPath)
            || ((synergy.count == 3 || synergy.count == 4 || synergy.count == 5) && synergy.imgPath == synergymain.getProtector().imgPath))
                power = 3

        if (synergy.count == 5&& synergy.imgPath == synergymain.getStarGuardian().imgPath
            || (synergy.count == 5 && synergy.imgPath == synergymain.getChrono().imgPath)
            || (synergy.count == 5 && synergy.imgPath == synergymain.getCybernetic().imgPath)
            || (synergy.count == 5 && synergy.imgPath == synergymain.getDarkStar().imgPath)
            || (synergy.count == 5 && synergy.imgPath == synergymain.getRebel().imgPath)
            || (synergy.count == 5 && synergy.imgPath == synergymain.getBattlecast().imgPath)
            || (synergy.count == 5 && synergy.imgPath == synergymain.getCelestial().imgPath)
            || (synergy.count == 5 && synergy.imgPath == synergymain.getBlademaster().imgPath)
            || (synergy.count == 5 && synergy.imgPath == synergymain.getSorcerer().imgPath)
            || (synergy.count == 5 && synergy.imgPath == synergymain.getVanguard().imgPath))
                power = 3


        Log.e("synPower",synergy.name + "  " + power.toString())

        return  power
    }*/

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


}


