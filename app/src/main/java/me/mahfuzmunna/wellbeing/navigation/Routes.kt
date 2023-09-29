package me.mahfuzmunna.wellbeing.navigation

sealed class Routes(val routeName : String) {
    object Splash : Routes("splash_screen")
    object AppHome : Routes("app_home")
}