package br.com.zup.controller

import br.com.zup.model.Toy
import br.com.zup.model.ToyDto

class ToyConverter {

    companion object {
        fun toyDtoToToy(dto: ToyDto) =
            Toy(dto.name, dto.price)
    }
}
