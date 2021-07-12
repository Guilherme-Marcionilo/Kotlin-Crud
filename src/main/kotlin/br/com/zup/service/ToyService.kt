package br.com.zup.service

import br.com.zup.model.Toy
import javax.inject.Singleton

@Singleton
interface ToyService {

    fun createToy(toy: Toy): Toy

    fun deleteToyById(id: Long)

}
