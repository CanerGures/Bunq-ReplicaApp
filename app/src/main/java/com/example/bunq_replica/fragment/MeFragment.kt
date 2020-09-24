package com.example.bunq_replica.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.bunq_replica.R

class MeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_me, container, false)
        val imgBtnAdd = rootView.findViewById<ImageButton>(R.id.fabAddMe)

        val bounceAnim: Animation =
            AnimationUtils.loadAnimation(rootView.context, R.anim.shake_animation)
        imgBtnAdd.startAnimation(bounceAnim)



        return rootView


    }


}