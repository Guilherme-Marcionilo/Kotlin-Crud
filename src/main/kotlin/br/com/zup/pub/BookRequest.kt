package br.com.zup.pub

import io.micronaut.core.annotation.Introspected
import java.util.*
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size

@Introspected
data class BookRequest(
    @field:NotBlank
    @field:Size(max = 50)
    val name: String,

    @field:NotBlank
    @field:Size(max = 50)
    val isbn: String
) {

    fun toModel(): Book {
        return Book(name, isbn)
    }
}
