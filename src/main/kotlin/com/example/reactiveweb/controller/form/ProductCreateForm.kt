package com.example.reactiveweb.controller.form

import com.fasterxml.jackson.annotation.JsonAlias
import org.hibernate.validator.constraints.Length
import javax.validation.constraints.NotNull

data class ProductCreateForm(val id: Long?, @NotNull @Length(min = 3, max = 32) @JsonAlias("pname") val name: String, val quantity: Long)