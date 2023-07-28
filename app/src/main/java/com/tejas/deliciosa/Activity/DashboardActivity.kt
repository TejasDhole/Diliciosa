package com.tejas.deliciosa.Activity

import android.bluetooth.BluetoothCsipSetCoordinator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.tejas.deliciosa.R

class DashboardActivity : AppCompatActivity() {

    lateinit var drawerLayout :DrawerLayout

   lateinit var toolbar :Toolbar

   lateinit var frameLayout :FrameLayout

   lateinit var navigationView :NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        drawerLayout = findViewById(R.id.DrawerLayour)
        toolbar = findViewById(R.id.Toolbar)
        frameLayout = findViewById(R.id.Frame)
        navigationView = findViewById(R.id.Navigationbar)

        setUpToolBar()

        val actionBarDrawerToggle = ActionBarDrawerToggle(this@DashboardActivity,drawerLayout,R.string.open_drawer,R.string.close_drawer)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

    }

    fun setUpToolBar(){
        setSupportActionBar(toolbar)
        supportActionBar?.title="Tool Bar"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        if(id == android.R.id.home){
            drawerLayout.openDrawer(GravityCompat.START)
        }

        return super.onOptionsItemSelected(item)
    }
}