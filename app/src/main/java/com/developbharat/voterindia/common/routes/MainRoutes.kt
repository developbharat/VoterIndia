package com.developbharat.voterindia.common.routes

sealed class MainRoutes(val route: String) {
    object DashboardScreen : MainRoutes("main_dashboard_screen")
}

