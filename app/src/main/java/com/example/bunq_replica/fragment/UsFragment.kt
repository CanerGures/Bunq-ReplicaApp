package com.example.bunq_replica.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bunq_replica.R
import com.example.bunq_replica.adapter.UsRecycleViewAdapter
import com.example.bunq_replica.model.UsNewsModel

class UsFragment : Fragment() {
    lateinit var recyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_us, container, false)
        val imgBtnAdd = rootView.findViewById<ImageButton>(R.id.fabAddUs)

        val bounceAnim: Animation =
            AnimationUtils.loadAnimation(rootView.context, R.anim.shake_animation)
        imgBtnAdd.startAnimation(bounceAnim)

        imgBtnAdd.setOnClickListener {

        }

        val list = createMockData()
        recyclerView = rootView.findViewById(R.id.usRecyclerView)
        recyclerView.adapter = UsRecycleViewAdapter(list)
        recyclerView.layoutManager = LinearLayoutManager(rootView.context)

        return rootView
    }


}


private fun createMockData(): List<UsNewsModel> {

    val list = ArrayList<UsNewsModel>()

    val card1 = UsNewsModel(
        "Freelancing like a pro through difficult times These are not easy times for anyone, but while some only have to go through the boredom of staying home, others worry about their finances more than ever.",
        "https://www.bunq.com/assets/elements/blog/freelancing-like-a-pro.jpg",
        1,
        "My Journey from Canada to bunq",
        "Blog",
        "#002a53",
        "#0080FF",
        "35",
        1
    )
    val card2 = UsNewsModel(
        "How Jedlix saves time and increases customer satisfaction with bunq. Here at bunq we’re all about 3 things: saving money, time and CO2 - and we’re always happy to collaborate with companies that hold similar values. ",
        "https://www.bunq.com/assets/elements/blog/bunq-jedlix-partnership.jpg",
        2,
        "Support what you love and bunq will pitch in too!",
        "Blog",
        "#002a53",
        "#0080FF",
        "14",
        1
    )
    val card3 = UsNewsModel(
        "Follow your dream! Why now is the time to build a start-up. You have a dream - that’s a great start! You may think you have to put that dream on hold for a while, but this is actually a great time to follow it. Let’s see why!",
        "https://www.bunq.com/assets/elements/blog/bunq-antler-blog.jpg",
        3,
        "The Free",
        "Social",
        "#530F1C",
        "#FF2F55",
        "68",
        2
    )
    val card4 = UsNewsModel(
        "Data Scientists care about trees. Trust me, we do. Machine learning and AI are hot topics in today's data driven day and age. Daniela, one of our Data Scientists, explains how you can use data too!",
        "https://www.bunq.com/assets/elements/blog/bunq-data-scientists-trees.jpg",
        4,
        "My Journey from Canada to bunq",
        "Blog",
        "#002a53",
        "#0080FF",
        "72",
        1
    )
    val card5 = UsNewsModel(
        "I built my own PC and you can too! Have you ever wanted to build your own PC? I recently did, and I'm here to share my knowledge, tips and tricks with you, so you can build your own PC in no time!",
        "https://www.bunq.com/assets/elements/blog/bunq-build-my-own-computer.jpg",
        5,
        "My Journey from Canada to bunq",
        "Blog",
        "#C9701E",
        "#E8903F",
        "55",
        3
    )
    val card6 = UsNewsModel(
        "Here’s who bunq really is: Ever wondered what happens behind the scenes at bunq? What does bunq really stand for? What do bunqers do all day, every day? And is there magic dust around?",
        "https://www.bunq.com/assets/elements/blog/the-bunqr.jpg",
        6,
        "My Journey from Canada to bunq",
        "Blog",
        "#530F1C",
        "#FF2F55",
        "983",
        2
    )
    val card7 = UsNewsModel(
        "Give (un)heard talents a voice. When the story of bunq began, many thought it could not succeed. A digital-only bank? Not making profits off users’ money?",
        "https://www.bunq.com/assets/elements/blog/bunq-unheard.jpg",
        7,
        "My Journey from Canada to bunq",
        "Blog",
        "#C9701E",
        "#E8903F",
        "1235",
        3
    )
    list.add(card1)
    list.add(card2)
    list.add(card3)
    list.add(card4)
    list.add(card5)
    list.add(card6)
    list.add(card7)
    return list
}