package com.example.asiantech.topmovies.ui.author

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.asiantech.topmovies.R
import com.example.asiantech.topmovies.ui.base.BaseFragment

class AuthorFragment : BaseFragment() {

    companion object {
        fun newInstance(): BaseFragment {
            val fragment = AuthorFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.fragment_author, null)
        return view
    }
}
