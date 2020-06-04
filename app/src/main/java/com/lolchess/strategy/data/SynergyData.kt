package com.lolchess.strategy.data

import com.lolchess.strategy.model.Synergy

class SynergyData {
    fun getBlaster() : Synergy{
        val option : List<String> = listOf("추가 공격 3회", "추가 공격 5회")
        val level : List<Int> = listOf(2,4)
        return Synergy("총잡이","이미지경로", option, level)
    }

    fun getSpacePirate() : Synergy{
        val option : List<String> = listOf("50% 확률로 1골드 획득", "50% 확률로 1골드 획득 및 25% 확률로 기본 아이템 획득")
        val level : List<Int> = listOf(2,4)
        return Synergy("우주해적","이미지경로", option, level)
    }

    fun getDarkStar(): Synergy{
        val option : List<String> = listOf("공격력 및 주문력 +20", " 공격력 및 주문력 +25", "공격력 및 주문력 +35")
        val level: List<Int> = listOf(3, 6, 9)
        return Synergy("암흑의 별", "이미지경로", option, level)
    }

    fun getProtector(): Synergy{
        val option : List<String> = listOf("최대 체력의 25%만큼 보호막", "최대 체력의 30%만큼 보호막", "최대 체력의 40%만큼 보호막")
        val level: List<Int> = listOf(2, 4, 6)
        return Synergy("수호자", "이미지경로", option, level)
    }


    fun getStarGuardian(): Synergy{
        val option : List<String> = listOf("총 마나 30", "총 마나 50")
        val level: List<Int> = listOf(3, 6)
        return Synergy("별 수호자", "이미지경로", option, level)
    }

    fun getVanguard(): Synergy{
        val option : List<String> = listOf(" 방어력 125", "방어력 250")
        val level: List<Int> = listOf(2, 4)
        return Synergy("선봉대", "이미지경로", option, level)
    }

    fun getBladmaster(): Synergy{
        val option : List<String> = listOf("추가 공격 확률 30%", "추가 공격 확률 55%", "추가 공격 확률 100%")
        val level: List<Int> = listOf(3, 6, 9)
        return Synergy("검사", "이미지경로", option, level)
    }

    fun getCelestial(): Synergy{
        val option : List<String> = listOf("회복량 15%", "회복량 35%", "회복량 60%")
        val level: List<Int> = listOf(2, 4, 6)
        return Synergy("천상", "이미지경로", option, level)
    }

    fun getChrono(): Synergy{
        val option : List<String> = listOf("8초마다 공격속도 증가", "3.5초마다 공격속도 증가", "1.5초마다 공격속도 증가")
        val level: List<Int> = listOf(2, 4, 6)
        return Synergy("시공간", "이미지경로", option, level)
    }

   fun getSorcerer(): Synergy{
        val option : List<String> = listOf("주문력 20%", "주문력 40%", "주문력 75%", "주문력 120%")
        val level: List<Int> = listOf(2, 4, 6, 8)
        return Synergy("마법사", "이미지경로", option, level)
    }

    fun getSniper(): Synergy{
        val option : List<String> = listOf("저격수와 대상 사이에 놓인 칸 하나당 해당 저격수가 입히는 피해량이 15% 증가합니다.")
        val level: List<Int> = listOf(2)
        return Synergy("저격수", "이미지경로", option, level)
    }

    fun getCybernetic(): Synergy{
        val option : List<String> = listOf("체력 350 및 공격력 50", "체력 600 및 공격력 90")
        val level: List<Int> = listOf(3, 6)
        return Synergy("사이버네틱", "이미지경로", option, level)
    }

    fun getBrawler(): Synergy{
        val option : List<String> = listOf("추가 체력 350", "추가 체력 600")
        val level: List<Int> = listOf(2, 4)
        return Synergy("싸움꾼", "이미지경로", option, level)
    }

    fun getRebel(): Synergy{
        val option : List<String> = listOf("보호막 150 및 피해량 10%", "보호막 210 및 피해량 12%",  "보호막 330 및 피해량 15%")
        val level: List<Int> = listOf(3, 6, 9)
        return Synergy("반군", "이미지경로", option, level)
    }

    fun getBattlecast(): Synergy{
        val option : List<String> = listOf("회복량 75 / 피해량 75", " 회복량 150/ 피해량 150",  "회복량 250 / 피해량 250")
        val level: List<Int> = listOf(2, 4, 6)
        return Synergy("전투기계", "이미지경로", option, level)
    }

    fun getDemolitionist(): Synergy{
        val option : List<String> = listOf("폭파광에게 스킬 피해를 입은 대상은 1.50초 동안 기절합니다. (스킬 사용당 1회)")
        val level: List<Int> = listOf(2)
        return Synergy("폭파광", "이미지경로", option, level)
    }

    fun getInfiltrator(): Synergy{
        val option : List<String> = listOf("추가 공격 속도 40%", "추가 공격 속도 70%", "추가 공격 속도 120%")
        val level: List<Int> = listOf(2, 4, 6)
        return Synergy("잠입자", "이미지경로", option, level)
    }

    fun getMana_Reaver(): Synergy{
        val option : List<String> = listOf("마나 약탈자의 공격이 대상의 다음 스킬 마나 소모량을 40% 증가시킵니다.")
        val level: List<Int> = listOf(2)
        return Synergy("마나 약탈자", "이미지경로", option, level)
    }

    fun getMechPilot(): Synergy{
        val option : List<String> = listOf("전투 시작 시 무작위 메카 파일럿 챔피언 셋이 슈퍼 메카로 합체")
        val level: List<Int> = listOf(3)
        return Synergy("메카 파일럿", "이미지경로", option, level)
    }

    fun getAstro(): Synergy{
        val option : List<String> = listOf("우주비행사 챔피언의 마나 소모량이 30만큼 감소합니다.")
        val level: List<Int> = listOf(3)
        return Synergy("우주비행사", "이미지경로", option, level)
    }



}