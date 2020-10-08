package com.lolchess.strategy.model.data

import com.lolchess.strategy.R
import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.model.Synergy

//10.13패치부터 스탯 변경해야됌
//3.5버전에서 진의 공속은 1성~3성 (0.85, 0.95, 1.25)로 바뀜. 따로 적용시켜야함.

class ChampData {
    //1코스트
    fun getGaren(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getWarlord(), SynergyData().getVanguard())
        val hp: List<Int> = listOf(600,1080,1944)
        val attack: List<Int> = listOf(50, 90, 162)

        return Champ("가렌", R.drawable.garen,"심판"," 마나: 0/100", "가렌이 4초 동안 검을 들고 회전하며 주변 적들에게 마법 피해를 입힙니다. 그동안 받는 마법 피해가 80% 감소합니다."

                , "총 피해량 : 450 / 675 / 1125", 1, synergy, hp, attack, 0.6, 1, 50, 35, R.drawable.garen_skill,synergy.size)
    }

    fun getNami(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getEnlightened(), SynergyData().getMage())
        val hp: List<Int> = listOf(550, 990, 1782)
        val attack: List<Int> = listOf(40, 72, 130)

        return Champ("나미", R.drawable.nami,"물의 감옥", "마나: 40/80", "나미가 가장 가까이 있는 적을 물방울에 가두어 마법 피해를 입히고 수 초 동안 기절시킵니다."
                , "피해량 : 225 / 325 / 450\n" + "기절 지속시간 : 2.5 / 3 / 4", 1, synergy, hp, attack,0.65, 3, 20, 20, R.drawable.nami_skill,synergy.size)
    }



    fun getDiana(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getMoonlight(), SynergyData().getAssassin())
        val hp: List<Int> = listOf(500, 900, 1620)
        val attack: List<Int> = listOf(50, 90, 162)

        return Champ("다이애나", R.drawable.diana, "은빛 가호", "마나: 0/70","다이애나가 4초 동안 피해를 흡수하는 보호막을 얻고 자신의 주위를 도는 구체를 소환합니다. 구체는 적과 닿으면 폭발하며 마법 피해를 입히며, 마지막 구체가 폭발하면 보호막이 초기화됩니다."
                , "구체 : 4 / 5 / 6 / 10\n" +
                "피해량 : 70 / 80 / 90 / 100\n" +
                "보호막 흡수량 : 200 / 300 / 450 / 650" , 1, synergy, hp, attack, 0.65, 1, 30, 20, R.drawable.diana_skill,synergy.size)
    }

    fun getElise(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getCultist(), SynergyData().getKeeper())
        val hp: List<Int> = listOf(600, 1080, 1944)
        val attack: List<Int> = listOf(45, 81, 146)

        return Champ("엘리스", R.drawable.elise, "거미 형태","마나: 0/75", "엘리스가 거미 형태로 변하여 최대 체력이 증가하고 기본 공격 시 체력을 회복합니다."
                , "추가 체력 : 35% / 40% / 45%\n" +
                "적중 시 체력 회복 : 40 / 80 / 120", 1, synergy, hp, attack, 0.65, 2, 30, 20, R.drawable.elise_skill,synergy.size)

    }

    fun getFiora(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getEnlightened(), SynergyData().getDuelist())
        val hp: List<Int> = listOf(600, 1080, 1944)
        val attack: List<Int> = listOf(45, 81, 146)

        return Champ("피오라", R.drawable.fiora, "응수","마나: 0/85", "피오라가 1.5초 동안 방어 태세를 갖추며 피해나 적 스킬에 면역 상태가 됩니다. 방어 태세가 끝나면 공격해 근처 적에게 마법 피해를 입히고 기절시킵니다."
                , "피해량 : 200 / 300 / 450\n" +
                "기절 지속시간 : 1.5 / 2 / 3", 1, synergy, hp, attack, 0.75, 1, 35, 30, R.drawable.fiora_skill,synergy.size)
    }

    fun getLissandra(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getMoonlight(), SynergyData().getDazzler())
        val hp: List<Int> = listOf(550, 990, 1782)
        val attack: List<Int> = listOf(40, 72, 130)

        return Champ("리산드라", R.drawable.lissandra, "천 개의 단검", "마나: 0/50","리산드라가 대상을 향해 단검을 던져 처음 적중한 적에게 마법 피해를 입힙니다. 처음 대상에게 적중하거나 사거리 끝에 도달하면 단검이 폭발하며 근처 대상들에게 마법 피해를 입힙니다."
                , "피해량 : 350 / 450 / 600 / 900\n" +
                "이차 피해 : 175 / 225 / 300 / 450", 1, synergy, hp, attack, 0.6, 3, 20, 20, R.drawable.lissandra_skill,synergy.size)

    }

    fun getMaokai(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getElderwood(), SynergyData().getBrawler())
        val hp: List<Int> = listOf(700, 1260, 2268)
        val attack: List<Int> = listOf(55, 99, 178)

        return Champ("마오카이", R.drawable.maokai,"덤불 주먹", "마나: 0/75", "마오카이가 지면을 강타해 전방으로 충격파를 발사합니다. 적중한 적들은 마법 피해를 입고 3초 동안 공격 속도가 50% 감소합니다."
                , "피해량 : 225 / 350 / 550", 1, synergy, hp, attack, 0.5, 1, 35, 20, R.drawable.maokai_skill,synergy.size)

    }

    fun getNidalee(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getWarlord(), SynergyData().getSharpShooter())
        val hp: List<Int> = listOf(550, 990, 1782)
        val attack: List<Int> = listOf(45, 81, 146)

        return Champ("니달리", R.drawable.nidalee, "창 투척", "마나: 0/80","니달리가 가장 멀리 있는 적에게 창을 던져 기본 피해량+날아간 칸당 10%의 마법 피해를 입힙니다."
                , "기본 피해량 : 225 / 350 / 600", 1, synergy, hp, attack, 0.7, 4, 30, 20, R.drawable.nidalee_skill,synergy.size)
    }

    fun getTahmKench(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getFortune(), SynergyData().getBrawler())
        val hp: List<Int> = listOf(700, 1260, 2268)
        val attack: List<Int> = listOf(85, 153, 275)

        return Champ("탐켄치", R.drawable.tahmkench, "두꺼운 피부", "마나: 없음","탐 켄치가 받는 모든 피해량이 감소합니다."
                , "피해량 감소 : 15 / 25 / 75", 1, synergy, hp, attack, 0.7, 3, 20, 20, R.drawable.twistedfate_skill,synergy.size)
    }

    fun getTwistedFate(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getCultist(), SynergyData().getMage())
        val hp: List<Int> = listOf(550, 990, 1782)
        val attack: List<Int> = listOf(45, 81, 146)

        return Champ("트위스티드 페이트", R.drawable.twistedfate, "와일드 카드", "마나: 0/70","트위스티드 페이트가 카드 세 장을 원뿔 형태로 던집니다. 카드는 적을 통과하며 마법 피해를 입힙니다."
                , "피해량 : 250 / 350 / 475", 1, synergy, hp, attack, 0.65, 3, 20, 20, R.drawable.twistedfate_skill,synergy.size)
    }

    fun getVayne(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getDusk(), SynergyData().getSharpShooter())
        val hp: List<Int> = listOf(500, 900, 1620)
        val attack: List<Int> = listOf(40, 72, 130)

        return Champ("베인", R.drawable.vayne, "은화살", "마나: 없음","기본 지속 효과: 베인이 같은 대상을 3회 기본 공격할 때마다 추가 고정 피해를 입힙니다."
                , "추가 고정 피해 : 40 / 75 / 125", 1, synergy, hp, attack, 0.9, 1, 20, 20, R.drawable.vayne_skill,synergy.size)

    }

    fun getWukong(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getDivine(), SynergyData().getVanguard())
        val hp: List<Int> = listOf(650, 1170, 2106)
        val attack: List<Int> = listOf(55, 99, 178)

        return Champ("오공", R.drawable.wukong, "파쇄격","마나: 0/50",  "오공이 대상에게 여의봉을 휘둘러 공격력에 비례한 물리 피해를 입히고 수 초 동안 기절시킵니다."
                , "공격력 % : 225% / 250% / 275%\n" +
                "기절 지속시간 : 1.5 / 2 / 3", 1, synergy, hp, attack, 0.65, 1, 40, 30, R.drawable.wukong_skill,synergy.size)

    }

    fun getYasuo(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getExile(), SynergyData().getDuelist())
        val hp: List<Int> = listOf(550, 990, 1782)
        val attack: List<Int> = listOf(50, 90, 162)

        return Champ("야스오", R.drawable.yasuo, "강철의 일격","마나: 0/45",  "야스오가 전방 2칸으로 검을 내질러 공격력에 비례하는 피해를 입힙니다. 현재 위치에서 대상 두 명을 타격하지 못할 경우 일단 타격이 가능한 위치로 돌진합니다."
                , "공격력 % : 160% / 190% / 225%", 1, synergy, hp, attack, 0.7, 1, 30, 20, R.drawable.yasuo_skill,synergy.size)

    }

    //2코스트
    fun getAnnie(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getFortune(), SynergyData().getMage())
        val hp: List<Int> = listOf(750 / 1350 / 2430)
        val attack: List<Int> = listOf(45 / 81 / 146)

        return Champ("애니", R.drawable.annie, "폭발 보호막","마나: 0/65", "애니가 원뿔 형태의 화염을 내뿜어 전방의 모든 적에게 마법 피해를 입히고 8초 동안 피해를 흡수하는 보호막을 얻습니다."
                , "피해량 : 250 / 350 / 450\n" +
                "보호막 흡수량 : 500 / 700 / 900", 2, synergy, hp, attack, 0.6, 2, 40, 40, R.drawable.annie_skill,synergy.size)

    }

    fun getAphelios(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getMoonlight(), SynergyData().getHunter())
        val hp: List<Int> = listOf(500, 900, 1620)
        val attack: List<Int> = listOf(45, 81, 146)

        return Champ("아펠리오스", R.drawable.aphelios, "파수탑","마나: 90/180", "아펠리오스가 수 초 동안 유지되는 포탑을 소환합니다. 아펠리오스의 의지가 담긴 포탑은 아펠리오스와 똑같이 공격하고 피해를 입히며, 아펠리오스가 죽으면 함께 파괴됩니다."
                , "지속시간 : 7 / 8 / 9 / 11", 2, synergy, hp, attack, 0.7, 4, 20, 20, R.drawable.aphelios_skill,synergy.size)
    }

    fun getHecarim(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getElderwood(), SynergyData().getVanguard())
        val hp: List<Int> = listOf(750, 1350, 2430)
        val attack: List<Int> = listOf(55, 99, 178)

        return Champ("헤카림", R.drawable.hecarim, "생명의 영혼", "마나: 0/120","헤카림이 3초 동안 주변에 오오라를 생성해 영역 내 적에게 마법 피해를 입히고, 자신의 체력을 회복합니다."
                , "피해량 : 250 / 400 / 600\n" +
                "회복량 : 250 / 350 / 500", 2, synergy, hp, attack, 0.55, 1, 45, 30, R.drawable.hecarim_skill,synergy.size)

    }

    fun getJanna(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getEnlightened(), SynergyData().getMystic())
        val hp: List<Int> = listOf(550, 990, 1782)
        val attack: List<Int> = listOf(40, 72, 130)

        return Champ("잔나", R.drawable.janna, "폭풍의 눈", "마나: 30/60","잔나가 체력이 가장 낮은 아군들에게 4초 동안 피해를 흡수하는 보호막을 부여합니다. 지속시간 동안 해당 아군은 추가 공격력을 얻습니다."
                , "아군 수 : 2 / 3 / 4\n" +
                "보호막 흡수량 : 250 / 300 / 400\n" +
                "추가 공격력 : 20 / 30 / 60", 2, synergy, hp, attack, 0.6, 4, 20, 20, R.drawable.janna_skill,synergy.size)

    }

    fun getJarvanIV(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getWarlord(), SynergyData().getKeeper())
        val hp: List<Int> = listOf(600, 1080, 1944)
        val attack: List<Int> = listOf(60, 108, 194)

        return Champ("자르반 4세", R.drawable.jarvaniv, "용의 일격", "마나: 60/120","자르반 4세가 가장 멀리 있는 적 근처에 깃발을 던진 후, 창을 뻗으며 깃발 쪽으로 돌진합니다. 경로 상에 있는 모든 적은 마법 피해를 입으며 공중에 뜨고 2초 동안 기절합니다."
                , "스킬 피해량 : 175 / 250 / 500", 2, synergy, hp, attack, 0.6, 1, 45, 30, R.drawable.jarvaniv_skill,synergy.size)
    }

    fun getJax(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getDivine(), SynergyData().getDuelist())
        val hp: List<Int> = listOf(750, 1350, 2430)
        val attack: List<Int> = listOf(60, 108, 194)

        return Champ("잭스", R.drawable.jax, "반격", "마나: 50/100","잭스가 2초 동안 모든 공격을 회피한 후, 주변 적들을 후려쳐 마법 피해를 입히고 1.5초 동안 기절시킵니다."
                , "피해량 : 150 / 250 / 450", 2, synergy, hp, attack, 0.75, 1, 40, 30, R.drawable.jax_skill,synergy.size)

    }

    fun getLulu(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getElderwood(), SynergyData().getMage())
        val hp: List<Int> = listOf(500, 900, 1620)
        val attack: List<Int> = listOf(50, 90, 162)

        return Champ("룰루", R.drawable.lulu, "급성장", "마나: 60/120","룰루가 체력이 낮은 아군 하나를 커지게 해 추가 체력을 부여하고 주변 적들을 1.5초 동안 공중으로 띄워 올립니다."
                , "추가 체력 : 400 / 600 / 950", 2, synergy, hp, attack, 0.6, 2, 45, 35, R.drawable.lulu_skill,synergy.size)

    }


    fun getPyke(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getCultist(), SynergyData().getAssassin())
        val hp: List<Int> = listOf(700, 1260, 2268)
        val attack: List<Int> = listOf(50, 90, 162)

        return Champ("파이크", R.drawable.pyke, "망자의 물살", "마나: 75/125","파이크가 자신이 있던 위치에 유령을 남긴 후 가장 멀리 있는 적 뒤로 돌진합니다. 1초 후 유령이 파이크에게 되돌아오며 경로상의 모든 적에게 마법 피해를 입히고 기절시킵니다."
                , "추가 피해량 : 200 / 275 / 375", 2, synergy, hp, attack, 0.6, 1, 50, 30, R.drawable.pyke_skill,synergy.size)

    }

    fun getSylas(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getMoonlight(), SynergyData().getBrawler())
        val hp: List<Int> = listOf(700, 1260, 2268)
        val attack: List<Int> = listOf(70, 126, 227)

        return Champ("사일러스", R.drawable.sylas, "사슬 후려치기", "마나: 30/60","사일러스가 일직선상의 3칸에 사슬을 후려쳐 적중한 모든 적에게 마법 피해를 입히고 다음 스킬의 비용을 33% 증가시킵니다."
                , "피해량 : 250 / 400 / 600 / 1000", 2, synergy, hp, attack, 0.6, 1, 40, 80, R.drawable.sylas_skill,synergy.size)
    }

    fun getTeemo(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getSpirit(), SynergyData().getSharpShooter())
        val hp: List<Int> = listOf(500, 900, 1620)
        val attack: List<Int> = listOf(55, 99, 178)

        return Champ("티모", R.drawable.teemo, "포자 구름 다트", "마나: 0/60","티모가 공격 속도가 가장 높은 적에게 다트를 날립니다. 다트는 폭발하며 포자 구름을 생성해 주변 적들을 중독시킵니다. 중독된 적들은 수 초 동안 마법 피해를 입고 실명합니다."
                , "피해량 : 200 / 300 / 600\n" +
                "지속시간 : 2.5 / 3 / 4.5", 2, synergy, hp, attack, 0.7, 2, 20, 20, R.drawable.teemo_skill,synergy.size)

    }
    ////여기부터
    fun getThresh(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getDusk(), SynergyData().getVanguard())
        val hp: List<Int> = listOf(700,1260,2268)
        val attack: List<Int> = listOf(60, 108, 194)

        return Champ("쓰레쉬", R.drawable.thresh, "유령 랜턴","마나: 50/100", "쓰레쉬가 가장 체력이 낮은 아군에게 랜턴을 던져 해당 아군 및 주변의 모든 아군에게 4초 동안 피해를 흡수하는 보호막을 씌웁니다."
                , "보호막 흡수량 : 250 / 450 / 750", 2, synergy, hp, attack, 0.55, 2, 80, 20, R.drawable.thresh_skill,synergy.size)
    }

    fun getVi(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getWarlord(), SynergyData().getBrawler())
        val hp: List<Int> = listOf(700, 1260, 2268)
        val attack: List<Int> = listOf(65, 117, 211)

        return Champ("바이", R.drawable.vi, "찌그러뜨리기", "마나: 0/60","바이의 공격이 대상 및 뒤의 원뿔 영역의 모든 적에게 마법 피해를 입히고 6초 동안 방어력을 감소시킵니다."
                , "피해량 : 250 / 400 / 600\n" +
                "방어력 감소 : 50% / 75% / 100%", 2, synergy, hp, attack, 0.6, 1, 40, 30, R.drawable.vi_skill,synergy.size)

    }

    fun getZed(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getNinja(), SynergyData().getShade())
        val hp: List<Int> = listOf(600, 1080, 1944)
        val attack: List<Int> = listOf(55, 99, 178)

        return Champ("제드", R.drawable.zed,  "약자 멸시", "마나: 없음","기본 지속 효과: 세 번째 공격마다 제드가 추가 마법 피해를 입히고 대상의 현재 공격력을 훔칩니다."
                , "훔친 공격력 : 20% / 30% / 40%\n" +
                "피해량 : 25 / 50 / 75", 2, synergy, hp, attack, 0.75, 1, 20, 20, R.drawable.zed_skill,synergy.size)

    }

    //3코스트

    fun getNunu(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getElderwood(), SynergyData().getBrawler())
        val hp: List<Int> = listOf(750, 1350, 2430)
        val attack: List<Int> = listOf(65, 117, 211)

        return Champ("누누와 월럼프", R.drawable.nunu,"잡아먹기","마나: 0/85",  "윌럼프가 대상을 물어뜯어 마법 피해를 입힙니다. 이때 만약 대상의 체력이 윌럼프보다 적으면 50%의 추가 피해를 입히며 고정 피해로 전환됩니다."

                , "피해량 : 450 / 650 / 1300", 3, synergy, hp, attack, 0.55, 1, 50, 30, R.drawable.nunu_skill,synergy.size)
    }

    fun getAkali(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getNinja(), SynergyData().getAssassin())
        val hp: List<Int> = listOf(650, 1170, 2106)
        val attack: List<Int> = listOf(55, 99, 178)

        return Champ("아칼리", R.drawable.akali, "오연투척검", "마나: 0/20","아칼리가 대상에게 단검을 던져 마법 피해를 입힙니다."
                , "피해량 : 150 / 225 / 400", 3, synergy, hp, attack, 0.75, 1, 20, 20, R.drawable.akali_skill,synergy.size)

    }

    fun getEvelynn(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getCultist(), SynergyData().getShade())
        val hp: List<Int> = listOf(600, 1080, 1944)
        val attack: List<Int> = listOf(70, 126, 227)

        return Champ("이블린", R.drawable.evelynn, "최후의 포옹", "마나: 0/60","이블린이 근처의 적 유닛 최대 3명에게 마법 피해를 입히고 순간이동해 멀어집니다. 대상의 체력이 50% 이하일 경우 3배의 피해를 입힙니다."
                , "피해량 : 350 / 500 / 900\n" +
                "피해량 증가율 : 3 / 3 / 3", 3, synergy, hp, attack, 0.7, 1, 20, 20, R.drawable.evelynn_skill,synergy.size)

    }

    fun getIrelia(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getEnlightened(),SynergyData().getDivine(), SynergyData().getAdept())
        val hp: List<Int> = listOf(800, 1440, 2592)
        val attack: List<Int> = listOf(55, 99, 178)

        return Champ("이렐리아", R.drawable.irelia,  "칼날 폭풍","마나: 50/100", "이렐리아가 전방에 칼날 폭풍을 날려 마법 피해를 입히고 적중 시 효과를 적용하며 적들을 수 초 동안 무장 해제합니다."
                , "피해량 : 200 / 300 / 600\n" +
                "무장 해제 지속시간 : 2.5 / 3 / 3.5", 3, synergy, hp, attack, 0.65, 1, 40, 40, R.drawable.irelia_skill,synergy.size)
    }

    fun getJinx(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getFortune(), SynergyData().getSharpShooter())
        val hp: List<Int> = listOf(650, 1170, 2106)
        val attack: List<Int> = listOf(75, 135, 243)

        return Champ("징크스", R.drawable.jinx,  "생선대가리","마나: 0/50", "징크스가 로켓을 발사해 대상을 1.5초 동안 기절시키고 대상과 근처 모든 적에게 마법 피해를 입힙니다."
                , "피해량 : 200 / 325 / 550", 3, synergy, hp, attack, 0.75, 1, 20, 20, R.drawable.jinx_skill,synergy.size)

    }

    fun getKalista(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getCultist(), SynergyData().getDuelist())
        val hp: List<Int> = listOf(550, 990, 1782)
        val attack: List<Int> = listOf(65, 117, 211)

        return Champ("칼리스타", R.drawable.kalista,  "뽑아 찢기", "마나: 없음","칼리스타의 창이 대상을 꿰뚫고 유지됩니다. 창을 뽑으면 하나당 대상 최대 체력의 %에 해당하는 마법 피해를 입힙니다. 칼리스타는 적을 처치할 수 있을 때만 창을 뽑습니다."
                , "적 최대 체력 비례 피해량 : 4% / 6% / 8%", 3, synergy, hp, attack, 1.0, 4, 20, 20, R.drawable.kalista_skill,synergy.size)
    }

    fun getKatarina(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getWarlord(), SynergyData().getFortune(), SynergyData().getAssassin())
        val hp: List<Int> = listOf(500, 900, 1620)
        val attack: List<Int> = listOf(65, 117, 211)

        return Champ("카타리나", R.drawable.katarina, "죽음의 연꽃", "마나: 0/90","카타리나가 2.5초 동안 정신을 집중하며 주변 적들에게 단검을 던져 마법 피해를 입히고 5초 동안 체력 회복 효과를 50% 감소시킵니다."
                , "총 피해량 : 600 / 900 / 1600\n" +
                "대상 수 : 4 / 6 / 8", 3, synergy, hp, attack, 0.65, 1, 20, 20, R.drawable.katarina_skill,synergy.size)
    }

    fun getKennen(): Champ {
        val synergy: List<Synergy> = listOf(SynergyData().getNinja(), SynergyData().getKeeper())
        val hp: List<Int> = listOf(650, 1170, 2106)
        val attack: List<Int> = listOf(60, 108, 194)

        return Champ("케넨", R.drawable.kennen, "날카로운 소용돌이", "마나: 50/125","케넨이 주변에 3초 동안 지속되는 폭풍을 소환해 범위 내 모든 적에게 마법 피해를 입힙니다. 폭풍 지속시간 동안 매 0.5초마다 번개가 치며 번개를 3회 맞은 적은 1.5초 동안 기절합니다."
                , "총 피해량 : 300 / 450 / 900", 3, synergy, hp, attack, 0.65, 2, 20, 20, R.drawable.kennen_skill,synergy.size)
    }

    fun getKindred() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getSpirit(),SynergyData().getHunter())
        val hp : List<Int> = listOf(650, 1170, 2106)
        val attack : List<Int> = listOf(70, 126, 227)

        return Champ("킨드레드",R.drawable.kindred, "공포 세례","마나: 0/35","늑대가 킨드레드의 적을 물어뜯어 마법 피해를 입히고 5초 동안 체력 회복 효과를 50% 감소시킵니다. 이때 양은 대상 적으로부터 재빨리 물러납니다."
                ,"피해량 : 450 / 600 / 1200",3,synergy,hp,attack,0.8,3,20,20, R.drawable.kindred_skill,synergy.size)

    }

    fun getLux() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getDivine(),SynergyData().getDazzler())
        val hp : List<Int> = listOf(600, 1080, 1944)
        val attack : List<Int> = listOf(40, 72, 130)

        return Champ("럭스",R.drawable.lux, "빛의 속박","마나: 40/100","럭스가 가장 멀리 있는 적에게 빛의 구체를 날립니다. 경로상의 모든 대상은 마법 피해를 입고 수 초 동안 기절합니다."
                ,"피해량 : 300 / 400 / 700\n" +
                "기절 지속시간 : 1.5 / 2 / 3",3,synergy,hp,attack,0.7,4,20,20, R.drawable.lux_skill,synergy.size)
    }

    fun getVeigar() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getElderwood(),SynergyData().getMage())
        val hp : List<Int> = listOf(600, 1080, 1944)
        val attack : List<Int> = listOf(40, 72, 130)

        return Champ("베이가",R.drawable.veigar, "어둠의 꽃","마나: 0/45","베이가가 체력이 가장 낮은 적을 공격해 마법 피해를 입힙니다. 이 스킬로 적을 처치하면 베이가의 주문력이 영구적으로 상승합니다."
                ,"피해량 : 450 / 600 / 900\n" +
                "얻는 주문력 : 1 / 2 / 4",3,synergy,hp,attack,0.6,3,20,20, R.drawable.veigar_skill,synergy.size)
    }

    fun getXinZhao() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getWarlord(),SynergyData().getDuelist())
        val hp : List<Int> = listOf(700, 1260, 2268)
        val attack : List<Int> = listOf(65, 117, 211)


        return Champ("신 짜오",R.drawable.xinzhao, "헌월수호","마나: 0/30","신 짜오가 주위로 창을 휘둘러 공격력에 비례한 피해를 입히고 적중한 적들에게 6초 동안 도전합니다. 도전을 받은 적에게 신 짜오의 기본 공격은 증가된 피해를 입히고, 이외의 적에게서 받는 모든 피해량이 85% 감소합니다."
                ,"최초 피해량 : 200 / 250 / 350\n" +
                "기본 공격 피해량 증가 : 200 / 200 / 200",3,synergy,hp,attack,0.8,1,45,30, R.drawable.xinzhao_skill,synergy.size)

    }

    fun getYuumi() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getSpirit(),SynergyData().getMystic())
        val hp : List<Int> = listOf(600, 1080, 1944)
        val attack : List<Int> = listOf(40, 72, 130)

        return Champ("유미",R.drawable.yuumi, "슈우우웅","마나: 0/40","유미가 체력이 가장 낮은 아군에게 날아가 잃은 체력의 일부를 회복시키고 5초 동안 추가 공격 속도를 부여합니다. 그리고 가장 멀리 있는 아군에게 다시 날아가 같은 스킬을 반복합니다."
                ,"회복량 : 30% / 40% / 60%\n" +
                "공격 속도 : 30% / 40% / 50%",3,synergy,hp,attack,0.6,3,20,20, R.drawable.yuumi_skill,synergy.size)

    }

    //4코스트
    fun getAatrox() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getCultist(),SynergyData().getVanguard())
        val hp : List<Int> = listOf(800, 1440, 2592)
        val attack : List<Int> = listOf(60, 108, 194)

        return Champ("아트록스",R.drawable.aatrox, "지옥사슬","마나: 75/150","아트록스가 가장 멀리 있는 적들을 자신 쪽으로 끌어당긴 후, 전방의 지면을 강타해 적중한 모든 적에게 피해를 입힙니다.",
                "피해량 : 250 / 450 / 1250\n" +
                        "대상 수 : 2 / 2 / 5",4,synergy,hp,attack,0.65,1,40,40, R.drawable.aatrox_skill,synergy.size)

    }

    fun getAhri() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getSpirit(),SynergyData().getMage())
        val hp : List<Int> = listOf(650, 1170, 2106)
        val attack : List<Int> = listOf(40, 72, 130)

        return Champ("아리",R.drawable.ahri, "영혼 폭탄","마나: 0/80","아리가 정신을 집중해 영혼 구슬에 에너지를 주입합니다. 1.5초 후 무작위 적에게 구슬을 던져 넓은 영역 안의 모든 적에게 마법 피해를 입힙니다.",
                "피해량 : 500 / 800 / 4000",4,synergy,hp,attack,0.75,4,20,20, R.drawable.ahri_skill,synergy.size)
    }

    fun getAshe() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getElderwood(),SynergyData().getHunter())
        val hp : List<Int> = listOf(650 / 1170 / 2106)
        val attack : List<Int> = listOf(80 / 144 / 259)

        return Champ("애쉬",R.drawable.ashe, "사냥꾼의 집중","마나: 0/30,","5초 동안 애쉬의 공격 속도가 오르며 기본 공격이 다발 공격으로 변경되어 물리 피해를 입힙니다.",
                "공격 속도 : 45% / 65% / 300%\n" +
                        "화살당 피해량 : 45% / 45% / 45%",4,synergy,hp,attack,0.75,4,25,20, R.drawable.ashe_skill,synergy.size)

    }

    fun getJhin() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getCultist(),SynergyData().getSharpShooter())
        val hp : List<Int> = listOf(600, 1080, 1944)
        val attack : List<Int> = listOf(85, 153, 275)

        return Champ("진",R.drawable.jhin, "속삭임","마나: 없음","기본 지속 효과: 진이 항상 일정한 초당 공격 속도를 갖습니다. 진의 추가 공격 속도 1%는 0.8의 공격력으로 전환됩니다. 기본 지속 효과: 진의 4번째 총탄은 공격력에 비례한 피해를 입힙니다.",
                "공격력 : 444% / 544% / 4444%\n" +"초당 공격 횟수 : 0.85 / 0.9 / 1.2",4,synergy,hp,attack, 0.85,4,20,20, R.drawable.jhin_skill,synergy.size)

    }

    fun getMorgana() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getEnlightened(),SynergyData().getDazzler())
        val hp : List<Int> = listOf(750, 1350, 2430)
        val attack : List<Int> = listOf(50, 90, 162)

        return Champ("모르가나",R.drawable.morgana, "신성한 땅","마나: 60/120","모르가나가 대상 아래의 땅을 신성화해 영역 내 적들에게 5초 동안 마법 피해를 입히고 영역 내에 있는 동안 마법 저항력을 40% 감소시킵니다. 모르가나는 피해량의 %만큼 체력을 회복합니다.",
                "피해량 : 250 / 400 / 2000\n" +
                        "회복량 : 20% / 25% / 30%",4,synergy,hp,attack,0.7,3,30,60, R.drawable.morgana_skill,synergy.size)
    }

    fun getSejuani() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getFortune(),SynergyData().getVanguard())
        val hp : List<Int> = listOf(1000, 1800, 3240)
        val attack : List<Int> = listOf(45, 81, 146)

        return Champ("세주아니",R.drawable.sejuani, "불꽃놀이","마나: 50/130","세주아니가 가장 가까운 적에게 거대한 폭죽을 던집니다. 폭죽은 2초 후에 폭발하며 범위 내의 적들은 마법 피해를 입고 수 초 동안 기절합니다.",
                "피해량 : 100 / 200 / 800\n" +
                        "기절 지속시간 : 2.5 / 3 / 6",4,synergy,hp,attack,0.55,1,60,40, R.drawable.sejuani_skill,synergy.size)

    }

    fun getShen() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getNinja(),SynergyData().getAdept(), SynergyData().getMystic())
        val hp : List<Int> = listOf(950, 1710, 3078)
        val attack : List<Int> = listOf(60, 108, 194)

        return Champ("쉔",R.drawable.shen, "그림자 돌진","마나: 50/100","쉔이 대상을 통과해 돌진하며 4초 동안 피해를 흡수하는 보호막을 얻고 근처 모든 적을 도발합니다.",
                "보호막 흡수량 : 500 / 800 / 4000\n" +"쉔 그림자 돌진 보호막 및 도발 지속시간: 4 / 4 / 8",4,synergy,hp,attack,0.65,1,50,40, R.drawable.shen_skill,synergy.size)

    }

    fun getTalon() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getEnlightened(),SynergyData().getAssassin())
        val hp : List<Int> = listOf(750, 1350, 2430)
        val attack : List<Int> = listOf(90, 162, 291)


        return Champ("탈론",R.drawable.talon, "예리한 일격","마나: 0/50","탈론이 대상을 공격해 공격력에 비례한 추가 물리 피해를 입힙니다. 대상을 처치하면 탈론은 저지 불가 및 무적, 대상으로 지정할 수 없는 상태가 되어 해당 라운드에 가장 입힌 피해량이 높은 적에게 도약합니다. 그리고 마나를 전부 회복합니다.",
                "추가 물리 공격력 % : 2 / 2.5 / 3\n" +
                        "추가 피해량 : 125 / 200 / 600",4,synergy,hp,attack,0.8,1,30,20, R.drawable.talon_skill,synergy.size)

    }

    fun getRiven() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getDusk(),SynergyData().getKeeper())
        val hp : List<Int> = listOf(800, 1440, 2592)
        val attack : List<Int> = listOf(70, 126, 227)

        return Champ("리븐",R.drawable.riven, "휩쓰는 공격","마나: 0/20","리븐이 돌진하며 피해를 흡수하는 보호막을 얻은 후 전방을 베어 근처 적에게 마법 피해를 입힙니다. 리븐은 세 번째 공격마다 공중으로 도약한 후 앞으로 커다란 에너지 파동을 발사하여 마법 피해를 입힙니다.",
                "보호막 흡수량 : 175 / 250 / 750\n" +
                        "피해량 : 180 / 250 / 750\n" +
                        "파동 피해량 : 300 / 450 / 1500",4,synergy,hp,attack,0.75,1,35,30, R.drawable.riven_skill,synergy.size)

    }

    fun getWarwick() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getDivine(),SynergyData().getBrawler(), SynergyData().getHunter())
        val hp : List<Int> = listOf(950, 1710, 3078)
        val attack : List<Int> = listOf(70, 126, 227)

        return Champ("워윅",R.drawable.warwick, "태고의 굶주림","마나: 0/70","워윅이 공격 속도 증가와 생명력 흡수 효과를 얻고 전투가 끝날 때까지 더 빠르게 움직입니다. 이 상태에서 처치에 관여하면 포효하여 근처 모든 적을 수 초 동안 기절시킵니다.",
                "공격 속도 : 175% / 200% / 500%\n" +
                        "생명력 흡수 : 50% / 50% / 200%\n" +
                        "기절 지속시간 : 1.5 / 1.5 / 3",4,synergy,hp,attack,0.9,1,40,40, R.drawable.warwick_skill,synergy.size)

    }

    fun getCassiopeia() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getDusk(),SynergyData().getMystic())
        val hp : List<Int> = listOf(750, 1350, 2430)
        val attack : List<Int> = listOf(55, 99, 178)

        return Champ("카시오페아",R.drawable.cassiopeia, "석화의 응시","마나: 60/120","카시오페아가 대상을 향해 원뿔 모양의 에너지를 발사해 적중한 모든 적에게 마법 피해를 입히고 기절시킵니다. 기절한 적은 받는 피해량이 10% 증가합니다.",
                "피해량 : 275 / 400 / 2000\n" +
                        "기절 지속시간 : 2.5 / 3 / 5",4,synergy,hp,attack,0.6,2,30,20, R.drawable.cassiopeia_skill,synergy.size)

    }

    //5코스트
    fun getAzir() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getWarlord(),SynergyData().getKeeper(),SynergyData().getEmperor())
        val hp : List<Int> = listOf(950 / 1710 / 3078)
        val attack : List<Int> = listOf(70 / 126 / 227)

        return Champ("아지르",R.drawable.azir, "황제의 진영","마나: 50/125","아지르가 뒤에서 병사들을 일렬로 소환해 돌진시키며 적중한 모든 적에게 마법 피해를 입히고 4초 동안 둔화시킵니다. 아지르 근처에 있는 적은 뒤로 밀려나며, 멀리 있는 적은 2초 동안 공중에 뜹니다.",
                "돌진 피해량 : 200 / 350 / 2000",5,synergy,hp,attack,0.85,4,30,20, R.drawable.azir_skill,synergy.size)
    }

    fun getEzreal() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getElderwood(),SynergyData().getDazzler())
        val hp : List<Int> = listOf(750, 1350, 2430)
        val attack : List<Int> = listOf(80, 144, 259)

        return Champ("이즈리얼",R.drawable.ezreal, "흐름의 일격","마나: 75/150","이즈리얼이 공격 속도가 가장 빠른 적을 향해 미사일을 발사해 통과한 모든 아군의 체력을 회복하고 5초 동안 50%의 공격 속도를 부여합니다. 적들에게는 마법 피해를 입히며 5초 동안 공격 속도를 50% 감소시킵니다.",
                "피해량 : 250 / 450 / 9999\n" +
                        "회복 : 250 / 450 / 9999",5,synergy,hp,attack,0.9,4,20,20, R.drawable.ezreal_skill,synergy.size)

    }

    fun getKayn() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getTormented(),SynergyData().getShade())
        val hp : List<Int> = listOf(900, 1620, 2916)
        val attack : List<Int> = listOf(80, 144, 259)

        return Champ("케인",R.drawable.kayn, "살상돌격","마나: 0/50","케인이 대상 방향으로 돌진하며 근처 모든 적을 베어 피해를 입히고 다음 스킬의 비용을 33% 증가시킵니다. 만약 스킬이 단 한 명의 적에게만 적중하면 곧바로 다시 사용합니다. 라아스트: 살상돌격으로 입힌 피해의 50%만큼 케인의 체력을 회복합니다. 그림자 암살자: 전투 시작 후 10초 동안 살상돌격의 피해량이 75% 증가합니다.",
                "피해량 : 450 / 600 / 6666",5,synergy,hp,attack,1.0,1,40,40, R.drawable.kayn_skill,synergy.size)
    }

    fun getLeeSin() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getDivine(), SynergyData().getDuelist())
        val hp : List<Int> = listOf(1000, 1800, 3240)
        val attack : List<Int> = listOf(60, 108, 194)
        return Champ("리신",R.drawable.leesin, "신의 권","마나: 0/40","리 신이 대상에게 주먹을 휘둘러 마법 피해를 입히고 전장 끝으로 날려 버리며 수 초 동안 기절시킵니다. 날아가는 대상과 충돌하는 적들은 절반의 피해를 입고 1.5초 동안 기절합니다. 만약 더 날아갈 공간이 없을 경우, 대상은 전장 밖으로 나가며 전투에서 제외됩니다. 대상이 살아 있으면 리 신이 돌진합니다",
                "피해량 : 250 / 450 / 1000\n" +
                        "기절 지속시간 : 3 / 4 / 10",5,synergy,hp,attack,0.85,1,50,50, R.drawable.leesin_skill,synergy.size)

    }

    fun getLillia() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getDusk(),SynergyData().getMage())
        val hp : List<Int> = listOf(950 / 1710 / 3078)
        val attack : List<Int> = listOf(40 / 72 / 130)

        return Champ("릴리아",R.drawable.lillia, "감미로운 자장가","마나: 75/125","릴리아가 마법의 자장가를 연주해 현재 체력이 높은 순서로 적을 3.5초 동안 잠들게 합니다. 잠든 적은 일정량의 피해를 입으면 깨어나며 마법 피해를 추가로 입습니다.",
                "대상 수 : 2 / 3 / 10\n" +
                        "기상 피해 : 500 / 750 / 1000\n" +
                        "피해량 : 500 / 750 / 5000",5,synergy,hp,attack,0.75,2,50,80, R.drawable.lillia_skill,synergy.size)

    }

    fun getSett() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().gettheboss(),SynergyData().getBrawler())
        val hp : List<Int> = listOf(1100, 1980, 3564)
        val attack : List<Int> = listOf(60, 108, 194)


        return Champ("세트",R.drawable.sett, "대미 장식","마나: 70/175","세트가 대상을 붙잡아 앞으로 내리꽂으며 대상 최대 체력에 비례한 마법 피해를 입힙니다. 내리꽂은 지점 주변 넓은 영역 내의 모든 적은 대상 최대 체력의 %에 해당하는 피해를 입습니다." ,
                "1차 피해량 % : 35% / 45% / 400%\n" +
                        "2차 피해량 % : 20% / 30% / 200%",5,synergy,hp,attack,0.75,1,60,30, R.drawable.sett_skill,synergy.size)

    }

    fun getYone() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getExile(),SynergyData().getAdept())
        val hp : List<Int> = listOf(950, 1710, 3078)
        val attack : List<Int> = listOf(80, 144, 259)

        return Champ("요네",R.drawable.yone, "운명봉인","마나: 0/80","요네가 전방의 경로에 있는 적들을 공격해 마법 피해를 나눠서 입히고 1.5초 동안 공중에 띄웁니다. 적중한 적들에게는 죽음의 표식이 남아 방어력과 마법 저항력이 60% 감소합니다. 그리고 죽음의 표식이 남은 적이 모두 사라질 때까지 요네의 스킬이 잊히지 못한 자로 바뀝니다. 잊히지 못한 자 (20마나): 요네가 죽음의 표식이 남은 적들 중 가장 체력이 낮은 적에게 돌진해 기본 마법 피해와 대상이 잃은 체력에 비례한 추가 마법 피해를 입힙니다.",
                "피해량 : 800 / 1300 / 9999\n" +
                        "잊히지 못한 자 기본 피해량 : 250 / 400 / 1000",5,synergy,hp,attack,0.95,1,40,40, R.drawable.yone_skill,synergy.size)

    }

    fun getZilean() : Champ{
        val synergy : List<Synergy> = listOf(SynergyData().getCultist(),SynergyData().getMystic())
        val hp : List<Int> = listOf(750 / 1350 / 2430)
        val attack : List<Int> = listOf(45 / 81 / 146)

        return Champ("질리언",R.drawable.zilean, "운명의 역행","마나: 100/150","질리언이 체력이 가장 낮은 아군들에게 보호용 시간 룬을 걸어 줍니다. 아군이 사망하면 수 초 후에 일정량의 체력을 얻고 모든 해로운 효과가 사라진 상태로 부활합니다. 부활한 아군은 전투가 끝날 때까지 50%의 추가 공격 속도를 얻습니다.",

                "대상 수 : 2 / 2 / 10\n" +
                        "부활까지 걸리는 시간 : 3.5 / 3 / 1\n" +
                        "체력 회복량 : 350 / 700 / 3000",5,synergy,hp,attack,0.75,3,20,20, R.drawable.zilean_skill, synergy.size)
    }
}