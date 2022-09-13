package com.example.retrofitdemo.repository

import com.example.retrofitdemo.api.RetrofitInstance
import com.example.retrofittest.model.Post
import retrofit2.Response

class Repository {

    suspend fun getPost(auth: String): Response<Post> {
        return RetrofitInstance.api.getPost(auth)
    }

    

}