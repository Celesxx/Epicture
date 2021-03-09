package com.example.epicture_project.ui.gallery

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun UserImages(
    galleryViewModel: GalleryViewModel = viewModel()
) {
    val images = galleryViewModel.userImages.value
    Column() {
        Text(text = "Salut")
    }
}