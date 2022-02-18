package com.dardev.onboarding_presentation.weight

import androidx.lifecycle.ViewModel
import com.dardev.core.domain.preferences.Preferences
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WeightViewModel @Inject constructor(
    private val preferences: Preferences
):ViewModel() {
}