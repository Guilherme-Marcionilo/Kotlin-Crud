package br.com.zup.core.port

import br.com.zup.core.model.Toy
import br.com.zup.database.entity.ToyEntity
import br.com.zup.entrypoint.dto.ToyDto
import java.util.*

interface ToyRepositoryPort {
    fun save(toyEntity: ToyEntity): Toy
    fun getAll(): MutableList<ToyDto>
    fun findById(id: UUID): Toy
    fun update(toEntity: ToyEntity): Toy
    fun delete(id: UUID)
}
