package com.developbharat.voterindia.di

import com.developbharat.voterindia.common.Constants
import com.developbharat.voterindia.domain.providers.IAuthAPI
import com.developbharat.voterindia.domain.providers.repos.auth.AuthRepository
import com.developbharat.voterindia.domain.providers.repos.auth.IAuthRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RootModule {
    @Provides
    @Singleton
    fun provideAuthAPI(): IAuthAPI {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_API_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(IAuthAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideAuthRepository(api: IAuthAPI): IAuthRepository {
        return AuthRepository(api)
    }
}