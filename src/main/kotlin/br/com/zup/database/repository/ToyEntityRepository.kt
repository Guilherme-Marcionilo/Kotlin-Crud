package br.com.zup.database.repository

import br.com.zup.database.entity.ToyEntity
import java.util.*

interface ToyEntityRepository{
    fun save(toyEntity: ToyEntity): ToyEntity
    fun getAll(): List<ToyEntity>
    fun findById(id: UUID): Optional<ToyEntity>
    fun update(toyEntity: ToyEntity): ToyEntity
    fun delete(toyEntity: ToyEntity)
}
