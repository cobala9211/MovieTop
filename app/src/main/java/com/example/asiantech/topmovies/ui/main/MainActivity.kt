package com.example.asiantech.topmovies.ui.main

import android.os.Bundle
import android.util.Log
import com.example.asiantech.topmovies.R
import com.example.asiantech.topmovies.models.MoviesResponse
import com.example.asiantech.topmovies.services.GitHubApiService
import com.example.asiantech.topmovies.services.core.ApiClient
import com.example.asiantech.topmovies.ui.author.AuthorFragment
import com.example.asiantech.topmovies.ui.base.BaseActivity
import com.example.asiantech.topmovies.ui.category.CategoryFragment
import com.example.asiantech.topmovies.ui.favorite.FavoriteFragment
import com.example.asiantech.topmovies.ui.top.TopMovieFragment
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : BaseActivity() {

    val API_KEY: String = "15bd8fd670bcd5de72fd89b4687bcf17"
    val mArray = intArrayOf(R.drawable.ic_top
            , R.drawable.ic_category
            , R.drawable.ic_favorite
            , R.drawable.ic_author)

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
        getApi()
    }

    fun getApi() {
        if (API_KEY.isBlank()) {
            Log.d("TAG11", "api key is blank")
            return
        }
        val apiService = ApiClient.getClient().create(GitHubApiService::class.java)
        val call = apiService.getTopRatedMovies(API_KEY)
        call.enqueue(object : Callback<MoviesResponse> {
            override fun onResponse(call: Call<MoviesResponse>, response: Response<MoviesResponse>) {
                val movies = response.body().results
                Log.d("TAG11", "Number of movies received: " + movies!!.size + movies[0].title)
            }

            override fun onFailure(call: Call<MoviesResponse>, t: Throwable) {
                // Log error here since request failed
                Log.e("TAG11", t.toString())
            }
        })
    }

}
