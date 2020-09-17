package com.lolchess.strategy.model.data

import com.lolchess.strategy.R
import com.lolchess.strategy.model.Combined_items

class Combined_Data {
    fun Bloodthirster(): Combined_items{
        return Combined_items("피바라기", "기본 공격시 피해량의 40%만큼 체력 회복"
                , "공격력 15, 마법 저항력 25", R.drawable.blood, R.drawable.sword, R.drawable.negatroncloak)
    }

    fun Zephar(): Combined_items{
        return Combined_items("서풍", "전투 시작 시 결투장 반대편에 회오리바람을 소환해 회오리바람과 가장 가까운 적을 5초 동안 전투에서 제외"
                , "체력 +200, 마법 저항력 +25", R.drawable.zephyr, R.drawable.belt, R.drawable.negatroncloak)
    }

    fun Bramble_Vest(): Combined_items{
        return Combined_items("덤불 조끼", "받는 치명타 공격의 추가 피해 무효화. 기본 공격에 맞을 경우 주변 모든 적에게 100 / 140 / 200 의 마법 피해 (2.5초마다 한 번씩)"
                , "방어력 +50", R.drawable.bramblevest, R. drawable.vest, R. drawable.vest)
    }

    fun Hextech_Gunblade(): Combined_items{
        return Combined_items("마법공학 총검", "스킬로 입힌 피해량의 33%만큼 체력 회복, 체력 회복 초과분이 보호막으로 전환됩니다. (최대 보호막 흡수량 400)"
                , "공격력 +15, 주문력 +15%", R.drawable.gunblade, R.drawable.sword, R.drawable.needlesslyrod)
    }

    fun Blue_Buff(): Combined_items{
        return Combined_items("푸른 파수꾼", "[고유 효과] 스킬 사용 후 20의 마나 회복"
                , "시작 마나 30", R.drawable.blue, R.drawable.tear, R.drawable.tear)
    }

    fun Ionic_Spark(): Combined_items{
        return Combined_items("이온 충격기", "2칸 내에 있는 모든 적의 마법 저항력이 40% 감소 (중첩 불가). 해당 적이 스킬 사용 시 대상 최대 마나의 225%에 해당하는 마법 피해"
                , "주문력 +15%, 마법 저항력 +25", R.drawable.ionicspark, R.drawable.needlesslyrod, R.drawable.negatroncloak)
    }

    fun Chalice_of_Power(): Combined_items{
        return Combined_items("힘의 성배", "전투 시작 끝날 때까지 장착한 챔피언과 양옆에 있는 아군의 주문력이 30 증가합니다.", "시작 마나 +15, 마법 저항력 +25"
                , R.drawable.chaliceofpower, R.drawable.tear, R.drawable.negatroncloak)
    }

    fun Runaan_Hurricane(): Combined_items{
        return Combined_items("루난의 허리케인", "기본 공격 시 주변 다른 적 하나에게 탄환을 발사하여 공격력의 75%만큼 피해를 입히고 적중 시 효과 적용(탄환에 치명타 적용, 탄환 사거리 제한 x)"
                , "공격속도 +15%, 마법 저항력 +25", R.drawable.runaan, R.drawable.bow, R.drawable.negatroncloak)
    }

    fun Hand_of_Justice(): Combined_items{
        return Combined_items("정의의 손길", "준비 단계에서 '피해량 50% 증가 효과' 또는 '기본 공격 및 스킬로 입힌 피해량의 45% 회복' 중 하나를 라운드 종료까지 획득합니다."
                , "시작 마나 +15, 치명타 확률 20%", R.drawable.justice, R.drawable.tear, R.drawable.gloves)
    }


    fun Infinity_Edge(): Combined_items{
        return Combined_items("무한의 대검", "[고유 효과] 치명타 확률 75% 증가 (기본 아이템 포함) , 치명타 확률이 100%를 넘으면 넘어가는 치명타 확률 1%마다 치명타 피해량이 1% 증가합니다."
                , "공격력 +15, 치명타 확률 +20%", R.drawable.infinity, R.drawable.sword, R.drawable.gloves)
    }


