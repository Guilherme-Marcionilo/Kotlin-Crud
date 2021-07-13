package br.com.zup.controller

import br.com.zup.model.Toy
import br.com.zup.model.ToyRequest
import br.com.zup.service.ToyServiceImpl
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
class ToyController(@Inject val toyServiceImpl: ToyServiceImpl) {

    private val log = LoggerFactory.getLogger(this::class.java)

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    fun getAllToys(@QueryValue(defaultValue = "") name: String): HttpResponse<List<Toy>> {

        log.info("Listando Toy's")
        val listToy = toyServiceImpl.getAllToys(name)

        return HttpResponse.ok(listToy)

    }

    @Get("/{id}")
    fun getToyById(@PathVariable id: Long): HttpResponse<Any> {

        log.info("Listando Toy's por ID")

        val possibleToy = toyServiceImpl.getToyById(id)

        return HttpResponse.ok(possibleToy)

    }


    @Post
    @Produces(MediaType.APPLICATION_JSON)
    fun createToy(@Body @Valid request: ToyRequest): HttpResponse<Toy> {

        log.info("Criando um Toy")
        val saved = toyServiceImpl.createToy(ToyConverter.toyDtoToToy(request))

        return HttpResponse.created(saved)
    }

    @Put("/{id}")
    fun updateToy(@PathVariable id: Long, @Body @Valid request: ToyRequest): HttpResponse<Toy> {
        log.info("Atualizando Toy")
        val updated = toyServiceImpl.updateToy(ToyConverter.toyPutDtoToToy(id, request))
        return HttpResponse.ok(updated)
    }

    @Delete("/{id}")
    fun deleteToy(@PathVariable id: Long) {
        log.info("Deletando Toy")
        return toyServiceImpl.deleteToyById(id)
    }

}