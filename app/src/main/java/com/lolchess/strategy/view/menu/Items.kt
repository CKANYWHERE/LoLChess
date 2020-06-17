package com.lolchess.strategy.view.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lolchess.strategy.R

class Items:Fragment(){

    companion object{
        fun newInstance() = Items()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.items_fragment, container, false)
    }

}
