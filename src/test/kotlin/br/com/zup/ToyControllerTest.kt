package br.com.zup

import br.com.zup.core.port.ToyServicePort
import br.com.zup.core.service.ToyServiceImpl
import br.com.zup.entrypoint.controller.ToyController
import br.com.zup.entrypoint.dto.ToyDto
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe
import io.micronaut.http.HttpRequest
import io.micronaut.test.extensions.kotest.annotation.MicronautTest
import io.mockk.clearAllMocks
import io.mockk.mockk
import java.math.BigDecimal
import java.util.*

@MicronautTest
class ToyControllerTest() : StringSpec({

    clearAllMocks()

    val createToy: ToyServicePort = ToyServiceImpl(mockk(relaxed = true))

    val toyDto = ToyDto(
        name = "TesteKotest",
        price = BigDecimal.ONE,
        description = "DescTest"
    )

    val toyController = ToyController(createToy)


    "create" {
        toyController.create(toyDto, HttpRequest.POST(toString(), toyDto)).code() shouldBe 201
    }

    "get" {
        toyController.findToyById(UUID.randomUUID()).code() shouldNotBe 201
    }

    "remove" {
        toyController.delete(UUID.randomUUID())
    }

    "list" {
        toyController.findAll().shouldNotBe(null)
    }
})