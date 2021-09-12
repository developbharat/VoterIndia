package com.developbharat.voterindia.screens.auth.passcode

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MobilePasscodeScreen(
    navController: NavController
) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Mobile Passcode") }) },
        content = {
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(5.dp)) {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)) {
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "256856",
                        onValueChange = {},
                        label = { Text("One Time Passcode") }
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedButton(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { /*TODO*/ }) {
                        Text("Validate Passcode")
                    }
                }
            }
        }
    )
}