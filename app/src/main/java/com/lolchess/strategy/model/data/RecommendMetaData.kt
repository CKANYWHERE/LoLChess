package com.lolchess.strategy.model.data

import androidx.core.graphics.createBitmap
import com.lolchess.strategy.model.RecommendMeta


class RecommendMetaData {

    fun getAllMetaData() : MutableList<RecommendMeta>{
        return listOf(getDuskCultist()).toMutableList()
    }


    fun getDuskCultist() : RecommendMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()
        val champ = listOf(
                champData.getElise(), champData.getPyke(),champData.getKalista(),champData.getAatrox(),champData.getCassiopeia(),champData.getJhin(),champData.getRiven(),champData.getZilean()
        )
        val syn = listOf(
                synData.getCultist(),synData.getKeeper(),synData.getMystic(),synData.getDusk()
        )
           val item = listOf(
            itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.Morellonomicon(),itemData.blank(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.Gargoyle(),itemData.Warmog_Armor(),itemData.blank(), //4번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.Guardian_Angel(),itemData.Hextech_Gunblade(),itemData.Quicksilver(), //7번째 챔피언
            itemData.blank(), itemData.blank(), itemData.blank() //8번째 챔피언
        )

        return RecommendMeta("우주 4저격", champ, syn, item)
    }


}