package com.dardev.core.domain.model

sealed class Gender(val name:String){
    object Male: Gender("male")
    object Female: Gender("female")
    object Other:Gender("other")

    companion object{
        fun fromString(name: String):Gender{
            return when(name) {
                "male" -> Male
                "female" -> Female
                "other" -> Other
                else -> Other
            }
        }
    }
}
