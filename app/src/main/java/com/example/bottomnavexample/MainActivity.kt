package com.example.bottomnavexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupActionBarWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupViews()
    }

    private fun setupViews() {
        var navHostFragment = supportFragmentManager.findFragmentById(R.id.fragNavHost) as NavHostFragment
        NavigationUI.setupWithNavController(bottomNavMenu, navHostFragment.navController)

        var appBarConfiguration = AppBarConfiguration(
            setOf(R.id.phoneFragment, R.id.shoppingFragment, R.id.settingsFragment, R.id.avatarFragment))
        setupActionBarWithNavController(navHostFragment.navController, appBarConfiguration)

    }
}