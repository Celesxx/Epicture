package com.example.epicture_project.data.remote

import javax.inject.Inject

class ImageDataSource @Inject constructor(
    private val imageDataService: ImageDataService
) : BaseDataSource() {
    suspend fun getGalleryImages(token: String, username: String) = getResult {
        imageDataService.getGalleryImages("Bearer $token", username)
    }
}