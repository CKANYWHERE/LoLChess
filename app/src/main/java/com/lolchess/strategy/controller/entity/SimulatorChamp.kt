package com.lolchess.strategy.controller.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "SimulatorChamp")
 class SimulatorChamp (@PrimaryKey var name:String,
                        @ColumnInfo(name = "imgPath") var imgPath: Int?,
                        @ColumnInfo(name="firstSynergy") var firstSynergy: String?,
                       @ColumnInfo(name="secondSynergy") var secondSynergy: String?,
                       @ColumnInfo(name="thirdSynergy") var thirdSynergy: String?)
