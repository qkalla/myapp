package com.example.cosmeticapp.ui.screens

import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.cosmeticapp.data.Product
import com.example.cosmeticapp.viewmodel.ProductViewModel
import kotlinx.coroutines.launch

@Composable
fun AdminPanelScreen(navController: NavController, context: Context) {
    val viewModel: ProductViewModel = viewModel()
    val coroutineScope = rememberCoroutineScope()

    var productName by remember { mutableStateOf("") }
    var productPrice by remember { mutableStateOf("") }
    var productDiscount by remember { mutableStateOf("") }
    var productDescription by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text("Admin Panel", style = MaterialTheme.typography.h5)

        TextField(
            value = productName,
            onValueChange = { productName = it },
            label = { Text("Product Name") },
            modifier = Modifier.fillMaxWidth()
        )

        TextField(
            value = productPrice,
            onValueChange = { productPrice = it },
            label = { Text("Product Price") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )

        TextField(
            value = productDiscount,
            onValueChange = { productDiscount = it },
            label = { Text("Product Discount (%)") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )

        TextField(
            value = productDescription,
            onValueChange = { productDescription = it },
            label = { Text("Product Description") },
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = {
                coroutineScope.launch {
                    val product = Product(
                        name = productName,
                        price = productPrice.toDouble(),
                        discount = productDiscount.toInt(),
                        description = productDescription
                    )
                    viewModel.insert(product)
                    productName = ""
                    productPrice = ""
                    productDiscount = ""
                    productDescription = ""
                }
            },
            modifier = Modifier.align(LineHeightStyle.Alignment.End)
        ) {
            Text("Add Product")
        }
    }
}

fun viewModel(): ProductViewModel = Unit
