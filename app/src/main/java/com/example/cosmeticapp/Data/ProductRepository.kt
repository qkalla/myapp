package com.example.cosmeticapp.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

// Repository class to abstract data access
class ProductRepository(private val productDao: ProductDao) {

    // Insert a product into the database
    suspend fun insert(product: Product) {
        withContext(Dispatchers.IO) {
            productDao.insert(product)
        }
    }

    // Retrieve all products from the database
    suspend fun getAllProducts(): List<Product> {
        return withContext(Dispatchers.IO) {
            productDao.getAllProducts()
        }
    }
}