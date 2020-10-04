package com.example.reactiveweb.service

import com.example.reactiveweb.model.Product

interface ProductService {
    fun getProducts(): List<Product>
    fun getProductById(id: Long): Product
    fun deleteProductById(id: Long): Unit
    fun updateProductById(id: Long, productName: String, quantity: String): Product
    fun createProduct(productName: String, quantity: String): Product
}