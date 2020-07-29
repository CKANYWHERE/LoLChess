package com.lolchess.strategy.controller.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "SimulatorSynergy")
class SimulatorSynergy (@PrimaryKey var name:String,
                        @ColumnInfo(name = "imgPath") var imgPath:Int?,
                        @ColumnInfo(name = "count") var count:Int?,
                        @ColumnInfo(name = "synPower") var synPower:Int?){
}