package com.lolchess.strategy.controller.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.lolchess.strategy.controller.dao.SimulatorDAO
import com.lolchess.strategy.controller.entity.SimulatorChamp
import com.lolchess.strategy.controller.entity.SimulatorSynergy
import com.lolchess.strategy.view.menu.Simulator

@Database(entities = [SimulatorChamp::class, SimulatorSynergy::class],version = 1)
abstract class SimulatorDB: RoomDatabase() {
    abstract fun SimulatorDAO(): SimulatorDAO

    companion object {
        private var INSTANCE: SimulatorDB? = null

        //singleton patton
        fun getInstance(context: Context): SimulatorDB? {
            if (INSTANCE == null) {
                //synchronized : 중복 방지
                synchronized(SimulatorDB::class) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        SimulatorDB::class.java, "photo.db"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE
        }
    }
}