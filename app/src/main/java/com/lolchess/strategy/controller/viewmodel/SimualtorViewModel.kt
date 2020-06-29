package com.lolchess.strategy.controller.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.lolchess.strategy.controller.database.SimulatorDB
import com.lolchess.strategy.controller.entity.SimulatorChamp
import com.lolchess.strategy.controller.entity.SimulatorSynergy
import com.lolchess.strategy.controller.repository.SimulatorRepository
import kotlinx.coroutines.launch

class SimualtorViewModel(application: Application):ViewModel() {
    private val simulatorRepository : SimulatorRepository
    val allSimChamp: LiveData<List<SimulatorChamp>>

    init {
        val simulatorDAO = SimulatorDB.getInstance(application)?.SimulatorDAO()
        simulatorRepository = simulatorDAO?.let { SimulatorRepository(it) }!!
        allSimChamp = simulatorRepository.allSimulatorChamp
    }

    fun insert(simulatorChamp: SimulatorChamp) = viewModelScope.launch{
        simulatorRepository.insert(simulatorChamp)
    }

    fun insert(simulatorSynergy: SimulatorSynergy) = viewModelScope.launch{
        simulatorRepository.insert(simulatorSynergy)
    }

    fun getAll(): LiveData<List<SimulatorChamp>> {
        return this.allSimChamp
    }
}