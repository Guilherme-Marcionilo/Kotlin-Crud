package br.com.zup.pub

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
import io.micronaut.http.uri.UriBuilder
import io.micronaut.validation.Validated
import javax.inject.Inject
import javax.transaction.Transactional
import javax.validation.Valid

@Validated
@Controller("/toy")
class ToyController(@Inject val toyRepository: ToyRepository) {

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
    fun createToy(@Body @Valid request: ToyRequest): HttpResponse<Any> {

        val toy = request.toModel()
        toyRepository.save(toy)

        val uri = UriBuilder.of("/toy/{id}").expand(mutableMapOf(Pair("id", toy.id)))

        return HttpResponse.created(uri)
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
    fun deleteToy(@PathVariable id: Long) : HttpResponse<Any> {

        val possibleToy = toyRepository.findById(id)

        if (possibleToy.isPresent) {
            toyRepository.deleteById(id)
            return HttpResponse.ok()
        }

        return HttpResponse.notFound()

    }

}