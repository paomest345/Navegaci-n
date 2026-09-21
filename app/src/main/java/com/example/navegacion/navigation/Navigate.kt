package com.example.navegacion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navegacion.uiapp.Details
import com.example.navegacion.uiapp.Home

@Composable
fun Navigate(
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ){
        composable("home"){
            Home(navController)
        }
        composable("Detail"){
            Details(navController)
        }
    }
    ){}
){}