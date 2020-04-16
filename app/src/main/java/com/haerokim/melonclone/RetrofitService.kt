package com.haerokim.melonclone

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService{
    @GET("melon/list/")
    fun getSongList(): Call<ArrayList<Song>>
}