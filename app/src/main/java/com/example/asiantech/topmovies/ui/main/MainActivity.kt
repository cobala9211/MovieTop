package com.example.asiantech.topmovies.ui.main

import android.os.Bundle
import com.example.asiantech.topmovies.R
import com.example.asiantech.topmovies.ui.author.AuthorFragment
import com.example.asiantech.topmovies.ui.base.BaseActivity
import com.example.asiantech.topmovies.ui.category.CategoryFragment
import com.example.asiantech.topmovies.ui.favorite.FavoriteFragment
import com.example.asiantech.topmovies.ui.top.TopMovieFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainAdapter = MainAdapter(supportFragmentManager)
        mainAdapter.addFragment(TopMovieFragment.newInstance(), "Top movie")
        mainAdapter.addFragment(CategoryFragment.newInstance(), "Category")
        mainAdapter.addFragment(FavoriteFragment.newInstance(), "Favorite")
        mainAdapter.addFragment(AuthorFragment.newInstance(), "Author")

        viewPager.adapter = mainAdapter
        tabs.setupWithViewPager(viewPager)
    }

    fun createIcons() {
//        mIcons.add(R.drawable.ic_author)
//        mIcons.add(R.drawable.ic_category)
//        mIcons.add(R.drawable.ic_top)
//        mIcons.add(R.drawable.ic_favorite)
    }
}
