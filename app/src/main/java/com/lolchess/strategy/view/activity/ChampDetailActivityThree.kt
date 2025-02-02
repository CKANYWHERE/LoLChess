package com.lolchess.strategy.view.activity

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.getSystemService
import androidx.databinding.DataBindingUtil
import com.lolchess.strategy.R
import com.lolchess.strategy.databinding.ActivityChampDetailBinding
import com.lolchess.strategy.databinding.ActivityChampDetailThreeBinding
import kotlinx.android.synthetic.main.activity_champ_detail.SynLevel1
import kotlinx.android.synthetic.main.activity_champ_detail.SynLevel2
import kotlinx.android.synthetic.main.activity_champ_detail.SynLevel3
import kotlinx.android.synthetic.main.activity_champ_detail.SynLevel4
import kotlinx.android.synthetic.main.activity_champ_detail.SynLevel_1
import kotlinx.android.synthetic.main.activity_champ_detail.SynLevel_2
import kotlinx.android.synthetic.main.activity_champ_detail.SynLevel_3
import kotlinx.android.synthetic.main.activity_champ_detail.armor
import kotlinx.android.synthetic.main.activity_champ_detail.attack1
import kotlinx.android.synthetic.main.activity_champ_detail.attack2
import kotlinx.android.synthetic.main.activity_champ_detail.attack3
import kotlinx.android.synthetic.main.activity_champ_detail.attack_speed
import kotlinx.android.synthetic.main.activity_champ_detail.hp1
import kotlinx.android.synthetic.main.activity_champ_detail.hp2
import kotlinx.android.synthetic.main.activity_champ_detail.hp3
import kotlinx.android.synthetic.main.activity_champ_detail.imgFirstSyn
import kotlinx.android.synthetic.main.activity_champ_detail.imgFirstSyn2
import kotlinx.android.synthetic.main.activity_champ_detail.imgMain
import kotlinx.android.synthetic.main.activity_champ_detail.imgSecondSyn
import kotlinx.android.synthetic.main.activity_champ_detail.imgSecondSyn2
import kotlinx.android.synthetic.main.activity_champ_detail.imgSkill
import kotlinx.android.synthetic.main.activity_champ_detail.magic_resistance
import kotlinx.android.synthetic.main.activity_champ_detail.range
import kotlinx.android.synthetic.main.activity_champ_detail.txtFirstSyn
import kotlinx.android.synthetic.main.activity_champ_detail.txtFirstSyn2
import kotlinx.android.synthetic.main.activity_champ_detail.txtMain
import kotlinx.android.synthetic.main.activity_champ_detail.txtMana
import kotlinx.android.synthetic.main.activity_champ_detail.txtSKillEffect
import kotlinx.android.synthetic.main.activity_champ_detail.txtSecondSyn
import kotlinx.android.synthetic.main.activity_champ_detail.txtSecondSyn2
import kotlinx.android.synthetic.main.activity_champ_detail.txtSkill
import kotlinx.android.synthetic.main.activity_champ_detail.txtSkillDes
import kotlinx.android.synthetic.main.activity_champ_detail.txtSynDes
import kotlinx.android.synthetic.main.activity_champ_detail.txtSynDes2
import kotlinx.android.synthetic.main.activity_champ_detail_three.*


class ChampDetailActivityThree: AppCompatActivity() {
    lateinit var threeBinding: ActivityChampDetailThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        threeBinding = DataBindingUtil.setContentView(this, R.layout.activity_champ_detail_three)

        //layout 바인딩해서 intent에서 나온 값을 넣어줌(?).
        var cost = intent.getStringExtra("Cost").toInt()

        when (cost){
            1->{imgCost.setBackgroundColor(Color.rgb(128,128,128))}
            2->{imgCost.setBackgroundColor(Color.rgb(17,178,136))}
            3->{imgCost.setBackgroundColor(Color.rgb(32,122,199))}
            4->{imgCost.setBackgroundColor(Color.rgb(196,64,218))}
            5->{imgCost.setBackgroundColor(Color.rgb(255,185,59))}
        }

        txtFirstSyn.text = intent.getStringExtra(("SYNERGYNAME"))
        txtSecondSyn.text = intent.getStringExtra(("SYNERGYNAME2"))
        txtThirdSyn.text = intent.getStringExtra(("SYNERGYNAME3"))

