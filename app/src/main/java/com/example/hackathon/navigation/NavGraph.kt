package com.example.hackathon.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.hackathon.view.MrR.MainActivityRa
import com.example.hackathon.view.MrR.MyScreenContent
import com.example.hackathon.view.MrR.ViewAddAuthorActivity
import com.example.hackathon.view.MrR.ViewGetBookActivity


@Composable
fun NavGraph (navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Main.route
    )
    {
        composable(route = Screens.Main.route) {
            MyScreenContent()
        }
        composable(route = Screens.GetBook.route) {
            ViewAddAuthorActivity()
        }
        composable(route = Screens.AddAuthor.route) {
            ViewGetBookActivity()
        }
    }
}

