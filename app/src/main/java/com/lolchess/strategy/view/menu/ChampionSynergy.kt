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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button1.setOnClickListener {
            // Get the text fragment instance
            val champion = Champion()

            // Get the support fragment manager instance
            val manager = fragmentManager

            // Begin the fragment transition using support fragment manager
            val transaction = manager?.beginTransaction()

            // Replace the fragment on container
            transaction?.replace(R.id.frameLayout, champion)
            transaction?.addToBackStack(null)

            // Finishing the transition
            transaction?.commit()
        }

        // Set a click listener for second button widget
        button2.setOnClickListener {
            // Get the text fragment instance
            val synergy = Synergy()

            // Get the support fragment manager instance
            val manager = fragmentManager
            // Begin the fragment transition using support fragment manager
            val transaction = manager?.beginTransaction()

            // Replace the fragment on container
            transaction?.replace(R.id.frameLayout, synergy)
            transaction?.addToBackStack(null)
            // Finishing the transition
            transaction?.commit()

        }
    }


}