package com.lolchess.strategy.view.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lolchess.strategy.R
import kotlinx.android.synthetic.main.champion_fragment.*
import kotlinx.android.synthetic.main.synergy_fragment.*

class Synergy : Fragment(){

    companion object {
        fun newInstance() = Synergy()
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.synergy_fragment, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}