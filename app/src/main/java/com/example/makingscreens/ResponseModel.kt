package com.example.makingscreens

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ResponseModel {
    @Expose
    @SerializedName("articles")
    var articles: List<Articles>? = null

    @Expose
    @SerializedName("totalResults")
    var totalResults = 0

    @Expose
    @SerializedName("status")
    var status: String? = null
}