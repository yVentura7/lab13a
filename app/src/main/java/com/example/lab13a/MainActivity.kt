package com.example.lab13

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.example.lab13.animations.combined.CombinedAnimationsScreen
import com.example.lab13.animations.size_position.SizePositionAnimationScreen
import com.example.lab13.animations.visibility.VisibilityAnimationScreen
import com.example.lab13a.ui.theme.Lab13aTheme
import com.example.lab13a.animations.color.ColorChangeScreen
import com.example.lab13a.animations.content.AnimatedContentScreen
import com.example.lab13a.ui.theme.Lab13aTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, true)
        setContent {
            Lab13aTheme {
                // Llamar a las pantallas
                 // CombinedAnimationsScreen()
                 // VisibilityAnimationScreen()
                 // ColorChangeScreen()
                 SizePositionAnimationScreen()
                 AnimatedContentScreen()
                 //     CombinedAnimationsScreen()

            }
        }
    }
}