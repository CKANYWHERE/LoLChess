package com.lolchess.strategy.view.activity

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.ClassCastException
import androidx.fragment.app.Fragment
import com.lolchess.strategy.R
import com.google.android.material.navigation.NavigationView
import com.lolchess.strategy.view.menu.*
import kotlinx.android.synthetic.main.app_bar_main.*
import java.lang.reflect.Array.newInstance

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private val drawerToggle by lazy {
        ActionBarDrawerToggle(this, drawer_layout, toolbar,
                R.string.drawer_open,
                R.string.drawer_close
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        navigationView.setNavigationItemSelectedListener(this)

        drawerToggle.isDrawerIndicatorEnabled = true
        drawer_layout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()

        val fragment = Home.newInstance()
        replacementFragment(fragment)

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
        if(drawer_layout.isDrawerOpen(GravityCompat.START)){
            drawer_layout.closeDrawers()
        } else{
            super.onBackPressed()
        }
    }

    private fun selectDrawerItem(item:MenuItem) {
        var fragment:Fragment? = null
        val fragmentClass = when (item.itemId) {
            R.id.action_home -> Home::class.java
            R.id.action_champion_synergy -> ChampionSynergy::class.java
            R.id.action_items -> Items::class.java
            R.id.action_arrangement -> Arrangement::class.java
            R.id.action_simulator -> Simulator::class.java

            else -> Simulator::class.java
        }
        try {
            fragment = fragmentClass.newInstance() as Fragment
        }catch (e: ClassCastException){
            e.printStackTrace()
        }
        replacementFragment(fragment)
        drawer_layout.closeDrawer(GravityCompat.START)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.action_home -> {
                val fragment = Home.newInstance()
                replacementFragment(fragment)

                true
            }

            R.id.action_champion_synergy -> {
                val fragment = ChampionSynergy.newInstance()
                replacementFragment(fragment)
                true
            }

            R.id.action_items -> {
                val fragment = Items.newInstance()
                replacementFragment(fragment)
                true
            }

            R.id.action_arrangement -> {
                val fragment = Arrangement.newInstance()
                replacementFragment(fragment)
                true
            }
            R.id.action_simulator -> {
                val fragment = Simulator.newInstance()
                replacementFragment(fragment)

                true
            }

        }
        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun replacementFragment(fragment: Fragment?){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment!!)
        fragmentTransaction.commit()
    }

}