package com.example.airline.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.airline.screens.HomeScreen
import com.example.airline.screens.LoginScreen
import com.example.airline.screens.SignUpScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {

        composable("login") {
            LoginScreen(navController)
        }

        composable("signup") {
            SignUpScreen(navController)
        }

        composable("home") {
            HomeScreen(navController)
        }
    }
}