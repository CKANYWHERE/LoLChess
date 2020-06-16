package com.lolchess.strategy.model.data

import com.lolchess.strategy.R
import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.model.Synergy

//3.5버전은 본섭으로 넘어오면서 스탯이 바뀔수 있음.
//3.5버전에서 진의 공속은 1성~3성 (0.85, 0.95, 1.25)로 바뀜. 따로 적용시켜야함.

class ChampData {
    //1코스트
    fun getGraves(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getSpacePirate(), SynergyData().getBlaster())
        val hp: List<Int> = listOf(650, 1170, 2106)
        val attack: List<Double> = listOf(55.0, 99.0, 178.2)

        return Champ("그레이브즈", R.drawable.graves,"연막탄"," 마나: 50/80", "그레이브즈가 공격 속도가 가장 높은 적을 향해 연막탄을 발사합니다. 연막탄은 적중 시 폭발하며 범위 내 모든 적은 마법 피해를 입고 수 초 동안 실명됩니다."

                , "실명 지속시간 : 3 / 4 / 5 초\n" + "피해량 : 150 / 200 / 400", 1, synergy, hp, attack, 0.55, 1, 40, 30, R.drawable.graves_skill,synergy.size)
    }

    fun getZoe(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getStarGuardian(), SynergyData().getSorcerer())
        val hp: List<Int> = listOf(500, 900, 1620)
        val attack: List<Double> = listOf(40.0, 72.0, 129.6)

        return Champ("조이", R.drawable.zoe,"헤롱헤롱쿨쿨방울", "마나: 70/100", "조이가 체력이 가장 높은 적에게 방울을 날려 피해를 입히고 기절시킵니다."
                , "피해량 : 200 / 275 / 400\n" + "기절 지속시간 : 2 / 2.5 / 4", 1, synergy, hp, attack,0.70, 3, 20, 20, R.drawable.zoe_skill,synergy.size)
    }

    fun getLeona(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getCybernetic(), SynergyData().getVanguard())
        val hp: List<Int> = listOf(600, 1080, 1944)
        val attack: List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("레오나", R.drawable.leona,"전자 방어막","마나: 50/100",  "레오나가 4초 동안 받는 모든 피해를 감소시키는 방어막을 생성합니다."

                , "피해량 감소 : 40 / 80 / 200", 1, synergy, hp, attack, 0.55, 1, 45, 30, R.drawable.leona_skill,synergy.size)
    }

    fun getFiora(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getCybernetic(), SynergyData().getBladmaster())
        val hp: List<Int> = listOf(450, 810, 1458)
        val attack: List<Double> = listOf(45.0, 81.0, 145.8)

        return Champ("피오라", R.drawable.fiora, "응수", "마나: 0/85","피오라가 1.5초 동안 방어 태세를 갖추며 피해나 적 스킬에 면역 상태가 됩니다. 방어 태세가 끝나면 공격을 응수하여 근처 적에게 마법 피해를 입히고 수 초 동안 기절시킵니다."
                , "기절 지속시간 : 1.5 / 1.5 / 3 초\n" + "피해량 : 200 / 300 / 450", 1, synergy, hp, attack, 1.0, 1, 30, 20, R.drawable.fiora_skill,synergy.size)
    }

    fun getMalphite(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getRebel(), SynergyData().getBrawler())
        val hp: List<Int> = listOf(700, 1260, 2268)
        val attack: List<Double> = listOf(70.0, 126.0, 226.8)

        return Champ("말파이트", R.drawable.malphite, "에너지 방패","마나: 없음", "기본 지속 효과: 전투 시작 시 말파이트가 최대 체력에 비례하는 보호막을 얻습니다."
                , "최대 체력 % : 40% / 45% / 60%", 1, synergy, hp, attack, 0.5, 1, 35, 30, R.drawable.malphite_skill,synergy.size)

    }

    fun getZiggs(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getRebel(), SynergyData().getDemolitionist())
        val hp: List<Int> = listOf(500, 900, 1620)
        val attack: List<Double> = listOf(40.0, 72.0, 129.6)

        return Champ("직스", R.drawable.ziggs, "펑!","마나: 0/40", "직스가 적에게 폭탄을 던져 마법 피해를 입힙니다."
                , "피해량 : 300 / 400 / 550", 1, synergy, hp, attack, 0.7, 3, 20, 20, R.drawable.ziggs_skill,synergy.size)
    }

    fun getJarvanIV(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getDarkStar(), SynergyData().getProtector())
        val hp: List<Int> = listOf(650, 1170, 2106)
        val attack: List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("자르반 4세", R.drawable.jarvanix, "영겁의 깃발", "마나: 50/100","자르반 4세가 근처에 깃발을 던져 6초 동안 주변 모든 아군의 공격 속도를 상승시킵니다."
            , "추가 공격 속도 : 50% / 75% / 100%", 1, synergy, hp, attack, 0.6, 1, 45, 30, R.drawable.jarvanix_skill,synergy.size)

    }

    fun getPoppy(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getStarGuardian(), SynergyData().getVanguard())
        val hp: List<Int> = listOf(650, 1170, 2106)
        val attack: List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("뽀삐", R.drawable.poppy,"방패 던지기", "마나: 60/100", "뽀삐가 가장 멀리 있는 적에게 방패를 던져 피해를 입힙니다. 적에게 적중한 방패는 돌아오며 뽀삐에게 보호막을 씌웁니다."
                , "피해량 : 100 / 150 / 200\n" + "보호막 흡수량 : 200 / 300 / 400", 1, synergy, hp, attack, 0.55, 1, 45, 30, R.drawable.poppy_skill,synergy.size)

    }

    fun getXayah(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getCelestial(), SynergyData().getBladmaster())
        val hp: List<Int> = listOf(500, 900, 1620)
        val attack: List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("자야", R.drawable.xayah, "죽음의 깃", "마나: 0/50","자야가 칼날 폭풍을 일으켜 8초 동안 공격 속도가 증가합니다."
                , "공격 속도 : 100% / 125% / 150%\n" + "지속 시간 : 8 / 8 / 8", 1, synergy, hp, attack, 0.8, 3, 20, 20, R.drawable.xayah_skill,synergy.size)
    }

    fun getTwistedFate(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getChrono(), SynergyData().getSorcerer())
        val hp: List<Int> = listOf(550, 990, 1782)
        val attack: List<Double> = listOf(40.0, 72.0, 129.6)

        return Champ("트위스티드 페이트", R.drawable.twistedfate, "와일드 카드", "마나: 0/75","트위스티드 페이트가 카드 세 장을 원뿔 형태로 던집니다. 카드는 적을 통과하며 마법 피해를 입힙니다."
                , "피해량 : 200 / 300 / 450", 1, synergy, hp, attack, 0.7, 3, 20, 20, R.drawable.twistedfate_skill,synergy.size)
    }

    fun getCaitlyn(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getChrono(), SynergyData().getSniper())
        val hp: List<Int> = listOf(500, 900, 1620)
        val attack: List<Double> = listOf(45.0, 81.0, 145.8)

        return Champ("케이틀린", R.drawable.caitlyn, "비장의 한 발", "마나: 0/125","케이틀린이 가장 멀리 있는 적을 향해 강력한 총알을 발사합니다. 총알은 처음 적중한 적에게 마법 피해를 입힙니다."
                , "피해량 : 750 / 1500 / 3000", 1, synergy, hp, attack, 0.75, 5, 20, 20, R.drawable.caitlyn_skill,synergy.size)
    }

    fun getIllaoi(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getBattlecast(), SynergyData().getBrawler())
        val hp: List<Int> = listOf(650, 1170, 2106)
        val attack: List<Double> = listOf(45.0, 81.0, 145.8)

        return Champ("일라오이", R.drawable.illaoi, "촉수 강타", "마나: 40/80","일라오이가 전방에 촉수를 내려쳐 피해를 입히고, 적중한 적으로부터 방어력과 마법 저항력을 4초간 훔칩니다."
                , "피해량 : 125 / 200 / 325\n" + "훔치는 방어력 및 마법 저항력 : 20 / 30 / 50%", 1, synergy, hp, attack, 0.7, 1, 40, 30, R.drawable.illaoi_skill,synergy.size)

    }

    fun getNocturne(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getBattlecast(), SynergyData().getInfiltrator())
        val hp: List<Int> = listOf(500, 900, 1620)
        val attack: List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("녹턴", R.drawable.nocturne, "말할 수 없는 공포","마나: 50/80",  "녹턴은 대상을 위협하여 공포로 2초간 기절시킵니다. 이 시간 동안 또는 녹턴이 죽을 때 까지 피해를 입힙니다."
                , "피해량 : 200 / 250 / 350\n" + "기절 시간 : 2 / 2.5 / 4초", 1, synergy, hp, attack, 0.7, 1, 20, 20, R.drawable.nocturne_skill,synergy.size)

    }

    //2코스트
    fun getKogMaw(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getBattlecast(), SynergyData().getBlaster())
        val hp: List<Int> = listOf(550, 990, 1782)
        val attack: List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("코그모", R.drawable.kogmaw, "폭격","마나: 0/30", "코그모는 3초 동안 무한한 사거리와 80%의 공격속도를 얻으며, 공격 시 적 최대 체력의 일정% 만큼 마법 피해를 입힙니다."
                , "피해량 : 2 / 4 / 7%", 2, synergy, hp, attack, 0.7, 1, 20, 20, R.drawable.kogmaw_skill,synergy.size)

    }

    fun getYasuo(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getRebel(), SynergyData().getBladmaster())
        val hp: List<Int> = listOf(700, 1260, 2268)
        val attack: List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("야스오", R.drawable.yasuo, "최후의 숨결","마나: 0/90", "야스오가 기본 공격 사거리 +2칸 내에 있는 적에게 순식간에 다가간 후 1초 동안 공중에 띄워 붙들어 두고 추가 공격을 해 기본 공격 시의 피해를 입힙니다. 이때 적중 시 효과가 적용됩니다."
                , "추가 공격 : 4 / 5 / 6", 2, synergy, hp, attack, 0.75, 1, 30, 20, R.drawable.yasuo_skill,synergy.size)
    }

    fun getShen(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getChrono(), SynergyData().getBladmaster())
        val hp: List<Int> = listOf(800, 1440, 2592)
        val attack: List<Double> = listOf(60.0, 108.0, 194.4)

        return Champ("쉔", R.drawable.shen, "의지의 결계", "100/150","쉔이 주변에 수 초 동안 지속되는 결계를 생성합니다. 결계 안의 아군은 모든 기본 공격을 회피합니다. 스킬이 활성화된 동안 쉔의 마법 저항력이 증가합니다."
                , "지속시간 : 2.5 / 3 / 5\n" + "추가 마법 저항력 : 15 / 30 / 45", 2, synergy, hp, attack, 0.7, 1, 45, 35, R.drawable.shen_skill,synergy.size)

    }

    fun getBlitzcrank(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getChrono(), SynergyData().getBrawler())
        val hp: List<Int> = listOf(650, 1170, 2106)
        val attack: List<Double> = listOf(55.0, 99.0, 178.2)

        return Champ("블리츠크랭크", R.drawable.blitzcrank, "로켓 손", "마나: 125/125","블리츠크랭크가 가장 멀리 있는 적을 당겨 마법 피해를 입히고 2.5초 동안 기절시킵니다. 당긴 후 다음 공격은 적을 1초 동안 공중으로 띄워 올립니다. 아군은 블리츠크랭크가 당긴 적이 사거리 안에 있을 경우 우선적으로 공격합니다."
, "피해량 : 250 / 400 / 900", 2, synergy, hp, attack, 0.5, 1, 45, 35, R.drawable.blitzcrank_skill,synergy.size)

    }

    fun getLucian(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getCybernetic(), SynergyData().getBlaster())
        val hp: List<Int> = listOf(500, 900, 1620)
        val attack: List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("루시안", R.drawable.lucian, "끈질긴 추격", "마나: 0/35","루시안이 현재 대상에서 먼 곳으로 돌진하며 기본 공격 후 이어서 추가로 공격해 마법 피해를 입힙니다."
                , "스킬 피해량 : 150 / 200 / 325", 2, synergy, hp, attack, 0.7, 4, 25, 20, R.drawable.lucian_skill,synergy.size)
    }

    fun getMordekaiser(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getDarkStar(), SynergyData().getVanguard())
        val hp: List<Int> = listOf(650, 1170, 2106)
        val attack: List<Double> = listOf(55.0, 99.0, 178.2)

        return Champ("모데카이저", R.drawable.mordekaiser, "불멸", "마나: 0/90","모데카이저가 피해를 흡수하는 보호막을 얻습니다. 보호막이 유지되는 동안 모데카이저는 주변 모든 적에게 초당 마법 피해를 입힙니다."
                , "보호막 흡수량 : 350 / 500 / 800\n" + "초당 피해량 : 50 / 75 / 125", 2, synergy, hp, attack, 0.6, 1, 50, 35, R.drawable.mordekaiser_skill,synergy.size)

    }

    fun getRakan(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getCelestial(), SynergyData().getProtector())
        val hp: List<Int> = listOf(600, 1080, 1944)
        val attack: List<Double> = listOf(45.0, 81.0, 145.8)

        return Champ("라칸", R.drawable.rakan, "화려한 등장", "마나: 50/100","라칸이 기본 공격 사거리 +1칸 내에 있는 적 중 가장 멀리 있는 적에게 돌진 후 공중으로 도약해 근처 모든 적을 띄워 올리고 마법 피해를 입힙니다."
                , "피해량 : 175 / 275 / 400\n" + "띄워올리기 지속시간 : 1.5 / 1.5 / 1.5", 2, synergy, hp, attack, 0.7, 2, 45, 35, R.drawable.rakan_skill,synergy.size)

    }


    fun getXinZhao(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getCelestial(), SynergyData().getProtector())
        val hp: List<Int> = listOf(650, 1170, 2106)
        val attack: List<Double> = listOf(60.0, 108.0, 194.4)

        return Champ("신 짜오", R.drawable.xinzhao, "삼조격", "마나: 0/60","신 짜오가 대상을 세 번 빠르게 타격해 기본 공격 시의 피해를 입히고 적중 시 효과를 적용합니다. 세 번째 공격은 추가 마법 피해를 입히고 대상을 1.5초 동안 공중에 띄워 올립니다."
                , "추가 피해량 : 200 / 275 / 375", 2, synergy, hp, attack, 0.7, 1, 45, 35, R.drawable.xinzhao_skill,synergy.size)

    }

    fun getDarius(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getSpacePirate(), SynergyData().getManaReaver())
        val hp: List<Int> = listOf(750, 1350, 2430)
        val attack: List<Double> = listOf(60.0, 108.0, 194.4)

        return Champ("다리우스", R.drawable.darius, "행성 파괴자의 단두대", "마나: 0/60","다리우스가 적을 내려찍으며 마법 피해를 입힙니다. 적을 처치하면 곧바로 스킬을 다시 사용합니다. 체력이 50%보다 낮은 대상은 두 배의 피해를 입습니다."
                , "피해량 : 400 / 500 / 750", 2, synergy, hp, attack, 0.65, 1, 35, 20, R.drawable.darius_skill,synergy.size)
    }

    fun getAnnie(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getMechPilot(), SynergyData().getSorcerer())
        val hp: List<Int> = listOf(750, 1260, 2268)
        val attack: List<Double> = listOf(40.0, 72.0, 129.6)

        return Champ("애니", R.drawable.annie, "은하 방패-폭발", "마나: 70/140","애니가 피해를 흡수하는 보호막을 얻고 원뿔 형태의 화염을 내뿜어 적중한 대상에게 마법 피해를 입힙니다."
            , "피해량 : 300 / 400 / 600\n" + "보호막 흡수량 : 400 / 500 / 700", 2, synergy, hp, attack, 0.65, 2, 40, 35, R.drawable.annie_skill,synergy.size)

    }

    fun getAhri(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getStarGuardian(), SynergyData().getSorcerer())
        val hp: List<Int> = listOf(600, 1080, 1944)
        val attack: List<Double> = listOf(45.0, 81.0, 145.8)

        return Champ("아리", R.drawable.ahri, "현혹의 구슬","마나: 0/60", "아리가 일직선으로 구슬을 던집니다. 구슬은 닿는 모든 적에게 마법 피해를 입힙니다. 구슬은 아리에게 되돌아오며 이때 닿는 모든 적에게 고정 피해를 입힙니다."
                , "피해량 : 175 / 250 / 375", 2, synergy, hp, attack, 0.75, 3, 20, 20, R.drawable.ahri_skill,synergy.size)
    }

    fun getNautilus(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getAstro(), SynergyData().getVanguard())
        val hp: List<Int> = listOf(750, 1350, 2430)
        val attack: List<Double> = listOf(60.0, 108.0, 194.4)

        return Champ("노틸러스", R.drawable.nautilus, "충격 분화구", "마나: 70/100","노틸러스가 대상 아래의 땅을 폭발시켜 공중으로 띄워 기절시키고 마법 피해를 입힙니다. 대상에 인접한 적들도 공중에 띄워 절반의 시간 동안 기절시키고 절반의 마법 피해를 입힙니다."
                , "기절 시간 : 3 / 3.5 / 4초\n" + "마법 피해량 : 100 / 200 / 400", 2, synergy, hp, attack, 0.65, 1, 50, 35, R.drawable.nautilus_skill,synergy.size)

    }

    fun getZed(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getRebel(), SynergyData().getInfiltrator())
        val hp: List<Int> = listOf(650, 1170, 2106)
        val attack: List<Double> = listOf(55.0, 99.0, 178.2)

        return Champ("제드", R.drawable.zed,  "약자 멸시", "마나: 없음","기본 지속 효과: 세 번째 공격마다 제드가 추가 마법 피해를 입히고 대상의 현재 공격력을 훔칩니다."
            , "훔친 공격력 : 20 / 25 / 40%\n" + "피해량 : 50 / 90 / 150", 2, synergy, hp, attack, 0.75, 1, 25, 20, R.drawable.zed_skill,synergy.size)

    }

    //3코스트트
    fun getNeeko(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getStarGuardian(), SynergyData().getProtector())
        val hp: List<Int> = listOf(800, 1440, 2592)
        val attack: List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("니코", R.drawable.neeko, "만개", "마나: 75/150","니코가 공중으로 도약한 후 지면을 강타하며 주변 모든 적에게 마법 피해를 입히고 기절시킵니다."
            , "피해량 : 150 / 250 / 500\n" + "기절 지속시간 : 1.5 / 2 / 2.5", 3, synergy, hp, attack, 0.65, 2, 45, 40, R.drawable.neeko_skill,synergy.size)

    }

    fun getRumble(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getMechPilot(), SynergyData().getDemolitionist())
        val hp: List<Int> = listOf(900, 1440, 2592)
        val attack: List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("럼블", R.drawable.rumble, "화염방사기", "마나: 0/50","럼블이 3초 동안 원뿔 형태로 화염을 내뿜어 범위 내 적들에게 마법 피해를 입히고 5초 동안 체력 회복 효과를 80% 감소시킵니다."
                , "피해량 : 500 / 750 / 1500", 3, synergy, hp, attack, 0.7, 1, 45, 40, R.drawable.rumble_skill,synergy.size)

    }

    fun getShaco(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getDarkStar(), SynergyData().getInfiltrator())
        val hp: List<Int> = listOf(650, 1170, 2106)
        val attack: List<Double> = listOf(75.0, 126.0, 226.8)

        return Champ("샤코", R.drawable.shaco,  "속임수","마나: 30/80", "샤코가 순간이동해 대상을 암습합니다. 이 공격에는 항상 치명타가 적용되며, 공격력에 비례하는 피해를 입힙니다."
                , "공격력 : 250% / 275% / 300%", 3, synergy, hp, attack, 0.8, 1, 25, 20, R.drawable.shaco_skill,synergy.size)
    }

    fun getVi(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getCybernetic(), SynergyData().getBrawler())
        val hp: List<Int> = listOf(700, 1260, 2268)
        val attack: List<Double> = listOf(60.0, 108.0, 194.4)

        return Champ("바이", R.drawable.vi,  "기동타격","마나: 70/140", "바이가 가장 멀리 있는 적에게 돌진합니다. 돌진 중 경로상에 있는 모든 적을 밀어내고 마법 피해를 입힙니다. 대상에 도달하면 대상에게 마법 피해를 입히고 공중으로 띄워 올립니다."
            , "1차피해 : 400 / 600 / 1200\n" + "2차피해 : 150 / 200 / 500\n" + "기절 지속시간 : 2 / 2.5 / 3", 3, synergy, hp, attack, 0.65, 1, 45, 40, R.drawable.vi_skill,synergy.size)

    }

    fun getSyndra(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getStarGuardian(), SynergyData().getSorcerer())
        val hp: List<Int> = listOf(600, 1080, 1944)
        val attack: List<Double> = listOf(45.0, 81.0, 145.8)

        return Champ("신드라", R.drawable.syndra,  "풀려난 힘", "마나: 0/60","신드라가 전장에 있는 모든 구체뿐만 아니라 3개의 구체를 추가로 생성해 체력이 가장 높은 적에게 날려 하나당 마법 피해를 입힙니다."
                , "피해량 : 100 / 125 / 200", 3, synergy, hp, attack, 0.65, 4, 20, 20, R.drawable.syndra_skill,synergy.size)
    }

    fun getMasterYi(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getRebel(), SynergyData().getBladmaster())
        val hp: List<Int> = listOf(750, 1350, 2430)
        val attack: List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("마스터 이", R.drawable.masteryi, "선택받은 자", "마나: 0/55","5초 동안 마스터 이의 이동 속도가 대폭 증가하고 매초 최대 체력에 비례하여 회복합니다. 또한 기본 공격 시 추가 고정 피해를 입힙니다."
                , "추가 고정 피해 : 75 / 100 / 200\n" +
                "회복량 : 12%", 3, synergy, hp, attack, 0.85, 1, 30, 20, R.drawable.masteryi_skill,synergy.size)
    }

    fun getKarma(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getDarkStar(), SynergyData().getMystic())
        val hp: List<Int> = listOf(600, 1080, 1944)
        val attack: List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("카르마", R.drawable.karma, "고무", "마나: 75/100","전투 시작 시 카르마가 자신과 가장 가까운 아군을 연결합니다. 카르마가 4초 동안 피해를 흡수하는 보호막을 연결된 아군(연결된 아군이 사망할 경우 무작위 아군 하나)에게 부여합니다. 보호막이 유지되는 동안 해당 아군은 추가 공격 속도를 얻습니다."
                , "보호막 흡수량 : 250 / 400 / 800\n" +
                "공격 속도 : 50% / 75% / 125%", 3, synergy, hp, attack, 0.65, 3, 20, 20, R.drawable.karma_skill,synergy.size)
    }

    fun getJayce() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getSpacePirate(),SynergyData().getVanguard())
        val hp : List<Int> = listOf(850, 1350, 2430)
        val attack : List<Double> = listOf(60.0, 108.0, 194.4)

        return Champ("제이스",R.drawable.jayce, "하늘로!","마나: 0/80","제이스가 공중으로 도약해 망치를 내려찍으며 주변 적들에게 마법 피해를 입힙니다."
                ,"피해량 : 450 / 600 / 1200",3,synergy,hp,attack,0.7,1,40,30, R.drawable.jayce_skill,synergy.size)

    }

    fun getEzreal() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getChrono(),SynergyData().getBlaster())
        val hp : List<Int> = listOf(600, 1080, 1944)
        val attack : List<Double> = listOf(60.0, 108.0, 194.4)

        return Champ("이즈리얼",R.drawable.ezreal, "전자기 펄스","마나: 50/80","이즈리얼이 무작위 적에게 전자기 펄스를 발사합니다. 전자기 펄스는 적중 시 폭발하며 주변 모든 적에게 피해를 입히고 해당 적들이 다음에 사용하는 스킬의 마나 소모량을 40% 증가시킵니다."
                ,"피해량 : 100 / 150 / 400",3,synergy,hp,attack,0.75,3,20,20, R.drawable.ezreal_skill,synergy.size)
    }

    fun getAshe() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getCelestial(),SynergyData().getSniper())
        val hp : List<Int> = listOf(600, 1080, 1944)
        val attack : List<Double> = listOf(60.0, 108.0, 194.4)

        return Champ("애쉬",R.drawable.ashe, "마법의 수정화살","마나: 50/100","애쉬가 가장 멀리 있는 적에게 화살을 발사합니다. 화살은 대상에게 처음으로 적중 시 폭발하며 주변 모든 적에게 마법 피해를 입히고 기절시킵니다."
                ,"피해량 : 200 / 275 / 550\n" +
                "기절 지속시간 : 2 / 2 / 2",3,synergy,hp,attack,0.8,5,20,20, R.drawable.ashe_skill,synergy.size)
    }

    fun getVayne() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getCybernetic(),SynergyData().getSniper())
        val hp : List<Int> = listOf(550, 990, 1782)
        val attack : List<Double> = listOf(60.0, 108.0, 194.4)

        return Champ("베인",R.drawable.vayne, "결전의 시간","마나: 0/50","베인이 10초 동안 집중한 뒤 구르기를 하며 즉시 대상에게서 멀어집니다. 이후 세 번째 공격을 할 때마다 구르기를 합니다. 베인은 구르기를 하는 동안 투명 상태가 되며 구르기 이후의 첫 공격은 공격력의 일정% 만큼 피해를 입힙니다. 베인은 구르기를 하는 동안 투명 상태가 되며 구르기 이후의 첫 공격은 공격력의 일정 피해를 입힙니다."
                ,"피해량 : 175 / 200 / 225%",3,synergy,hp,attack,0.8,5,25,20, R.drawable.vayne_skill,synergy.size)

    }

    fun getCassiopeia() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getBattlecast(),SynergyData().getMystic())
        val hp : List<Int> = listOf(750, 1350, 2430)
        val attack : List<Double> = listOf(40.0, 72.0, 129.6)

        return Champ("카시오페아",R.drawable.cassiopeia, "맹독 폭발","마나: 0/25","카시오페아가 맹독 폴발의 영향을 받지 않은 가장 가까운 적에게 독을 발사해 12초간 피해를 입힙니다. 해당 적에게 적용된 보호막 효과를 50% 감소시킵니다."
                ,"피해량 : 700 / 1500 / 3000",3,synergy,hp,attack,0.75,2,30,20, R.drawable.cassiopeia_skill,synergy.size)

    }

    fun getBard() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getAstro(),SynergyData().getMystic())
        val hp : List<Int> = listOf(700, 1260, 2268)
        val attack : List<Double> = listOf(45.0, 81.0, 145.8)

        return Champ("바드",R.drawable.bard, "방랑자의 부름","마나: 0/90","바드가 벤치에 정령을 하나 소환합니다. 정령을 판매하면 1의 경험치를 얻습니다.\n" +
                "\n" + "패시브: 바드는 매 공격시 추가 마나를 얻습니다. 적 챔피언이 없는 라운드에서는 마나를 얻을 수 없습니다."
                ,"추가 마나 : 8 / 20 / 90",3,synergy,hp,attack,0.7,3,30,20, R.drawable.bard_skill,synergy.size)

    }

    //4코스트
    fun getWukong() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getChrono(),SynergyData().getVanguard())
        val hp : List<Int> = listOf(950, 1710, 3078)
        val attack : List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("오공",R.drawable.wukong, "회전격","마나: 50/150","오공이 빠르게 회전하며 주변 적들에게 2초에 걸쳐 마법 피해를 입힙니다. 처음 공격이 적중하면 오공은 적을 공중으로 띄워 올려 기절시킵니다.",
                "피해량 : 300 / 500 / 4000\n" +
                        "기절 지속시간 : 2 / 2 / 5",4,synergy,hp,attack,0.75,1,55,40, R.drawable.wukong_skill,synergy.size)

    }

    fun getSoraka() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getStarGuardian(),SynergyData().getMystic())
        val hp : List<Int> = listOf(700, 1260, 2268)
        val attack : List<Double> = listOf(45.0, 81.0, 148.8)

        return Champ("소라카",R.drawable.soraka, "기원","마나: 50/125","소라카가 모든 아군의 체력을 회복시킵니다.",
                "회복량 : 375 / 550 / 20000",4,synergy,hp,attack,0.75,3,30,20, R.drawable.soraka_skill,synergy.size)
    }

    fun getJinx() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getRebel(),SynergyData().getBlaster())
        val hp : List<Int> = listOf(600, 1080, 1944)
        val attack : List<Double> = listOf(70.0, 126.0, 226.8)

        return Champ("징크스",R.drawable.jinx, "신난다!","마나: 없음","기본 지속 효과: 징크스가 적 유닛 처치에 관여하면 신난다! 상태가 됩니다. 처음 적 처치에 관여하면 공격 속도가 추가로 증가합니다. 두 번째로 적 처치에 관여하면 로켓 런처를 장착해 기본 공격으로 대상 주변의 작은 영역내 모든 적에게 추가 마법 피해를 입힙니다.",
                "공격 속도 : 60% / 75% / 100%\n" +
                        "피해량 : 125 / 200 / 1000",4,synergy,hp,attack,0.75,3,20,20, R.drawable.jinx_skill,synergy.size)

    }

    fun getJhin() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getDarkStar(),SynergyData().getSniper())
        val hp : List<Int> = listOf(600, 1080, 1944)
        val attack : List<Double> = listOf(80.0, 162.0, 291.6)

        return Champ("진",R.drawable.jhin, "속삭임","마나: 없음","기본 지속 효과: 진은 추가 공격 속도 1%를 공격력 0.8로 전환합니다. 진의 4번째 총탄은 공격력의 비례한 만큼 피해를 입힙니다.",
                "공격력 : 244% / 344% / 4444%",4,synergy,hp,attack, 0.85,5,20,20, R.drawable.jhin_skill,synergy.size)

    }

    fun getIrelia() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getCybernetic(),SynergyData().getBladmaster(),SynergyData().getManaReaver())
        val hp : List<Int> = listOf(800, 1440, 2592)
        val attack : List<Double> = listOf(70.0, 126.0, 226.8)

        return Champ("이렐리아",R.drawable.irelia, "칼날 쇄도","마나: 0/30","이렐리아가 돌진하여 지나친 대상에게 공격력에 비례한 피해를 입힙니다. 만약 대상이 죽으면 마나가 가장 높은 적에게 스킬을 곧바로 다시 사용합니다.",
                "공격력 : 175% / 250% / 500%",4,synergy,hp,attack,0.85,1,35,20, R.drawable.irelia_skill,synergy.size)
    }

    fun getFizz() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getMechPilot(),SynergyData().getInfiltrator())
        val hp : List<Int> = listOf(700, 1080, 1944)
        val attack : List<Double> = listOf(60.0, 108.0, 194.4)

        return Champ("피즈",R.drawable.fizz, "미끼 뿌리기","마나: 60/120","피즈가 미끼를 뿌립니다. 잠시 후 상어가 위로 솟구치며 부딪친 적들에게 마법 피해를 입히고 뒤로 밀어내며 1.5초 동안 기절시킵니다.",
            "피해량 : 450 / 600 / 5000",4,synergy,hp,attack,0.85,1,25,20, R.drawable.fizz_skill,synergy.size)

    }

    fun getViktor() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getBattlecast(),SynergyData().getSorcerer())
        val hp : List<Int> = listOf(650, 1170, 2106)
        val attack : List<Double> = listOf(45.0, 81.0, 145.8)

        return Champ("빅토르",R.drawable.viktor, "죽음의 광선","마나: 0/80","빅토르는 서로 가장 멀리 떨어져 있는 두 적 사이의 경로를 불태웁니다. 먼저 최대 체력의 25%만큼 피해를 입히고, 같은 경로를 따라 폭발을 일으켜 250 만큼의 피해를 입힙니다.",
                "초기 피해량 : 15 / 20 / 80%\n" +
                        "후속 피해량 : 250 / 400 / 1500",4,synergy,hp,attack,0.75,3,20,20, R.drawable.viktor_skill,synergy.size)

    }

    fun getTeemo() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getAstro(),SynergyData().getSniper())
        val hp : List<Int> = listOf(600, 1080, 1944)
        val attack : List<Double> = listOf(45.0, 81.0, 145.8)


        return Champ("티모",R.drawable.teemo, "위성 함정","마나: 0/80","티모는 가장 가까운 적 주위에 함정을 3개를 뿌립니다. 적이 함정에 가까이 오거나 3초가 지나면 폭발하며, 근처의 적에게 피해를 입히고, 4초 동안 둔화됩니다.",
                "피해량 : 125 / 175 / 600",4,synergy,hp,attack,1.0,5,20,20, R.drawable.teemo_skill,synergy.size)

    }

    fun getRiven() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getChrono(),SynergyData().getBladmaster())
        val hp : List<Int> = listOf(800, 1440, 2592)
        val attack : List<Double> = listOf(70.0, 126.0, 226.8)

        return Champ("리븐",R.drawable.riven, "에너지 가르기","마나: 0/25","리븐이 돌진하며 피해를 흡수하는 보호막을 얻은 후 전방을 베어 근처 적에게 마법 피해를 입힙니다. 리븐은 세 번째 공격마다 공중으로 도약한 후 앞으로 커다란 에너지 파를 발사하여 마법 피해를 입힙니다.",
                "보호막 흡수량 : 250 / 400 / 1000\n" +
                        "피해량 : 100 / 150 /450\n" +
                        "파동 피해량 : 300 / 500 / 1500",4,synergy,hp,attack,0.85,1,35,20, R.drawable.riven_skill,synergy.size)

    }

    fun getGnar() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getAstro(),SynergyData().getBrawler())
        val hp : List<Int> = listOf(750, 1350, 2430)
        val attack : List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("나르",R.drawable.gnar, "나르!","마나: 0/100","나르가 대상에게 도약하며 메가나르로 변신합니다. 이대 적들을 집어던지며 마법피해를 입히고 2초간 기절시킵니다. 메가 나르 모습인 동안에는 추가 체력과 공격력을 얻고 근접 공격을 합니다.",
                "피해량 : 100 / 200 / 800\n" +
                        "추가 체력 : 750 / 1250 / 2500\n" +
                        "추가 피해량 : 100 / 175 / 400",4,synergy,hp,attack,0.8,2,45,40, R.drawable.gnar_skill,synergy.size)

    }

    //5코스트
    fun getXerath() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getDarkStar(),SynergyData().getSorcerer())
        val hp : List<Int> = listOf(750, 1350, 2430)
        val attack : List<Double> = listOf(60.0, 108.0, 194.4)

        return Champ("제라스",R.drawable.xerath, "심연 포격","마나: 30/80","제라스가 변신해 6초 동안 기본 공격 대신 무작위 적에게 유성을 소환해 떨어뜨립니다. 유성은 적중 시 300의 마법 피해를 입히며, 대상이 사망하면 주변 모든 적이 25%(기본 피해량에 비례)의 마법 피해를 입고 1.5초 동안 기절합니다.",
                "피해량 : 300 / 400 / 2500\n" +
                        "변신 지속시간 : 6 / 8 / 45",5,synergy,hp,attack,0.9,5,20,20, R.drawable.xerath_skill,synergy.size)
    }

    fun getThresh() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getChrono(),SynergyData().getManaReaver())
        val hp : List<Int> = listOf(950, 1710, 3078)
        val attack : List<Double> = listOf(50.0, 90.0, 162.0)

        return Champ("쓰레쉬",R.drawable.thresh, "시간의 통로","마나: 50/85","쓰레쉬가 랜턴을 던져 대기석에 있는 무작위 유닛을 현재 전투에 합류시킵니다. 합류한 유닛과 쓰레쉬는 추가 마나를 얻습니다. 특성은 영향을 받지 않습니다.",
                "추가 마나 : 25 / 50 / 200\n" +
                        "끌어당긴 유닛 : 1 / 1 / 9",5,synergy,hp,attack,0.95,2,55,40, R.drawable.thresh_skill,synergy.size)

    }

    fun getLulu() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getCelestial(),SynergyData().getMystic())
        val hp : List<Int> = listOf(800, 1440, 2592)
        val attack : List<Double> = listOf(45.0, 81.0, 145.8)

        return Champ("룰루",R.drawable.lulu, "대규모 변이","마나: 75/150","룰루가 가까이 있는 적을 변이시킵니다. 변이된 적은 공격하거나 스킬을 사용할 수 없는 상태로 주위를 뛰어다니며 추가 피해를 입습니다.",
                "대상 수 : 2 / 4 / 12\n" +
                        "추가 피해량 : 5% / 10% / 25%\n" +
                        "지속 시간 : 3초 / 3초 / 8초",5,synergy,hp,attack,0.8,3,25,20, R.drawable.lulu_skill,synergy.size)
    }

    fun getGangplank() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getSpacePirate(), SynergyData().getDemolitionist(), SynergyData().getMercenary())
        val hp : List<Int> = listOf(1000, 1800, 3240)
        val attack : List<Double> = listOf(60.0, 108.0, 194.4)
        return Champ("갱플랭크",R.drawable.gangplank, "궤도 포격","마나: 70/160","갱플랭크가 대상 주변 넓은 지역으로 궤도 포격을 요청합니다. 범위 내의 모든 적은 2초 후 피해를 입습니다.",
                "피해량 : 450 / 600 / 9001",5,synergy,hp,attack,1.0,1,30,20, R.drawable.gangplank_skill,synergy.size)

    }

    fun getEkko() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getCybernetic(),SynergyData().getInfiltrator())
        val hp : List<Int> = listOf(850, 1530, 2754)
        val attack : List<Double> = listOf(60.0, 108.0, 194.4)

        return Champ("에코",R.drawable.ekko, "시공간 붕괴","마나: 80/150","에코가 시간의 균열을 열어 모든 유닛의 시간을 멈춘 후 적들을 공격합니다. 공격 시 추가 마법 피해를 입히고 적중 시 효과를 적용합니다. 공격당한 모든 적의 공격 속도가 7초 동안 50% 감소합니다.",
                "피해량 : 100 / 200 / 2000\n" + "공격 횟수: 5/7/20",5,synergy,hp,attack,0.9,1,30,20, R.drawable.ekko_skill,synergy.size)

    }

    fun getAurelionSol() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getRebel(),SynergyData().getStarship())
        val hp : List<Int> = listOf(1100, 1980, 3564)
        val attack : List<Double> = listOf(10.0, 18.0, 32.4)


        return Champ("아우렐리온 솔",R.drawable.aurelionsol, "함대 출격","마나: 120/120","아우렐리온 솔이 전투기를 출격시킵니다. 처음 스킬 사용 시 4대의 전투기가 출격합니다. 이후 스킬을 사용할 때마다 2대의 전투기가 추가로 출격합니다. 전투기는 가까운 적을 먼저 공격합니다.\n " +
                "전투기가 대상의 마나를 감소시킵니다.",
                "피해량 : 80 / 150 / 750\n" +"마나 감소: 10/25/50",5,synergy,hp,attack,0.2,1,55,40, R.drawable.aurelionsol_skill,synergy.size)

    }

    fun getUrgot() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getBattlecast(),SynergyData().getProtector())
        val hp : List<Int> = listOf(950, 1710, 3078)
        val attack : List<Double> = listOf(80.0, 144.0, 259.2)

        return Champ("우르곳",R.drawable.urgot, "불사의 공포","마나: 40/100","우르곳이 공격 사거리 내에서 가장 먼 적에게 드릴을 발사하여 당겨옵니다. 당겨진 적은 2000의 고정 피해를 지속적으로 입으면서 우르곳에게 닿으면 사망하고, 우르곳의 스킬 마나 소모량이 줄어듭니다.",
                "줄어드는 마나 소모량 : 10 / 20 / 100",5,synergy,hp,attack,0.7,3,30,20, R.drawable.urgot_skill,synergy.size)

    }

    fun getJanna() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getStarGuardian(),SynergyData().getParagon())
        val hp : List<Int> = listOf(750, 1350, 2430)
        val attack : List<Double> = listOf(60.0, 106.0, 194.4)

        return Champ("잔나",R.drawable.janna, "울부짖는 돌풍","마나: 50/130","잔나가 부채꼴 모양으로 5개의 회오리바람을 날립니다. 회오리 바람에 닿은 아군은 공격 속도가 5초 동안 빨라지며, 적은 1.5초 동안 공중으로 띄워올려져 기절 상태가 됩니다.",

                "공격 속도 증가량 : 100 / 150 / 500%",5,synergy,hp,attack,0.7,3,30,20, R.drawable.janna_skill, synergy.size)
    }
}