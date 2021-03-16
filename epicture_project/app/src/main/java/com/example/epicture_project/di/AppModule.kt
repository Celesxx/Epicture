package com.example.epicture_project.di

import androidx.compose.ui.res.stringResource
import com.example.epicture_project.Consts
import com.example.epicture_project.R
import com.example.epicture_project.data.remote.ImageDataService
import com.example.epicture_project.data.remote.ImageDataSource
import com.example.epicture_project.data.repositories.ImageRepository
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideOkHttpClient() : OkHttpClient {
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY) // Logger entrées sorties
        return OkHttpClient.Builder().addInterceptor(interceptor).build()
    }

    @Provides
    @Singleton
    fun provideGson() : Gson = GsonBuilder().create()

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient, gson: Gson) : Retrofit = Retrofit.Builder()
        .baseUrl(Consts.IMGUR_API_URL)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .client(okHttpClient)
        .build()

    @Provides
    @Singleton
    fun provideImageDataService(retrofit: Retrofit) : ImageDataService = retrofit.create(ImageDataService::class.java)

    @Provides
    @Singleton
    fun provideImageDataSource(imageDataService: ImageDataService) = ImageDataSource(imageDataService)

    @Provides
    @Singleton
    fun provideImageRepository(remoteDataSource: ImageDataSource) = ImageRepository(remoteDataSource)
}
