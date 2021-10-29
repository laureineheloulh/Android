package com.example.crous_project

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
interface CrousService {

    @GET("crous")
    fun getAllCrous(): Call<List<Crous>>

    @POST("crous")
    fun createCrous(@Body crous:Crous): Call<Crous>
}