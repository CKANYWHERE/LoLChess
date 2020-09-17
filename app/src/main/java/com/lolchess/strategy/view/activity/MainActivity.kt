package com.lolchess.strategy.view.activity

import android.content.Context
import android.content.res.Configuration
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*
import androidx.fragment.app.Fragment
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds
import com.lolchess.strategy.R
import com.google.android.material.navigation.NavigationView
import com.lolchess.strategy.view.menu.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.home_fragment.*


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    private val drawerToggle by lazy {
        ActionBarDrawerToggle(
            this, drawer_layout, toolbar,
            R.string.drawer_open,
            R.string.drawer_close
        )
    }
    private lateinit var mInterstitialAd: InterstitialAd

    override fun onDestroy() {
        super.onDestroy()
        createFrontAd()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        navigationView.setNavigationItemSelectedListener(this)

        drawerToggle.isDrawerIndicatorEnabled = true
        drawer_layout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        MobileAds.initialize(this)

        mInterstitialAd = InterstitialAd(applicationContext)
        mInterstitialAd.adUnitId = "ca-app-pub-9396361569793554/2382658247"
        mInterstitialAd.loadAd(AdRequest.Builder().build())

        val fragment = Home.newInstance()
        replaceFragment(fragment)
        navigationView.setCheckedItem(R.id.action_home)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean { //메뉴 생성과 초기화
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        drawerToggle.onConfigurationChanged(newConfig)
    }

    override fun onBackPressed() { //뒤로가기 처리
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            createFrontAd()
            drawer_layout.closeDrawers()
        } else {
            super.onBackPressed()
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_home -> {
                val fragment = Home.newInstance()
                replaceFragment(fragment)
                true
            }

            R.id.action_champion_synergy -> {
                val fragment = ChampionSynergy.newInstance()
                replaceFragment(fragment)
                true
            }

            R.id.action_items -> {
                val fragment = Items.newInstance()
                replaceFragment(fragment)
                true
            }

            R.id.action_arrangement -> {
                val fragment = Arrangement.newInstance()
                replaceFragment(fragment)
                true
            }
            R.id.action_simulator -> {
                val fragment = Simulator.newInstance()
                createFrontAd()
                replaceFragment(fragment)
                true
            }

        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun createFrontAd() {

        if (mInterstitialAd.isLoaded) {
            mInterstitialAd.show()
            mInterstitialAd.adListener = object : AdListener(){
                override fun onAdClosed() {
                    mInterstitialAd.loadAd(AdRequest.Builder().build())
                }
            }
        } else {
            Log.e("TAG", "The interstitial wasn't loaded yet.")
        }
    }

}

fun AppCompatActivity.replaceFragment(fragment: Fragment) {
    val fragmentManager = supportFragmentManager
    val transaction = fragmentManager.beginTransaction()
    transaction.replace(R.id.fragmentContainer, fragment)
    transaction.addToBackStack(null)
    transaction.commit()
}
