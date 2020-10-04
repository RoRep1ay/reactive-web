package com.example.reactiveweb.controller.form

import org.hibernate.validator.constraints.Length
import javax.validation.constraints.NotNull

data class ProductCreateForm(val id: Long?, @NotNull @Length(min = 3, max = 32) val name: String, val quantity: Long)