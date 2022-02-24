package com.dardev.tracker_domain.use_case


import com.dardev.tracker_domain.model.TrackedFood
import com.dardev.tracker_domain.repository.TrackerRepository


class DeleteTrackedFood(
    private val repository: TrackerRepository
) {
    suspend operator fun invoke(trackedFood: TrackedFood){
        repository.deleteTrackedFood(trackedFood)
    }
}