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

    @Query("Select * From SimulatorSynergy")
    fun getAllSynergy(): LiveData<List<SimulatorSynergy>>

    @Query("Select(Count(*)) From SimulatorChamp")
    fun getChampCount():LiveData<Int>

    @Query("Select * From SimulatorSynergy Where name in(:name1,:name2,:name3)")
    fun getSynergyByName(name1: String ,name2: String ,name3: String): LiveData<List<SimulatorSynergy>>

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