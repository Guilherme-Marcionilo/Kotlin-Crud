package br.com.zup.controller

import br.com.zup.model.Toy
import br.com.zup.model.ToyDto
import br.com.zup.service.ToyService
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Produces
import io.micronaut.http.annotation.Put
import io.micronaut.http.annotation.QueryValue
import io.micronaut.validation.Validated
import org.slf4j.LoggerFactory
import javax.inject.Inject
import javax.validation.Valid

@Validated
@Controller("/toy")
class ToyController(@Inject val toyService: ToyService) {

    private val log = LoggerFactory.getLogger(this::class.java)

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    fun getAllToys(@QueryValue(defaultValue = "") name: String): HttpResponse<List<Toy>> {

        log.info("Listando Toy's")
        val listToy = toyService.getAllToys(name)

        return HttpResponse.ok(listToy)
    }

    @Get("/{id}")
    fun getToyById(@PathVariable id: Long): HttpResponse<Any> {

        log.info("Listando Toy's por ID")

        val possibleToy = toyService.getToyById(id)

        return HttpResponse.ok(possibleToy)

    }


    @Post
    @Produces(MediaType.APPLICATION_JSON)
    fun createToy(@Body @Valid dto: ToyDto): HttpResponse<Toy> {

        log.info("Criando um Toy")
        val saved = toyService.createToy(ToyConverter.toyDtoToToy(dto))

        return HttpResponse.created(saved)
    }

    @Put("/{id}")
    fun updateToy(@PathVariable id: Long, name: String): HttpResponse<Toy> {
        log.info("Atualizando Toy")
        val updated = toyService.updateToy(id, name)

        return HttpResponse.ok(updated)
    }

    @Delete("/{id}")
    fun deleteToy(@PathVariable id: Long) {
        log.info("Deletando Toy")
        return toyService.deleteToyById(id)
    }

}