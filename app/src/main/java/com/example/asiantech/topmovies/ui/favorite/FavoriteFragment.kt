package com.example.asiantech.topmovies.ui.favorite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.asiantech.topmovies.R
import com.example.asiantech.topmovies.ui.base.BaseFragment

class FavoriteFragment : BaseFragment() {

    companion object {
        fun newInstance(): FavoriteFragment {
            val fragment = FavoriteFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_favorite, null)
        return view
    }
}
