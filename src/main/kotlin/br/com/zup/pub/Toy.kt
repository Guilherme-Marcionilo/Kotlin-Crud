package br.com.zup.pub

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Toy(
    var name: String,
    val price: Double
) {
    @Id
    @GeneratedValue
    var id: Long? = null
}
