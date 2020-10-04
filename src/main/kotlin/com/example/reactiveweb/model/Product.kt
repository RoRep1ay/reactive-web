package com.example.reactiveweb.model

import java.time.OffsetDateTime

data class Product(
        val id: Int,
        val name: String,
        val quantity: Long,
        val createdAt: OffsetDateTime,
        val updatedAt: OffsetDateTime
)
