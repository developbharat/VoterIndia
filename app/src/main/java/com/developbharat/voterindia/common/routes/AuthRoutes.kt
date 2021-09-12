package com.developbharat.voterindia.common.routes

sealed class AuthRoutes(val route: String) {
    object WelcomeScreen : AuthRoutes("auth_welcome_screen")
    object MobileAuthScreen : AuthRoutes("auth_mobile_screen")
    object CreateAccountScreen : AuthRoutes("auth_create_account_screen")
    object MobilePasscodeScreen : AuthRoutes("auth_mobile_passcode_screen")
    object PurchaseLicenceScreen : AuthRoutes("auth_purchase_licence_screen")
    object LicenceActivationScreen : AuthRoutes("auth_licence_activation_screen")
}