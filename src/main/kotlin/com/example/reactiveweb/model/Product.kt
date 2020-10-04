package com.example.reactiveweb.model

import java.time.OffsetDateTime

data class Product(
        val pId: Int,
        val pName: String,
        val quantity: Long,
        val createdAt: OffsetDateTime,
        val updatedAt: OffsetDateTime
)
