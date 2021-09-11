package com.developbharat.voterindia.common.routes

sealed class AuthRoutes(val route: String){
    object WelcomeScreen: AuthRoutes("auth_welcome_screen")
    object MobileAuthScreen: AuthRoutes("auth_mobile_screen")
    object SignupScreen: AuthRoutes("auth_signup_screen")
    object MobilePasscodeScreen: AuthRoutes("auth_mobile_passcode_screen")
    object RequestLicenceScreen: AuthRoutes("auth_request_licence_screen")
    object LicenceActivationScreen: AuthRoutes("auth_licence_activation_screen")
}