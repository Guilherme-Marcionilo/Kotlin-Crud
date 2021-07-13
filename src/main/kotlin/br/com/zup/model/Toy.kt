package br.com.zup.model

import java.math.BigDecimal
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import kotlin.random.Random

@Entity
class Toy(
    var name: String,
    val price: BigDecimal,
    @Id
    @GeneratedValue
    var id: Long? = null
)
