package com.developbharat.voterindia.common.routes

sealed class MainRoutes(val route: String){
    class DashboardScreen(): MainRoutes("main_dashboard_screen")
}

