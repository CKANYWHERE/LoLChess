package com.lolchess.strategy.model

data class Champ(
    val name: String //챔프 이름
    , val imgPath: Int // 챔프 이미지 경로
    , val skill: String // 챔프 스킬
    , val mana: String  //챔프 마나(시작마나/최대마나)
    , val skillDescription: String // 스킬설명
    , val skillEffect: String//스킬 효과
    , val cost: Int // 챔프 코스트
    , val synergy: List<Synergy> // 챔프 시너지
    , val hp: List<Int> // 챔프 체력 1성, 2성 ,3성 순으로 리스트에 저장
    , val attack: List<Double> // 챔프 공격력 1성, 2성, 3성 순으로 리스트에 저장
    , val attackSpeed: Double // 공격속도
    , val attackRange: Int // 공격범위
    , val shield: Int // 방어력
    , val magicShield: Int // 마법 저항력
    , val skillImg: Int //스킬 이미지 경로
    , val type: Int //챔프 뷰 타입
 ){
    companion object{
        const val TWO_TYPE_SYN = 2
        const val THREE_TYPE_SYN = 3
    }
}
