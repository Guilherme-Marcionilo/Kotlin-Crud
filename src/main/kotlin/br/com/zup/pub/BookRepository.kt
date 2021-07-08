package br.com.zup.pub

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface BookRepository: JpaRepository<Book, Long> {
    fun findByName(name: String) : Optional<Book>
}
