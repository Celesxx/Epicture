package com.example.epicture_project.data.remote

import com.example.epicture_project.data.ImageData
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface ImageDataService {

    @GET("account/{username}/images")
    suspend fun getGalleryImages(
        @Header("Authorization") token: String,
        @Path("username") username: String
    ): Response<DataListHolder<ImageData>>
}