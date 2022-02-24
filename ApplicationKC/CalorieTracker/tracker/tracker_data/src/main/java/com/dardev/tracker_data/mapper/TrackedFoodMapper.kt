package com.dardev.tracker_data.mapper

import com.dardev.tracker_data.local.entity.TrackedFoodEntity
import com.dardev.tracker_domain.model.MealType
import com.dardev.tracker_domain.model.TrackedFood
import java.time.LocalDate

fun TrackedFoodEntity.toTrackedFood(): TrackedFood{
    return TrackedFood(
        name = name,
        carbs=carbs,
        protein = protein,
        fat = fat,
        imageUrl = imageUrl,
        mealType = MealType.fromString(type),
        amount=amount,
        date = LocalDate.of(year,month, dayOfMonth),
        calories = calories,
        id = id
    )
}

fun TrackedFood.toTrackedFoodEntity():TrackedFoodEntity{
    return TrackedFoodEntity(
        name = name,
        carbs=carbs,
        protein = protein,
        fat = fat,
        imageUrl = imageUrl,
        type = mealType.name,
        amount=amount,
        year = date.year,
        month = date.dayOfMonth,
        dayOfMonth = date.monthValue,
        calories = calories,
        id = id
    )
}