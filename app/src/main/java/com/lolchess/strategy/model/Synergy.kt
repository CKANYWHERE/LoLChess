package com.lolchess.strategy.model

data class Synergy (val name : String //시너지 이름
                    , val imgPath : String //시너지 이미지 경로
                    , val optionByLevel : List<Map<Int, String>> // 시너지 레벨당 설명 ex) 2 , 50% 확률로 1골드 획득 => 리스트 형태로 저
                    )