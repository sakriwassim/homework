package com.example.retrofitdemo.api

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class MyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val request : Request = chain.request()
            .newBuilder()
            .addHeader("grant_type","password")
            .addHeader(  "client_id","YOUR_APP_ID")
                .addHeader( "client_secret","YOUR_CLIENT_SECRET")
                    .addHeader(  "username","USER_MAIL")
                        .addHeader( "password","USER_PASSWORD")
                            .addHeader("scope","SCOPES_SPACE_SEPARATED")
            .build()
        return chain.proceed(request)
    }
}