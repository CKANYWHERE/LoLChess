package com.lolchess.strategy.view.menu


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.lolchess.strategy.R
import kotlinx.android.synthetic.main.champion_fragment.*
import kotlinx.android.synthetic.main.champion_synergy_fragment.*
import kotlinx.android.synthetic.main.synergy_fragment.*

class ChampionSynergy:Fragment() {

    companion object {
        fun newInstance() = ChampionSynergy()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.champion_synergy_fragment, container, false)
    }
}