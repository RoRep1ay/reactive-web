package com.example.reactiveweb.service.impl

import com.example.reactiveweb.exception.ResourceNotFoundException
import com.example.reactiveweb.model.Product
import com.example.reactiveweb.repository.ProductRepository
import com.example.reactiveweb.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(@Autowired private val productRepository: ProductRepository) : ProductService {
    override fun getProducts(): List<Product> {
        return this.productRepository.getProducts()
    }

    override fun getProductById(id: Int): Product {
        return this.productRepository.getProductById(id) ?: throw ResourceNotFoundException("not found")
    }

    override fun deleteProductById(id: Int) {
        val productToDelete =  this.productRepository.getProductById(id) ?: throw ResourceNotFoundException("not found")
        this.productRepository.deleteProduct(product = productToDelete)
    }

    override fun updateProductById(id: Int, productName: String, quantity: Long): Product {
        val productIndex = this.productRepository.getProductIndexById(id) ?: throw ResourceNotFoundException("not found")
        return this.productRepository.updateProductById(productIndex, productName, quantity)
    }

    override fun createProduct(productName: String, quantity: Long): Product {
        return this.productRepository.createProduct(productName, quantity)
    }

}