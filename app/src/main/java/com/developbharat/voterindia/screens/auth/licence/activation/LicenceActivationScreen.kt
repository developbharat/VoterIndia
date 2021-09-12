package com.developbharat.voterindia.screens.auth.licence.activation

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun LicenceActivationScreen(
    navController: NavController
) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Licence Activation") }) },
        content = {
            Box(modifier = Modifier.fillMaxSize().padding(5.dp)){
                Column(modifier= Modifier.fillMaxSize().padding(10.dp)) {
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "+91",
                        onValueChange = {},
                        label = { Text("Mobile Number") }
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "TRIAL-02545",
                        onValueChange = {},
                        label = { Text("Licence Code") }
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedButton(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { /* TODO */ }) {
                        Text("Activate Account")
                    }
                }
            }
        }
    )
}