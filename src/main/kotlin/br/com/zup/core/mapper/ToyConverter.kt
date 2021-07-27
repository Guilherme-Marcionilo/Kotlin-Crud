package br.com.zup.core.mapper

import br.com.zup.core.model.Toy
import br.com.zup.database.entity.ToyEntity
import br.com.zup.entrypoint.dto.ToyDto
import java.util.*
import java.util.stream.Collectors

class ToyConverter {
    companion object {
        fun toEntity(toy: Toy) =
            ToyEntity(toy.id, toy.name, toy.price, toy.description)

        fun toToy(dto: ToyDto) =
            Toy(null, dto.name, dto.price, dto.description)

        fun toToy(toyEntity: ToyEntity) =
            Toy(toyEntity.id, toyEntity.name, toyEntity.price, toyEntity.description)

        fun toListDto(toyList: MutableList<ToyDto>): MutableList<ToyDto> = toyList.stream().map { toy -> ToyDto(toy.name, toy.price, toy.description)}
            .collect(Collectors.toList())

        fun toListToy(toyEntityList: List<ToyEntity>): MutableList<ToyDto> = toyEntityList.stream().map { toy -> ToyDto(toy.name, toy.price, toy.description)}
            .collect(Collectors.toList())

        fun toDto(toy: Toy) = ToyDto(toy.name, toy.price, toy.description)

        fun toToytWithId(id: UUID, dto: ToyDto) = Toy(id, dto.name, dto.price, dto.description)
    }
}

