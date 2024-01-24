package com.jay.newstask3.apiservice

import android.util.Log
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class ApiService {
    companion object{
        val BASE_URL = "https://newsapi.org"

        val httpClient = OkHttpClient.Builder().addInterceptor {it->
            val request = it.request().newBuilder()
                .build()

            Log.i("Request", "Request Header: ${request.headers.toString()}")
            Log.i("Request", "Request Type: ${request.method.toString()}")
            Log.i("Request", "Request: ${request.body.toString()}")

            it.proceed(request)
        }.build()

        val apiService : ApiInterface by lazy {
            val retroFit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retroFit.create(ApiInterface::class.java)
        }
    }
}