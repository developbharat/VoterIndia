package com.developbharat.voterindia.screens.auth.licence.purchase

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun LicencePurchaseScreen(
    navController: NavController
) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Purchase Licence") }) },
        content = {
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(5.dp)) {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)) {
                    OutlinedTextField(
                        modifier = Modifier.fillMaxWidth(),
                        value = "+91",
                        onValueChange = {},
                        label = { Text("Mobile Number") }
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    Text("Please call us or send us a whatsapp message at +91 9466749874 to obtain licence. And you will get a licence via sms after verification from our side.")
                    Spacer(modifier = Modifier.height(5.dp))
                    Text("Licence will be charged a minimum fee of Rs 1000. You will get a call from our side from +91 9466749874 to receive payment.")
                    Spacer(modifier = Modifier.height(5.dp))
                    Text("Note: We only contact you via +9466749874, incase you receive call or sms from other numbers, please discard as they can be fake.")
                    Spacer(modifier = Modifier.height(10.dp))
                    OutlinedButton(
                        modifier = Modifier.fillMaxWidth(),
                        onClick = { /* TODO */ }) {
                        Text("Send Whatsapp Request")
                    }
                }
            }
        }
    )
}