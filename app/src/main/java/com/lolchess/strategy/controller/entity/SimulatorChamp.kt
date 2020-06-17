package com.lolchess.strategy.controller.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "SimulatorChamp")
 class SimulatorChamp (@PrimaryKey var name:String?,
                        @ColumnInfo(name = "imgPath") var imgPath: Int?,
                        @ColumnInfo(name = "firstSyn") var firstSyn: String?,
                        @ColumnInfo(name = "secondSyn") var secondSyn: String?,
                       @ColumnInfo(name = "thirdSyn") var thirdSyn: String?)