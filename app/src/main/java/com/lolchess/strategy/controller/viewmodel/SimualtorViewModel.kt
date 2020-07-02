package com.lolchess.strategy.controller.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.lolchess.strategy.controller.database.SimulatorDB
import com.lolchess.strategy.controller.entity.SimulatorChamp
import com.lolchess.strategy.controller.entity.SimulatorSynergy
import com.lolchess.strategy.controller.repository.SimulatorRepository
import kotlinx.coroutines.launch

class SimualtorViewModel(application: Application):ViewModel() {
    private val simulatorRepository : SimulatorRepository
    val allSimChamp: LiveData<List<SimulatorChamp>>
    val allSimSyn: LiveData<List<SimulatorSynergy>>


    class Factory(val application: Application) : ViewModelProvider.Factory {
        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return SimualtorViewModel(application) as T
        }
    }

    init {
        val simulatorDAO = SimulatorDB.getInstance(application)?.SimulatorDAO()
        simulatorRepository = simulatorDAO?.let { SimulatorRepository(it) }!!
        allSimChamp = simulatorRepository.allSimulatorChamp
        allSimSyn = simulatorRepository.allSimulatorSynergy
    }

    fun insert(simulatorChamp: SimulatorChamp) = viewModelScope.launch{
        simulatorRepository.insert(simulatorChamp)
    }

    fun insert(simulatorSynergy: SimulatorSynergy) = viewModelScope.launch{
        simulatorRepository.insert(simulatorSynergy)
    }

    fun getAllChamp(): LiveData<List<SimulatorChamp>> {
        return this.allSimChamp
    }

    fun getAllSynergy():LiveData<List<SimulatorSynergy>>{
        return this.allSimSyn
    }

    fun getSynergyByName(name:Array<String>): LiveData<List<SimulatorSynergy>>{
        return simulatorRepository.getSynergyByName(name)
    }

    fun deleteChampByName(name:String)  = viewModelScope.launch{
        simulatorRepository.deleteChampByName(name)
    }

    fun deleteSynergyByName(name: String) = viewModelScope.launch{
        simulatorRepository.deleteSynergyByName(name)
    }
}