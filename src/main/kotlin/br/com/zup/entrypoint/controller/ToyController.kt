package br.com.zup.entrypoint.controller

import br.com.zup.core.mapper.ToyConverter
import br.com.zup.core.port.ToyServicePort
import br.com.zup.entrypoint.dto.ToyDto
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Consumes
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import io.micronaut.http.annotation.Put
import io.micronaut.validation.Validated
import java.util.*
import javax.validation.Valid

@Validated
@Controller("/toy")
class ToyController(private val toyServicePort: ToyServicePort) {

    @Post
    fun create(@Body @Valid dto: ToyDto) = HttpResponse.created(toyServicePort.create(ToyConverter.toToy(dto)))

    @Get
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun findAll() = HttpResponse.ok(ToyConverter.toListDto(toyServicePort.getAll()))

    @Get("/{id}")
    fun findToyById(@PathVariable id: UUID) = HttpResponse.ok(ToyConverter.toDto(toyServicePort.findById(id)))

    @Put("/{id}")
    fun update(@PathVariable id: UUID, @Valid @Body dto: ToyDto): HttpResponse<Any> {
        toyServicePort.update(ToyConverter.toToytWithId(id, dto))
        return HttpResponse.noContent()
    }

    @Delete("/{id}")
    fun delete(@PathVariable id: UUID): HttpResponse<Any> {
        toyServicePort.delete(id)
        return HttpResponse.noContent()
    }
}