package com.lolchess.strategy.model

data class Combined_items(val name: String, //템 이름
                          val effect: String, //템 효과
                          val status: String,   //템 기본 스탯
                          val imgPath: Int,    //템 이미지 경로
                          val based_item1: Int, //하위 템 이미지 경로1
                          val based_item2: Int //하위 템 이미지 경로2
                           )