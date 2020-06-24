package com.lolchess.strategy.model.data

import com.lolchess.strategy.R
import com.lolchess.strategy.model.Synergy

class SynergyData {
    fun getBlaster() : Synergy{
        val description : String = "총잡이는 네 번째 기본 공격마다 무작위 적에게 추가 공격을 가합니다. 추가 공격은 기본 공격 시의 피해를 입히며 적중 시 효과가 적용됩니다."
        val option : List<String> = listOf("② 추가 공격 3회", "④ 추가 공격 6회")
        val level : List<Int> = listOf(2,4)
        return Synergy("총잡이", R.drawable.blaster,description, option, level)

    }

    fun getSpacePirate() : Synergy{
        val description : String = "우주 해적 챔피언이 마무리 일격 시 일정 확률로 아이템이 추가로 떨어집니다."
        val option : List<String> = listOf("② 50% 확률로 1골드 획득", "④ 25% 확률로 기본 아이템 획득")
        val level : List<Int> = listOf(2,4)

        return Synergy("우주해적",R.drawable.spacepirate,description, option, level)

    }

    fun getDarkStar(): Synergy{
        val description : String = "아군 챔피언이 죽으면 모든 아군 암흑의 별 챔피언의 공격력 및 주문력이 증가합니다."
        val option : List<String> = listOf("② 공격력 및 주문력 +8", "④ 공격력 및 주문력 +16", "⑥ 공격력 및 주문력 +24", "⑧ 공격력 및 주문력 +32")
        val level: List<Int> = listOf(2, 4, 6, 8)

        return Synergy("암흑의 별", R.drawable.darkstar,description, option, level)

    }

    fun getProtector(): Synergy{
        val description : String = "수호자는 스킬을 사용할 때 마다 4초 동안 보호막을 얻습니다. 이 보호막은 중첩되지 않습니다."
        val option : List<String> = listOf("② 최대 체력의 30%만큼 보호막", "④ 최대 체력의 40%만큼 보호막", "⑥ 최대 체력의 55%만큼 보호막")
        val level: List<Int> = listOf(2, 4, 6)

        return Synergy("수호자", R.drawable.protector,description, option, level)

    }


    fun getStarGuardian(): Synergy{
        val description : String = "별 수호자는 스킬 사용 시 다른 별 수호자들에게 마나를 부여합니다. (서로 적용)"
        val option : List<String> = listOf("③ 총 마나 25", "⑥ 총 마나 40", "⑨ 총 마나 55")
        val level: List<Int> = listOf(3, 6, 9)
        return Synergy("별 수호자", R.drawable.starguardian,description, option, level)

    }

    fun getVanguard(): Synergy{
        val description : String = "선봉대 챔피언은 추가 방어력을 얻습니다."
        val option : List<String> = listOf("② 방어력 125", "④ 방어력 300", "⑥ 방어력 1000")
        val level: List<Int> = listOf(2, 4, 6)
        return Synergy("선봉대", R.drawable.vanguard,description, option, level)

    }

    fun getBladmaster(): Synergy{
        val description : String = "검사는 기본 공격 시 일정 확률로 대상에게 두 번의 추가 공격을 가합니다. 추가 공격은 기본 공격 시의 피해를 입히며 적중 시 효과가 적용됩니다."
        val option : List<String> = listOf("③ 추가 공격 확률 30%", "⑥ 추가 공격 확률 70%", "⑨ 추가 공격 확률 100%")
        val level: List<Int> = listOf(3, 6, 9)

        return Synergy("검사", R.drawable.blademaster,description, option, level)

    }

    fun getCelestial(): Synergy{
        val description : String = "모든 아군이 자신이 가한 피해량의 일부만큼 체력을 회복합니다."
        val option : List<String> = listOf("② 회복량 15%", "④ 회복량 40%", "⑥ 회복량 99%")
        val level: List<Int> = listOf(2, 4, 6)

        return Synergy("천상", R.drawable.celestial,description, option, level)

    }

    fun getChrono(): Synergy{
        val description : String = "모든 아군의 공격 속도가 수 초마다 15% 증가합니다."

        val option : List<String> = listOf("② 8초", "④ 3.5초", "⑥ 1.5초", "⑧ 0,75초")
        val level: List<Int> = listOf(2, 4, 6, 8)
        return Synergy("시공간", R.drawable.chrono,description, option, level)

    }

   fun getSorcerer(): Synergy{
       val description : String = "모든 아군의 주문력이 증가합니다"
        val option : List<String> = listOf("② 주문력 20%", "④ 주문력 45%", "⑥ 주문력 75%")
        val level: List<Int> = listOf(2, 4, 6)
        return Synergy("마법사", R.drawable.sorcerer,description, option, level)

    }

    fun getSniper(): Synergy{
        val description : String = "저격수와 대상 사이에 놓인 칸 하나당 해당 저격수가 입히는 피해량이 증가합니다."
        val option : List<String> = listOf("② 한 칸당 피해량 10% 증가", "④ 한 칸당 피해량 18% 증가")
        val level: List<Int> = listOf(2, 4)

        return Synergy("저격수", R.drawable.sniper,description, option, level)

    }

