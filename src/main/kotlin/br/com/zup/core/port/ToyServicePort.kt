package br.com.zup.core.port

import br.com.zup.core.model.Toy
import br.com.zup.entrypoint.dto.ToyDto
import java.util.*

interface ToyServicePort {
    fun create(toy: Toy): Toy
    fun getAll(): MutableList<ToyDto>
    fun findById(id: UUID): Toy
    fun update(toy: Toy): Toy
    fun delete(id: UUID)
}
