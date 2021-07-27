package br.com.zup.core.service

import br.com.zup.core.mapper.ToyConverter
import br.com.zup.core.model.Toy
import br.com.zup.core.port.ToyRepositoryPort
import br.com.zup.core.port.ToyServicePort
import java.util.*
import javax.inject.Singleton

@Singleton
class ToyService(private val toyRepository: ToyRepositoryPort): ToyServicePort {

    override fun create(toy: Toy) = toyRepository.save(ToyConverter.toEntity(toy))

    override fun getAll() = toyRepository.getAll()

    override fun findById(id: UUID) = toyRepository.findById(id)

    override fun update(toy: Toy) = toyRepository.update(ToyConverter.toEntity(toy))

    override fun delete(id: UUID) = toyRepository.delete(id)

}