package br.com.zup.repository

import br.com.zup.model.Toy
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface ToyRepository: JpaRepository<Toy, Long> {

}
