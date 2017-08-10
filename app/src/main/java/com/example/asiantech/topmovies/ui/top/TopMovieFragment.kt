package com.example.asiantech.topmovies.ui.top

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.asiantech.topmovies.R
import com.example.asiantech.topmovies.ui.base.BaseFragment

class TopMovieFragment : BaseFragment() {

    companion object {
        fun newInstance(): TopMovieFragment {
            val fragment = TopMovieFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_top_movie, null)
        return view
    }
}
