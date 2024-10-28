package com.example.teemfashion.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.teemfashion.components.CustomInput

@Composable
fun LoginScreen(navController: NavHostController) {
    val navController = rememberNavController()
    Text(text = "Login screen")
 Column(){

     CustomInput(text = "", onTextChange = {} , label = "user name")
 }
}