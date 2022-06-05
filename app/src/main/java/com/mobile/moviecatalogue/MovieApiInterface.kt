package com.mobile.moviecatalogue

import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=517debd05896afb46d2b9d862000d48e")
    fun getMovieList(): Call<MovieResponse>
}

