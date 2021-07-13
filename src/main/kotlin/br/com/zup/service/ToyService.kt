package br.com.zup.service

import br.com.zup.model.Toy
import java.util.*
import javax.inject.Singleton

@Singleton
interface ToyService {

    fun createToy(toy: Toy): Toy

    fun updateToy(toy: Toy): Toy

    fun deleteToyById(id: Long)

    fun getAllToys(name: String): List<Toy>

    fun getToyById(id: Long): Optional<Toy>

}
