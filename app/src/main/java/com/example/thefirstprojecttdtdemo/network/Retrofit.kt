package com.example.thefirstprojecttdtdemo.network

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import retrofit2.Retrofit

@Module
@InstallIn(ActivityComponent::class)
object Retrofit {
    @Provides
    fun provideAnalyticsService(): GitHubService {
        return Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
            .create(GitHubService::class.java)
    }
}