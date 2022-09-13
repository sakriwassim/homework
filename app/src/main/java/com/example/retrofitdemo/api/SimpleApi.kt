package com.example.retrofitdemo.api

import com.example.retrofittest.model.Post
import retrofit2.Response
import retrofit2.http.*

interface SimpleApi {

    @GET("posts")
    suspend fun getPost(@Header("Auth") auth: String): Response<Post>


}