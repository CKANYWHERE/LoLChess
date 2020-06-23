package com.lolchess.strategy.controller.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.lolchess.strategy.controller.dao.SimulatorDAO
import com.lolchess.strategy.controller.entity.SimulatorChamp
import com.lolchess.strategy.controller.entity.SimulatorSynergy

@Database(entities = [SimulatorChamp::class, SimulatorSynergy::class],version = 4)
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
                        SimulatorDB::class.java, "simulator.db"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }
            return INSTANCE
        }

        fun destroyInstance(){
            INSTANCE = null
        }
    }
}