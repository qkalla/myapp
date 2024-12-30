package com.example.cosmeticapp.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Home", Modifier.padding(bottom = 8.dp))
        Text("Perfume", Modifier.clickable { navController.navigate("perfume") }.padding(8.dp))
        Text("Makeup", Modifier.clickable { navController.navigate("makeup") }.padding(8.dp))
        Text("Skincare", Modifier.clickable { navController.navigate("skincare") }.padding(8.dp))
        Text("Haircare", Modifier.clickable { navController.navigate("haircare") }.padding(8.dp))

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate("admin") }) {
            Text("Admin Panel")
        }
    }
}