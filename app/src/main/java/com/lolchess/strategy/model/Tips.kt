package com.lolchess.strategy.model

data class Tips(val name: String, //팁 제목
                val imgPath1: Int, //팁 이미지1
                val imgPath2: Int, //팁 이미지2
                val context1: String, //팁 내용1
                val context2: String, //팁 내용2
                val context3: String, //팁 내용3
                val subText: String //카드뷰 텍스트
)