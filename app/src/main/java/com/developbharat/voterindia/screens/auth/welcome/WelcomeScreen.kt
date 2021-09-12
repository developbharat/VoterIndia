package com.developbharat.voterindia.screens.auth.welcome

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.developbharat.voterindia.common.routes.AuthRoutes

@Composable
fun WelcomeScreen(
    navController: NavController
) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Welcome Friend") }) },
        content = {
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(5.dp)){
                Column(modifier= Modifier
                    .fillMaxWidth()
                    .padding(10.dp)) {
                    OutlinedButton(
                        modifier= Modifier.fillMaxWidth(),
                        onClick = { navController.navigate(AuthRoutes.MobileAuthScreen.route) }
                    ) { Text("SIGN IN") }
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedButton(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { navController.navigate(AuthRoutes.CreateAccountScreen.route) }
                    ) { Text("SIGN UP") }
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedButton(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { navController.navigate(AuthRoutes.LicenceActivationScreen.route) }
                    ) { Text("ACTIVATE LICENCE") }
                }
            }
        }
    )
}