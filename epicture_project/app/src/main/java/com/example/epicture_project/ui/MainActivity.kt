package com.example.epicture_project.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.epicture_project.ui.gallery.UserImages
import com.example.epicture_project.ui.theme.Epicture_projectTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint  //hilt
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Epicture_projectTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    UserImages()
                }
            }
        }
    }
}

