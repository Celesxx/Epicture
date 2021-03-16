package com.example.epicture_project.data.remote

import com.google.gson.annotations.SerializedName

data class DataListHolder<T>(
    @SerializedName("data")
    val data: List<T>
)