package com.dardev.calorietracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dardev.calorietracker.navigation.navigate
import com.dardev.calorietracker.ui.theme.CaloryTrackerTheme
import com.dardev.core.navigation.Route
import com.dardev.onboarding_presentation.activity.ActivityScreen
import com.dardev.onboarding_presentation.age.AgeScreen
import com.dardev.onboarding_presentation.gender.GenderScreen
import com.dardev.onboarding_presentation.goal.GoalScreen
import com.dardev.onboarding_presentation.height.HeightScreen
import com.dardev.onboarding_presentation.nutrient_goal.NutrientGoalScreen
import com.dardev.onboarding_presentation.weight.WeightScreen
import com.dardev.onboarding_presentation.welcome.WelcomeScreen
import com.dardev.tracker_presentation.tracker_overview.TrackerOverviewScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaloryTrackerTheme {
                val navController = rememberNavController()
                val scaffoldState = rememberScaffoldState()
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    scaffoldState = scaffoldState
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = Route.WELCOME
                    ){
                        composable(Route.WELCOME){
                            WelcomeScreen(onNavigate = navController::navigate)
                        }
                        composable(Route.AGE){
                            AgeScreen(
                                scaffoldState = scaffoldState,
                                onNavigate = navController::navigate
                            )
                        }
                        composable(Route.GENDER){
                            GenderScreen(onNavigate = navController::navigate)
                        }
                        composable(Route.HEIGHT){
                            HeightScreen(scaffoldState = scaffoldState, onNavigate = navController::navigate)
                        }
                        composable(Route.WEIGHT){
                            WeightScreen(scaffoldState = scaffoldState, onNavigate = navController::navigate)
                        }
                        composable(Route.NUTRIENT_GOAL){
                            NutrientGoalScreen(scaffoldState = scaffoldState,onNavigate = navController::navigate)
                        }
                        composable(Route.ACTIVITY){
                            ActivityScreen(onNavigate = navController::navigate)
                        }
                        composable(Route.GOAL){
                            GoalScreen(onNavigate = navController::navigate)
                        }
                        composable(Route.TRACKER_OVERVIEW){
                            TrackerOverviewScreen(onNavigate = navController::navigate)
                        }
                        composable(Route.SEARCH){

                        }
                    }
                }

            }
        }
    }
}
