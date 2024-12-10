package com.example.retrofit_yt

import UserItem
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("users")
    fun getData() : Call<List<UserItem>>

}