package com.example.hackathon.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.hackathon.view.MrR.AddAuthorActivity
//import com.example.hackathon.view.MrR.GetBookActivity
import com.example.hackathon.view.MrR.MainActivityRa
import com.example.hackathon.view.MrR.MyScreenContent
import com.example.hackathon.view.MrR.ViewGetBookActivity
import com.example.hackathon.viewModel.Book
//import com.example.hackathon.viewModel.ViewModelGetBook


@Composable
fun NavGraph (navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Main.route
    )
    {
        composable(route = Screens.Main.route) {
            MyScreenContent(navController)
        }
        composable(route = Screens.GetBook.route) {
//            GetBookActivity(   ViewModelGetBook(
//                Book(1,"Ведьмаг дикая охота","«Сага о ведьмаке» — цикл книг польского писателя Анджея Сапковского в жанре фэнтези.\n" +
//                    "\n" +
//                    "Первый рассказ цикла увидел свет в 1986 году, а последняя книга — в 2013. Действие книг происходит в вымышленном Мире «Ведьмака», напоминающем Европу времён позднего средневековья, где рядом с людьми существуют разного рода волшебные существа и чудовища.\n" +
//                    "\n" +
//                    "Геральт из Ривии — один из последних «ведьмаков», бродячих охотников на чудовищ","Книга","2015")
//            ))
        }
        composable(route = Screens.AddAuthor.route) {
            AddAuthorActivity()
        }
    }
}

