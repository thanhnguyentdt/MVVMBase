package com.example.thefirstprojecttdtdemo.network

import retrofit2.Retrofit

object Retrofit {
    var retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .build()
    var service: GitHubService = retrofit.create(GitHubService::class.java)
}