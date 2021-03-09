package com.example.epicture_project.ui.gallery

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.epicture_project.data.ImageData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel  //hilt
class GalleryViewModel @Inject constructor() : ViewModel() {
    var userImages : MutableState<List<ImageData>> = mutableStateOf(listOf())

    init {
        viewModelScope.launch {
            userImages.value = listOf(
                ImageData(name = "Coucou"),
                ImageData(name = "Ca va")
            )

            //fetchUserImages()
        }
    }

/*    fun fetchUserImages() {
        userImages.value = repository.getUserImages()
    }*/
}