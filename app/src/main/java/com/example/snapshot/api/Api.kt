package com.example.snapshot.api

import com.example.snapshot.models.LoginResponse
import com.google.android.gms.common.util.Strings
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded

interface Api {

    @FormUrlEncoded
    @POST("registration")
    fun newUser(
        @Field("username") username:String,
        @Field("email") email:String,
        @Field("password") password:String,
        @Field("date_birth") date_birth:String,
        @Field("sexe") sexe:String,
        @Field("picture") picture:String
    ): Call<DefaultResponse>

    @FormUrlEncoded
    @POST("login")
    fun loginUser(
        @Field("email") email:String,
        @Field("password") password:String,
    ):Call<LoginResponse>
}