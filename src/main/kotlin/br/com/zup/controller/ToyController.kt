package br.com.zup.controller

import br.com.zup.model.Toy
import br.com.zup.model.ToyDetailsResponse
import br.com.zup.model.ToyRequest
import br.com.zup.repository.ToyRepository
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
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus
import javax.inject.Inject
import javax.transaction.Transactional
import javax.validation.Valid

@Validated
@Controller("/toy")
class ToyController(@Inject val toyRepository: ToyRepository, @Inject val toyServiceImpl: ToyServiceImpl) {

    private val log = LoggerFactory.getLogger(this::class.java)

    @Get
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    fun getAllToys(@QueryValue(defaultValue = "") name: String): HttpResponse<Any> {

        if (name.isBlank()) {

            val listToys = toyRepository.findAll()

            val answer = listToys.map { toy -> ToyDetailsResponse(toy) }

            return HttpResponse.ok(answer)
        }

       val possibleToy =  toyRepository.findByName(name)

       if (possibleToy.isEmpty) {
           return HttpResponse.notFound()
       }

       val toy = possibleToy.get()

       return HttpResponse.ok(ToyDetailsResponse(toy))

    }

    @Get("/{id}")
    @Transactional
    fun getToyById(@PathVariable id: Long) : HttpResponse<Any>{
        val possibleToy = toyRepository.findById(id)

        if (possibleToy.isPresent) {
            return HttpResponse.ok(possibleToy)
        }
        return HttpResponse.notFound()
    }


    @Post
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @ResponseStatus(HttpStatus.CREATED)
    fun createToy(@Body @Valid request: ToyRequest): Toy {

        log.info("Criando um Toy")
        val toy = request.toModel()

        return toyServiceImpl.createToy(toy)
    }

    @Put("/{id}")
    @Transactional
    fun updateToy(@PathVariable id: Long, name: String): HttpResponse<Any> {

        val possibleToy = toyRepository.findById(id)

        if (possibleToy.isEmpty) {
            return HttpResponse.notFound()
        }

        val toy = possibleToy.get()
        toy.name = name

        toyRepository.update(toy)

        return HttpResponse.ok(ToyDetailsResponse(toy))

    }

    @Delete("/{id}")
    @Transactional
    fun deleteToy(@PathVariable id: Long) {
        return toyServiceImpl.deleteToyById(id)
    }

}