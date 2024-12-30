package com.example.cosmeticapp

import org.junit.Test
import org.junit.Assert.*
import com.example.cosmeticapp.data.Product
import com.example.cosmeticapp.data.ProductRepository
import kotlinx.coroutines.runBlocking

class ExampleUnitTest {

    @Test
    fun testProductInsertion() = runBlocking {
        val product = Product(name = "Test Product", price = 10.0, discount = 20, description = "Test Description")
        val mockDao = MockProductDao()
        val repository = ProductRepository(mockDao)

        repository.insert(product)
        val products = repository.getAllProducts()

        assertEquals(1, products.size)
        assertEquals(product, products[0])
    }

    private fun ProductRepository(productDao: MockProductDao): ProductRepository {

    }
}

// Mock DAO for testing
class MockProductDao : ProductDao {
    private val productList = mutableListOf<Product>()

    override suspend fun insert(product: Product) {
        productList.add(product)
    }

    override suspend fun getAllProducts(): List<Product> {
        return productList
    }
}