package com.example.cosmeticapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MakeupScreen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Makeup", Modifier.padding(bottom = 8.dp))
        // Add your makeup-specific content here
    }
}