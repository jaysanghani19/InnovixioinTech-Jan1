package com.jay.newstask3.apiservice

import com.jay.newstask3.dataclass.NewsClass
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("/v2/top-headlines?sources=techcrunch&apiKey=2c9b50f3a4e14f5cbe5c419cfc9717a7")
    fun getNews() : Call<NewsClass>
}