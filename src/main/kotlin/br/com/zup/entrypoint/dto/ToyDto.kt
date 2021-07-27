package br.com.zup.entrypoint.dto

import io.micronaut.core.annotation.Introspected
import java.math.BigDecimal
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Positive

@Introspected
data class ToyDto(
    @field:NotBlank val name: String,
    @field:Positive val price: BigDecimal,
    @field:NotBlank val description: String
)
