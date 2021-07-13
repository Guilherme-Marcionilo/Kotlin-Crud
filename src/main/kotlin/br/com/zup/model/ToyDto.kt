package br.com.zup.model

import io.micronaut.core.annotation.Introspected
import java.math.BigDecimal
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Positive
import javax.validation.constraints.Size

@Introspected
data class ToyDto(
    @field:NotBlank
    @field:Size(max = 50)
    val name: String,

    @field:NotBlank
    @field:Size(max = 50)
    @field:Positive
    val price: BigDecimal
)
