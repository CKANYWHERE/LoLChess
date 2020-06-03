package com.lolchess.strategy.view.menu

import android.content.res.Resources
import android.graphics.BitmapFactory
import android.graphics.drawable.Drawable
import android.graphics.drawable.Icon
import android.media.Image
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.lolchess.strategy.R
import com.lolchess.strategy.data.ChampData
import com.lolchess.strategy.model.Champ
import kotlinx.android.synthetic.main.fragment_first_image.*
import kotlinx.android.synthetic.main.fragment_first_image.view.*

class AppHome:Fragment(){

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)

        val view = inflater.inflate(R.layout.fragment_first_image, container, false)

        val champ =  ChampData().getGraves()
        view.graves.setImageResource(champ?.imgPath)
        view.graves.setOnClickListener {
            val myToast = Toast.makeText(context,champ.toString(),Toast.LENGTH_SHORT)
            myToast.show()
        }
        return view



    }

}
