package br.com.zup

import io.micronaut.runtime.Micronaut.*
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Contact
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.info.License
import io.swagger.v3.oas.annotations.servers.Server

@OpenAPIDefinition(
    info = Info(
        title = "REST API - Project Toy",
        version = ("1.0"),
        description = "Warrior Project Toy",
        license = License(name = "Apache 2.0", url = "https://foo.bar"),
        contact = Contact(url = "toy.com.br", name = "TOY", email = "toy@email.com")
    ),
    servers = [Server(url = "https://iupp.com.br")]
)
object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        build()
            .args(*args)
            .packages("br.com.zup")
            .start()
    }
}