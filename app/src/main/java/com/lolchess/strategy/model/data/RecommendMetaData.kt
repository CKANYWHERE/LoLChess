package com.lolchess.strategy.model.data

import androidx.core.graphics.createBitmap
import com.lolchess.strategy.model.RecommendMeta


class RecommendMetaData {

    fun getAllMetaData() : MutableList<RecommendMeta>{
        return listOf(getChosenDuelist(),getChosenZed(), getVanguardMystic(),getElderwoodVeigar(),getMoonlight(), getDuskCultist(), getChosenSharpshooters(), getChosenWarlords(), getElderWood(), get6Mages(), getEnlightendAssassins()).toMutableList()
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
                champData.getNidalee(), champData.getVayne(), champData.getTeemo(),champData.getJarvanIV(), champData.getJinx(),champData.getKennen(),champData.getRiven(),champData.getJhin(), champData.getAzir()
        )
        val syn = listOf(
                synData.getSharpShooter(),synData.getCultist(),synData.getMystic(),synData.getSpirit() ,synData.getDusk(),synData.getVanguard()
        )
        val item = listOf(
                itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
                itemData.Spear_of_Shojin(),itemData.Guinsoo_Rageblade(),itemData.blank(), //5번째 챔피언
                itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
                itemData.blank(),itemData.Sunfire_Cape(),itemData.blank(), //7번째 챔피언
                itemData.Guardian_Angel(), itemData.Infinity_Edge(), itemData.Last_Whisper(), //8번째 챔피언
                itemData.blank(), itemData.blank(), itemData.blank() //9번째 챔피언
        )

        return RecommendMeta("6명사수 귀감 (명사수 선택받은자)", champ, syn, item)
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
                champData.getFiora(), champData.getYasuo(), champData.getJanna(), champData.getJax(),champData.getKalista(),champData.getXinZhao() ,champData.getShen(),champData.getLeeSin(),champData.getYone()
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
                itemData.blank(),itemData.blank(),itemData.blank(), //8번째 챔피언
                itemData.blank(), itemData.Thief_gloves(), itemData.blank() //9번째 챔피언
        )

        return RecommendMeta("8결투가, 슬로우 리롤(야, 잭 3성작)", champ, syn, item)
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

        return RecommendMeta("6선지자", champ, syn, item)
    }

    fun getChosenZed() : RecommendMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()
        val champ = listOf(
            champData.getZed(), champData.getTeemo(), champData.getYuumi(), champData.getEvelynn(), champData.getKindred(),champData.getAhri(),champData.getZilean(),champData.getKayn()
        )
        val syn = listOf(
            synData.getShade(),synData.getSpirit(),synData.getTormented(),synData.getMystic(),synData.getNinja()
        )
        val item = listOf(
            itemData.Rapid_Firecannon(),itemData.Bloodthirster(),itemData.Quicksilver(), //2번째 챔피언
            itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //5번째 챔피언
            itemData.Guardian_Angel(),itemData.Morellonomicon(),itemData.blank(), //6번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
            itemData.Hextech_Gunblade(), itemData.Hand_of_Justice(), itemData.Guardian_Angel() //8번째 챔피언
        )

        return RecommendMeta("4그림자, 4영혼", champ, syn, item)
    }


    fun getVanguardMystic() : RecommendMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()
        val champ = listOf(
            champData.getThresh(), champData.getJanna(), champData.getYuumi(), champData.getSejuani(), champData.getAhri(),champData.getAatrox(),champData.getCassiopeia(),champData.getZilean()
        )
        val syn = listOf(
            synData.getMystic(),synData.getVanguard(),synData.getSpirit(),synData.getDusk()
        )
        val item = listOf(
            itemData.blank(),itemData.blank(),itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.Morellonomicon(),itemData.Dragon_Claw(),itemData.Bramble_Vest(), //4번째 챔피언
            itemData.Guardian_Angel(),itemData.Jeweled_Gauntlet(),itemData.Jeweled_Gauntlet(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //8번째 챔피언
        )

        return RecommendMeta("4선봉, 4신비 아리 캐리", champ, syn, item)
    }

    fun getElderwoodVeigar() : RecommendMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()
        val champ = listOf(
            champData.getMaokai(), champData.getLulu(), champData.getAnnie(), champData.getHecarim(), champData.getNunu(),champData.getVeigar(),champData.getAshe(),champData.getEzreal()
        )
        val syn = listOf(
            synData.getMystic(),synData.getVanguard(),synData.getSpirit(),synData.getDusk()
        )
        val item = listOf(
            itemData.blank(),itemData.blank(),itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //5번째 챔피언
            itemData.Hextech_Gunblade(),itemData.Blue_Buff(),itemData.Quicksilver(), //6번째 챔피언
            itemData.Giant_Slayer(),itemData.Guinsoo_Rageblade(),itemData.blank(), //7번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //8번째 챔피언
        )

        return RecommendMeta("9나무 베이가", champ, syn, item)
    }

    fun getMoonlight() : RecommendMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()
        val champ = listOf(
            champData.getDiana(), champData.getLissandra(), champData.getAphelios(), champData.getTeemo(), champData.getYuumi(),champData.getKindred(),champData.getShen(),champData.getAhri()
        )
        val syn = listOf(
            synData.getSpirit(),synData.getMoonlight(),synData.getHunter(),synData.getMystic(),synData.getNinja()
        )
        val item = listOf(
            itemData.blank(),itemData.ZzRot_Portal(),itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.ZzRot_Portal(),itemData.blank(), //2번째 챔피언
            itemData.Guardian_Angel(),itemData.Guinsoo_Rageblade(),itemData.Quicksilver(), //3번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
            itemData.blank(),itemData.Guardian_Angel(),itemData.blank() //8번째 챔피언
        )

        return RecommendMeta("달빛, 4영혼(아펠 사냥꾼 선받자)", champ, syn, item)
    }



}