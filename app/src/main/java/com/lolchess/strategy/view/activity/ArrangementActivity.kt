package com.lolchess.strategy.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.lolchess.strategy.R
import com.lolchess.strategy.databinding.ActivityArrangementBinding
import kotlinx.android.synthetic.main.activity_arrangement.*
import kotlinx.android.synthetic.main.arrangement_cardview.*

class ArrangementActivity : AppCompatActivity() {
    lateinit var binding: ActivityArrangementBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arrangement)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_arrangement)

        tipImgIn1.setImageResource(intent.getStringExtra("tipImgMain").toInt())
        tipImgIn2.setImageResource(intent.getStringExtra("tipImgSub").toInt())
        tipCardIn.text = intent.getStringExtra("tipTxtMain")
        tipTxtIn1.text = intent.getStringExtra("tipTxt1")
        tipTxtIn2.text = intent.getStringExtra("tipTxt2")
        tipTxtIn3.text = intent.getStringExtra("tipTxt3")

    }
}