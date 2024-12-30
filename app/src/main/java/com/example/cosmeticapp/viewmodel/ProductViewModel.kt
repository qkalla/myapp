package com.example.cosmeticapp.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cosmeticapp.data.AppDatabase
import com.example.cosmeticapp.data.Product
import kotlinx.coroutines.launch

class ProductViewModel : ViewModel() {

    fun insertProduct(context: Context, product: Product) {
        viewModelScope.launch {
            val db = AppDatabase.getDatabase(context)
            db.productDao().insert(product)
        }
    }

    fun getAllProducts(context: Context): List<Product> {
        var products: List<Product> = emptyList()
        viewModelScope.launch {
            val db = AppDatabase.getDatabase(context)
            products = db.productDao().getAllProducts()
        }
        return products
    }

    fun insert(product: Product) {

    }
}