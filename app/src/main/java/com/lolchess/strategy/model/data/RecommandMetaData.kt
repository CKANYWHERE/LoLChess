package com.lolchess.strategy.model.data

import androidx.core.graphics.createBitmap
import com.lolchess.strategy.model.RecommandMeta


class RecommandMetaData {

    fun getAllMetaData() : MutableList<RecommandMeta>{
        return listOf(getChronoCyberEkko(), getChronoCyberLucian(), getSpacePirates(), getSpacePiratesMystic(), getAstroSniper(),getStarGuardianSorcerer_Jarvan(), getStarGuardianSorcerer_Rakan(), getMechDemolitionist(), getCybernetic_Vayne(),
                getCybernetic_Irellia(), getRerollXayah(), getRerollXayah_Cyber(), getRerollXayah_ManaReaver(), get4Vanguard4Mystic(),
                getDarkStar(),getDarkStar_Protector(), getMasterYi(), getMasterYi_BladeMasterZed(),getReroll_BattleCast(), getReroll_BattleCast_Chrono()).toMutableList()
    }


    fun getAstroSniper() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()
        val champ = listOf(
                champData.getCaitlyn(), champData.getNautilus(),champData.getJayce(),champData.getKarma(),champData.getGnar(),champData.getWukong(),champData.getJhin(),champData.getTeemo(), champData.getLulu()
        )
        val syn = listOf(
                synData.getAstro(),synData.getSniper(),synData.getChrono(),synData.getDarkStar(),synData.getCelestial(), synData.getMystic(), synData.getVanguard()
        )
           val item = listOf(
            itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
            itemData.Ionic_Spark(),itemData.Bramble_Vest(),itemData.blank(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.Guardian_Angel(),itemData.Last_Whisper(),itemData.Infinity_Edge(), //7번째 챔피언
            itemData.Blue_Buff(), itemData.Morellonomicon(), itemData.Rabadon_Deathcap(), //8번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //9번째 챔피언
        )

        return RecommandMeta("우주 4저격", champ, syn, item)
    }

