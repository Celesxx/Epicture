package com.example.epicture_project.data.repositories

import com.example.epicture_project.data.remote.ImageDataSource
import javax.inject.Inject

class ImageRepository @Inject constructor(
    private val remoteDataSource: ImageDataSource
) {
    suspend fun getGalleryImages(token: String, username: String) = remoteDataSource.getGalleryImages(token, username)

}