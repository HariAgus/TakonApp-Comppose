package com.haw.takonappcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.haw.takonappcompose.presentation.screen.MessageScreen
import com.haw.takonappcompose.presentation.screen.OnBoardingScreen
import com.haw.takonappcompose.presentation.screen.SplashScreen

@Composable
fun MainNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        route = "main_route",
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen()
        }
        composable(route = Screen.OnBoarding.route) {
            OnBoardingScreen()
        }
        composable(route = Screen.Message.route) {
            MessageScreen()
        }
    }

}