    fun getCybernetic(): Synergy{
        val description : String = "사이버네틱 챔피언은 하나 이상의 아이템을 장착하면 체력과 공격력을 얻습니다."
        val option : List<String> = listOf("③ 체력 350 및 공격력 40", "⑥ 체력 600 및 공격력 80")
        val level: List<Int> = listOf(3, 6)

        return Synergy("사이버네틱", R.drawable.cybernetic,description, option, level)

    }

    fun getBrawler(): Synergy{
        val description : String = "싸움꾼은 추가 최대 체력을 얻습니다."
        val option : List<String> = listOf("② 추가 체력 350", "④ 추가 체력 600")
        val level: List<Int> = listOf(2, 4)

        return Synergy("싸움꾼", R.drawable.brawler,description, option, level)

    }

    fun getRebel(): Synergy{
        val description : String = "전투 시작 시 반군은 주변에 있는 반군의 수에 따라 보호막을 얻고 입히는 피해량이 증가합니다."
        val option : List<String> = listOf("③ 보호막 150 및 피해량 10%", "⑥ 보호막 210 및 피해량 12%",  "⑨ 보호막 330 및 피해량 15%")
        val level: List<Int> = listOf(3, 6, 9)

        return Synergy("반군", R.drawable.rebel ,description, option, level)

    }

    fun getBattlecast(): Synergy{
        val description : String = "전투 기계 챔피언은 피해를 10회 입히거나 입으면 현재 체력에 따라 추가 효과를 적용받습니다. 체력이 절반 이상인 경우 가장 가까운 적에게 마법 피해를 입힙니다. 체력이 절반 이하인 경우 체력을 회복합니다."
        val option : List<String> = listOf("② 회복량 75 / 피해량 75", "④ 회복량 160/ 피해량 160",  "⑥ 회복량 325 / 피해량 325", "⑧ 회복량 600 / 피해량 600")
        val level: List<Int> = listOf(2, 4, 6, 8)
        return Synergy("전투기계", R.drawable.battlecast,description, option, level)

    }

    fun getDemolitionist(): Synergy{
        val description : String = "② 폭파광에게 스킬 피해를 입은 대상은 1.50초 동안 기절합니다. (스킬 사용당 1회)"
        val option : List<String> = listOf("")
        val level: List<Int> = listOf(2)

        return Synergy("폭파광", R.drawable.demolitionist,description, option, level)

    }

    fun getInfiltrator(): Synergy{
        val description : String = "고유: 전투 시작 시 잠입자는 적의 후방으로 이동합니다. 전투 시작 시 잠입자의 공격 속도가 6초 동안 증가하며 처치 관여 시 초기화됩니다."
        val option : List<String> = listOf("② 추가 공격 속도 40%", "④ 추가 공격 속도 70%", "⑥ 추가 공격 속도 120%")
        val level: List<Int> = listOf(2, 4, 6)

        return Synergy("잠입자", R.drawable.infiltrator,description, option, level)

    }

    fun getManaReaver(): Synergy{
        val description : String = "② 마나 약탈자의 공격이 대상의 다음 스킬 마나 소모량을 40% 증가시킵니다."
        val option : List<String> = listOf("")
        val level: List<Int> = listOf(2)

        return Synergy("마나 약탈자", R.drawable.manareaver,description, option, level)

    }

    fun getMechPilot(): Synergy{
        val description : String = "③ 전투 시작 시 무작위 메카 파일럿 챔피언 셋이 슈퍼 메카로 합체"
        val option : List<String> = listOf("")
        val level: List<Int> = listOf(3)

        return Synergy("메카 파일럿", R.drawable.mechpilot,description, option, level)

    }

    fun getAstro(): Synergy{
        val description : String = "③ 우주비행사 챔피언의 마나 소모량이 30만큼 감소합니다."
        val option : List<String> = listOf("")
        val level: List<Int> = listOf(3)

        return Synergy("우주비행사", R.drawable.astro,description, option, level)

    }

    fun getMystic(): Synergy{
        val description : String = "모든 아군이 마법 저항력을 얻습니다."
        val option : List<String> = listOf("② 마법 저항력 50", "④ 마법 저항력 125")
        val level: List<Int> = listOf(2, 4)

        return Synergy("신비술사", R.drawable.mystic, description, option, level)

    }

    fun getMercenary(): Synergy{
        val description : String = "① 고유: 용병은 상점에서 스킬을 업그레이드 할 수 있습니다."
        val option : List<String> = listOf("")
        val level: List<Int> = listOf(1)

        return Synergy("용병", R.drawable.mercenary, description, option, level)

    }

    fun getStarship(): Synergy{
        val description : String = "① 고유: 우주선은 매초 마나를 40씩 획득하며 전장 주위를 돕니다. 이동 방해 효과에 면역이지만, 기본 공격은 할 수 없습니다."
        val option : List<String> = listOf("")
        val level: List<Int> = listOf(1)

        return Synergy("우주선", R.drawable.starship, description, option, level)

    }

    fun getParagon(): Synergy{
        val description : String = "① 아군 별 수호자의 기본 공격이 입히는 피해가 고정 피해로 전환됩니다. 다른 아군은 기본 공격이 입히는 피해가 마법 피해로 전환됩니다."
        val option : List<String> = listOf("")
        val level: List<Int> = listOf(1)

        return Synergy("인도자", R.drawable.paragon, description, option, level)

    }




}