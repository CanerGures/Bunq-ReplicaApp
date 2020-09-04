package com.example.bunq_replica.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bunq_replica.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navigationController = findNavController(R.id.fragment)

        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.meFragment,
                R.id.usFragment,
                R.id.profileFragment,
                R.id.cameraFragment
            )
        )
        setupActionBarWithNavController(navigationController, appBarConfiguration)

        bottomNavigationView.setupWithNavController(navigationController)
        /*makeCurrentFragment(meFragment)

        bnvBottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.action_me -> makeCurrentFragment(meFragment)
                R.id.action_us -> makeCurrentFragment(usFragment)
                R.id.action_profile -> makeCurrentFragment(profileFragment)
                R.id.action_camera -> makeCurrentFragment(cameraFragment)

            }
            true
        }*/


    }

    /*private fun makeCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_main, fragment)
            commit()
        }
    }*/
}