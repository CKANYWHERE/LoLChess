package com.lolchess.strategy.view.viewholder

import android.content.Intent
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.view.activity.ChampDetailActivity
import kotlinx.android.synthetic.main.champ_home_item_three.view.*

class ChampDetailViewHolder3Syn (var view: View) : RecyclerView.ViewHolder(view){
    var imgMain = view.imgMain
    var txtMain = view.txtMain
    var firstImgSyn = view.imgFirstSyn
    var secondImgSyn = view.imgSecondSyn
    var thirdImgSyn = view.imgThirdSyn
    var txtFirstSyn = view.txtFirstSyn
    var txtSecondSyn = view.txtSecondSyn
    var txtThirdSyn = view.txtThirdSyn
    var imgCost = view.imgCost

    fun initialize_2(item: Champ) {
        val intent = Intent(view.context, ChampDetailActivity::class.java )

        intent.putExtra("CHAMPIMAGE", item.imgPath.toString())
        intent.putExtra("SYNERGYIMAGE", item.synergy[0].imgPath.toString())
        intent.putExtra("SYNERGYIMAGE2", item.synergy[1].imgPath.toString())
        intent.putExtra("SYNERGYIMAGE3", item.synergy[2].imgPath.toString())

        intent.putExtra("SYNERGYNAME", item.synergy[0].name)
        intent.putExtra("SYNERGYNAME2", item.synergy[1].name)
        intent.putExtra("SYNERGYNAME3", item.synergy[2].name)

        intent.putExtra("CHAMPNAME", item.name)

        intent.putExtra("HP1", item.hp[0].toString())
        intent.putExtra("HP2", item.hp[1].toString())
        intent.putExtra("HP3", item.hp[2].toString())

        intent.putExtra("SKILL", item.skill)
        intent.putExtra("SYNERGYDES1", item.synergy[0].description)
        intent.putExtra("SYNERGYDES2", item.synergy[1].description)
        intent.putExtra("Champ",item.toString())


        intent.putExtra("SynergyOption", item.synergy[0].option.toTypedArray())
        intent.putExtra("SynergyOption2", item.synergy[1].option.toTypedArray())
        intent.putExtra("ThirdSynergy", item.synergy[2].description)
        when (item.synergy[0].option.size){

            1->{
                intent.putExtra("SYNLEVEL1", item.synergy[0].option[0])
            }
            2->{
                intent.putExtra("SYNLEVEL1", item.synergy[0].option[0])
                intent.putExtra("SYNLEVEL2", item.synergy[0].option[1])
            }
            3->{
                intent.putExtra("SYNLEVEL1", item.synergy[0].option[0])
                intent.putExtra("SYNLEVEL2", item.synergy[0].option[1])
                intent.putExtra("SYNLEVEL3", item.synergy[0].option[2])
            }
            4->{
                intent.putExtra("SYNLEVEL1", item.synergy[0].option[0])
                intent.putExtra("SYNLEVEL2", item.synergy[0].option[1])
                intent.putExtra("SYNLEVEL3", item.synergy[0].option[2])
                intent.putExtra("SYNLEVEL4", item.synergy[0].option[3])
            }
        }

        when (item.synergy[1].option.size) {
            1->{
                intent.putExtra("SYNLEVEL_1", item.synergy[1].option[0])
            }
            2->{
                intent.putExtra("SYNLEVEL_1", item.synergy[1].option[0])
                intent.putExtra("SYNLEVEL_2", item.synergy[1].option[1])
            }
            3->{
                intent.putExtra("SYNLEVEL_1", item.synergy[1].option[0])
                intent.putExtra("SYNLEVEL_2", item.synergy[1].option[1])
                intent.putExtra("SYNLEVEL_3", item.synergy[1].option[2])

            }

        }



        intent.putExtra("MANA", item.mana)
        intent.putExtra("SKILLDES", item.skillDescription)
        intent.putExtra("SKILLEFFECT", item.skillEffect)

        intent.putExtra("ATTACK1", item.attack[0].toString())
        intent.putExtra("ATTACK2", item.attack[1].toString())
        intent.putExtra("ATTACK3", item.attack[2].toString())

        intent.putExtra("ATTACKSPEED", item.attackSpeed.toString())
        intent.putExtra("ATTACKRANGE", item.attackRange.toString())
        intent.putExtra("SHIELD", item.shield.toString())
        intent.putExtra("MAGICSHIELD", item.magicShield.toString())
        intent.putExtra("SKILLIMAGE", item.skillImg.toString())

        view?.context.startActivity(intent)
    }

}