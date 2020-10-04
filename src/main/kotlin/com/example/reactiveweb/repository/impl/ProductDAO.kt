package com.example.reactiveweb.repository.impl

import com.example.reactiveweb.model.Product
import com.example.reactiveweb.repository.ProductRepository
import org.springframework.stereotype.Repository
import java.time.OffsetDateTime

@Repository
class ProductDAO: ProductRepository {

    companion object {
        val products = mutableListOf(
            Product(1, "Coka", 100, OffsetDateTime.now(), OffsetDateTime.now()),
            Product(2, "Fanta", 24, OffsetDateTime.now(), OffsetDateTime.now()),
            Product(3, "Pepsi", 33, OffsetDateTime.now(), OffsetDateTime.now())
        )

        fun getNextId(): Int {
            return products.last().id + 1
        }
    }

    override fun getProducts(): List<Product> {
        return products
    }

    override fun getProductById(id: Int): Product? {
        return products.find { it.id == id }
    }

    override fun getProductIndexById(id: Int): Int? {
        return products.find { it.id == id }?.let { products.indexOf(it) }
    }

    override fun deleteProduct(product: Product) {
        products.remove(product)
    }

    override fun createProduct(productName: String, quantity: Long): Product {
        val product = Product(id = getNextId(), name = productName, quantity =  quantity, createdAt = OffsetDateTime.now(), updatedAt = OffsetDateTime.now())
        products.add(product)
        return product
    }

    override fun updateProductById(productIndex: Int, productName: String, quantity: Long): Product {
        val currentProduct = products[productIndex]
        val updateProduct = currentProduct.copy(name = productName, quantity = quantity, updatedAt = OffsetDateTime.now())
        return products.set(productIndex, updateProduct)
    }
}