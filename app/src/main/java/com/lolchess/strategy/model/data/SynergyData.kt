package com.lolchess.strategy.model.data

import com.lolchess.strategy.R
import com.lolchess.strategy.model.Synergy

class SynergyData {
    fun getCultist() : Synergy{
        val description : String = "아군이 50%의 체력을 잃으면 갈리오가 나타나 가장 많은 적이 모여 있는 지점에 착지해 적들을 공중에 띄웁니다."
        val option : List<String> = listOf("③ 폭군 갈리오", "⑥ 악마의 군주 갈리오", "⑨ 절대 지배자 갈리오")
        val level : List<Int> = listOf(3,6,9)
        return Synergy("광신도", R.drawable.cultist,description, option, level)

    }

    fun getDivine() : Synergy{
        val description : String = "6회 공격하거나 체력이 50% 이하가 되면 신성 챔피언이 초월하여 전투가 끝날 때까지 받는 피해량이 25% 감소하고 추가 고정 피해를 입힙니다."
        val option : List<String> = listOf("② 추가 고정 피해 20%", "④ 추가 고정 피해 40%", "⑥ 추가 고정 피해 65%", "⑧ 추가 고정 피해 100%")
        val level : List<Int> = listOf(2,4,6,8)

        return Synergy("신성",R.drawable.divine,description, option, level)

    }

    fun getDusk(): Synergy{
        val description : String = "황혼 챔피언은 모든 아군의 주문력을 증가시킵니다."
        val option : List<String> = listOf("② 모든 아군의 주문력이 20% 증가", "④ 황혼 챔피언의 주문력이 추가로 50% 증가", "⑥ 모든 아군의 주문력이 50%, 황혼 챔피언의 주문력이 추가로 75% 증가")
        val level: List<Int> = listOf(2, 4, 6, 8)

        return Synergy("황혼", R.drawable.dusk,description, option, level)

    }

    fun getEnlightened(): Synergy{
        val description : String = "선지자는 마나를 추가로 회복합니다."
        val option : List<String> = listOf("② 마나 회복 40% 증가", "④ 마나 회복 70% 증가", "⑥ 마나 회복 100% 증가")
        val level: List<Int> = listOf(2, 4, 6)

        return Synergy("선지자", R.drawable.enlightened,description, option, level)

    }


    fun getElderwood(): Synergy{
        val description : String = "2초마다 모든 나무정령 챔피언이 자라나며 추가 능력치를 얻습니다. 이 효과는 최대 5번까지 중첩됩니다."
        val option : List<String> = listOf("③ 방어력 및 마법 저항력 15, 공격력 및 주문력 5", "⑥ 방어력 및 마법 저항력 25, 공격력 및 주문력 10", "⑨ 방어력 및 마법 저항력 40, 공격력 및 주문력 20")
        val level: List<Int> = listOf(3, 6, 9)
        return Synergy("나무정령", R.drawable.elderwood,description, option, level)

    }

    fun getExile(): Synergy{
        val description : String = "전투 시작시 추방자 주변에 아군이 없다면, 다음 효과를 얻습니다."
        val option : List<String> = listOf("① 최대 체력의 50%에 해당하는 피해를 흡수하는 보호막", "② 생명력 흡수 80%")
        val level: List<Int> = listOf(1, 2)

        return Synergy("추방자", R.drawable.exile,description, option, level)

    }

    fun getFortune(): Synergy{
        val description : String = ""
        val option : List<String> = listOf("③ 플레이어를 상대로 전투에서 승리하면 추가 구체를 얻습니다. 구체를 얻지 못한 라운드가 많을수록 더 큰 보상을 획득합니다!", "⑥ 승리시 희귀한 전리품이 포함된 구체 1개를 추가로 얻습니다.")
        val level: List<Int> = listOf(3, 6)

        return Synergy("행운", R.drawable.fortune,description, option, level)

    }

    fun getMoonlight(): Synergy{
        val description : String = "전투 시작 시 별 등급이 가장 낮은 달빛 챔피언의 별 등급이 전투가 끝날 때까지 한 단계 상승합니다. (등급이 같을 경우 아이템이 가장 많은 챔피언의 등급이 상승합니다.)"
        val option : List<String> = listOf("")
        val level: List<Int> = listOf(3)
        return Synergy("달빛", R.drawable.moonlight,description, option, level)

    }

