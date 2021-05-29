package com.example.makingscreens

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User (
    @Expose
    @SerializedName("DeviceId")
    var DeviceId: String? = null,

    @Expose
    @SerializedName("GoogleId")
    var GoogleId: String? = null,

    @Expose
    @SerializedName("FacebookId")
    var FacebookId: String? = null,

    @Expose
    @SerializedName("DeviceToken")
    var DeviceToken: String? = null,

    @Expose
    @SerializedName("SocialType")
    var SocialType: String? = null,

    @Expose
    @SerializedName("SocialLogin")
    var SocialLogin: String? = null,

    @Expose
    @SerializedName("DeviceType")
    var DeviceType: String? = null,

    @Expose
    @SerializedName("SubscribeNewsLetter")
    var SubscribeNewsLetter: String? = null,

    @Expose
    @SerializedName("WithChildren")
    var WithChildren: String? = null,

    @Expose
    @SerializedName("Gender")
    var Gender: String? = null,

    @Expose
    @SerializedName("FullName")
    var FullName: String? = null,

    @Expose
    @SerializedName("Password")
    var Password: String? = null,

    @Expose
    @SerializedName("Email")
    var Email: String? = null
)