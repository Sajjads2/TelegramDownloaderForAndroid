package com.app.ui

import androidx.compose.material3.*
import androidx.compose.runtime.*

@Composable
fun LoginScreen() {

    var phone by remember { mutableStateOf("") }
    var apiId by remember { mutableStateOf("") }
    var apiHash by remember { mutableStateOf("") }

    Column {

        Text("TDLib Login")

        TextField(phone, { phone = it }, label = { Text("Phone") })
        TextField(apiId, { apiId = it }, label = { Text("API ID") })
        TextField(apiHash, { apiHash = it }, label = { Text("API HASH") })

        Button(onClick = {
            // send to AuthManager
        }) {
            Text("Login")
        }
    }
}
