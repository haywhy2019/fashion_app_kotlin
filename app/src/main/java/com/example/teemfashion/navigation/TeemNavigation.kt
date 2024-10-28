package com.example.teemfashion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.teemfashion.screens.DesignScreen
import com.example.teemfashion.screens.HomeScreen
import com.example.teemfashion.screens.LoginScreen
import com.example.teemfashion.screens.MeasurementScreen
import com.example.teemfashion.screens.OrderDetailScreen
import com.example.teemfashion.screens.RegisterScreen
import com.example.teemfashion.screens.ReviewScreen


@Composable
fun TeemNavigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = TeemScreens.LoginScreen.name) {
        composable(TeemScreens.DesignScreen.name) { DesignScreen(navController) }
        composable(TeemScreens.HomeScreen.name) { HomeScreen(navController) }
        composable(TeemScreens.MeasurementScreen.name) { MeasurementScreen(navController) }
        composable(TeemScreens.OrderDetailsScreen.name) { OrderDetailScreen(navController) }
        composable(TeemScreens.LoginScreen.name) { LoginScreen(navController) }
        composable(TeemScreens.RegisterScreen.name) { RegisterScreen(navController) }
        composable(TeemScreens.ReviewScreen.name) { ReviewScreen(navController) }
        // Add more destinations similarly.
    }
}