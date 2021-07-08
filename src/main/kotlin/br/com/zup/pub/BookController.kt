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
@Controller("/book")
class BookController(@Inject val bookRepository: BookRepository) {

    @Get
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    fun getAllBooks(@QueryValue(defaultValue = "") name: String): HttpResponse<Any> {

        if (name.isBlank()) {

            val listBooks = bookRepository.findAll()

            val answer = listBooks.map { book -> BookDetailsResponse(book) }

            return HttpResponse.ok(answer)
        }

       val possibleBook =  bookRepository.findByName(name)

       if (possibleBook.isEmpty) {
           return HttpResponse.notFound()
       }

       val book = possibleBook.get()

       return HttpResponse.ok(BookDetailsResponse(book))

    }

    @Get("/{id}")
    @Transactional
    fun getById(@PathVariable id: Long) : HttpResponse<Any>{
        val possibleBook = bookRepository.findById(id)

        if (possibleBook.isPresent) {
            return HttpResponse.ok(possibleBook)
        }
        return HttpResponse.notFound()
    }


    @Post
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    fun createBook(@Body @Valid request: BookRequest): HttpResponse<Any> {

        val book = request.toModel()
        bookRepository.save(book)

        val uri = UriBuilder.of("/book/{id}").expand(mutableMapOf(Pair("id", book.id)))

        return HttpResponse.created(uri)
    }

    @Put("/{id}")
    @Transactional
    fun updateBook(@PathVariable id: Long, name: String): HttpResponse<Any> {

        val possibleBook = bookRepository.findById(id)

        if (possibleBook.isEmpty) {
            return HttpResponse.notFound()
        }

        val book = possibleBook.get()
        book.name = name

        bookRepository.update(book)

        return HttpResponse.ok(BookDetailsResponse(book))

    }

    @Delete("/{id}")
    @Transactional
    fun deleteBook(@PathVariable id: Long) : HttpResponse<Any> {

        val possibleBook = bookRepository.findById(id)

        if (possibleBook.isPresent) {
            bookRepository.deleteById(id)
            return HttpResponse.ok()
        }

        return HttpResponse.notFound()

    }

}