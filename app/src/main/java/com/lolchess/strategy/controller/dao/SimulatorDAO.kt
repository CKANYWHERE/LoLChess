package com.lolchess.strategy.controller.dao

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import androidx.room.Update
import com.lolchess.strategy.controller.entity.SimulatorChamp
import com.lolchess.strategy.controller.entity.SimulatorSynergy


@Dao
interface SimulatorDAO {
    @Query("Select * From SimulatorChamp")
    fun getAllChamp(): LiveData<List<SimulatorChamp>>

    @Query("Select * From SimulatorSynergy order by count desc")
    fun getAllSynergy(): LiveData<List<SimulatorSynergy>>

    @Query("Select(Count(*)) From SimulatorChamp")
    fun getChampCount():LiveData<Int>

    @Query("Select * From SimulatorSynergy Where name in(:name)")
    fun getSynergyByName(name:Array<String>): LiveData<List<SimulatorSynergy>>

    @Insert(onConflict = REPLACE)
    suspend fun insert(simulatorSynergy: SimulatorSynergy)

    @Insert(onConflict = REPLACE)
    suspend fun insert(simulatorChamp: SimulatorChamp)

    @Update
    suspend fun updateSynCount(simulatorSynergy:SimulatorSynergy)

    @Query("Delete From SimulatorChamp")
    suspend fun deleteAllChamp()

    @Query("Delete From SimulatorSynergy")
    suspend fun deleteAllSynergy()

    @Query("Delete From SimulatorChamp Where name = :name")
    suspend fun deleteChamp(name:String)

    @Query("Delete From SimulatorSynergy Where name = :name")
    suspend fun deleteSynergy(name:String)

}