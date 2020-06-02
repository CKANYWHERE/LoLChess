package com.lolchess.strategy.data

import com.lolchess.strategy.model.Synergy

class SynergyData {
    fun getBlaster() : Synergy{
        val option : List<String> = listOf("추가 공격 3회", "추가 공격 5회")
        val level : List<Int> = listOf(2,4)
        return Synergy("총잡이","이미지경로", option, level)
    }

    fun getSpacePilot() : Synergy{
        val option : List<String> = listOf("50% 확률로 1골드 획득", "50% 확률로 1골드 획득 및 25% 확률로 기본 아이템 획득")
        val level : List<Int> = listOf(2,4)
        return Synergy("우주해적","이미지경로", option, level)
    }
}