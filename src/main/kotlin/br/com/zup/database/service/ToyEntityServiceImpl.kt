package br.com.zup.database.service

import br.com.zup.core.mapper.ToyConverter
import br.com.zup.core.model.Toy
import br.com.zup.core.port.ToyRepositoryPort
import br.com.zup.database.entity.ToyEntity
import br.com.zup.database.repository.ToyEntityRepository
import java.util.*
import javax.inject.Singleton

@Singleton
class ToyEntityServiceImpl(private val toyEntityRepository: ToyEntityRepository) : ToyRepositoryPort {

    override fun save(toyEntity: ToyEntity) = ToyConverter.toToy(toyEntityRepository.save(toyEntity))

    override fun getAll() = ToyConverter.toListToy(toyEntityRepository.getAll())

    override fun findById(id: UUID) = ToyConverter.toToy(toyEntityRepository.findById(id)!!)

    override fun update(toyEntity: ToyEntity) = ToyConverter.toToy(toyEntityRepository.update(toyEntity))

    override fun delete(id: UUID) = toyEntityRepository.delete(id)

}