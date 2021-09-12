package com.developbharat.voterindia.screens.auth.signup

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun CreateAccountScreen(
    navController: NavController
) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Create Account") }) },
        content = {
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(5.dp)) {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)) {
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "Jayant Malik",
                        onValueChange = {},
                        label = { Text("Name") }
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "+91 8607749874",
                        onValueChange = {},
                        label = { Text("Mobile Number") }
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedButton(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { /*TODO*/ }) {
                        Text("Create Account")
                    }
                }
            }
        }
    )

}