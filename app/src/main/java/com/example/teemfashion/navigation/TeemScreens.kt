package com.example.teemfashion.navigation

enum class TeemScreens {
    HomeScreen,
    DesignScreen,
    MeasurementScreen,
    ReviewScreen,
    RegisterScreen,
    LoginScreen,
    OrderDetailsScreen;
    companion object {
        fun fromRoute(route: String?): TeemScreens =
            when (route?.substringBefore("/")){
                HomeScreen.name -> HomeScreen
                DesignScreen.name -> DesignScreen
                MeasurementScreen.name -> MeasurementScreen
                ReviewScreen.name -> ReviewScreen
                LoginScreen.name -> LoginScreen
                RegisterScreen.name -> RegisterScreen
                OrderDetailsScreen.name -> OrderDetailsScreen
            null -> HomeScreen
                else -> throw IllegalArgumentException("Route $route is not found" )
            }
    }
}