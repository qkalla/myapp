package com.example.cosmeticapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cosmeticapp.ui.screens.*

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("home") { HomeScreen(navController) }
        composable("perfume") { PerfumeScreen(navController) }
        composable("makeup") { MakeupScreen(navController) }
        composable("skincare") { SkincareScreen(navController) }
        composable("haircare") { HaircareScreen(navController) }
        composable("admin") { AdminPanelScreen(navController) }
    }
}