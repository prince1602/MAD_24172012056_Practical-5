package com.example.pr5

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pr5.screen.LoginScreen
import com.example.pr5.screen.RegisterUI

@Composable
fun AppNavigation(context: Context) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {

        composable("login") {
            LoginScreen(context = context, navController = navController)
        }

        composable("register") {
            RegisterUI(navController = navController)
        }
    }
}
