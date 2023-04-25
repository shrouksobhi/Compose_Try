package com.example.composetest.navigation

sealed class NavRoute(val routs:String) {
    object RegisterScreen : NavRoute("register_screen")
    object HomeScreen : NavRoute("home_screen")
    object LoginScreen : NavRoute("login_screen")

}