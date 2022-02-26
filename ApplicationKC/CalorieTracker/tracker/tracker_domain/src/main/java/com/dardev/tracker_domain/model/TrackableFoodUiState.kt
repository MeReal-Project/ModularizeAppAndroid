package com.dardev.tracker_domain.model

import com.dardev.tracker_domain.model.TrackableFood

data class TrackableFoodUiState (
    val food:TrackableFood,
    val isExpanded:Boolean = true,
    val amount:String = "",
)