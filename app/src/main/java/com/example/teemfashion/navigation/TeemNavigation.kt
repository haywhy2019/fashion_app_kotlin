package com.example.teemfashion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.teemfashion.screens.DesignScreen




@Composable
fun TeemNavigation(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = TeemScreens.LoginScreen.name) {
        composable(TeemScreens.DesignScreen.name) { DesignScreen(navController) }
        composable(TeemScreens.HomeScreen.name) { HomeScreen(navController) }
        composable(TeemScreens.OnboardScreen.name) { OnBoardScreen(navController) }
        composable(TeemScreens.SignUpScreen.name) { SignUpScreen(navController) }
        composable(TeemScreens.LoginScreen.name) { LoginScreen(navController) }
        composable(TeemScreens.HotelScreen.name) { HotelScreen(navController) }
        composable(TeemScreens.CheckoutScreen.name) { CheckoutScreen(navController) }
        composable(TeemScreens.TicketScreen.name) { TicketScreen(navController) }

        // Add more destinations similarly.
    }
}