package com.example.epicture_project.ui.gallery

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.epicture_project.utils.GlideImage

@Composable
fun UserImages(
    galleryViewModel: GalleryViewModel = viewModel()
) {
    val images = galleryViewModel.userImages.value
    val listState = rememberLazyListState()

    LazyColumn(
        state = listState,
        contentPadding = PaddingValues(bottom = 80.dp),
        modifier = Modifier.fillMaxWidth()
    ) {
        items(images) { image ->
            if (image.link.isEmpty()) {
                return@items
            }
            GlideImage(url = image.link, modifier = Modifier.fillMaxWidth())
        }
    }
}