package com.lolchess.strategy.view.viewholder

import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.lolchess.strategy.model.Champ
import com.lolchess.strategy.view.activity.ChampDetailActivity
import kotlinx.android.synthetic.main.activity_champ_detail.*
import kotlinx.android.synthetic.main.champ_home_item.view.*
import org.json.JSONStringer

class ChampDetailViewHolder(var view: View) : RecyclerView.ViewHolder(view){ //cardview binding 해주는 클래스
    var imgMain = view.imgMain
    var txtMain = view.txtMain
    var firstImgSyn = view.imgFirstSyn
    var secondImgSyn = view.imgSecondSyn
    var txtFirstSyn = view.txtFirstSyn
    var txtSecondSyn = view.txtSecondSyn
    var imgCost = view.imgCost


    fun initialize(item: Champ) {
        val intent = Intent(view.context, ChampDetailActivity::class.java )

        intent.putExtra("CHAMPIMAGE", item.imgPath.toString())
        intent.putExtra("SYNERGYIMAGE", item.synergy[0].imgPath.toString())
        intent.putExtra("SYNERGYIMAGE2", item.synergy[1].imgPath.toString())
        intent.putExtra("SYNERGYNAME", item.synergy[0].name)
        intent.putExtra("SYNERGYNAME2", item.synergy[1].name)
        intent.putExtra("CHAMPNAME", item.name)

        intent.putExtra("HP1", item.hp[0].toString())
        intent.putExtra("HP2", item.hp[1].toString())
        intent.putExtra("HP3", item.hp[2].toString())

        intent.putExtra("SKILL", item.skill)
        intent.putExtra("SYNERGYDES1", item.synergy[0].description)
        intent.putExtra("SYNERGYDES2", item.synergy[1].description)


        intent.putExtra("SynergyOption", item.synergy[0].option.toTypedArray())
        intent.putExtra("SynergyOption2", item.synergy[1].option.toTypedArray())

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