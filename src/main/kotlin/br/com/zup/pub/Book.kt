package br.com.zup.pub

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Book(
    var name: String,
    val isbn: String
) {
    @Id
    @GeneratedValue
    var id: Long? = null
}
