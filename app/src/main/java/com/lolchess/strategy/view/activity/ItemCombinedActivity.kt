package com.lolchess.strategy.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.lolchess.strategy.R
import com.lolchess.strategy.databinding.ActivityItemCombinedBinding
import kotlinx.android.synthetic.main.activity_item_combined.*
import kotlinx.android.synthetic.main.items_fragment.*

class ItemCombinedActivity : AppCompatActivity() {
    lateinit var itemCombined: ActivityItemCombinedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        itemCombined = DataBindingUtil.setContentView(this, R.layout.activity_item_combined)

        itemImgMain.setImageResource(intent.getStringExtra("itemImgMain").toInt())
        itemTextMain.text = intent.getStringExtra("itemTextMain")
        itemDescription.text = intent.getStringExtra("itemDescription")
        itemImgBased1.setImageResource(intent.getStringExtra("itemImgBased1").toInt())
        itemImgBased2.setImageResource(intent.getStringExtra("itemImgBased2").toInt())

    }
}