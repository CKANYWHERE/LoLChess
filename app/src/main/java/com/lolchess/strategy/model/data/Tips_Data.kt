package com.lolchess.strategy.model.data

import com.lolchess.strategy.R
import com.lolchess.strategy.model.Based_items
import com.lolchess.strategy.model.Tips

class Tips_Data {
    fun tips_7_11(): Tips {
        return Tips("기본 배치 팁",R.drawable.lolchess_map, R.drawable.lolchess_map, "PC라면 q와 r을 통해 주기적으로 정찰을 해줍니다. (순위가 아니라 맵의 시계, 반시계 방향으로 돕니다)\n" +
                "정찰을 하면서 자신이 다음에 만날 유저가 누구일지 예측하고 그에 맞게 배치를 해야 합니다.", "위 사진처럼 크립라운드(유저가 아닌 ai몹을 잡는 라운드)까지 5명을 만났으니, 다음에는 나머지 2명을 만날 확률이 아주 높습니다.\n" +
                "간혹 순서가 다 안 돌았는데도 만나는 경우도 있음!", "")
    }
    fun tips_7_12(): Tips {
        return Tips ("기본 배치 팁",R.drawable.lolchess_map, R.drawable.lolchess_map, "PC라면 q와 r을 통해 주기적으로 정찰을 해줍니다. (순위가 아니라 맵의 시계, 반시계 방향으로 돕니다)\n" +
                "정찰을 하면서 자신이 다음에 만날 유저가 누구일지 예측하고 그에 맞게 배치를 해야 합니다.", "위 사진처럼 크립라운드(유저가 아닌 ai몹을 잡는 라운드)까지 5명을 만났으니, 다음에는 나머지 2명을 만날 확률이 아주 높습니다.\n" +
                "간혹 순서가 다 안 돌았는데도 만나는 경우도 있음!", "")
    }
}