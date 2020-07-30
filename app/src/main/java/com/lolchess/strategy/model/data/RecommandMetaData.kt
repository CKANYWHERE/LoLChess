package com.lolchess.strategy.model.data

import com.lolchess.strategy.model.RecommandMeta


class RecommandMetaData {

    fun getAllMetaData() : MutableList<RecommandMeta>{
        return listOf(getAstroSniper(),getStarGuardianSorcerer_Jarvan(), getStarGuardianSorcerer_Rakan(), getMechDemolitionist(), getCybernetic_Vayne(),
                getCybernetic_Irellia(), getRerollXayah(), getRerollXayah_Cyber(), getRerollXayah_ManaReaver(), get4Vanguard4Mystic(), get6Vanguard(),
                getDarkStar(),getDarkStar_Protector(), getMasterYi(), getMasterYi_BladeMasterZed(),getReroll_BattleCast(), getReroll_BattleCast_Chrono()).toMutableList()
    }


    fun getAstroSniper() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getCaitlyn(), champData.getNautilus(),champData.getJayce(),champData.getKarma(),champData.getGnar(),champData.getWukong(),champData.getJhin(),champData.getTeemo(), champData.getLulu()
        )
        val syn = listOf(
                synData.getAstro(),synData.getSniper(),synData.getChrono(),synData.getDarkStar(),synData.getCelestial(), synData.getMystic(), synData.getVanguard()
        )

        return RecommandMeta("우주 4저격", champ, syn)
    }

    fun getStarGuardianSorcerer_Jarvan() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getJarvanIV(), champData.getZoe(),champData.getAhri(),champData.getNeeko(),champData.getSyndra(),champData.getSoraka(),champData.getLulu(),champData.getJanna(), champData.getXerath()
        )
        val syn = listOf(
                synData.getParagon(),synData.getStarGuardian(),synData.getSorcerer(),synData.getDarkStar(),synData.getProtector(), synData.getMystic()
        )

        return RecommandMeta("별 수호자 마법사(2암별)", champ, syn)
    }


    fun getStarGuardianSorcerer_Rakan() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getZoe(),champData.getRakan(),champData.getAhri(),champData.getNeeko(),champData.getSyndra(),champData.getSoraka(),champData.getLulu(),champData.getJanna(), champData.getXerath()
        )
        val syn = listOf(
                synData.getParagon(),synData.getStarGuardian(),synData.getSorcerer(),synData.getProtector(),synData.getCelestial(), synData.getMystic()
        )

        return RecommandMeta("별 수호자 마법사(2천상)", champ, syn)
    }

    fun get4Vanguard4Mystic() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getNautilus(),champData.getMordekaiser(),champData.getJayce(),champData.getKarma(),champData.getCassiopeia(),champData.getSoraka(),champData.getWukong(),champData.getLulu(), champData.getThresh()
        )
        val syn = listOf(
                synData.getMystic(),synData.getVanguard(),synData.getChrono(),synData.getDarkStar()
        )

        return RecommandMeta("4선봉 4신비", champ, syn)
    }


    fun get6Vanguard() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getLeona(), champData.getPoppy(), champData.getNautilus(),champData.getMordekaiser(),champData.getJayce(),champData.getCassiopeia(),champData.getSoraka(),champData.getWukong(), champData.getThresh()
        )
        val syn = listOf(
                synData.getVanguard(),synData.getChrono(),synData.getMystic()
        )

        return RecommandMeta("6선봉", champ, syn)
    }

    fun getRerollXayah() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getJarvanIV(), champData.getXayah(), champData.getFiora(),champData.getRakan(),champData.getShen(),champData.getMasterYi(),champData.getRiven(),champData.getIrelia()
        )
        val syn = listOf(
                synData.getBlademaster(),synData.getChrono(),synData.getProtector(), synData.getCelestial()
        )

        return RecommandMeta("리롤 자야(8렙 천상)", champ, syn)
    }

    fun getRerollXayah_Cyber() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getJarvanIV(), champData.getXayah(), champData.getFiora(),champData.getShen(),champData.getMasterYi(),champData.getRiven(),champData.getIrelia(), champData.getEkko()
        )
        val syn = listOf(
                synData.getBlademaster(),synData.getChrono(),synData.getCybernetic(), synData.getCelestial()
        )

        return RecommandMeta("리롤 자야(8렙 사이버)", champ, syn)
    }

    fun getRerollXayah_ManaReaver() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getJarvanIV(), champData.getXayah(), champData.getFiora(),champData.getShen(),champData.getMasterYi(),champData.getRiven(),champData.getIrelia(), champData.getThresh()
        )
        val syn = listOf(
                synData.getBlademaster(),synData.getManaReaver(), synData.getChrono(), synData.getCelestial()
        )

        return RecommandMeta("리롤 자야(8렙 마나 약탈자)", champ, syn)
    }

    fun getMasterYi() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getFiora(), champData.getZed(), champData.getYasuo(),champData.getShen(),champData.getMasterYi(),champData.getRiven(),champData.getIrelia()
        )
        val syn = listOf(
                synData.getBlademaster(),synData.getChrono(), synData.getRebel()
        )

        return RecommandMeta("6검사 마이(7렙 조합)", champ, syn)
    }


    fun getMasterYi_BladeMasterZed() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getFiora(), champData.getZed(), champData.getYasuo(),champData.getShen(),champData.getMasterYi(),champData.getRiven(),champData.getFizz()
        )
        val syn = listOf(
                synData.getBlademaster(),synData.getChrono(), synData.getInfiltrator(), synData.getRebel()
        )

        return RecommandMeta("6검사 마이(제드 검사)", champ, syn)
    }

    fun getReroll_BattleCast() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getGraves(), champData.getNocturne(), champData.getIllaoi(),champData.getKogMaw(),champData.getCassiopeia(),champData.getGnar(),champData.getViktor(), champData.getUrgot()
        )
        val syn = listOf(
                synData.getBattlecast(),synData.getBlaster(), synData.getBrawler()
        )

        return RecommandMeta("리롤 전투기계(3성 그브, 나르 or 3성 말파)", champ, syn)
    }

    fun getReroll_BattleCast_Chrono() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getNocturne(), champData.getIllaoi(),champData.getBlitzcrank() ,champData.getKogMaw() ,champData.getEzreal(),champData.getCassiopeia(),champData.getGnar(),champData.getViktor(), champData.getUrgot()
        )
        val syn = listOf(
                synData.getBattlecast(),synData.getBlaster(),synData.getChrono(), synData.getBrawler()
        )

        return RecommandMeta("전투기계(이즈, 블리츠)", champ, syn)
    }

    fun getCybernetic_Vayne() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getLeona(), champData.getCaitlyn(), champData.getFiora(),champData.getVayne(),champData.getVi(),champData.getWukong(),champData.getIrelia(), champData.getEkko(), champData.getThresh()
        )
        val syn = listOf(
                synData.getCybernetic(),synData.getManaReaver(),synData.getChrono(), synData.getSniper(), synData.getVanguard()
        )

        return RecommandMeta("사이버네틱(베인 캐리)", champ, syn)
    }

    fun getCybernetic_Irellia() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getLeona(), champData.getFiora(),champData.getVayne(),champData.getVi(),champData.getRiven(),champData.getWukong(),champData.getIrelia(), champData.getEkko(), champData.getThresh()
        )
        val syn = listOf(
                synData.getCybernetic(),synData.getManaReaver(),synData.getChrono(), synData.getBlademaster(), synData.getVanguard()
        )

        return RecommandMeta("사이버네틱(이렐 캐리)", champ, syn)
    }

    fun getDarkStar_Protector() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getJarvanIV(), champData.getRakan(),champData.getXinZhao(),champData.getShaco(),champData.getAshe(),champData.getKarma(),champData.getJhin(), champData.getFizz(), champData.getLulu()
        )
        val syn = listOf(
                synData.getProtector(),synData.getCelestial(),synData.getDarkStar(), synData.getInfiltrator(), synData.getMystic(), synData.getSniper()
        )

        return RecommandMeta("암흑의 별(수호자 샤코)", champ, syn)
    }

    fun getDarkStar() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getJarvanIV(), champData.getMordekaiser(),champData.getShaco(),champData.getAshe(),champData.getKarma(),champData.getJhin(), champData.getFizz(), champData.getLulu(), champData.getXerath()
        )
        val syn = listOf(
                synData.getDarkStar(),synData.getInfiltrator(),synData.getCelestial(), synData.getMystic(), synData.getSniper()
        )

        return RecommandMeta("6암흑의 별", champ, syn)
    }

    fun getMechDemolitionist() : RecommandMeta {
        val champData = ChampData()
        val synData = SynergyData()
        val champ = listOf(
                champData.getAnnie(), champData.getRumble(),champData.getShaco(), champData.getCassiopeia(),champData.getViktor(),champData.getSoraka(),champData.getFizz(), champData.getGangplank()
        )
        val syn = listOf(
                synData.getProtector(),synData.getCelestial(),synData.getDarkStar(), synData.getInfiltrator(), synData.getMystic(), synData.getSniper()
        )

        return RecommandMeta("메카 폭파광", champ, syn)
    }


}