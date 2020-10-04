package com.example.reactiveweb.service

import com.example.reactiveweb.model.Product

interface ProductService {
    fun getProducts(): List<Product>
    fun getProductById(id: Int): Product
    fun deleteProductById(id: Int): Unit
    fun updateProductById(id: Int, productName: String, quantity: Long): Product
    fun createProduct(productName: String, quantity: Long): Product
}