package com.dardev.tracker_presentation.search

import com.dardev.tracker_domain.model.TrackableFood
import com.dardev.tracker_domain.model.TrackableFoodUiState

data class SearchState (
    val query:String = "",
    val isHintVisible:Boolean = false,
    val isSearching:Boolean = false,
    val trackableFood: List<TrackableFoodUiState> = emptyList()
)