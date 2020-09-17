package com.lolchess.strategy.model.data

import com.lolchess.strategy.R
import com.lolchess.strategy.model.Based_items

class Based_Data {
    fun B_F_Sword(): Based_items {
        return Based_items("B.F 대검","공격력 +15", R.drawable.sword)
    }

    fun Chain_Vest(): Based_items {
        return Based_items("쇠사슬 조끼","방어력 +25", R.drawable.vest)
    }

    fun Giant_Belt(): Based_items {
        return Based_items("거인의 허리띠","체력 +200", R.drawable.belt)
    }

    fun Needlessly_Large_Rod(): Based_items {
        return Based_items("쓸데없이 큰 지팡이","주문력 +15%", R.drawable.needlesslyrod)
    }

    fun Negatron_Cloak(): Based_items {
        return Based_items("음전자 망토","마법 저항력 +25", R.drawable.negatroncloak)
    }

    fun Recurve_Bow(): Based_items {
        return Based_items("곡궁","공격 속도 +15%", R.drawable.bow)
    }

    fun Sparring_Gloves(): Based_items {
        return Based_items("연습용 장갑","치명타 확률 +10%, 회피 확률 10%", R.drawable.gloves)
    }

    fun Tear_of_the_Goddess(): Based_items {
        return Based_items("여신의 눈물","시작 마나 +15", R.drawable.tear)
    }

    fun Spatula(): Based_items {
        return Based_items("뒤집개","특별한 능력을 얻음", R.drawable.spatula)
    }
}