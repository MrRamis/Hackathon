package com.example.hackathon.navigation

sealed class Screens(val route: String) {
    object Main: Screens("MainActivityRa")
    object AddAuthor: Screens("ViewAddAuthorActivity")
    object GetBook: Screens("ViewGetBookActivity")
}