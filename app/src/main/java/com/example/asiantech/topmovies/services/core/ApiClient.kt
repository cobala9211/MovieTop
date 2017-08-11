package com.example.asiantech.topmovies.services.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Copyright © 2017 AsianTech inc.
 * Created by phuongdn on 11/08/2017.
 */
class ApiClient {
    companion object {
        val BASE_URL = "http://api.themoviedb.org/3/"
        var retrofit: Retrofit? = null
        fun getClient(): Retrofit {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()
            }
            return retrofit!!
        }
    }
}
