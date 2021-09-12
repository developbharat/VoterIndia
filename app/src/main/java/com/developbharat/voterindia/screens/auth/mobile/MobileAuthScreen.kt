package com.developbharat.voterindia.screens.auth.mobile

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.developbharat.voterindia.common.routes.AuthRoutes

@Composable
fun MobileAuthScreen(
    navController: NavController
) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Mobile Authentication") }) },
        content = {
            Box(modifier = Modifier.fillMaxSize().padding(5.dp)){
                Column(modifier= Modifier.fillMaxSize().padding(10.dp)) {
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "+91",
                        onValueChange = {},
                        label = {Text("Mobile Number")}
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedButton(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { navController.navigate(AuthRoutes.MobilePasscodeScreen.route) }) {
                        Text("Send OTP")
                    }
                }
            }
        }
    )
}
