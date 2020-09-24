package com.example.bunq_replica.ui

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.bunq_replica.R
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imgBtnAdd = findViewById<ImageButton>(R.id.fabAddMe)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val bottomSheet = findViewById<ConstraintLayout>(R.id.bottomSheetBehavior)
        val bottomSheetBehavior = BottomSheetBehavior.from(bottomSheet)

        val navigationController = findNavController(R.id.fragment)
        bottomNavigationView.setupWithNavController(navigationController)

        val bounceAnim: Animation =
            AnimationUtils.loadAnimation(this, R.anim.shake_animation)
        imgBtnAdd.startAnimation(bounceAnim)



        imgBtnAdd.setOnClickListener {


        }


    }

}