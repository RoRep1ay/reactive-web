package com.example.reactiveweb.repository

import com.example.reactiveweb.model.Product

interface ProductRepository {
    fun getProducts(): List<Product>
    fun getProductById(id: Int): Product?
    fun deleteProduct(product: Product): Unit
    fun updateProductById(productIndex: Int, productName: String, quantity: Long): Product
    fun createProduct(productName: String, quantity: Long): Product
    fun getProductIndexById(id: Int): Int?
}