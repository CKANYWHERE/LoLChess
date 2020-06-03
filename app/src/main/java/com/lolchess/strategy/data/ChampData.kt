package com.lolchess.strategy.data

import com.lolchess.strategy.R
import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.model.Synergy

class ChampData {
    fun getGraves() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getBlaster(),SynergyData().getSpacePilot())
        val hp : List<Int> = listOf(650, 1170, 2106)
        val attack : List<Double> = listOf(55.0,99.0,178.2)

        return Champ("그레이브즈", R.drawable.graves,"연막탄","그레이브즈가 공격 속도가 가장 높은 적을 향해 연막탄을 발사합니다. 연막탄은 적중 시 폭발하며 범위 내 모든 적은 마법 피해를 입고 수 초 동안 실명됩니다."
        ,1,synergy,hp,attack,0.55,1,35,20)
    }
}