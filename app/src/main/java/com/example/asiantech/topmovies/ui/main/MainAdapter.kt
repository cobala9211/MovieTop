package com.example.asiantech.topmovies.ui.main

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter

/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 10/08/2017.
 */
class MainAdapter(fragmentManager: FragmentManager) : FragmentStatePagerAdapter(fragmentManager) {

    private val titles = ArrayList<String>()
    private val fragments = ArrayList<Fragment>()

    override fun getItem(position: Int): Fragment = fragments[position]

    override fun getCount(): Int = fragments.size

    override fun getPageTitle(position: Int): CharSequence = titles[position]

    open fun addFragment(fragment: Fragment, title: String) {
        titles.add(title)
        fragments.add(fragment)
    }
}