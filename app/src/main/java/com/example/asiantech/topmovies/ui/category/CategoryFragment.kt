package com.example.asiantech.topmovies.ui.category

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.asiantech.topmovies.R
import com.example.asiantech.topmovies.ui.base.BaseFragment

class CategoryFragment : BaseFragment() {

    companion object {
        fun newInstance(): CategoryFragment {
            val fragment = CategoryFragment()
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.fragment_category, null)
        return view
    }
}
