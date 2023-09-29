package me.mahfuzmunna.wellbeing.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import me.mahfuzmunna.wellbeing.screens.AppHomeScreen
import me.mahfuzmunna.wellbeing.screens.AppSplashScreen

@Composable
fun AppNavGraph(navHostController: NavHostController = rememberNavController()) {
    NavHost(navController = navHostController, startDestination = Routes.Splash.routeName) {
        composable(route = Routes.Splash.routeName) {
            AppSplashScreen(navHostController)
        }

        composable(route = Routes.AppHome.routeName) {
            AppHomeScreen()
        }
    }
}