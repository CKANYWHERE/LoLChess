package com.lolchess.strategy.controller.dao

import android.util.Log
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.lolchess.strategy.controller.entity.SimulatorChamp
import com.lolchess.strategy.controller.entity.SimulatorSynergy


@Dao
interface SimulatorDAO {
    @Query("Select * From SimulatorChamp")
    fun getAllChamp(): List<SimulatorChamp>

    @Query("Select * From SimulatorSynergy")
    fun getAllSynergy(): List<SimulatorSynergy>

    @Query("Select(Count(*)) From SimulatorChamp")
    fun getChampCount():Int

    @Insert(onConflict = REPLACE)
    fun insert(simulatorSynergy: SimulatorSynergy)


    @Insert(onConflict = REPLACE)
    fun insert(simulatorChamp: SimulatorChamp)

    @Query("Delete From SimulatorChamp Where name = :name")
    fun deleteChamp(name:String)

    @Query("Delete From SimulatorSynergy Where name = :name")
    fun deleteSynergy(name:String)

}