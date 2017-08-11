package com.example.asiantech.topmovies.models

import com.google.gson.annotations.SerializedName

/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 11/08/2017.
 */
data class MoviesResponse(
        @SerializedName("page")
        val page: Int = 0,
        @SerializedName("results")
        val results: List<Movie>? = null,
        @SerializedName("total_results")
        val totalResults: Int = 0,
        @SerializedName("total_pages")
        val totalPages: Int = 0
)
