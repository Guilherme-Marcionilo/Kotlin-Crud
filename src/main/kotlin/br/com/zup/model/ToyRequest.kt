package br.com.zup.model

import br.com.zup.model.Toy
import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Positive
import javax.validation.constraints.Size

@Introspected
data class ToyRequest(
    @field:NotBlank
    @field:Size(max = 50)
    val name: String,

    @field:NotBlank
    @field:Size(max = 50)
    @field:Positive
    val price: Double
) {

    fun toModel(): Toy {
        return Toy(name, price)
    }
}
