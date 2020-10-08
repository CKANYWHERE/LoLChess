package com.lolchess.strategy.view.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.lolchess.strategy.R
import com.lolchess.strategy.model.Arrangement_tips
import com.lolchess.strategy.model.Simple_Tips
import com.lolchess.strategy.model.data.Arrangement_Tips_Data
import com.lolchess.strategy.model.data.Tips_Data
import com.lolchess.strategy.view.adapter.ArrangementAdapter
import com.lolchess.strategy.view.adapter.TipsAdapter
import kotlinx.android.synthetic.main.arrangement_fragment.*
import kotlinx.android.synthetic.main.arrangement_fragment.tipsRecycler
import kotlinx.android.synthetic.main.tips_fragment.*

class Tips:Fragment(){

    companion object{
        fun newInstance() = Tips()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.tips_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tips_Data = Tips_Data()
        var tipsData: List<Simple_Tips> = listOf(tips_Data.tip1(), tips_Data.tip2(), tips_Data.tip3(), tips_Data.tip4(), tips_Data.tip5(), tips_Data.tip6(), tips_Data.tip7())


        val tips = tipsData.toMutableList()

        val mAdapter = TipsAdapter(tips)
        tips_Recycler?.adapter = mAdapter
        tips_Recycler?.layoutManager = LinearLayoutManager(view.context)
    }

}