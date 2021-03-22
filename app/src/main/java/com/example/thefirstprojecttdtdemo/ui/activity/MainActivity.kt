package com.example.thefirstprojecttdtdemo.ui.activity

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.example.thefirstprojecttdtdemo.R
import com.example.thefirstprojecttdtdemo.extensions.abc
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        homeBottomNavigation.setOnNavigationItemSelectedListener(this)
        "".toString()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.singleActivity -> nav_host_fragment.visibility = View.VISIBLE
            R.id.multiplyActivity -> startActivity(Intent(this, SecondActivity::class.java))
        }
        return true
    }
}