        txtFirstSyn2.text = intent.getStringExtra(("SYNERGYNAME"))
        txtSecondSyn2.text = intent.getStringExtra(("SYNERGYNAME2"))
        txtThirdSyn2.text = intent.getStringExtra(("SYNERGYNAME3"))

        txtMain.text = intent.getStringExtra(("CHAMPNAME"))
        imgMain.setImageResource(intent.getStringExtra("CHAMPIMAGE").toInt())
        imgSkill.setImageResource(intent.getStringExtra("SKILLIMAGE").toInt())

        imgFirstSyn.setImageResource(intent.getStringExtra("SYNERGYIMAGE").toInt())
        imgSecondSyn.setImageResource(intent.getStringExtra("SYNERGYIMAGE2").toInt())
        imgThirdSyn.setImageResource(intent.getStringExtra("SYNERGYIMAGE3").toInt())


        imgFirstSyn2.setImageResource(intent.getStringExtra("SYNERGYIMAGE").toInt())
        imgSecondSyn2.setImageResource(intent.getStringExtra("SYNERGYIMAGE2").toInt())
        imgThirdSyn2.setImageResource(intent.getStringExtra("SYNERGYIMAGE3").toInt())


        txtSynDes.text = intent.getStringExtra(("SYNERGYDES1"))
        txtSynDes2.text = intent.getStringExtra(("SYNERGYDES2"))
        txtSynDes3.text = intent.getStringExtra(("ThirdSynergy"))


        val option = intent.getStringArrayExtra("SynergyOption").size
        val option2 = intent.getStringArrayExtra("SynergyOption2").size
        Log.e("SynergyOption", intent.getStringArrayExtra("SynergyOption").size.toString())
        Log.e("SynergyOption2", intent.getStringArrayExtra("SynergyOption2").size.toString())

        when (option){

            1->{
                SynLevel1.text = intent.getStringExtra(("SYNLEVEL1"))
            }
            2->{
                SynLevel1.text = intent.getStringExtra(("SYNLEVEL1"))
                SynLevel2.text = intent.getStringExtra(("SYNLEVEL2"))
            }
            3->{
                SynLevel1.text = intent.getStringExtra(("SYNLEVEL1"))
                SynLevel2.text = intent.getStringExtra(("SYNLEVEL2"))
                SynLevel3.text = intent.getStringExtra(("SYNLEVEL3"))
            }
            4->{
                SynLevel1.text = intent.getStringExtra(("SYNLEVEL1"))
                SynLevel2.text = intent.getStringExtra(("SYNLEVEL2"))
                SynLevel3.text = intent.getStringExtra(("SYNLEVEL3"))
                SynLevel4.text = intent.getStringExtra(("SYNLEVEL4"))
            }
        }

        when (option2) {
            1->{
                SynLevel_1.text = intent.getStringExtra(("SYNLEVEL_1"))
            }
            2->{
                SynLevel_1.text = intent.getStringExtra(("SYNLEVEL_1"))
                SynLevel_2.text = intent.getStringExtra(("SYNLEVEL_2"))
            }
            3->{
                SynLevel_1.text = intent.getStringExtra(("SYNLEVEL_1"))
                SynLevel_2.text = intent.getStringExtra(("SYNLEVEL_2"))
                SynLevel_3.text = intent.getStringExtra(("SYNLEVEL_3"))
            }

        }

        hp1.text = intent.getStringExtra(("HP1"))
        hp2.text = intent.getStringExtra(("HP2"))
        hp3.text = intent.getStringExtra(("HP3"))
        attack1.text = intent.getStringExtra(("ATTACK1"))
        attack2.text = intent.getStringExtra(("ATTACK2"))
        attack3.text = intent.getStringExtra(("ATTACK3"))

        txtMana.text = intent.getStringExtra(("MANA"))
        txtSkill.text = intent.getStringExtra(("SKILL"))
        txtSkillDes.text = intent.getStringExtra(("SKILLDES"))
        txtSKillEffect.text = intent.getStringExtra(("SKILLEFFECT"))

        attack_speed.text = intent.getStringExtra(("ATTACKSPEED"))
        range.text = intent.getStringExtra(("ATTACKRANGE"))
        armor.text = intent.getStringExtra(("SHIELD"))
        magic_resistance.text = intent.getStringExtra(("MAGICSHIELD"))


    }
}