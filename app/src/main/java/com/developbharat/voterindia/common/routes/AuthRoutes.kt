package com.developbharat.voterindia.common.routes

sealed class AuthRoutes(val route: String){
    class WelcomeScreen: AuthRoutes("auth_welcome_screen")
    class MobileAuthScreen: AuthRoutes("auth_mobile_screen")
    class SignupScreen: AuthRoutes("auth_signup_screen")
    class MobilePasscodeScreen: AuthRoutes("auth_mobile_passcode_screen")
    class RequestLicenceScreen: AuthRoutes("auth_request_licence_screen")
    class LicenceActivationScreen: AuthRoutes("auth_licence_activation_screen")
}