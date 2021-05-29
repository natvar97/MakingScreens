package com.example.makingscreens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsApiCalling : AppCompatActivity() {

    private val BASE_URL = "https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=f0ff90e809ef4848885fad9b2250cd17"
    private val API_KEY = "f0ff90e809ef4848885fad9b2250cd17"
    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_api_calling)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this , LinearLayoutManager.VERTICAL , false)

        val call = NewsService.newsInstance.getHeadlines("in",1)
        call.enqueue(object : Callback<ResponseModel>{
            override fun onResponse(call: Call<ResponseModel>, response: Response<ResponseModel>) {
                val body = response.body()
                if (body != null) {
                    Log.d("TAG" , call.toString())
                }
            }

            override fun onFailure(call: Call<ResponseModel>, t: Throwable) {

            }

        })
    }
}