    fun Morellonomicon(): Combined_items{
        return Combined_items("모렐로노미콘", "스킬로 피해를 입히면 대상을 불태워 10초 동안 대상 최대 체력의 25%만큼 고정 피해를 입히고 그동안 모든 체력 회복 효과 50% 감소"
                , "체력 + 200, 주문력 +15%", R.drawable.morellonomicon, R.drawable.belt, R.drawable.needlesslyrod)
    }


    fun Trap_Claw(): Combined_items{
        return Combined_items("덫 발톱", "전투가 시작될 때 주문 보호막을 획득합니다. 주문보호막을 파괴한 적은 4초간 기절합니다."
                , "회피 확률 +20%, 체력 +200", R.drawable.trapclaw, R.drawable.belt, R.drawable.gloves)
    }


    fun Giant_Slayer(): Combined_items{
        return Combined_items("거인 학살자", "기본 공격 및 스킬 사용시 10%의 추가 고정 피해. 대상 현재 체력이 1750 초과 시 추가 고정 피해 90%로 증가"
                , "공격력 +15, 공격속도 +15%", R.drawable.giant, R.drawable.sword, R.drawable.bow)
    }


    fun Shroud_of_Stillness(): Combined_items{
        return Combined_items("침묵의 장막", "전투 시작 시 광선을 발사해 적중당한 적들의 최대 마나를 40% 증가시켜 첫 스킬 사용을 지연"
                , "회피 확률 +20%, 방어력 +25", R.drawable.stilness, R.drawable.gloves, R.drawable.vest)
    }


    fun Sunfire_Cape(): Combined_items{
        return Combined_items("태양불꽃 망토", "고유] 전투 시작 시 및 1초마다 2칸 내에 있는 무작위 적 하나가 불타 10초 동안 최대 체력의 25%에 해당하는 피해를 입고 체력 회복 효과 50% 감소"
                , "체력 +200, 방어력 +25", R.drawable.sunfirecape, R.drawable.belt, R.drawable.vest)
    }


    fun Statikk_Shiv(): Combined_items{
        return Combined_items("스태틱의 단검", "세 번째 기본 공격마다 3/4/5 명의 적에게 80의 마법 피해, 보호막을 가진 적이나 군중 제어 효과에 적중된 적에게 고정 피해 85를 추가로 입힙니다."
                , "시작 마나 +15, 공격속도 +15%",R.drawable.statikk,  R.drawable.tear, R.drawable.bow)
    }


    fun Spear_of_Shojin(): Combined_items{
        return Combined_items("쇼진의 창", "기본 공격당 마나 5 추가 회복"
                , "공격력 +15, 시작 마나 +15", R.drawable.shojin, R.drawable.sword, R.drawable.tear)
    }


    fun Rapid_Firecannon(): Combined_items{
        return Combined_items("고속 연사포", "공격 사거리가 +200% 증가하며 기본 공격이 반드시 적중합니다."
                , "공격속도 +30%", R.drawable.rapid, R.drawable.bow, R.drawable.bow)
    }


    fun Gargoyle(): Combined_items{
        return Combined_items("가고일의 돌갑옷", "적의 공격 대상이 되면 방어력이 12, 마법 저항력이 12 증가. 공격하는 적이 늘어나면 중첩되어 적용."
                , "방어력 +25, 마법 저항력 +25", R.drawable.gargoylestoneplate, R.drawable.vest, R.drawable.negatroncloak)
    }

    fun Guinsoo_Rageblade(): Combined_items{
        return Combined_items("구인수의 격노검", "기본 공격 시 공격 속도가 6% 증가 (무제한 중첩)"
                , "공격속도 +15%, 주문력 +15%", R.drawable.guinsoo, R.drawable.bow, R.drawable.needlesslyrod)
    }

