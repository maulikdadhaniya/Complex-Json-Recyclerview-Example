package com.example.getretrofit.retrofit

import com.example.getretrofit.response.MyResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("5c5820252f0000b312856ccf")
    fun GETDATA(
    ): Call<MyResponse>

}