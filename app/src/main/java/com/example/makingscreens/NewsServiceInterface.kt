package com.example.makingscreens

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


//https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=f0ff90e809ef4848885fad9b2250cd17

const val BASE_URL = "https://newsapi.org/"
const val API_KEY = "f0ff90e809ef4848885fad9b2250cd17"
interface NewsServiceInterface {

    @GET("v2/top-headlines?apiKey=$API_KEY")
    fun getHeadlines(@Query("country") country : String ,@Query("page") page : Int) : Call<ResponseModel>

    //https://newsapi.org/v2/top-headlines?apiKey=f0ff90e809ef4848885fad9b2250cd17&country=in&page=1

}

//making singleton object for retrofit

object NewsService{
    var newsInstance : NewsServiceInterface
    init {
        val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        newsInstance = retrofit.create(NewsServiceInterface::class.java)
    }

}