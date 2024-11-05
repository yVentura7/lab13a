package com.example.lab13a.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class VisibilityAnimationViewModel : ViewModel() {

    val isVisible = mutableStateOf(false)

    fun toggleVisibility() {
        isVisible.value = !isVisible.value
    }
}
