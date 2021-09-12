package com.developbharat.voterindia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.developbharat.voterindia.common.routes.AuthRoutes
import com.developbharat.voterindia.screens.auth.licence.activation.LicenceActivationScreen
import com.developbharat.voterindia.screens.auth.licence.purchase.LicencePurchaseScreen
import com.developbharat.voterindia.screens.auth.mobile.MobileAuthScreen
import com.developbharat.voterindia.screens.auth.passcode.MobilePasscodeScreen
import com.developbharat.voterindia.screens.auth.signup.CreateAccountScreen
import com.developbharat.voterindia.screens.auth.welcome.WelcomeScreen
import com.developbharat.voterindia.ui.theme.VoterIndiaTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VoterIndiaTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = AuthRoutes.WelcomeScreen.route){
                        composable(route=AuthRoutes.WelcomeScreen.route){ WelcomeScreen(navController=navController) }
                        composable(route=AuthRoutes.MobileAuthScreen.route){ MobileAuthScreen(navController=navController) }
                        composable(route=AuthRoutes.MobilePasscodeScreen.route){ MobilePasscodeScreen(navController=navController) }
                        composable(route=AuthRoutes.CreateAccountScreen.route){ CreateAccountScreen(navController=navController) }
                        composable(route=AuthRoutes.LicenceActivationScreen.route){ LicenceActivationScreen(navController=navController) }
                        composable(route=AuthRoutes.PurchaseLicenceScreen.route){ LicencePurchaseScreen(navController=navController) }
                    }
                }
            }
        }
    }
}
