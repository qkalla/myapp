package com.example.cosmeticapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun SkincareScreen(navController: NavController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text("Skincare", Modifier.padding(bottom = 8.dp))
        // Add your skincare-specific content here
    }
}