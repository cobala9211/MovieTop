package com.example.asiantech.topmovies.services

import com.example.asiantech.topmovies.models.MoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 11/08/2017.
 */
interface GitHubApiService {

    @GET("movie/top_rated")
    fun getTopRatedMovies(@Query("api_key") apiKey: String): Call<MoviesResponse>

    @GET("movie/{id}")
    fun getMovieDetails(@Path("id") id: Int, @Query("api_key") apiKey: String): Call<MoviesResponse>
}
