package com.example.teemfashion.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector

data class NavItem(val title: String,
                   val selectedIcon: ImageVector,
                   val unselectedIcon: ImageVector,
                   val badgeCount: Int? = null,
                   val route: String = "")

val listOfNavItems : List<NavItem> = listOf(
    NavItem(
        title = "Home",
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
        route = TeemScreens.HomeScreen.name
    ),
    NavItem(
        title = "Login",
        selectedIcon = Icons.Default.AccountCircle,
        unselectedIcon = Icons.Outlined.AccountCircle,
        route = TeemScreens.LoginScreen.name
    ),


)
