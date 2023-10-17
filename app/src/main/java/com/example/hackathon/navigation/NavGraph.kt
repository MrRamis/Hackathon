package com.example.hackathon.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.hackathon.view.MrR.AddAuthorActivity
import com.example.hackathon.view.MrR.GetBookActivity
import com.example.hackathon.view.MrR.MyScreenContent



@Composable
fun NavGraph (navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Main.route
    )
    {
        composable(route = Screens.Main.route  ) {
            MyScreenContent(navController)
        }
        composable(route = Screens.GetBook.route) {
            GetBookActivity()
        }
        composable(route = Screens.AddAuthor.route) {
            AddAuthorActivity()
        }
    }
}