   fun getNinja(): Synergy{
       val description : String = "닌자는 추가 공격력과 주문력을 얻습니다. 이 특성은 닌자가 정확히 하나 또는 각기 다른 닌자가 넷 있을 때 활성화됩니다."
        val option : List<String> = listOf("① 닌자 유닛 공격력 및 주문력 +50", "④ 모든 닌자 유닛 공격력 및 주문력 +120")
        val level: List<Int> = listOf(1, 4)
        return Synergy("닌자", R.drawable.ninja,description, option, level)

    }

    fun getSpirit(): Synergy{
        val description : String = "영혼이 처음 스킬을 사용하면 해당 스킬 마나 소모량에 비례해 모든 아군의 공격 속도가 증가합니다."
        val option : List<String> = listOf("② 마나 소모량의 35%", "④ 마나 소모량의 90%")
        val level: List<Int> = listOf(2, 4)

        return Synergy("영혼", R.drawable.spirit,description, option, level)

    }

    fun gettheboss(): Synergy{
        val description : String = "우두머리의 체력이 처음으로 40% 이하로 내려가면, 전투에서 벗어나 윗몸일으키기를 합니다. 윗몸일으키기를 할 때마다 최대 체력의 15%를 회복하고 공격속도와 이동속도가 40% 증가합니다. 체력을 모두 회복하면 강화된 상태로 전투에 복귀하며, 기본 공격과 스킬이 고정 피해를 입힙니다. 모든 아군이 처치되면 전투에 즉시 복귀합니다"
        val option : List<String> = listOf("")
        val level: List<Int> = listOf(1)

        return Synergy("사이버네틱", R.drawable.theboss,description, option, level)

    }

    fun getTormented(): Synergy{
        val description : String = "번뇌 챔피언은 전투에 3번 참여하면 변신해 스킬을 강화할 수 있습니다."
        val option : List<String> = listOf("")
        val level: List<Int> = listOf(1)
        return Synergy("번뇌", R.drawable.tormented,description, option, level)

    }

    fun getWarlord(): Synergy{
        val description : String = "대장군은 추가 체력 및 주문력을 얻습니다. 전투에 참여해 승리할 때마다 추가 능력치가 10% 증가합니다. 이 효과는 최대 5번까지 중첩됩니다."
        val option : List<String> = listOf("③ 체력 +200, 주문력 +20", "⑥ 체력 +450, 주문력 +40",  "⑨ 체력 +700, 주문력 +70")
        val level: List<Int> = listOf(3, 6, 9)

        return Synergy("대장군", R.drawable.warlord ,description, option, level)

    }

    fun getAdept(): Synergy{
        val description : String = "전투 시작 시 조율자는 전투의 흐름을 진정시켜 몇 초 동안 모든 적의 공격 속도를 50% 감소시킵니다."
        val option : List<String> = listOf("② 전투 시작 후 2초", "③ 전투 시작 후 3초",  "④ 전투 시작 후 5초")
        val level: List<Int> = listOf(2, 3, 4)
        return Synergy("조율자", R.drawable.adept,description, option, level)

    }

    fun getAssassin(): Synergy{
        val description : String = "고유: 전투 시작 시 암살자는 적의 후방으로 도약합니다. 암살자는 추가 치명타 피해량과 확률을 획득하며, 스킬에 치명타가 적용될 수 있습니다."
        val option : List<String> = listOf("② 치명타 피해량 +30% , 치명타 확률 +10%", "④ 치명타 피해량 +60% , 치명타 확률 +25%" , "⑥ 치명타 피해량 +90% , 치명타 확률 +40%")
        val level: List<Int> = listOf(2,4,6)

        return Synergy("암살자", R.drawable.assassin,description, option, level)

    }

    fun getBrawler(): Synergy{
        val description : String = "싸움꾼은 추가 최대 체력을 얻습니다."
        val option : List<String> = listOf("② 체력 +400", "④ 체력 +800", "⑥ 체력 +1200", "⑧ 체력 +1800")
        val level: List<Int> = listOf(2, 4,6,8)

        return Synergy("싸움꾼", R.drawable.brawler,description, option, level)

    }

    fun getDazzler(): Synergy{
        val description : String = "현혹술사의 스킬은 적의 공격력을 몇 초 동안 50% 감소시킵니다."
        val option : List<String> = listOf("② 5초 동안 공격력 감소", "④ 15초 동안 공격력 감소")
        val level: List<Int> = listOf(2, 4)

        return Synergy("현혹술사", R.drawable.dazzler,description, option, level)

    }

