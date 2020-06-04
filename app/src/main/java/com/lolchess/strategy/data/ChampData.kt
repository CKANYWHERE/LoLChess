package com.lolchess.strategy.data

import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.model.Synergy

class ChampData {
    //1코스트
    fun getGraves() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getSpacePirate(),SynergyData().getBlaster())
        val hp : List<Int> = listOf(650, 1170, 2106)
        val attack : List<Double> = listOf(55.0, 99.0, 178.2)

        return Champ("그레이브즈","이미지경로","연막탄","그레이브즈가 공격 속도가 가장 높은 적을 향해 연막탄을 발사합니다. 연막탄은 적중 시 폭발하며 범위 내 모든 적은 마법 피해를 입고 수 초 동안 실명됩니다."
        ,1,synergy,hp,attack,0.55,1,35,20)
    }

    fun getZoe() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getStarGuardian(),SynergyData().getSorcerer())
        val hp : List<Int> = listOf(500, 900, 1620)
        val attack : List<Double> = listOf(40.0, 72.0, 129.6)

        return Champ("조이","이미지경로","헤롱헤롱쿨쿨방울","조이가 체력이 가장 높은 적에게 방울을 날려 피해를 입히고 기절시킵니다."
            ,1,synergy,hp,attack,0.70,3,20,20)
    }

    fun getLeona() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getCybernetic(),SynergyData().getVanguard())
        val hp : List<Int> = listOf(600, 1080, 1944)
        val attack : List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("레오나","이미지경로","전자 방어막","레오나가 4초 동안 받는 모든 피해를 감소시키는 방어막을 생성합니다."
            ,1,synergy,hp,attack,0.55,1,40,20)
    }

    fun getFiora() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getCybernetic(),SynergyData().getBladmaster())
        val hp : List<Int> = listOf(450, 810, 1458)
        val attack : List<Double> = listOf(45.0, 81.0, 146.0)

        return Champ("피오라","이미지경로","응수","피오라가 1.5초 동안 방어 태세를 갖추며 피해나 적 스킬에 면역 상태가 됩니다. 방어 태세가 끝나면 공격을 응수하여 근처 적에게 마법 피해를 입히고 수 초 동안 기절시킵니다."
            ,1,synergy,hp,attack,1.0,1,30,20)
    }

    fun getMalphite() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getRebel(),SynergyData().getBrawler())
        val hp : List<Int> = listOf(700, 1260, 2268)
        val attack : List<Double> = listOf(70.0, 126.0, 227.0)

        return Champ("말파이트","이미지경로","에너지 방패","기본 지속 효과: 전투 시작 시 말파이트가 최대 체력에 비례하는 보호막을 얻습니다."
            ,1,synergy,hp,attack,0.5,1,20,20)
    }

    fun getZiggs() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getRebel(),SynergyData().getDemolitionist())
        val hp : List<Int> = listOf(500, 900, 1620)
        val attack : List<Double> = listOf(40.0, 72.0, 130.0)

        return Champ("직스","이미지경로","펑!","직스가 적에게 폭탄을 던져 마법 피해를 입힙니다."
            ,1,synergy,hp,attack,0.7,3,20,20)
    }

    fun getJarvanIV() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getDarkStar(), SynergyData().getProtector())
        val hp : List<Int> = listOf(650, 1170, 2106)
        val attack : List<Double> = listOf(50.0, 90.0,162.0)

        return Champ("자르반 4세","이미지경로","영겁의 깃발","자르반 4세가 근처에 깃발을 던져 6초 동안 주변 모든 아군의 공격 속도를 상승시킵니다."
            ,1,synergy,hp,attack,0.6,1,40,20)
    }

    fun getPoppy() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getStarGuardian(),SynergyData().getVanguard())
        val hp : List<Int> = listOf(650, 1170, 2106)
        val attack : List<Double> = listOf(50.0, 90.0,162.0)

        return Champ("뽀삐","이미지경로","방패 던지기","뽀삐가 가장 멀리 있는 적에게 방패를 던져 피해를 입힙니다. 적에게 적중한 방패는 돌아오며 뽀삐에게 보호막을 씌웁니다."
            ,1,synergy,hp,attack,0.55,1,40,20)
    }

    fun getXayah() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getCelestial(),SynergyData().getBladmaster())
        val hp : List<Int> = listOf(500, 900, 1620)
        val attack : List<Double> = listOf(50.0, 90.0,162.0)

        return Champ("자야","이미지경로","죽음의 깃","자야가 칼날 폭풍을 일으켜 8초 동안 공격 속도가 증가합니다."
            ,1,synergy,hp,attack,0.8,3,20,20)
    }

    fun getTwistedFate() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getChrono(),SynergyData().getSorcerer())
        val hp : List<Int> = listOf(550, 990, 1782)
        val attack : List<Double> = listOf(45.0, 81.0, 146.0)

        return Champ("트위스티드 페이트","이미지경로","와일드 카드","트위스티드 페이트가 카드 세 장을 원뿔 형태로 던집니다. 카드는 적을 통과하며 마법 피해를 입힙니다."
            ,1,synergy,hp,attack,0.7,3,20,20)
    }

    fun getCaitlyn() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getChrono(),SynergyData().getSniper())
        val hp : List<Int> = listOf(500, 900, 1620)
        val attack : List<Double> = listOf(45.0, 81.0, 146.0)

        return Champ("케이틀린","이미지경로","비장의 한 발","케이틀린이 가장 멀리 있는 적을 향해 강력한 총알을 발사합니다. 총알은 처음 적중한 적에게 마법 피해를 입힙니다."
            ,1,synergy,hp,attack,0.75,5,20,20)
    }

    fun getIllaoi() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getBattlecast(),SynergyData().getBrawler())
        val hp : List<Int> = listOf(650, 1170, 2106)
        val attack : List<Double> = listOf(45.0, 81.0, 146.0)

        return Champ("일라오이","이미지경로","촉수 강타","일라오이가 전방에 촉수를 내려쳐 피해를 입히고, 적중한 적으로부터 방어력과 마법 저항력을 4초간 훔칩니다."
            ,1,synergy,hp,attack,0.7,1,35,20)
    }

    fun getNocturne() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getBattlecast(),SynergyData().getInfiltrator())
        val hp : List<Int> = listOf(500, 900, 1620)
        val attack : List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("녹턴","이미지경로","말할 수 없는 공포","녹턴은 대상을 위협하여 공포로 2초간 기절시킵니다. 이 시간 동안 또는 녹턴이 죽을 때 까지 피해를 입힙니다."
            ,1,synergy,hp,attack,0.7,1,20,20)
    }

    //2코스트
    fun getKogMaw() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getBattlecast(),SynergyData().getBlaster())
        val hp : List<Int> = listOf(550, 990, 1782)
        val attack : List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("코그모","이미지경로","폭격","코그모는 3초 동안 무한한 사거리와 90%의 공격속도를 얻으며, 공격 시 적 최대 체력의 일정% 만큼 마법 피해를 입힙니다."
            ,2,synergy,hp,attack,0.7,1,20,20)
    }

    fun getYasuo() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getRebel(),SynergyData().getBladmaster())
        val hp : List<Int> = listOf(700, 1260, 2268)
        val attack : List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("야스오","이미지경로","최후의 숨결","야스오가 기본 공격 사거리 +2칸 내에 있는 적에게 순식간에 다가간 후 1초 동안 공중에 띄워 붙들어 두고 추가 공격을 해 기본 공격 시의 피해를 입힙니다. 이때 적중 시 효과가 적용됩니다."
            ,2,synergy,hp,attack,0.75,1,30,20)
    }

    fun getShen() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getChrono(),SynergyData().getBladmaster())
        val hp : List<Int> = listOf(800, 1440, 2592)
        val attack : List<Double> = listOf(60.0, 108.0, 194.0)

        return Champ("쉔","이미지경로","의지의 결계","쉔이 주변에 수 초 동안 지속되는 결계를 생성합니다. 결계 안의 아군은 모든 기본 공격을 회피합니다. 스킬이 활성화된 동안 쉔의 마법 저항력이 증가합니다."
            ,2,synergy,hp,attack,0.7,1,35,20)
    }

    fun getBlitzcrank() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getRebel(),SynergyData().getBladmaster())
        val hp : List<Int> = listOf(650, 1170, 2106)
        val attack : List<Double> = listOf(55.0, 99.0, 178.0)

        return Champ("블리츠크랭크","이미지경로","로켓 손","블리츠크랭크가 가장 멀리 있는 적을 당겨 마법 피해를 입히고 2.5초 동안 기절시킵니다. 당긴 후 다음 공격은 적을 1초 동안 공중으로 띄워 올립니다. 아군은 블리츠크랭크가 당긴 적이 사거리 안에 있을 경우 우선적으로 공격합니다."
            ,2,synergy,hp,attack,0.5,1,35,20)
    }

    fun getLucian() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getChrono(),SynergyData().getBlaster())
        val hp : List<Int> = listOf(500, 900, 1620)
        val attack : List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("루시안","이미지경로","끈질긴 추격","루시안이 현재 대상에서 먼 곳으로 돌진하며 기본 공격 후 이어서 추가로 공격해 마법 피해를 입힙니다."
            ,2,synergy,hp,attack,0.7,4,25,20)
    }

    fun getMordekaiser() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getDarkStar(),SynergyData().getVanguard())
        val hp : List<Int> = listOf(650, 1170, 2106)
        val attack : List<Double> = listOf(55.0, 99.0, 178.0)

        return Champ("모데카이저","이미지경로","불멸","모데카이저가 피해를 흡수하는 보호막을 얻습니다. 보호막이 유지되는 동안 모데카이저는 주변 모든 적에게 초당 마법 피해를 입힙니다."
            ,2,synergy,hp,attack,0.6,1,40,20)
    }

    fun getRakan() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getCelestial(),SynergyData().getProtector())
        val hp : List<Int> = listOf(600, 1080, 1944)
        val attack : List<Double> = listOf(45.0, 81.0, 146.0)

        return Champ("라칸","이미지경로","화려한 등장","라칸이 기본 공격 사거리 +1칸 내에 있는 적 중 가장 멀리 있는 적에게 돌진 후 공중으로 도약해 근처 모든 적을 띄워 올리고 마법 피해를 입힙니다."
            ,2,synergy,hp,attack,0.7,2,35,20)
    }


    fun getXinZhao() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getCelestial(),SynergyData().getProtector())
        val hp : List<Int> = listOf(650, 1170, 2106)
        val attack : List<Double> = listOf(60.0, 108.0, 194.0)

        return Champ("신 짜오","이미지경로","삼조격","신 짜오가 대상을 세 번 빠르게 타격해 기본 공격 시의 피해를 입히고 적중 시 효과를 적용합니다. 세 번째 공격은 추가 마법 피해를 입히고 대상을 1.5초 동안 공중에 띄워 올립니다."
            ,2,synergy,hp,attack,0.7,1,35,20)
    }
    fun getDarius() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getSpacePirate(),SynergyData().getMana_Reaver())
        val hp : List<Int> = listOf(750, 1350, 2430)
        val attack : List<Double> = listOf(60.0, 108.0, 194.0)

        return Champ("다리우스","이미지경로","행성 파괴자의 단두대","다리우스가 적을 내려찍으며 마법 피해를 입힙니다. 적을 처치하면 곧바로 스킬을 다시 사용합니다. 체력이 50%보다 낮은 대상은 두 배의 피해를 입습니다."
            ,2,synergy,hp,attack,0.65,1,35,20)
    }
    fun getAnnie() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getMechPilot(),SynergyData().getSorcerer())
        val hp : List<Int> = listOf(700, 1260, 2268)
        val attack : List<Double> = listOf(40.0, 72.0, 130.0)

        return Champ("애니","이미지경로","은하 방패-폭발","애니가 피해를 흡수하는 보호막을 얻고 원뿔 형태의 화염을 내뿜어 적중한 대상에게 마법 피해를 입힙니다."
            ,2,synergy,hp,attack,0.65,2,40,20)
    }
    fun getAhri() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getStarGuardian(),SynergyData().getSorcerer())
        val hp : List<Int> = listOf(600, 1080, 1944)
        val attack : List<Double> = listOf(45.0, 81.0, 146.0)

        return Champ("아리","이미지경로","현혹의 구슬","아리가 일직선으로 구슬을 던집니다. 구슬은 닿는 모든 적에게 마법 피해를 입힙니다. 구슬은 아리에게 되돌아오며 이때 닿는 모든 적에게 고정 피해를 입힙니다."
            ,2,synergy,hp,attack,0.75,3,20,20)
    }

    fun getNautilus() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getAstro(),SynergyData().getVanguard())
        val hp : List<Int> = listOf(750, 1350, 2430)
        val attack : List<Double> = listOf(60.0, 108.0, 194.0)

        return Champ("노틸러스","이미지경로","충격 분화구","노틸러스가 대상 아래의 땅을 폭발시켜 공중으로 띄워 기절시키고 마법 피해를 입힙니다. 대상에 인접한 적들도 공중에 띄워 절반의 시간 동안 기절시키고 절반의 마법 피해를 입힙니다."
            ,2,synergy,hp,attack,0.65,1,40,20)
    }
    fun getZed() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getRebel(),SynergyData().getInfiltrator())
        val hp : List<Int> = listOf(650, 1170, 2106)
        val attack : List<Double> = listOf(55.0, 99.0, 178.0)

        return Champ("제드","이미지경로","약자 멸시","기본 지속 효과: 세 번째 공격마다 제드가 추가 마법 피해를 입히고 대상의 현재 공격력을 훔칩니다."
            ,2,synergy,hp,attack,0.75,1,25,20)


    //3코스트
    }fun getAhri() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getStarGuardian(),SynergyData().getSorcerer())
        val hp : List<Int> = listOf(600, 1080, 1944)
        val attack : List<Double> = listOf(45.0, 81.0, 146.0)

        return Champ("","이미지경로","",""
            ,2,synergy,hp,attack,0.75,1,20,20)
    }fun getAhri() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getStarGuardian(),SynergyData().getSorcerer())
        val hp : List<Int> = listOf(600, 1080, 1944)
        val attack : List<Double> = listOf(45.0, 81.0, 146.0)

        return Champ("","이미지경로","",""
            ,2,synergy,hp,attack,0.75,1,20,20)
    }fun getAhri() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getStarGuardian(),SynergyData().getSorcerer())
        val hp : List<Int> = listOf(600, 1080, 1944)
        val attack : List<Double> = listOf(45.0, 81.0, 146.0)

        return Champ("","이미지경로","",""
            ,2,synergy,hp,attack,0.75,1,20,20)
    }




}