package com.example.asiantech.topmovies.models

import com.google.gson.annotations.SerializedName

/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 11/08/2017.
 */
data class Movie(
        @SerializedName("poster_path")
        val posterPath: String? = null,
        @SerializedName("adult")
        val adult: Boolean = false,
        @SerializedName("overview")
        val overview: String? = null,
        @SerializedName("release_date")
        val releaseDate: String? = null,
        @SerializedName("genre_ids")
        val genreIds: ArrayList<Int> = ArrayList<Int>(),
        @SerializedName("id")
        val id: Int? = null,
        @SerializedName("original_title")
        val originalTitle: String? = null,
        @SerializedName("original_language")
        val originalLanguage: String? = null,
        @SerializedName("title")
        val title: String? = null,
        @SerializedName("backdrop_path")
        val backdropPath: String? = null,
        @SerializedName("popularity")
        val popularity: Double? = null,
        @SerializedName("vote_count")
        val voteCount: Int? = null,
        @SerializedName("video")
        val video: Boolean? = null,
        @SerializedName("vote_average")
        val voteAverage: Double? = null
)