    fun getDuelist(): Synergy{
        val description : String = "고유: 결투가는 추가 이동 속도를 얻습니다. 결투가는 기본 공격할 때마다 공격 속도가 증가합니다. 이 효과는 최대 8번까지 중첩됩니다."
        val option : List<String> = listOf("② 중첩당 공격 속도 +12%", "④ 중첩당 공격 속도 +20%", "⑥ 중첩당 공격 속도 +35%", "⑧ 중첩당 공격 속도 +60%")
        val level: List<Int> = listOf(2,4,6,8)

        return Synergy("결투가", R.drawable.duelist,description, option, level)

    }

    fun getEmperor(): Synergy{
        val description : String = "황제는 전장의 원하는 위치에 2명의 모래 병사를 배치합니다. 모래 병사는 움직이거나 공격할 수 없으며, 황제가 처치되면 사라집니다."
        val option : List<String> = listOf("")
        val level: List<Int> = listOf(1)

        return Synergy("황제", R.drawable.emperor,description, option, level)

    }

    fun getHunter(): Synergy{
        val description : String = "몇 초마다 모든 사냥꾼은 남은 체력 비율이 가장 낮은 적을 공격해 추가 피해를 입힙니다."
        val option : List<String> = listOf("② 3.5초 마다 175%의 피해","④ 3초 마다 175%의 피해","⑥ 2.5초 마다 175%의 피해","⑧ 2초 마다 175%의 피해")
        val level: List<Int> = listOf(2, 4, 6, 8)

        return Synergy("사냥꾼", R.drawable.hunter,description, option, level)

    }

    fun getKeeper(): Synergy{
        val description : String = "전투 시작 시 귀감 챔피언은 자신과 주변의 모든 아군에게 8초 동안 보호막을 부여합니다. 귀감 챔피언에게 적용된 보호막은 50% 더 많은 피해를 흡수합니다."
        val option : List<String> = listOf("② 보호막 175","④ 보호막 250","⑥ 보호막 325")
        val level: List<Int> = listOf(2, 4,6)

        return Synergy("귀감", R.drawable.keeper, description, option, level)

    }



    fun getMage(): Synergy{
        val description : String = "요술사는 스킬을 두 번 사용하고 주문력이 조정됩니다."
        val option : List<String> = listOf("③ 모든 요술사 주문력 총합의 70%", "⑥ 모든 요술사 주문력 총합의 110%", "⑨ 모든 요술사 주문력 총합의 180%")
        val level: List<Int> = listOf(3, 6, 9)

        return Synergy("요술사", R.drawable.mage, description, option, level)

    }

    fun getMystic(): Synergy{
        val description : String = "모든 아군이 마법 저항력을 얻습니다."
        val option : List<String> = listOf("② 마법 저항력 35", "④ 마법 저항력 95","⑥ 마법 저항력 175")
        val level: List<Int> = listOf(2, 4, 6)

        return Synergy("신비술사", R.drawable.mystic, description, option, level)

    }

    fun getShade(): Synergy{
        val description : String = "고유: 전투 시작 시 그림자는 적의 후방으로 순간이동합니다. 세 번째 공격마다 그림자 속으로 숨어 투명 상태가 되고 다음 기본 공격으로 추가 마법 피해를 입힙니다."
        val option : List<String> = listOf("② 추가 피해량 100", "③ 추가 피해량 325", "④ 추가 피해량 650")
        val level: List<Int> = listOf(2, 3, 4)

        return Synergy("그림자", R.drawable.shade, description, option, level)

    }

    fun getSharpShooter(): Synergy{
        val description : String = "명사수의 기본 공격 및 스킬은 주변 적들에게 튕기며 감소된 피해를 입힙니다."
        val option : List<String> = listOf("② 1회 튕기며 65% 감소된 피해", "④ 2회 튕기며 50% 감소된 피해", "⑥ 3회 튕기며 35% 감소된 피해")
        val level: List<Int> = listOf(2, 4, 6)

        return Synergy("명사수", R.drawable.sharpshooter, description, option, level)

    }

    fun getVanguard(): Synergy{
        val description : String = "선봉대 챔피언은 추가 방어력을 얻습니다."
        val option : List<String> = listOf("② 방어력 100", "④ 방어력 200", "⑥ 방어력 500")
        val level: List<Int> = listOf(2, 4, 6)

        return Synergy("선봉대", R.drawable.vanguard, description, option, level)

    }




}