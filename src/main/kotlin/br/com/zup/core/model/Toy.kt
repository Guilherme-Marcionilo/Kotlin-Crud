package br.com.zup.core.model

import java.math.BigDecimal
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import kotlin.random.Random

data class Toy(
    val id: UUID?,
    val name: String,
    val price: BigDecimal,
    val description: String
)
