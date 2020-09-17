package com.lolchess.strategy.model.data

import androidx.core.graphics.createBitmap
import com.lolchess.strategy.model.RecommendMeta


class RecommendMetaData {

    fun getAllMetaData() : MutableList<RecommendMeta>{
        return listOf(getDuskCultist(), get8Cultist(), getChosenSharpshooters(), getChosenWarlords(), getElderWood(), getChosenDuelist(), get6Mages(), getEnlightendAssassins()).toMutableList()
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

        return RecommendMeta("황혼 6광신도", champ, syn, item)
    }

    fun get8Cultist() : RecommendMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()
        val champ = listOf(
                champData.getElise(), champData.getTwistedFate(), champData.getPyke(),champData.getKalista(), champData.getEvelynn(),champData.getAatrox(),champData.getJhin(),champData.getZilean()
        )
        val syn = listOf(
                synData.getCultist()
        )
        val item = listOf(
                itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
                itemData.blank(),itemData.Morellonomicon(),itemData.blank(), //2번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
                itemData.Guinsoo_Rageblade(),itemData.Rapid_Firecannon(),itemData.Runaan_Hurricane(), //4번째 챔피언
                itemData.Guardian_Angel(),itemData.Hextech_Gunblade(),itemData.blank(), //5번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
                itemData.blank(), itemData.blank(), itemData.blank() //8번째 챔피언
        )

        return RecommendMeta("9광신도(광신도 선택받은자)", champ, syn, item)
    }

    fun getChosenWarlords() : RecommendMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()
        val champ = listOf(
                champData.getGaren(), champData.getNidalee(), champData.getJarvanIV(),champData.getPyke(), champData.getVi(),champData.getKatarina(),champData.getXinZhao(),champData.getAzir()
        )
        val syn = listOf(
                synData.getWarlord(),synData.getEmperor(),synData.getAssassin(),synData.getKeeper()
        )
        val item = listOf(
                itemData.Gargoyle(), itemData.Sunfire_Cape(), itemData.blank(), //1번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
                itemData.blank(),itemData.Warlords_Banner(),itemData.blank(), //4번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //5번째 챔피언
                itemData.Guardian_Angel(),itemData.Hextech_Gunblade(),itemData.Quicksilver(), //6번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
                itemData.blank(), itemData.blank(), itemData.blank() //8번째 챔피언
        )

        return RecommendMeta("9대장군(대장군 선택받은자)", champ, syn, item)
    }

    fun getChosenSharpshooters() : RecommendMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()
        val champ = listOf(
                champData.getNidalee(), champData.getVayne(), champData.getTeemo(),champData.getThresh(), champData.getJinx(),champData.getYuumi(),champData.getAatrox(),champData.getJhin(), champData.getZilean()
        )
        val syn = listOf(
                synData.getSharpShooter(),synData.getCultist(),synData.getMystic(),synData.getSpirit() ,synData.getDusk(),synData.getVanguard()
        )
        val item = listOf(
                itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
                itemData.blank(),itemData.Warlords_Banner(),itemData.blank(), //4번째 챔피언
                itemData.Spear_of_Shojin(),itemData.Guinsoo_Rageblade(),itemData.blank(), //5번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
                itemData.Guardian_Angel(), itemData.Infinity_Edge(), itemData.Last_Whisper(), //8번째 챔피언
                itemData.blank(), itemData.blank(), itemData.blank() //9번째 챔피언
        )

        return RecommendMeta("6명사수 (명사수 선택받은자)", champ, syn, item)
    }

    fun getElderWood() : RecommendMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()
        val champ = listOf(
                champData.getMaokai(), champData.getLulu(), champData.getHecarim(),champData.getNunu(), champData.getAshe(),champData.getWarwick(),champData.getEzreal(),champData.getSett()
        )
        val syn = listOf(
                synData.gettheboss(),synData.getElderwood(),synData.getBrawler(),synData.getHunter()
        )
        val item = listOf(
                itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
                itemData.Gargoyle(),itemData.Hextech_Gunblade(),itemData.Warmog_Armor(), //4번째 챔피언
                itemData.Giant_Slayer(),itemData.Infinity_Edge(),itemData.Guinsoo_Rageblade(), //5번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
                itemData.blank(), itemData.blank(), itemData.blank() //8번째 챔피언
        )

        return RecommendMeta("나무정령 싸움꾼", champ, syn, item)
    }

    fun getChosenDuelist() : RecommendMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()
        val champ = listOf(
                champData.getFiora(), champData.getYasuo(), champData.getJanna(), champData.getJax(),champData.getKalista(),champData.getShen(),champData.getLeeSin(),champData.getYone()
        )
        val syn = listOf(
                synData.getDuelist(),synData.getExile(),synData.getEnlightened(),synData.getDivine(),synData.getMystic(),synData.getAdept(),synData.getNinja()
        )
        val item = listOf(
                itemData.blank(), itemData.blank(), itemData.blank(),//1번째 챔피언
                itemData.Guardian_Angel(),itemData.Hand_of_Justice(),itemData.Quicksilver(), //2번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
                itemData.Guinsoo_Rageblade(),itemData.Runaan_Hurricane(),itemData.blank(), //5번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
                itemData.blank(), itemData.Thief_gloves(), itemData.blank() //8번째 챔피언
        )

        return RecommendMeta("결투가, 슬로우 리롤(피, 야, 잭 3성작)", champ, syn, item)
    }

    fun get6Mages() : RecommendMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()
        val champ = listOf(
                champData.getTwistedFate(), champData.getLulu(), champData.getHecarim(), champData.getAnnie(), champData.getVeigar(),champData.getAatrox(),champData.getCassiopeia(),champData.getLillia()
        )
        val syn = listOf(
                synData.getMage(),synData.getVanguard(),synData.getDusk(),synData.getElderwood(),synData.getMystic(),synData.getAdept(),synData.getNinja()
        )
        val item = listOf(
                itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
                itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
                itemData.Sunfire_Cape(),itemData.Ionic_Spark(),itemData.Quicksilver(), //4번째 챔피언
                itemData.Blue_Buff(),itemData.Hextech_Gunblade(),itemData.Quicksilver(), //5번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
                itemData.blank(), itemData.blank(), itemData.blank() //8번째 챔피언
        )

        return RecommendMeta("6요술사 베이가", champ, syn, item)
    }


    fun getEnlightendAssassins() : RecommendMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()
        val champ = listOf(
                champData.getFiora(), champData.getNami(), champData.getJanna(), champData.getPyke(), champData.getIrelia(),champData.getMorgana(),champData.getShen(),champData.getTalon()
        )
        val syn = listOf(
                synData.getEnlightened(),synData.getAdept(),synData.getMystic(),synData.getAssassin(),synData.getNinja()
        )
        val item = listOf(
                itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
                itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //5번째 챔피언
                itemData.Blue_Buff(),itemData.Morellonomicon(),itemData.blank(), //6번째 챔피언
                itemData.blank(),itemData.Gargoyle(),itemData.blank(), //7번째 챔피언
                itemData.Bloodthirster(), itemData.Deathblade(), itemData.Quicksilver() //8번째 챔피언
        )

        return RecommendMeta("6요술사 베이가", champ, syn, item)
    }




}