package com.example.makingscreens

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {

    @GET("top-headlines")
    fun getLatestNews(@Query("country") country : String , @Query("apiKey")apiKey : String) : Call<ResponseModel>
}