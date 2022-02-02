package com.dardev.calorietracker.navigation

import androidx.navigation.NavController
import com.dardev.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate){
    this.navigate(event.route)
}