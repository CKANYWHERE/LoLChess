package com.lolchess.strategy.controller.repository

import android.app.Application
import androidx.lifecycle.LiveData
import com.lolchess.strategy.controller.dao.SimulatorDAO
import com.lolchess.strategy.controller.database.SimulatorDB
import com.lolchess.strategy.controller.entity.SimulatorChamp
import com.lolchess.strategy.controller.entity.SimulatorSynergy

class SimulatorRepository(private val simulatorDAO :SimulatorDAO) {

    val allSimulatorChamp : LiveData<List<SimulatorChamp>> = simulatorDAO.getAllChamp()

    suspend fun insert(simulatorChamp: SimulatorChamp){
        simulatorDAO.insert(simulatorChamp)
    }

    suspend fun insert(simulatorSynergy: SimulatorSynergy){
        simulatorDAO.insert(simulatorSynergy)
    }

    suspend fun deleteChampByName(name:String) {
        return simulatorDAO.deleteChamp(name)
    }
}