    fun getStarGuardianSorcerer_Jarvan() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
                champData.getJarvanIV(), champData.getZoe(),champData.getAhri(),champData.getNeeko(),champData.getSyndra(),champData.getSoraka(),champData.getLulu(),champData.getJanna(), champData.getXerath()
        )
        val syn = listOf(
                synData.getParagon(),synData.getStarGuardian(),synData.getSorcerer(),synData.getDarkStar(),synData.getProtector(), synData.getMystic()
        )

           val item = listOf(
            itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.Guardian_Angel(),itemData.Warmog_Armor(),itemData.Quicksilver(), //4번째 챔피언
            itemData.Rabadon_Deathcap(),itemData.Jeweled_Gauntlet(),itemData.Blue_Buff(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
            itemData.Spear_of_Shojin(), itemData.Blue_Buff(), itemData.blank(), //8번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //9번째 챔피언
        )


        return RecommandMeta("별 수호자 마법사(2암별)", champ, syn, item)
    }


    fun getStarGuardianSorcerer_Rakan() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
                champData.getZoe(),champData.getRakan(),champData.getAhri(),champData.getNeeko(),champData.getSyndra(),champData.getSoraka(),champData.getLulu(),champData.getJanna(), champData.getXerath()
        )
        val syn = listOf(
                synData.getParagon(),synData.getStarGuardian(),synData.getSorcerer(),synData.getProtector(),synData.getCelestial(), synData.getMystic()
        )
        val item = listOf(
            itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.Guardian_Angel(),itemData.Warmog_Armor(),itemData.Quicksilver(), //4번째 챔피언
            itemData.Rabadon_Deathcap(),itemData.Jeweled_Gauntlet(),itemData.Blue_Buff(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
            itemData.Spear_of_Shojin(), itemData.Blue_Buff(), itemData.blank(), //8번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //9번째 챔피언
        )

        return RecommandMeta("별 수호자 마법사(2천상)", champ, syn, item)
    }

    fun get4Vanguard4Mystic() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
                champData.getNautilus(),champData.getMordekaiser(),champData.getJayce(),champData.getKarma(),champData.getCassiopeia(),champData.getSoraka(),champData.getWukong(),champData.getLulu(), champData.getThresh()
        )
        val syn = listOf(
                synData.getMystic(),synData.getVanguard(),synData.getChrono(),synData.getDarkStar()
        )
        val item = listOf(
            itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.Guardian_Angel(),itemData.Hextech_Gunblade(),itemData.Ionic_Spark(), //3번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
            itemData.Morellonomicon(),itemData.Rapid_Firecannon(),itemData.Blue_Buff(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //8번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //9번째 챔피언
        )

        return RecommandMeta("4선봉 4신비", champ, syn, item)
    }

    fun getRerollXayah() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
                champData.getJarvanIV(), champData.getXayah(), champData.getFiora(),champData.getRakan(),champData.getShen(),champData.getMasterYi(),champData.getRiven(),champData.getIrelia()
        )
        val syn = listOf(
                synData.getBlademaster(),synData.getChrono(),synData.getProtector(), synData.getCelestial()
        )
        val item = listOf(
            itemData.Ionic_Spark(), itemData.Locket_of_the_Iron_Solari(), itemData.Warmog_Armor(), //1번째 챔피언
            itemData.Infinity_Edge(),itemData.Giant_Slayer(),itemData.Last_Whisper(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(),  //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
            itemData.Infinity_Edge(), itemData.Hand_of_Justice(), itemData.blank() //8번째 챔피언

        )

        return RecommandMeta("리롤 자야(8렙 천상)", champ, syn, item)
    }

    fun getRerollXayah_Cyber() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
                champData.getJarvanIV(), champData.getXayah(), champData.getFiora(),champData.getShen(),champData.getMasterYi(),champData.getRiven(),champData.getIrelia(), champData.getEkko()
        )
        val syn = listOf(
                synData.getBlademaster(),synData.getChrono(),synData.getCybernetic(), synData.getCelestial()
        )
        val item = listOf(
            itemData.Ionic_Spark(), itemData.Locket_of_the_Iron_Solari(), itemData.Warmog_Armor(), //1번째 챔피언
            itemData.Infinity_Edge(),itemData.Giant_Slayer(),itemData.Last_Whisper(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(),  //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.Infinity_Edge(), itemData.Hand_of_Justice(), itemData.blank(), //8번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //7번째 챔피언

        )

        return RecommandMeta("리롤 자야(8렙 사이버)", champ, syn, item)
    }

    fun getRerollXayah_ManaReaver() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
                champData.getJarvanIV(), champData.getXayah(), champData.getFiora(),champData.getShen(),champData.getMasterYi(),champData.getRiven(),champData.getIrelia(), champData.getThresh()
        )
        val syn = listOf(
                synData.getBlademaster(),synData.getManaReaver(), synData.getChrono(), synData.getCelestial()
        )

        val item = listOf(
            itemData.Ionic_Spark(), itemData.Locket_of_the_Iron_Solari(), itemData.Warmog_Armor(), //1번째 챔피언
            itemData.Infinity_Edge(),itemData.Giant_Slayer(),itemData.Last_Whisper(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(),  //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.Infinity_Edge(), itemData.Hand_of_Justice(), itemData.blank(), //8번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //7번째 챔피언

        )

        return RecommandMeta("리롤 자야(8렙 마나 약탈자)", champ, syn, item)
    }

    fun getMasterYi() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
                champData.getFiora(), champData.getZed(), champData.getYasuo(),champData.getShen(),champData.getMasterYi(),champData.getRiven(),champData.getIrelia(), champData.getEkko()
        )
        val syn = listOf(
                synData.getBlademaster(),synData.getChrono(), synData.getRebel()
        )
        val item = listOf(
            itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
            itemData.Rapid_Firecannon(),itemData.Runaan_Hurricane(),itemData.Jeweled_Gauntlet(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.Guardian_Angel(),itemData.Bloodthirster(),itemData.Infinity_Edge(), //7번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //8번째 챔피언

        )

        return RecommandMeta("6검사 마이(8렙 조합)", champ, syn, item)
    }


    fun getMasterYi_BladeMasterZed() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
                champData.getZed(), champData.getYasuo(),champData.getShen(),champData.getMasterYi(),champData.getRiven(),champData.getIrelia(), champData.getFizz(), champData.getThresh()
        )
        val syn = listOf(
                synData.getBlademaster(),synData.getChrono(), synData.getInfiltrator(), synData.getRebel()
        )
        val item = listOf(
            itemData.Guardian_Angel(), itemData.Blade_of_the_Ruined_King(), itemData.Rapid_Firecannon(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
            itemData.Rapid_Firecannon(),itemData.Runaan_Hurricane(),itemData.Jeweled_Gauntlet(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //8번째 챔피언

        )

        return RecommandMeta("6검사 마이(제드 검사, 8렙)", champ, syn, item)
    }

    fun getReroll_BattleCast() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
                champData.getGraves(), champData.getNocturne(), champData.getIllaoi(),champData.getKogMaw(),champData.getCassiopeia(),champData.getGnar(),champData.getViktor(), champData.getUrgot()
        )
        val syn = listOf(
                synData.getBattlecast(),synData.getBlaster(), synData.getBrawler()
        )
              val item = listOf(
            itemData.Battlecast_Plating(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.Ionic_Spark(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.Red_Buff(),itemData.Runaan_Hurricane(),itemData.Statikk_Shiv(), //4번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //8번째 챔피언
        )

        return RecommandMeta("리롤 전투기계(3성 그브, 나르 or 3성 말파)", champ, syn, item)
    }

    fun getReroll_BattleCast_Chrono() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
                champData.getNocturne(), champData.getIllaoi(),champData.getBlitzcrank() ,champData.getKogMaw() ,champData.getEzreal(),champData.getCassiopeia(),champData.getViktor(), champData.getUrgot()
        )
        val syn = listOf(
                synData.getBattlecast(),synData.getBlaster(),synData.getChrono(), synData.getBrawler()
        )
              val item = listOf(
            itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.Ionic_Spark(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.Red_Buff(),itemData.Runaan_Hurricane(),itemData.Statikk_Shiv(), //4번째 챔피언
            itemData.Battlecast_Plating(),itemData.blank(),itemData.blank(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //8번째 챔피언

        )

        return RecommandMeta("전투기계(이즈, 블리츠)", champ, syn, item)
    }

    fun getCybernetic_Vayne() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
                champData.getLeona(), champData.getCaitlyn(), champData.getFiora(),champData.getVayne(),champData.getVi(),champData.getWukong(),champData.getIrelia(), champData.getEkko(), champData.getThresh()
        )
        val syn = listOf(
                synData.getCybernetic(),synData.getManaReaver(),synData.getChrono(), synData.getSniper(), synData.getVanguard()
        )
              val item = listOf(
            itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.Infinity_Edge(),itemData.Giant_Slayer(),itemData.Last_Whisper(), //4번째 챔피언
            itemData.Ionic_Spark(),itemData.Bramble_Vest(),itemData.blank(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.Guardian_Angel(),itemData.Infinity_Edge(),itemData.blank(), //7번째 챔피언
            itemData.Red_Buff(), itemData.Blue_Buff(), itemData.blank(), //8번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //9번째 챔피언
        )

        return RecommandMeta("사이버네틱(베인 캐리)", champ, syn, item)
    }

    fun getCybernetic_Irellia() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
                champData.getLeona(), champData.getFiora(),champData.getVayne(),champData.getVi(),champData.getRiven(),champData.getWukong(),champData.getIrelia(), champData.getEkko(), champData.getThresh()
        )
        val syn = listOf(
                synData.getCybernetic(),synData.getManaReaver(),synData.getChrono(), synData.getInfiltrator(), synData.getBlademaster(), synData.getVanguard()
        )
        val item = listOf(
            itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.Giant_Slayer(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.Infiltrator_Talons(),itemData.Infinity_Edge(),itemData.Last_Whisper(), //7번째 챔피언
            itemData.Morellonomicon(), itemData.Blue_Buff(), itemData.blank(), //8번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //9번째 챔피언
        )

        return RecommandMeta("사이버네틱(이렐 캐리)", champ, syn, item)
    }

    fun getDarkStar_Protector() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
                champData.getJarvanIV(), champData.getRakan(),champData.getXinZhao(),champData.getShaco(),champData.getAshe(),champData.getKarma(),champData.getJhin(), champData.getFizz(), champData.getLulu()
        )
        val syn = listOf(
                synData.getProtector(),synData.getCelestial(),synData.getDarkStar(), synData.getInfiltrator(), synData.getMystic(), synData.getSniper()
        )
              val item = listOf(
            itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.Guardian_Angel(),itemData.Bloodthirster(),itemData.Rapid_Firecannon(), //4번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.Guardian_Angel(),itemData.Last_Whisper(),itemData.Infinity_Edge(), //7번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //8번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //9번째 챔피언
        )

        return RecommandMeta("4천상 4암흑의 별", champ, syn, item)
    }

    fun getDarkStar() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
                champData.getJarvanIV(), champData.getMordekaiser(),champData.getShaco(),champData.getAshe(),champData.getKarma(),champData.getJhin(), champData.getFizz(), champData.getLulu(), champData.getXerath()
        )
        val syn = listOf(
                synData.getDarkStar(),synData.getInfiltrator(),synData.getCelestial(), synData.getMystic(), synData.getSniper()
        )
              val item = listOf(
            itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.Guardian_Angel(),itemData.Bloodthirster(),itemData.Rapid_Firecannon(), //3번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(),//5번째 챔피언
            itemData.Guardian_Angel(),itemData.Last_Whisper(),itemData.Infinity_Edge(), //6번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(),  //7번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(),  //8번째 챔피언
            itemData.Guinsoo_Rageblade(),itemData.blank(),itemData.blank() //9번째 챔피언
        )

        return RecommandMeta("6암흑의 별", champ, syn, item)
    }

    fun getMechDemolitionist() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
            champData.getAnnie(), champData.getRumble(),champData.getShaco(),champData.getKarma(),champData.getCassiopeia(),champData.getFizz(), champData.getViktor(), champData.getGangplank()
        )
        val syn = listOf(
            synData.getMechPilot(),synData.getDemolitionist(),synData.getMercenary(), synData.getMystic(), synData.getSorcerer(), synData.getInfiltrator(), synData.getDarkStar()
        )
              val item = listOf(
            itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.Giant_Slayer(),itemData.Ionic_Spark(),itemData.Quicksilver(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.Morellonomicon(),itemData.Spear_of_Shojin(),itemData.Blue_Buff(), //7번째 챔피언
            itemData.Guardian_Angel(), itemData.Ionic_Spark(), itemData.Rabadon_Deathcap() //8번째 챔피언
        )

        return RecommandMeta("메카 폭파광", champ, syn, item)
    }

    fun getSpacePirates() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
            champData.getGraves(), champData.getZiggs(),champData.getDarius(),champData.getJayce(),champData.getWukong(),champData.getJinx(), champData.getGangplank(), champData.getThresh(), champData.getAurelionSol()
        )
        val syn = listOf(
            synData.getDemolitionist(),synData.getManaReaver(),synData.getMercenary(), synData.getSpacePirate(), synData.getStarship(), synData.getBlaster(), synData.getChrono(), synData.getRebel(), synData.getVanguard()
        )
        val item = listOf(
            itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.Ionic_Spark(),itemData.Chalice_of_Power(),itemData.blank(), //4번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //5번째 챔피언
            itemData.Rapid_Firecannon(),itemData.Red_Buff(),itemData.Giant_Slayer(), //6번째 챔피언
            itemData.Guardian_Angel(),itemData.Rabadon_Deathcap(),itemData.Jeweled_Gauntlet(), //7번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //8번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //9번째 챔피언
        )

        return RecommandMeta("4우주해적 3반군", champ, syn, item)
    }

    fun getSpacePiratesMystic() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
            champData.getGraves(),champData.getDarius(), champData.getRumble(),champData.getJayce(),champData.getSoraka(), champData.getWukong(),champData.getGangplank(), champData.getLulu(), champData.getThresh()
        )
        val syn = listOf(
            synData.getDemolitionist(),synData.getManaReaver(),synData.getMercenary(), synData.getSpacePirate(), synData.getChrono(), synData.getMystic(), synData.getVanguard()
        )
        val item = listOf(
            itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.Ionic_Spark(),itemData.Chalice_of_Power(),itemData.blank(), //4번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //5번째 챔피언
            itemData.Frozen_Heart(),itemData.ZzRot_Portal(),itemData.blank(), //6번째 챔피언
            itemData.Guardian_Angel(),itemData.Rabadon_Deathcap(),itemData.Jeweled_Gauntlet(), //7번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //8번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //9번째 챔피언
        )

        return RecommandMeta("4우주해적 신비", champ, syn, item)
    }

    fun getChronoCyberEkko() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
            champData.getBlitzcrank(),champData.getShen(), champData.getVi(),champData.getEzreal(),champData.getRiven(), champData.getWukong(),champData.getIrelia(), champData.getThresh(), champData.getEkko()
        )
        val syn = listOf(
            synData.getChrono(),synData.getManaReaver(),synData.getCybernetic(), synData.getBlademaster(), synData.getBrawler()
        )
        val item = listOf(
            itemData.blank(), itemData.blank(), itemData.blank(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.Ionic_Spark(),itemData.Zephar(),itemData.blank(), //3번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //4번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.Guardian_Angel(),itemData.Infinity_Edge(),itemData.Last_Whisper(), //7번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //8번째 챔피언
            itemData.Rabadon_Deathcap(),itemData.Red_Buff(),itemData.Statikk_Shiv() //9번째 챔피언
        )

        return RecommandMeta("4우주해적 신비", champ, syn, item)
    }

    fun getChronoCyberLucian() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val itemData = Combined_Data()

        val champ = listOf(
            champData.getLucian() ,champData.getBlitzcrank(),champData.getShen(), champData.getEzreal(),champData.getRiven(), champData.getWukong(),champData.getIrelia(), champData.getThresh(), champData.getEkko()
        )
        val syn = listOf(
            synData.getChrono(),synData.getManaReaver(),synData.getBlaster(), synData.getCybernetic(), synData.getBlademaster(), synData.getBrawler()
        )
        val item = listOf(
            itemData.Red_Buff(), itemData.Giant_Slayer(), itemData.Last_Whisper(), //1번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //2번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //3번째 챔피언
            itemData.Frozen_Heart(),itemData.Ionic_Spark(),itemData.blank(), //4번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //5번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //6번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank(), //7번째 챔피언
            itemData.Guardian_Angel(),itemData.Infinity_Edge(),itemData.Hand_of_Justice(), //8번째 챔피언
            itemData.blank(),itemData.blank(),itemData.blank() //9번째 챔피언
        )

        return RecommandMeta("4우주해적 신비", champ, syn, item)
    }
}