package com.example.taboada.tipscales.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

/*
@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}
*/

@Composable
fun LoginScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ){
           Text(
               text = "Login Screen",
               fontSize = MaterialTheme.typography.titleLarge.fontSize,
               fontWeight = FontWeight.Bold
           )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center
        ) {
            ElevatedButton(
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black),
                onClick = { navController.navigate(Screens.Home.route)},
                modifier = Modifier.padding(5.dp)
            ) {
                Text(
                    text = "Go to Home Screen",
                    modifier = Modifier.padding(5.dp),
                    style = MaterialTheme.typography.titleSmall.copy(
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                )
            }
        }
    }
}