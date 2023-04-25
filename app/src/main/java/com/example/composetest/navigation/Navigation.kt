package com.example.composetest.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composetest.ui.presentation.HomeContent
import com.example.composetest.ui.presentation.Login
import com.example.composetest.ui.presentation.Register

@Composable
fun Navigate(){
    val navController= rememberNavController()
    NavHost(navController = navController , startDestination = NavRoute.LoginScreen.routs ){

        composable(
            route = NavRoute.LoginScreen.routs
        ){
            Login(navController)
        }
        composable(
            route = NavRoute.HomeScreen.routs
        ){
            HomeContent(navController)
        }
        composable(route = NavRoute.RegisterScreen.routs){
            Register(navController)
        }
    }
}