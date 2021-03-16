package com.example.epicture_project.ui.gallery

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.epicture_project.data.ImageData
import com.example.epicture_project.data.repositories.ImageRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel  //hilt
class GalleryViewModel @Inject constructor(
    private val repository: ImageRepository
) : ViewModel() {
    var userImages : MutableState<List<ImageData>> = mutableStateOf(listOf())

    init {
        fetchUserImages()
    }

    fun fetchUserImages() {
       viewModelScope.launch {
           val value = repository.getGalleryImages(username = "MouleFriction", token = "b19e18242f1916f06638be497d322b0e69214c6e")
           value.data?.let {
               userImages.value = it.data
           }
       }
    }
}