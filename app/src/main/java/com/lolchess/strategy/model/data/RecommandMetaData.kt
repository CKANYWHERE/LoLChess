package com.lolchess.strategy.model.data

import com.lolchess.strategy.model.RecommandMeta


class RecommandMetaData {

    fun getAllMetaData() : MutableList<RecommandMeta>{
        return listOf(getMagicStarGuardian(), getTest(),getMagicStarGuardian(),getMagicStarGuardian(),getMagicStarGuardian(),getMagicStarGuardian()
        ,getMagicStarGuardian(),getMagicStarGuardian(),getMagicStarGuardian(),getMagicStarGuardian()).toMutableList()
    }

    fun getMagicStarGuardian() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
            champData.getJarvanIV(), champData.getZoe(),champData.getAhri(),champData.getNeeko(),champData.getSyndra(),champData.getSoraka(),champData.getJanna(),champData.getXerath(), champData.getJanna()
        )
        val syn = listOf(
            synData.getBattlecast(),synData.getStarGuardian(),synData.getSorcerer(),synData.getDarkStar(),synData.getProtector()
        )

        return RecommandMeta("마법사 별수호자", champ, syn)
    }

    fun getTest() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getJarvanIV(), champData.getZoe(),champData.getAhri(),champData.getNeeko(),champData.getSyndra(),champData.getSoraka(),champData.getJanna(),champData.getXerath(), champData.getJanna()
        )
        val syn = listOf(
                synData.getBattlecast(),synData.getStarGuardian(),synData.getSorcerer(),synData.getDarkStar(),synData.getProtector()
        )

        return RecommandMeta("마법사 별수호자", champ, syn)
    }

}