package br.com.zup.controller

import br.com.zup.model.Toy
import br.com.zup.model.ToyRequest
import java.util.*

class ToyConverter {

    companion object {
        fun toyDtoToToy(request: ToyRequest) =
            Toy(request.name, request.price)

        fun toyPutDtoToToy(id: Long, toyRequest: ToyRequest) =
            Toy(toyRequest.name, toyRequest.price)

        fun toyDtoToListToy(toy : Toy) =
            Toy(toy.name, toy.price)

    }

}
