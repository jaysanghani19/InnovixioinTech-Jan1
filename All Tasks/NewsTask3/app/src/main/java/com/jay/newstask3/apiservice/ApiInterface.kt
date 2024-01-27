package com.jay.newstask3.apiservice

import com.jay.newstask3.dataclass.NewsClass
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("/v2/top-headlines?country=in&apiKey=2c9b50f3a4e14f5cbe5c419cfc9717a7")
    fun getNews(): Call<NewsClass>

    @GET("/v2/top-headlines?apiKey=2c9b50f3a4e14f5cbe5c419cfc9717a7")
    fun getNews(@Query("category") category: String): Call<NewsClass>

    @GET("/v2/top-headlines?apiKey=2c9b50f3a4e14f5cbe5c419cfc9717a7")
    fun getNews(
        @Query("category") category: String,
        @Query("country") country: String,
    ): Call<NewsClass>

}