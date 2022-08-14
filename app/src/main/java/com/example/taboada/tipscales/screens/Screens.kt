package com.example.taboada.tipscales.screens

sealed class Screens (val route: String) {
    object Login: Screens("login_screen")
    object Home: Screens("home_screen")
    sealed class NavGraph
    object Detail: Screens("detail_screen")
}