package com.developbharat.voterindia.screens.auth.signup

import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun CreateAccountSuccessScreen(
    navController: NavController
) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Account Created") }) },
        content = {
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(5.dp)) {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)) {
                    Text("Account Created Successfully.")
                    Spacer(modifier = Modifier.height(5.dp))
                    Text("Before using your account, you need to purchase licence.")
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedButton(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { /*TODO*/ }) {
                        Text("Purchase Licence Instructions")
                    }
                }
            }
        }
    )
}