    fun Locket_of_the_Iron_Solari(): Combined_items{
        return Combined_items("강철의 솔라리 펜던트", "전투 시작 시 장착한 유닛과 가로로 2칸 이내에 있는 모든 아군이 8초 동안 250 /300 /375의 피해를 흡수하는 보호막 획득"
                , "방어력 +25, 주문력 +15%", R.drawable.solari, R.drawable.needlesslyrod, R.drawable.vest)
    }

    fun ZzRot_Portal(): Combined_items{
        return Combined_items("즈롯", "사망 시 1500/2250/3000의 체력을 지닌 인공체가 깨어나 전투에 참여"
                , "공격속도 +15%, 체력 +200", R.drawable.zzrot, R.drawable.bow, R.drawable.belt)
    }

    fun Deathblade(): Combined_items{
        return Combined_items("죽음의 검", "적 처치 또는 처치 관여 시 전투가 끝날 때까지 공격력이 +20 증가합니다. (무제한 중첩 가능)"
                , "공격력 +30", R.drawable.deathblade, R.drawable.sword, R.drawable.sword)
    }

    fun Guardian_Angel(): Combined_items{
        return Combined_items("수호 천사", "처음 사망시 2초 동안 경직된 후 해로운 효과가 사라지고 400의 체력을 지닌 채 부활"
                , "공격력 +15, 방어력 +25", R.drawable.guardianangel, R.drawable.sword, R.drawable.vest)
    }

    fun Titan_Resolve(): Combined_items{
        return Combined_items("거인의 결의", "피해를 입거나 치명타 피해를 입힐 때마다 추가 피해량이 2%씩 증가합니다. 이 효과는 최대 50%까지 중첩됩니다. 효과가 25회 중첩되면 방어력과 마법 저항력이 25 증가하며 몸집이 커집니다. 효과는 매 라운드 초기화됩니다."
                , "공격속도 +15%, 방어력 +25", R.drawable.titan, R.drawable.bow, R.drawable.vest)
    }

    fun Thief_gloves(): Combined_items{
        return Combined_items("도적의 장갑", "라운드 시작 시 임시 아이템 2개가 추가로 장착됩니다. 임시 아이템 2개의 등급은 플레이어 레벨에 따라 달라집니다. [아이템 슬롯 3칸 소모]"
                , "회피 확률 +20%, 치명타 확률 +20%", R.drawable.thief, R.drawable.gloves, R.drawable.gloves)
    }

    fun Warmog_Armor(): Combined_items{
        return Combined_items("워모그의 갑옷", "체력 +600 증가"
                , "체력 +400", R.drawable.warmog, R.drawable.belt, R.drawable.belt)
    }

    fun Zeke_Herald(): Combined_items{
        return Combined_items("지크의 전령", "전투 시작 시 장착한 챔피언과 가로로 1칸 안에 있는 아군의 공격 속도가 남은 전투 시간 동안 +30% 증가"
                , "공격력 +15, 체력 +200", R.drawable.zeke, R.drawable.sword, R.drawable.belt)
    }

    fun Redemption(): Combined_items{
        return Combined_items("구원", "사망 시 아군의 체력 800 회복"
                , "시작 마나 +15, 체력 +200", R.drawable.redemption, R.drawable.tear, R.drawable.belt)
    }

    fun Rabadon_Deathcap(): Combined_items{
        return Combined_items("라바돈의 죽음모자", "주문력 +40%"
                , "주문력 +30%", R.drawable.rabadon, R.drawable.needlesslyrod, R.drawable.needlesslyrod)
    }

    fun Quicksilver(): Combined_items{
        return Combined_items("수은", "[고유 효과] 전투 시작 후 처음 12초 동안 군중 제어 효과에 면역"
                , "회피 확률 +20%, 마법 저항력 +25", R.drawable.quicksilver, R.drawable.gloves, R.drawable.negatroncloak)
    }
    fun Last_Whisper(): Combined_items{
        return Combined_items("최후의 속삭임", "치명타 공격 시 3초 동안 적의 방어력을 75% 감소시킵니다. 이 효과는 중첩되지 않습니다."
                , "치명타 확률 +20%, 공격속도 +15%", R.drawable.lastwhisper, R.drawable.bow, R.drawable.gloves)
    }

