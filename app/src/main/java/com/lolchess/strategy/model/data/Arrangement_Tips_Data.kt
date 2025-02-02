package com.lolchess.strategy.model.data

import com.lolchess.strategy.R
import com.lolchess.strategy.model.Arrangement_tips

class Arrangement_Tips_Data {
    fun tips_basic(): Arrangement_tips {
        return Arrangement_tips("기본 배치 팁",R.drawable.basic_tip1, R.drawable.basic_tips2, "PC라면 q와 r을 통해 주기적으로 정찰을 해줍니다. (순위가 아니라 맵의 시계, 반시계 방향으로 돕니다)\n" +
                "정찰을 하면서 자신이 다음에 만날 유저가 누구일지 예측하고 그에 맞게 배치를 해야 합니다.", "아래 사진처럼 크립라운드(유저가 아닌 ai몹을 잡는 라운드)까지 5명을 만났으니, 다음에는 나머지 2명을 만날 확률이 아주 높습니다.(주황색이 만난 유저, 빨간색이 안 만난 유저)\n" +
                "간혹 순서가 다 안 돌았는데도 만나는 경우도 있음!", "", "배치하기 전, 미세 팁입니다.")
    }
    fun tips_zephyr(): Arrangement_tips {
        return Arrangement_tips ("서풍 배치 팁",R.drawable.zephyr_tip1, R.drawable.zephyr_tip2, "★서풍 저격, 피하기★\n" +
                "서풍 : 전투 시작 시 결투장 반대편에 회오리바람을 소환해 회오리바람과 가장 가까운 적을 5초 동안 전투에서 제외\n" +
                "이 아이템을 사용해서 상대의 주요 탱커, 딜러, CC기(기절, 띄우기 등등) 챔피언들을 전투에서 제외시키면 전투를 유리하게 가져갈 수 있습니다.", "상대가 배치할 때 어느곳으로 움직일지 예상해야하기 때문에 피하기보다 저격이 더 어려운 편입니다.\n" +
                "PC라면 서풍들어가 있는 챔피언을 클릭한 채로 q나 r을 누르면서 상대 챔피언의 위치를 파악해서 저격할 수 있습니다.\n" +
                "서풍 저격하려면, 자신이 다음에 만날 사람이 누구인지 예측해야합니다. 만약 예측이 어렵다면, 자기가 질만한 상대를 기준으로 배치해놓으면 좋습니다.",
                "(마샤와곰은 부캐입니다, KatzeH가 본캐)", "게임의 판도를 뒤집을 수 있는 서풍!")
    }
/*
    fun tips_infiltrator(): Tips {
        return Tips ("잠입자 배치 팁",R.drawable.infiltrator_tip,0, "★잠입자 위치 잡기★\n" +
                "잠입자는 기본적으로 상대 딜러를 잡거나 방해하는 역할을 합니다. 그래서 배치는 대부분 주요 딜러와 마주보게 해주시면 됩니다.\n" +
                "잠입자를 대비해서 박스배치(딜러를 보호하기 위해 구석에 모아놓는 배치)를 하는 경우가 있는데, 그럴 때에는 진영붕괴에 탁월한 피즈를 써주시는게 좋습니다.\n" +
                "잠입자에 고속연사포 아이템을 넣어줬다면 박스배치에 대비해 딜러와 먼 쪽으로 날아가게 해주는 것도 방법입니다.", "",
                "", "잠입자 배치의 기본!")
    }

 */
}