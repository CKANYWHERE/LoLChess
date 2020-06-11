package com.lolchess.strategy.view.menu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.lolchess.strategy.R
import kotlinx.android.synthetic.main.champion_fragment.*
import kotlinx.android.synthetic.main.synergy_fragment.*

class Champion : Fragment(){

    companion object {
        fun newInstance() = Champion()
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.champion_fragment, container, false)
    }

}