    fun Jeweled_Gauntlet(): Combined_items{
        return Combined_items("보석 건틀릿", "스킬에 치명타가 적용될 수 있으며 치명타 피해량이 +50% 증가합니다."
                , "주문력 +15%, 치명타 확률 +20%", R.drawable.jeweled, R.drawable.needlesslyrod, R.drawable.gloves)
    }

    fun Luden_Echo(): Combined_items{
        return Combined_items("루덴의 메아리", "스킬 사용 시 처음 마법 피해를 입은 적과 주변에 있는 최대 3명의 적에게 180의 추가 마법 피해"
                , "시작 마나 +15, 주문력 +15%", R.drawable.luden, R.drawable.needlesslyrod, R.drawable.tear)
    }
    fun Frozen_Heart(): Combined_items{
        return Combined_items("얼어붙은 심장", "주변 적의 공격 속도 50% 감소. 보유한 두 번째 얼어붙은 심장 1개마다 효과 반경 증가"
                , "시작 마나 +15, 방어력 +25", R.drawable.frozenheart, R.drawable.tear, R.drawable.vest)
    }

    fun Dragon_Claw(): Combined_items{
        return Combined_items("용의 발톱", "받는 마법 피해 60% 감소"
                , "마법 저항력 +50", R.drawable.dragonsclaw, R.drawable.negatroncloak, R.drawable.negatroncloak)
    }

    fun Sword_Of_the_Divine(): Combined_items{
        return Combined_items("신성의 검", "[고유] 장착시 신성 특성 획득"
                , "공격력 +15", R.drawable.swordofthedivine, R.drawable.spatula, R.drawable.sword)
    }

    fun Vanguards_Cuirass(): Combined_items{
        return Combined_items("수호자의 흉갑", "[고유] 장착 시 선봉대 특성 획득"
                , "방어력 +25", R.drawable.vanguardscuirass, R.drawable.spatula, R.drawable.vest)
    }

    fun Force_of_Nature(): Combined_items{
        return Combined_items("대자연의 힘", "아군의 최대 팀 규모 +1 증가"
                , "", R.drawable.forceofnature, R.drawable.spatula, R.drawable.spatula)
    }

    fun Mantle_of_Dusk(): Combined_items{
        return Combined_items("황혼의 성위", "[고유] 장착 시 황혼 특성 획득"
                , "주문력 +15%", R.drawable.mantleofdusk, R.drawable.spatula, R.drawable.needlesslyrod)
    }

    fun Elderwood_Heirloom(): Combined_items{
        return Combined_items("나무정령 새싹", "[고유] 장착 시 나무정령 특성 획득"
                , "마법 저항력 +25", R.drawable.elderwoodheirloom, R.drawable.spatula, R.drawable.negatroncloak)
    }

    fun Duelists_Zeal(): Combined_items{
        return Combined_items("결투가의 열정", "[고유] 장착 시 결투가 특성 획득"
                , "공격속도 +15", R.drawable.duelistszeal, R.drawable.spatula, R.drawable.bow)
    }


    fun Youmuus_Ghostblade(): Combined_items{
        return Combined_items("요우무의 유령검", "[고유] 장착 시 암살자 특성 획득"
                , "치명타 확률 +10%, 회피 확률 + 10%", R.drawable.youmuushgostblade, R.drawable.gloves, R.drawable.spatula)
    }


    fun Mages_Cap(): Combined_items{
        return Combined_items("수호자의 흉갑", "[고유] 장착 시 요술사 특성 획득"
                , "시작 마나 +15", R.drawable.magescap, R.drawable.spatula, R.drawable.tear)
    }

    fun Warlords_Banner(): Combined_items{
        return Combined_items("대장군의 깃발", "[고유] 장착 시 대장군 특성 획득"
                , "체력 +200", R.drawable.warlordsbanner, R.drawable.spatula, R.drawable.belt)
    }

    fun blank(): Combined_items{
        return Combined_items("", ""
            , "", R.drawable.blank,0,0)
    }



}