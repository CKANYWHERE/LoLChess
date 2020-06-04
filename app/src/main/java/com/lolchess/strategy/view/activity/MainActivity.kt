package com.lolchess.strategy.view.activity

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.ClassCastException
import androidx.fragment.app.Fragment
import com.lolchess.strategy.R
import com.lolchess.strategy.view.menu.*

class MainActivity : AppCompatActivity() {

    val drawerToogle by lazy {
        ActionBarDrawerToggle(this, drawer_layout, toolbar,
            R.string.drawer_open,
            R.string.drawer_close
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        navigationView.setNavigationItemSelectedListener {
            selectDrawerItem(it)
            true
        }
        drawer_layout.addDrawerListener(drawerToogle)
    }


    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        drawerToogle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        drawerToogle.onConfigurationChanged(newConfig)
    }

    private fun selectDrawerItem(item: MenuItem) {
        var fragment:Fragment? = null
        val fragmentClass = when(item.itemId) {
            R.id.firstFragmentItem -> AppHome::class.java
            R.id.secondFragmentItem -> ChampionSynergy::class.java
            R.id.thirdFragmentItem -> Items::class.java
            R.id.fourthFragmentItem -> Arrangement::class.java
            else -> AppHome::class.java
        }
        try {
            fragment = fragmentClass.newInstance() as Fragment
        } catch (e: ClassCastException) {
            e.printStackTrace()
        }
        replaceFragment(fragment)
        drawer_layout.closeDrawer(GravityCompat.START)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (drawerToogle.onOptionsItemSelected(item)) true else super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.fragment_menu, menu)
        return true
    }

    private fun replaceFragment(fragment: Fragment?){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment!!)
        fragmentTransaction.commit()
    }


}