package com.example.reactiveweb.controller

import com.example.reactiveweb.controller.form.ProductCreateForm
import com.example.reactiveweb.controller.form.ProductUpdateForm
import com.example.reactiveweb.model.Product
import org.springframework.web.bind.annotation.*

@RestController("/v1/products")
class ProductController {
    @PostMapping
    fun postProduct(@RequestBody product: ProductCreateForm) {

    }

    @GetMapping
    fun getProductList() {

    }

    @GetMapping("/{id}")
    fun getProductById(@PathVariable("id") productId: Int) {

    }

    @PatchMapping("/{id}")
    fun updateProduct(@PathVariable("id") productId: Int, updateForm: ProductUpdateForm) {

    }

    @DeleteMapping("/{id}")
    fun deleteProduct(@PathVariable("id") productId: Int) {

    }
}