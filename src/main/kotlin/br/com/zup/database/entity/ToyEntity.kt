package br.com.zup.database.entity

import java.math.BigDecimal
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class ToyEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: UUID? = null,
    val name: String = "",
    val price: BigDecimal = BigDecimal.ONE,
    val description: String = ""
) {
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , name = $name , price = $price , description = $description )"
    }
}
