package com.example.reactiveweb.controller

import com.example.reactiveweb.controller.form.ProductCreateForm
import com.example.reactiveweb.controller.form.ProductUpdateForm
import com.example.reactiveweb.model.Product
import com.example.reactiveweb.service.ProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/products")
class ProductController(@Autowired private val productService: ProductService) {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    fun postProduct(@RequestBody product: ProductCreateForm): Product {
        return this.productService.createProduct(product.name, product.quantity)
    }

    @GetMapping
    fun getProductList(): List<Product> {
        return this.productService.getProducts()
    }

    @GetMapping("/{id}")
    fun getProductById(@PathVariable("id") productId: Int): Product {
        return this.productService.getProductById(productId)
    }

    @PatchMapping("/{id}")
    fun updateProduct(@PathVariable("id") productId: Int, updateForm: ProductUpdateForm): Product {
        return this.productService.updateProductById(productId, updateForm.name, updateForm.quantity)
    }

    @DeleteMapping("/{id}")
    fun deleteProduct(@PathVariable("id") productId: Int): Unit {
        return this.productService.deleteProductById(id = productId)
    }
}