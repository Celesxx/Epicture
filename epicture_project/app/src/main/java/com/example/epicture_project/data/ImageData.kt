package com.example.epicture_project.data

import android.graphics.drawable.BitmapDrawable
import androidx.compose.ui.graphics.ImageBitmap

data class ImageData(
    val image: ImageBitmap? = null,
    val link: String = "",
    val name: String = "",
    val title: String? = "",
    val description: String? = ""
)
