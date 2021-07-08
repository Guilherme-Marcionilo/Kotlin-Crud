package br.com.zup

import io.micronaut.runtime.Micronaut.*
import org.h2.tools.Server

fun main(args: Array<String>) {
	Server.createWebServer().start()
	build()
	    .args(*args)
		.packages("br.com.zup")
		.start()
}

